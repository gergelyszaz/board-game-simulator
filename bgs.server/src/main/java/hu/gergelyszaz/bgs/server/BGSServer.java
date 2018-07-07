package hu.gergelyszaz.bgs.server;

import com.google.gson.Gson;
import hu.gergelyszaz.bgs.view.Controller;
import hu.gergelyszaz.bgs.view.View;
import hu.gergelyszaz.bgs.manager.GameManager;
import hu.gergelyszaz.bgs.state.GameState;
import org.json.JSONArray;
import org.json.JSONException;
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
	private Logger log = Logger.getLogger(this.getClass().getName());
	private Session session;

	@OnOpen
	public void onOpen(Session session) {
		this.session = session;
		log.info("Connected ... " + session.getId());
	}

	@OnMessage
	public String onMessage(String input, Session session) {
		try {
			log.info("Server received: " + input);
			
			JSONObject message = new JSONObject(input);
			String param = message.has(PARAMETER) ? message.getString(PARAMETER) : "";

			switch (message.getString(ACTION)) {

				case "join":
					return handleJoinAction(session, param);

				case "info":
					return handleInfoAction();

				case "select":
					return handleSelectAction(session, param);

				default:
					return new JSONObject().put(STATUS, "error").put("message", "Invalid action!").toString();
			}
		} catch (JSONException e) {
			log.warning(e.getMessage());
			return new JSONObject().put(STATUS, "error").put("message", "Invalid JSON message!").toString();
		} catch (Exception e) {
			log.severe(e.getMessage());
			return new JSONObject().put(STATUS, "error").put("message", "Internal Server Error").toString();
		}
	}

	private String handleSelectAction(Session session, String param) {
		JSONObject ret = new JSONObject();
		int selected = Integer.parseInt(PARAMETER);
		Controller c = (Controller) session.getUserProperties().get(GAME);
		if (c.setSelected(session.getId(), selected)) {
			ret.put(STATUS, "ok");
			gm.Wake();
		} else {
			return createErrorMessage("Internal Server Error");
		}
		return ret.toString();
	}

	private String handleInfoAction() {
		JSONObject ret = new JSONObject();
		ret.put(STATUS, "ok");
		JSONArray games = new JSONArray();
		for (String g : gm.modelManager.AvailableModels()) {
			games.put(new JSONObject().put("name", g));
		}
		ret.put("games", games);
		return ret.toString();
	}

	private String handleJoinAction(Session session, String param) throws Exception {
		if (isAlreadyJoined(session)) {
			return createErrorMessage("Already joined a game");
		}

		JSONObject ret = new JSONObject();
		Controller c = gm.JoinGame(session.getId(), param);
		c.AddView(this);
		session.getUserProperties().put(GAME, c);
		session.getUserProperties().put(GAMESTATEVERSION, -1);
		return ret.put(STATUS, "ok").put("message", "Joined").toString();
	}

	private String createErrorMessage(String message) {
		return new JSONObject().put(STATUS, "error").put("message", message).toString();
	}

	private boolean isAlreadyJoined(Session session) {
		return session.getUserProperties().containsKey(GAME);
	}

	@OnClose
	public void onClose(Session session, CloseReason closeReason) {
		log.info(String.format("Session %s closed because of %s", session.getId(), closeReason));
	}

	@Override
	public void Refresh() {
		try {
			session.getBasicRemote().sendText(Update(session));
		} catch (IOException e) {
			log.info(e.getMessage());
		}
	}

	private String Update(Session session) {
		Controller c = (Controller) session.getUserProperties().get(GAME);
		Gson gson = new Gson();

		GameState gs = c.getCurrentState(session.getId());

		return gson.toJson(gs);
	}

}
