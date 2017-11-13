package hu.gergelyszaz.bgs.game.internal;

import java.awt.*;

public class Player {
	String sessionID;
	Color color;
	String userName;
	int uniqueID;

	public Player(int id) {
		sessionID = null;
		uniqueID = id;
		userName = "Player";
	}

	public Color getColor() {
		return color;
	}

	public String getSessionID() {
		return sessionID;
	}

	public void setSessionID(String id) {
		sessionID = id;
	}

	public String getName() {
		return userName;
	}

	public boolean IsConnected() {
		return sessionID != null;
	}

}
