package hu.gergelyszaz.bgs.client;

import com.google.gson.*;
import hu.gergelyszaz.bgs.state.GameState;
import org.glassfish.tyrus.client.ClientManager;
import org.json.JSONObject;

import javax.websocket.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by mad on 2016. 10. 04..
 */
public class Connection {
	private static ConcurrentHashMap<String, Connection> connections = new ConcurrentHashMap<>();
	private Session session;
	private Set<MessageListener> messageListeners = new HashSet<>();
	private String address;
	private Set<StateListener> stateListeners = new HashSet<>();

	public Connection(String address) {
		this.address = address;
	}

	static void processMessage(String id, String message) {
		connections.get(id).notifyListeners(message);
	}

	public void open() throws ConnectException {
		try {

			URI uri = new URI(address);
			ClientManager client = ClientManager.createClient();
			session = client.connectToServer(BGSClient.class, uri);
			connections.put(session.getId(), this);

		} catch (URISyntaxException | DeploymentException e) {
			throw new ConnectException("Couldn't connect to " + address);
		}
	}

	public void addMessageListener(MessageListener messageListener) {
		messageListeners.add(messageListener);
	}

	public void removeMessageListener(MessageListener messageListener) {
		messageListeners.remove(messageListener);
	}

	public void addStateListener(StateListener stateListener) {
		stateListeners.add(stateListener);
	}

	public void removeStateListener(StateListener stateListener) {
		stateListeners.remove(stateListener);
	}

	public void close() {

		synchronized (session) {
			JSONObject message = new JSONObject().put("action", "quit");
			sendMessage(message);
		}

	}

	public void sendSelected(int id) {
		JSONObject message = new JSONObject().put("action", "select").put("parameter", id);
		sendMessage(message);
	}

	public void sendJoinGame(String gameId) {
		JSONObject message = new JSONObject().put("action", "join").put("parameter", gameId);
		sendMessage(message);

	}

	public void sendRequestServerInfo() {
		JSONObject message = new JSONObject().put("action", "info");
		sendMessage(message);
	}

	private void sendMessage(JSONObject obj) {
		synchronized (session) {
			session.getAsyncRemote().sendText(obj.toString());
		}
	}

	private void notifyListeners(String message) {
		JSONObject obj = new JSONObject(message);
		notifyMessageListeners(obj);
		notifyStateListeners(obj);
	}

	private void notifyMessageListeners(JSONObject obj) {
		for (MessageListener messageListener : messageListeners) {
			messageListener.RecieveMessage(obj);
		}
	}

	private void notifyStateListeners(JSONObject obj) {
		Gson gson = new Gson();
		try {
			GameState gameState = gson.fromJson(obj.toString(), GameState.class);
			stateListeners.forEach(stateListener -> stateListener.UpdateGameState(gameState));
		} catch (JsonSyntaxException e) {
			//don't do anything, invalid GameState object should not be handled
		}
	}

}
