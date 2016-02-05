package hu.bme.aut.gergelyszaz.BGS.client;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;

import javax.websocket.ClientEndpoint;
import javax.websocket.CloseReason;
import javax.websocket.DeploymentException;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;

import org.glassfish.tyrus.client.ClientManager;
import org.json.JSONObject;

@ClientEndpoint
public class BGSClient {

	private Logger logger = Logger.getLogger(this.getClass().getName());
	private Session session = null;
	private IMessageReciever messageReciever = null;

	public void setMessageReciever(IMessageReciever a) {
		messageReciever = a;
	}

	public void SendMessage(JSONObject obj) {
		try {
			latch.await();
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
		messageReciever.RecieveMessage(obj);
		return "";
	}

	private static CountDownLatch latch;

	@OnClose
	public void onClose(Session session, CloseReason closeReason) {
		logger.info(String.format("Session %s close because of %s", session.getId(), closeReason));
		
	}

	public void Connect(URI uri) {
		ClientManager client = ClientManager.createClient();
		latch = new CountDownLatch(1);

		try {
			session=client.connectToServer(BGSClient.class, uri);
			latch.countDown();

		} catch (DeploymentException e) {
			throw new RuntimeException(e);
		}
	}
}