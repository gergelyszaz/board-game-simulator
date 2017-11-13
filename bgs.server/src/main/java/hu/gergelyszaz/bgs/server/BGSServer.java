package hu.gergelyszaz.bgs.server;

import com.google.gson.Gson;
import hu.gergelyszaz.bgs.view.Controller;
import hu.gergelyszaz.bgs.view.View;
import hu.gergelyszaz.bgs.manager.GameManager;
import hu.gergelyszaz.bgs.state.GameState;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.logging.Logger;

@ServerEndpoint(value = "/game")
public class BGSServer implements View {

	private static final String GAMESTATEVERSION = "gameStateVersion";
	private static final String GAME = "game";
	private static final String PARAMETER = "parameter";
	private static final String ACTION = "action";
	private static final String STATUS = "status";

	private GameManager gm = GameManagerSingleton.getGameManagerInstance();
	private Logger logger = Logger.getLogger(this.getClass().getName());
	private Session session;

	@OnOpen
	public void onOpen(Session session) {
		this.session = session;
		logger.info("Connected ... " + session.getId());
	}

	@OnMessage
	public String onMessage(String input, Session session) {
		logger.info("Recieved: " + input);
		final JSONObject message = new JSONObject(input);
		String action = message.getString(ACTION);
		JSONObject ret = new JSONObject();
		switch (action) {

			case "join":
				String gameName = message.getString(PARAMETER);
				try {
					Controller c = gm.JoinGame(session.getId(), gameName);
					c.AddView(this);
					session.getUserProperties().put(GAME, c);
					session.getUserProperties().put(GAMESTATEVERSION, -1);
					return ret.put(STATUS, "ok").put("message","Joined").toString();
				} catch (Exception e) {
					logger.warning(e.toString());
					return ret.put(STATUS, "error").put("message", e.getMessage().toString()).toString();
				}

			case "update":
				return Update(session);

			case "info":
				ret.put(STATUS, "ok");
				JSONArray games = new JSONArray();
				for (String g : gm.modelManager.AvailableModels()) {
					games.put(new JSONObject().put("name", g));
				}
				ret.put("games", games);
				return ret.toString();

			case "select":
				String status;
				int selected = message.getInt(PARAMETER);
				Controller c = (Controller) session.getUserProperties().get(GAME);
				if (c.setSelected(session.getId(), selected)) {
					status = "ok";
				} else {
					status = "error";
				}
				ret.put(STATUS, status);
				return ret.toString();
		}
		return ret.put(STATUS, "error").put("message","Invalid action: " + action).toString();
	}

	@OnClose
	public void onClose(Session session, CloseReason closeReason) {
		logger.info(String.format("Session %s closed because of %s", session.getId(), closeReason));
	}

	@Override
	public void Refresh() {
		logger.info("refresh");
		try {
			session.getBasicRemote().sendText(Update(session));
		} catch (IOException e) {
			logger.info(e.getMessage());
		}
	}

	private String Update(Session session) {
		Controller c = (Controller) session.getUserProperties().get(GAME);
		Gson gson = new Gson();

		GameState gs = c.getCurrentState(session.getId());

		return gson.toJson(gs);
	}

}