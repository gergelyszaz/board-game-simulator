package hu.gergelyszaz.bgs.server;

import static org.junit.Assert.fail;

import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.jetty.websocket.WebSocket;
import org.eclipse.jetty.websocket.WebSocketClient;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WebSocketServerFunctionalTest {

	@BeforeEach
	void setUp() {
		WebSocketServer.runServer("0.0.0.0", 8025, "", "/config/games.properties");
	}

	@AfterEach
	void tearDown() {
		WebSocketServer.stopServer();
	}
	
	public static Client createClient(String name) throws Exception {
		Client client = new Client("C1");
		
		URI uri = new URI("ws://localhost:8025/game");
		
		new WebSocketClient().open(uri, client);
		
		synchronized (client) {
			client.wait();
		}
		
		return client;
	}

	@Test
	void testRunServer() throws Exception {
		try (Client client1 = createClient("C1"); Client client2 = createClient("C2")) {
			client1.sendMessage("info", "");
			client1.sendMessage("join", "Mills");
			client2.sendMessage("join", "Mills");
		}
	}

	private static class Client implements WebSocket.OnTextMessage, Closeable {
		public Client(String name) {
			this.name = name;
		}
		Connection connection;
		private String name;

		@Override
		public void onOpen(Connection connection) {
			this.connection = connection;
			synchronized (this) {
				this.notify();
			}
		}

		public void close() {
			connection.close();
		}

		@Override
		public void onClose(int closeCode, String message) {
			fail("Connection should close normally");
		}

		@Override
		public void onMessage(String data) {
			synchronized (connection) {
				System.out.println(name+":\t"+data);
				connection.notify();
			}
		}

		public void sendMessage(String action, String parameter) throws Exception {
			synchronized (connection) {
				connection.sendMessage("{\"action\":\"" + action + "\",\"parameter\":\"" + parameter + "\"}");
				connection.wait();
			}
		}
	}
}
