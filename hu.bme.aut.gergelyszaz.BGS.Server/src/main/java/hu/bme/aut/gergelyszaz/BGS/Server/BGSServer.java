package hu.bme.aut.gergelyszaz.BGS.Server;
 
import java.io.IOException;
import java.util.UUID;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.websocket.CloseReason;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.CloseReason.CloseCodes;
import javax.websocket.server.ServerEndpoint;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import hu.bme.aut.gergelyszaz.BGS.core.Game;
import hu.bme.aut.gergelyszaz.BGS.core.GameManager;
import hu.bme.aut.gergelyszaz.BGS.state.GameState;
 
@ServerEndpoint(value = "/game")
public class BGSServer {
 
	@Inject
	private GameManager gm=GameManager.getInstance();
    private Logger logger = Logger.getLogger(this.getClass().getName());
 
    @OnOpen
    public void onOpen(Session session) {
    	logger.info("Connected ... " + session.getId());
    }
 
    
    @OnMessage
    public String onMessage(String message, Session session) {
    	final JSONObject obj = new JSONObject(message);
    	String action=obj.getString("action");
    	JSONObject ret=new JSONObject();
        switch (action) {
        case "join":
        	String gameName=obj.getString("game");
        	try {
        		logger.info(session.getId());
        		gm.JoinGame(session.getId(),gameName);
        		return ret.put("status", "Joined").toString();
			} catch (Exception e) {
				logger.info(e.getMessage());
				return ret.put("error", e.getMessage()).toString();
			}
        case "update":
        	GameState gs=gm.getCurrentState(session.getId());
        	logger.info(gs.toString());
        	return GameToJsonSerializer.JSONify(gs).toString();
        case "info":
        	ret.put("runningGames", gm.runningGames.size());
        	JSONArray games = new JSONArray();
        	ret.put("availableGames",gm.availableGames.size());
        	ret.put("playerConnections",gm.playerConnections.size());
        	for(String g:gm.mm.AvailableModels())
        	{
        		games.put(new JSONObject().put("name", g));
        	}
        	ret.put("models", games);
        	return ret.toString();
        case "quit":
            logger.info("Quitting the game");
            try {
                session.close(new CloseReason(CloseCodes.NORMAL_CLOSURE, "Game finished"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
		return ret.put("error", "No Action").toString();
    }
 
    @OnClose
    public void onClose(Session session, CloseReason closeReason) {
        logger.info(String.format("Session %s closed because of %s", session.getId(), closeReason));
    }
 
    private String checkLastWordAndSendANewWord(String scrambledWord, String unscrambledWord, Session session) {
    	//Only left sample code which may be relevant in the future. 
        session.getUserProperties().put("scrambledWord", new Object());
        return String.format("You guessed it right. Try the next word ...  %s", new Object());
    }
}