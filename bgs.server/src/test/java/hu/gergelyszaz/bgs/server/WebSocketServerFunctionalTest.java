package hu.gergelyszaz.bgs.server;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
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

	public static Session createClient(String name) throws Exception {

		URI uri = new URI(WS_URI);
		Session client;
		synchronized (uri) {
			client = ClientManager.createClient().connectToServer(Client.class, uri);

			uri.wait();
		}

		return client;
	}

	@Test
	public void testInfo() throws Exception {
		try (Client client1 = new Client("C1")) {
			JSONObject answer = client1.sendMessage("info", "");

			assertEquals("ok", answer.getString("status"));
			assertTrue(answer.has("games"));
		}
	}

	@Test
	public void testJoinGame() throws Exception {
		try (Client client1 = new Client("C1"); Client client2 = new Client("C2")) {
			JSONObject answer = client1.sendMessage("join", "Mills");

			assertEquals("ok", answer.getString("status"));
		}
	}

	@Test
	public void testUpdates() throws Exception {
		try (Client client1 = new Client("C1"); Client client2 = new Client("C2")) {
			client1.sendMessage("join", "Mills");
			client2.sendMessage("join", "Mills");

			client1.waitForMessages(1);
			JSONObject message = new JSONObject(client1.messageQueue.get(0));

			assertTrue(message.has("players"));
			assertTrue(message.has("fields"));
			assertTrue(message.has("selectables"));
			assertTrue(message.has("tokens"));
			assertTrue(message.has("playerID"));
			assertTrue(message.has("name"));
			assertTrue(message.has("winners"));
			assertTrue(message.has("losers"));
			assertTrue(message.has("decks"));
			assertTrue(message.has("version"));
		}
	}

	@Test
	public void testMultipleJoins() throws Exception {
		try (Client client1 = new Client("C1")) {
			JSONObject answer1 = client1.sendMessage("join", "Mills");
			JSONObject answer2 = client1.sendMessage("join", "Mills");

			assertEquals("ok", answer1.getString("status"));
			assertEquals("error", answer2.getString("status"));
		}
	}

	private static class Client implements Closeable {
		public Client(String name) throws Exception {
			session = ClientManager.createClient().connectToServer(ClientEnd.class, new URI(WS_URI));
			session.getUserProperties().put("client", this);
		}

		@ClientEndpoint
		public static class ClientEnd {

			@OnOpen
			public void onOpen(Session session) {
				synchronized (this) {
					this.notify();
				}
			}

			@OnClose
			public void onClose(Session session, CloseReason closeReason) {
				if (closeReason.getCloseCode() != CloseCodes.NORMAL_CLOSURE)
					fail("Connection should close normally");
			}

			@OnMessage
			public void onMessage(String data, Session session) {
				Client client = (Client) session.getUserProperties().get("client");
				JSONObject message = new JSONObject(data);
				if (message.has("status")) {
					synchronized (session) {
						client.answer = data;
						session.notify();
					}
				} else {
					synchronized (client.messageQueue) {
						client.messageQueue.add(data);
						client.messageQueue.notify();
					}
				}

			}
		}

		@Override
		public void close() throws IOException {
			session.close();
		}

		public void waitForMessages(int totalNumber) throws Exception {
			synchronized (messageQueue) {
				int initialSize = messageQueue.size();
				if (messageQueue.size() < totalNumber) {
					messageQueue.wait(500);
				}
				if (messageQueue.size() == initialSize) {
					throw new Exception("No message received!");
				}

			}
		}

		public JSONObject sendMessage(String action, String parameter) throws Exception {
			synchronized (session) {
				session.getBasicRemote()
						.sendText("{\"action\":\"" + action + "\",\"parameter\":\"" + parameter + "\"}");
				session.wait();
			}
			return new JSONObject(answer);
		}

		private Session session;
		private String answer;
		public List<String> messageQueue = new ArrayList<>();
	}
}
