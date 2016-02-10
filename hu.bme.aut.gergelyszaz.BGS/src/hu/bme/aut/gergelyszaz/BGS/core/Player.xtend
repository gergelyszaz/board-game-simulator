package hu.bme.aut.gergelyszaz.BGS.core

import java.awt.Color
import hu.bme.aut.gergelyszaz.BGS.manager.IDGenerator.GGID

class Player implements GGID {
	String sessionID
	Color color
	String userName
	int uniqueID

	new(int id) {
		sessionID = null
		uniqueID=id		
		userName="Player"
	}

	def getColor() { color }

	def String getSessionID() {
		return sessionID
	}

	def String getName() {
		userName
	}

	def void setSessionID(String id) {
		sessionID = id
	}

	def boolean IsConnected() {
		return sessionID != null
	}
	
	override getUniqueID() {
		return uniqueID
	}

}
