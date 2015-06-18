package hu.bme.aut.gergelyszaz.BGS.core

import java.util.List

class Game {
	String name
	Board board
	List<Player> players
	def Init(String n, Board b, List<Player> p)
	{
		name=n
		board=b
		players=p	
	}
	def Run()
	{
		println(name+"     playercount "+players.size) 
	}
}