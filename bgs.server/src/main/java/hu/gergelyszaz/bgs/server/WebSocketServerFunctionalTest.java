package hu.gergelyszaz.bgs.server;

import static org.junit.Assert.fail;

import java.net.URI;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.websocket.WebSocket;
import org.eclipse.jetty.websocket.WebSocket.Connection;
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

	@Test
	void testRunServer() throws Exception {
		URI uri = new URI("ws://localhost:8025/game");
		MessageListener messageListener = new MessageListener();
		Future<Connection> connectionFuture = 
			new WebSocketClient().open(uri, messageListener);
		Connection connection = connectionFuture.get(2, TimeUnit.SECONDS);

		connection.sendMessage("{\"action\":\"info\"}");

		synchronized (messageListener) {
			messageListener.wait();			
		}
		connection.close();
	}

	private static class MessageListener implements WebSocket.OnTextMessage {
		@Override
		public void onOpen(Connection connection) {
		}

		@Override
		public void onClose(int closeCode, String message) {
			fail("Connection should close normally");
		}

		@Override
		public void onMessage(String data) {
			System.out.println(data);
			
			String expectedMessage = "{\"games\":[{\"name\":\"Mills\"},{\"name\":\"TicTacToe\"},{\"name\":\"Uno\"}],\"status\":\"ok\"}";
			
			if(data.contains(expectedMessage)) {
				synchronized (this) {
					this.notify();					
				}

			}
		}
	}

}
