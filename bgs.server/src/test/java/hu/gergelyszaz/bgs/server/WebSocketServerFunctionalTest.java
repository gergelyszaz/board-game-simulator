package hu.gergelyszaz.bgs.server;

import static org.junit.Assert.fail;
import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
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
			client1.sendMessage("info", "");

			client1.assertMessageReceived(m -> m.get("status").equals("ok") && m.has("games"));
		}
	}

	@Test
	public void testJoinGame() throws Exception {
		try (Client client1 = new Client("C1")) {
			client1.sendMessage("join", "Mills");

			Predicate<JSONObject> filterStatusOk = m -> m.get("status").equals("ok");
			client1.assertMessageReceived(filterStatusOk);
		}
	}

	@Test
	@Ignore
	public void testUpdates() throws Exception {
		try (Client client1 = new Client("C1"); Client client2 = new Client("C2")) {
			client1.sendMessage("join", "Mills");
			client2.sendMessage("join", "Mills");

			Predicate<JSONObject> filterStatusOk = m -> m.get("status").equals("ok");
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
		try (Client client1 = new Client("C1")) {
			client1.sendMessage("join", "Mills");
			client1.sendMessage("join", "Mills");

			client1.assertMessageReceived(m -> m.get("status").equals("ok"));
			client1.assertMessageReceived(m -> m.get("status").equals("error"));
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
				synchronized (session) {
					Client client = (Client) session.getUserProperties().get("client");
					JSONObject message = new JSONObject(data);
					client.messageQueue.add(message);
					session.notify();
				}
			}
		}

		@Override
		public void close() throws IOException {
			session.close();
		}

		public void assertMessageReceived(Predicate<JSONObject> filter) throws Exception {
			synchronized (session) {
				if (messageQueue.removeIf(filter)) {
					return;
				}

				session.wait(500);
				if (!messageQueue.removeIf(filter)) {
					fail();
				}
			}
		}

		public void sendMessage(String action, String parameter) throws Exception {
			session.getBasicRemote().sendText("{\"action\":\"" + action + "\",\"parameter\":\"" + parameter + "\"}");
		}

		private Session session;
		public volatile List<JSONObject> messageQueue = new ArrayList<>();
	}
}
