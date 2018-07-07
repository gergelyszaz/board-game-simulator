package hu.gergelyszaz.bgs.server;

import static org.junit.Assert.fail;
import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;
import javax.websocket.ClientEndpoint;
import javax.websocket.CloseReason;
import javax.websocket.CloseReason.CloseCodes;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import org.glassfish.tyrus.client.ClientManager;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WebSocketServerFunctionalTest {

	private static final String WS_URI = "ws://localhost:8025/game";

	@Before
	public void setUp() throws Exception {
		WebSocketServer.runServer(null, 8025, null, "/config/games.properties");
	}

	@After
	public void tearDown() {
		WebSocketServer.stopServer();
	}

	@Test
	public void testInfo() throws Exception {
		try (Client client1 = new Client("C1")) {
			client1.sendMessage("info", "");

			client1.assertMessageReceived(m -> m.has("games"));
		}
	}

	@Test
	public void testJoinGame() throws Exception {
		try (Client client1 = new Client("C2")) {
			client1.sendMessage("join", "Mills");

			Predicate<JSONObject> filterStatusOk = m -> m.has("status") && m.get("status").equals("ok");
			client1.assertMessageReceived(filterStatusOk);
		}
	}

	@Test
	public void testIncorrectMessage() throws Exception {
		try (Client client1 = new Client("C3"); Client client2 = new Client("C4")) {
			client1.session.getBasicRemote().sendText("INVALID MESSAGE");
			client1.sendMessage("info", "");
			client1.assertMessageReceived(m -> m.has("status") && m.getString("status").equals("ok"));
		}
	}


	@Test
	public void testUpdates() throws Exception {
		try (Client client1 = new Client("C5"); Client client2 = new Client("C6")) {
			client1.sendMessage("join", "Mills");
			client2.sendMessage("join", "Mills");

			Predicate<JSONObject> filterStatusOk = m -> m.has("status") && m.get("status").equals("ok");
			client1.assertMessageReceived(filterStatusOk);
			client2.assertMessageReceived(filterStatusOk);

			Predicate<JSONObject> filterGameState = m -> m.has("players") && m.has("fields") && m.has("playerID")
					&& m.has("name") && m.has("winners") && m.has("losers") && m.has("selectables") && m.has("tokens")
					&& m.has("decks") && m.has("version");

			client1.assertMessageReceived(filterGameState);
			client2.assertMessageReceived(filterGameState);
		}
	}

	@Test
	public void testMultipleJoins() throws Exception {
		try (Client client1 = new Client("C7")) {
			client1.sendMessage("join", "Mills");
			client1.sendMessage("join", "Mills");

			client1.assertMessageReceived(m -> m.has("status") && m.get("status").equals("ok"));
			client1.assertMessageReceived(m -> m.has("status") && m.get("status").equals("error"));
		}
	}

	private static class Client implements Closeable {
		public String name;

		public Client(String name) throws Exception {
			this.name = name;
			session = ClientManager.createClient().connectToServer(ClientEnd.class, new URI(WS_URI));
			session.getUserProperties().put("client", this);
		}

		@ClientEndpoint
		public static class ClientEnd {

			@OnClose
			public void onClose(Session session, CloseReason closeReason) {
				if (closeReason.getCloseCode() != CloseCodes.NORMAL_CLOSURE)
					fail("Connection should close normally");
			}

			@OnMessage
			public void onMessage(String data, Session session) {
				Client client = (Client) session.getUserProperties().get("client");
				synchronized (client) {
					System.out.println(client.name + ": " + data);
					JSONObject message = new JSONObject(data);
					client.messageQueue.add(message);
					client.notify();
				}
			}
		}

		@Override
		public void close() throws IOException {
			session.close();
		}

		public synchronized void assertMessageReceived(Predicate<JSONObject> filter) throws Exception {
			if (!messageQueue.stream().anyMatch(filter)) {
				this.wait(500);
			}

			if (!messageQueue.removeIf(filter)) {
				fail();
			}
		}

		public synchronized void sendMessage(String action, String parameter) throws Exception {
			session.getBasicRemote().sendText("{\"action\":\"" + action + "\",\"parameter\":\"" + parameter + "\"}");
			this.wait(500);
		}

		private Session session;
		public volatile List<JSONObject> messageQueue = new ArrayList<>();
	}
}
