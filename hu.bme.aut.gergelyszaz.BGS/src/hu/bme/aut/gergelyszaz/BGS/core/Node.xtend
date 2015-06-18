package hu.bme.aut.gergelyszaz.BGS.core

import java.util.List

class Node {
	int X
	int Y
	int Z
	List<Node> neighbours
	String ID

	new(String id,int x, int y, int z) {
		ID = id
		X = x
		Y = y
		Z = z
	}

	def Init( List<Node> n) {
		neighbours = n
	}

	def Equals(Node n2) {
		ID == n2.ID
	}
}
