package hu.bme.aut.gergelyszaz.BGS.client;

import org.glassfish.tyrus.client.ClientManager;
import org.json.JSONObject;

import javax.websocket.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;

@ClientEndpoint
public class BGSClient {
	private static CountDownLatch latch;
	private Logger logger = Logger.getLogger(this.getClass().getName());
	private Session session = null;
	private static ConcurrentHashMap<String, IMessageReciever> recievers = new ConcurrentHashMap<String, IMessageReciever>();

	public void SendMessage(JSONObject obj) {
		try {
			latch.await();
			logger.info("Sending: " + obj.toString());
			session.getBasicRemote().sendText(obj.toString());
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (InterruptedException e) {

		}
	}

	@OnOpen
	public void onOpen(Session session) {
		logger.info("Connected ... " + session.getId());
	}

	@OnMessage
	public String onMessage(String message, Session session) {
		logger.info("Received: " + message);
		JSONObject obj = new JSONObject(message);
		recievers.get(session.getId()).RecieveMessage(obj);
		return "got message";
	}

	@OnClose
	public void onClose(Session session, CloseReason closeReason) {
		logger.info(String.format("Session %s close because of %s", session.getId(), closeReason));

	}

	public boolean Connect(String address, IMessageReciever messageReciever) {

		try {
			URI uri;

			uri = new URI(address);

			ClientManager client = ClientManager.createClient();
			latch = new CountDownLatch(1);
			session = client.connectToServer(BGSClient.class, uri);
			recievers.put(session.getId(), messageReciever);
			latch.countDown();

		} catch (DeploymentException | URISyntaxException e) {
			logger.info(e.getMessage());
			return false;

		}
		return true;
	}
}