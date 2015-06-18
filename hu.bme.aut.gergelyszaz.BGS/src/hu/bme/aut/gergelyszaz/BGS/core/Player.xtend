package hu.bme.aut.gergelyszaz.BGS.core

import java.util.Hashtable

class Player {
	int ID
	Hashtable<String, Integer> attributes

	new(int id) {
		ID = id
	}

	def Init(Hashtable<String, Integer> hashtable) {
		attributes = hashtable
	}

}
