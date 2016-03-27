package hu.bme.aut.gergelyszaz.BGS.manager

import hu.bme.aut.gergelyszaz.BGS.core.Game

import hu.bme.aut.gergelyszaz.BGS.core.model.Player
import hu.bme.aut.gergelyszaz.bGL.Model
import java.util.ArrayList
import hu.bme.aut.gergelyszaz.BGS.core.VariableManager
import java.util.Stack
import hu.bme.aut.gergelyszaz.BGS.core.model.Card
import hu.bme.aut.gergelyszaz.BGS.core.model.Deck
import java.util.HashSet

class GameFactory {
	def CreateGame(Model model) {
		var vm=new VariableManager
		val game = new Game(vm)
		val players = new ArrayList<Player>
		val decks=new ArrayList<Deck>
		
		//Player setup
		for (var id = 0; id < model.player.playercount; id++) {
			val player = new Player(id+1)
			players.add(player)
		}

		vm.StoreToObject_Name(null, VariableManager.NULL, null);

		//store and fill all decks
		for(d: model.board.decks){
			var cards=new Stack<Card>();
			for(c:d.cards){
				cards.add(new Card(vm,c));
			}
			var deck=new Deck(vm,cards);
			decks.add(deck);
			vm.StoreToObject_Name(null, d.name, deck);
		}

		//store and fill all player decks
		for(d : model.player.decks){
			//the same cards are in each deck
			for(p:players){
				var cards=new Stack<Card>();
				for(c:d.cards){
					cards.add(new Card(vm,c));
				}
				var deck=new Deck(vm,cards);
				decks.add(deck);
				vm.StoreToObject_Name(p, d.name, deck);
				vm.StoreToObject_Name(deck, VariableManager.OWNER, p);
			}
		}

		// store all field
		for (f : model.board.fields) {
			vm.StoreToObject_Name(null, f.name, f)
			vm.StoreToObject_Name(f, "tokenCount", 0)
			for (v : f.variables) {
				vm.Store(v, f)
			}
		}

		game.Init(model, players, decks);
		return game;
	}


}


