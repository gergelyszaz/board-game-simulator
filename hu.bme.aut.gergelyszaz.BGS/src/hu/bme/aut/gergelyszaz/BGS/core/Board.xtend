package hu.bme.aut.gergelyszaz.BGS.core

import java.util.List
import java.util.Hashtable

class Board {
	List<Node> nodes
	Hashtable<String, Integer> attributes

	def Init(List<Node> n, Hashtable<String, Integer> attr) {
		nodes = n
		attributes = attr
	}
}
