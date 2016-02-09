package hu.bme.aut.gergelyszaz.BGS.core

import java.awt.Color
import java.util.Random

class Player {
	String ID
	Color color
	String userName

	new(int id) {
		ID = null
		val r = new Random(id + 360)
		color = new Color(r.nextFloat, r.nextFloat, r.nextFloat)
		userName="Player "+id
	}

	def getColor() { color }

	def String getId() {
		return ID
	}

	def String getName() {
		userName
	}

	def void setId(String id) {
		ID = id
	}

	def boolean IsConnected() {
		return ID != null
	}

}
