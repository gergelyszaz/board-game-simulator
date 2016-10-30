package hu.bme.aut.gergelyszaz.BGS.server;

import com.google.gson.Gson;
import hu.bme.aut.gergelyszaz.BGS.view.Controller;
import hu.bme.aut.gergelyszaz.BGS.view.View;
import hu.bme.aut.gergelyszaz.BGS.manager.GameManager;
import hu.bme.aut.gergelyszaz.BGS.state.GameState;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.websocket.*;
import javax.websocket.CloseReason.CloseCodes;
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
					return ret.put(STATUS, "joined").toString();
				} catch (Exception e) {
					logger.info(e.toString());
					e.printStackTrace();
					ret.put("message", e.getMessage().toString());
					return ret.put(STATUS, "error").toString();
				}

			case "update":
				return Update(session);

			case "info":
				logger.info("info request");
				ret.put("running", gm.runningGames.size());
				JSONArray games = new JSONArray();
				ret.put("waiting", gm.availableGames.size());
				ret.put("connections", gm.playerConnections.size());
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

			case "quit":
				try {
					session.close(new CloseReason(CloseCodes.NORMAL_CLOSURE, "GameImpl finished"));
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
		}
		return ret.put(STATUS, "no action").toString();
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
		// TODO error if there is no game yet
		Controller c = (Controller) session.getUserProperties().get(GAME);
		Gson gson = new Gson();

		GameState gs = c.getCurrentState(session.getId());

		return gson.toJson(gs);
	}

}