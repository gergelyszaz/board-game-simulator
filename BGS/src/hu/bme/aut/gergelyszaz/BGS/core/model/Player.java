package hu.bme.aut.gergelyszaz.BGS.core.model;

import java.awt.*;

public class Player {
	String sessionID;
	Color color;
	String userName;
	int uniqueID;

	public Player(int id) {
		sessionID = null;
		uniqueID=id		;
		userName="Player";
	}

	public Color getColor() { return color ;}

	public String getSessionID() {
		return sessionID;
	}

	public String getName() {
		return userName;
	}

	public void setSessionID(String id) {
		sessionID = id;
	}

	public boolean IsConnected() {
		return sessionID != null;
	}


}
