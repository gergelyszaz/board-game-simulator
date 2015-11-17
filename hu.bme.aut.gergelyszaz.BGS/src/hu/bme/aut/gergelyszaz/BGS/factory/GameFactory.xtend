package hu.bme.aut.gergelyszaz.BGS.factory

import hu.bme.aut.gergelyszaz.BGS.core.Game

import hu.bme.aut.gergelyszaz.BGS.core.Player
import hu.bme.aut.gergelyszaz.bGL.Model
import java.util.ArrayList
import java.util.Hashtable


class GameFactory {
	def CreateGame(Model model) {
		val game = new Game
		val players = new ArrayList<Player>

		//Board setup 
		val boardAttributes = new Hashtable<String, Integer>
		for (a : model.board.attributes) {
			boardAttributes.put(a.name, 0)
		}


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


		game.Init(model.name, players, model)
		game
	}
}
