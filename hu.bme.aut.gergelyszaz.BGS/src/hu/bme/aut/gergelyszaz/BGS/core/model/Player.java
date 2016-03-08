package hu.bme.aut.gergelyszaz.BGS.core.model;

import hu.bme.aut.gergelyszaz.BGS.manager.IDGenerator.GGID;

import java.awt.*;

public class Player implements GGID {
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

	@Override
	public int getUniqueID() {
		return uniqueID;
	}

}
