package hu.bme.aut.gergelyszaz.BGS.manager

import hu.bme.aut.gergelyszaz.BGS.core.Game

import hu.bme.aut.gergelyszaz.BGS.core.model.Player
import hu.bme.aut.gergelyszaz.bGL.Model
import java.util.ArrayList
import hu.bme.aut.gergelyszaz.BGS.core.VariableManager
import java.util.Stack
import hu.bme.aut.gergelyszaz.BGS.core.model.Card
import hu.bme.aut.gergelyszaz.BGS.core.model.Deck

class GameFactory {
	def CreateGame(Model model) {
		var vm=new VariableManager
		val game = new Game(vm)
		val players = new ArrayList<Player>
		
		//Player setup
		for (var id = 0; id < model.player.playercount; id++) {
			val player = new Player(id+1)
			players.add(player)
		}


		for(d : model.player.decks){
			var cards=new Stack<Card>();
			for(c:d.cards){
				cards.add(new Card(vm,c));
			}
			var deck=new Deck(vm,cards);
		}


		game.Init(model.name, players, model);
		return game;
	}
}
