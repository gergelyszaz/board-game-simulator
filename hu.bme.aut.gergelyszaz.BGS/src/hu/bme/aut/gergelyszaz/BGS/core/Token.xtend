package hu.bme.aut.gergelyszaz.BGS.core

import java.util.Hashtable

class Token {
	String type
	Node place
	Hashtable<String, Integer> attributes
	
	new(String t) {
		type = t
		place = null
	}
	
	def Init(Hashtable<String, Integer> attr)
	{
		attributes=attr
	}

	def setPlace(Node p) {
		place = p
	}

	def getPlace() { place }
}
