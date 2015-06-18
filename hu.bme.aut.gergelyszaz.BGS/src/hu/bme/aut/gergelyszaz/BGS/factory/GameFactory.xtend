package hu.bme.aut.gergelyszaz.BGS.factory

import hu.bme.aut.gergelyszaz.bGL.Model
import hu.bme.aut.gergelyszaz.BGS.core.*
import java.util.ArrayList
import java.util.Hashtable

class GameFactory {
	def CreateGame(Model model) {
		val game = new Game
		val players = new ArrayList<Player>
		val board = new Board

		//Board setup 
		val nodes = new Hashtable<String, Node>;
		for (f : model.board.fields) {
			nodes.put(f.name, new Node(f.name, f.x, f.y, f.z))
		}
		for (f : model.board.fields) {
			val nodelist = new ArrayList<Node>
			for (n : f.neighbours) {
				nodelist.add(nodes.get(n.name))
			}
			nodes.get(f.name).Init(nodelist)
		}

		val boardAttributes = new Hashtable<String, Integer>
		for (a : model.board.attributes) {
			boardAttributes.put(a.name, 0)
		}

		board.Init(new ArrayList<Node>(nodes.values), boardAttributes)

		//Player setup
		for (var id = 0; id < model.player.playercount; id++) {
			val player = new Player(id)
			val playerAttributes = new Hashtable<String, Integer>
			for (a : model.player.attributes) {
				boardAttributes.put(a.name, 0)
			}
			player.Init(playerAttributes)
			players.add(player)
		}

		//Token setup
		for (t : model.tokens.tokentypes) {
			var token = new Token(t.name)
			
			val tokenAttributes = new Hashtable<String, Integer>
			for (a : model.board.attributes) {
				boardAttributes.put(a.name, 0)
			}

		}

		game.Init(model.name, board, players)
		game
	}
}
