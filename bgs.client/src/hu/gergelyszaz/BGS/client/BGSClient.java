package hu.gergelyszaz.BGS.client;

import javax.websocket.*;
import java.util.logging.Logger;

@ClientEndpoint
public class BGSClient {
	private Logger logger = Logger.getLogger(this.getClass().getName());

	@OnOpen
	public void onOpen(Session session) {
		logger.info("Connected ... " + session.getId());
	}

	@OnMessage
	public String onMessage(String message, Session session) {
		logger.info("Received: " + message);
		Connection.processMessage(session.getId(), message);
		return "ok";
	}

	@OnClose
	public void onClose(Session session, CloseReason closeReason) {
		logger.info(String.format("Session %s close because of %s", session.getId(), closeReason));

	}

}