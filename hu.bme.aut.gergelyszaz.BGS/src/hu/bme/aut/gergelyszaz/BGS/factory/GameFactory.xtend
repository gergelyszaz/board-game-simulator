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
		
		//Player setup
		for (var id = 0; id < model.player.playercount; id++) {
			val player = new Player(id+1)
			players.add(player)
		}


		game.Init(model.name, players, model)
		game
	}
}
