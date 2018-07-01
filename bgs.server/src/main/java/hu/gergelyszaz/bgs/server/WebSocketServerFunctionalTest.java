package hu.gergelyszaz.bgs.server;

import static org.junit.Assert.fail;

import java.io.Closeable;
import java.net.URI;

import javax.websocket.CloseReason.CloseCode;
import javax.websocket.CloseReason.CloseCodes;

import org.eclipse.jetty.websocket.WebSocket;
import org.eclipse.jetty.websocket.WebSocketClient;
import org.eclipse.jetty.websocket.WebSocketClientFactory;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WebSocketServerFunctionalTest {

	private static final WebSocketClientFactory CLIENT_FACTORY = new WebSocketClientFactory();

	@BeforeEach
	void setUp() throws Exception {
		WebSocketServer.runServer("0.0.0.0", 8025, "", "/config/games.properties");
		CLIENT_FACTORY.start();
	}

	@AfterEach
	void tearDown() {
		CLIENT_FACTORY.destroy();
		WebSocketServer.stopServer();
	}

	public static Client createClient(String name) throws Exception {
		Client client = new Client(name);

		URI uri = new URI("ws://localhost:8025/game");

		synchronized (client) {
			CLIENT_FACTORY.newWebSocketClient().open(uri, client);
			client.wait();
		}

		return client;
	}

	@Test
	void testInfo() throws Exception {
		try (Client client1 = createClient("C1")) {
			JSONObject answer = client1.sendMessage("info", "");

			Assert.assertEquals("ok", answer.getString("status"));
			Assert.assertTrue(answer.has("games"));
		}
	}

	@Test
	void testJoinGame() throws Exception {
		try (Client client1 = createClient("C1"); Client client2 = createClient("C2")) {
			JSONObject answer1 = client1.sendMessage("join", "Mills");
			JSONObject answer2 = client2.sendMessage("join", "Mills");

			Assert.assertEquals("ok", answer1.getString("status"));
			Assert.assertEquals("ok", answer2.getString("status"));

			answer2 = client2.sendMessage("update", "");
		}
	}

	@Test
	void testMultipleJoins() throws Exception {
		try (Client client1 = createClient("C1")) {
			JSONObject answer1 = client1.sendMessage("join", "Mills");
			JSONObject answer2 = client1.sendMessage("join", "Mills");

			Assert.assertEquals("ok", answer1.getString("status"));
			Assert.assertEquals("error", answer2.getString("status"));

		}
	}

	private static class Client implements WebSocket.OnTextMessage, Closeable {
		public Client(String name) {
			this.name = name;
		}

		Connection connection;
		private String name;

		public String lastReceivedMessage;

		@Override
		public void onOpen(Connection connection) {
			this.connection = connection;
			synchronized (this) {
				this.notify();
			}
		}

		@Override
		public void close() {
			connection.close();
		}

		@Override
		public void onClose(int closeCode, String message) {
			if (CloseCodes.getCloseCode(closeCode) != CloseCodes.NORMAL_CLOSURE)
				fail("Connection should close normally");
		}

		@Override
		public void onMessage(String data) {
			synchronized (connection) {
				System.out.println(name + ":\t" + data);
				lastReceivedMessage = data;
				connection.notify();
			}
		}

		public JSONObject sendMessage(String action, String parameter) throws Exception {
			synchronized (connection) {
				connection.sendMessage("{\"action\":\"" + action + "\",\"parameter\":\"" + parameter + "\"}");
				connection.wait();
			}
			return new JSONObject(lastReceivedMessage);
		}
	}
}
