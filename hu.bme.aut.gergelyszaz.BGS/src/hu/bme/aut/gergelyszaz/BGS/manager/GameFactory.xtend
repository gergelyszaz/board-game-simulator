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
		val decks=new ArrayList<Deck>

		//Player setup
		for (var id = 0; id < model.player.playercount; id++) {
			val player = new Player(id+1)
			players.add(player)
			for(s:model.player.variables){
				vm.Store(s,player)
			}
		}

		vm.StoreToObject_Name(null, VariableManager.NULL, null);
		for(s:model.board.variables){
			vm.Store(s,null)
		}


		//Add fields to vm
		for(f:model.board.fields){
			vm.StoreToObject_Name(null, f.name, f)
		}

		//store and fill all decks
		for(d: model.board.decks){
			var cards=new Stack<Card>();
			for(c:d.cards){
				var nc=new Card(vm,c)
				cards.add(nc);
				for(s:c.variables){
					vm.Store(s,nc)
				}

			}
			var deck=new Deck(vm,cards,null,d.visibility);
			decks.add(deck);
			vm.StoreToObject_Name(null, d.name, deck);
			vm.StoreToObject_Name(deck, VariableManager.OWNER, null);
		}

		//store and fill all player decks
		for(d : model.player.decks){
			//the same cards are in each deck
			for(p:players){
				var cards=new Stack<Card>();
				for(c:d.cards){
					cards.add(new Card(vm,c));
					for(s:c.variables){
						vm.Store(s,c)
					}
				}
				var deck=new Deck(vm,cards,p,d.visibility);
				decks.add(deck);
				vm.StoreToObject_Name(p, d.name, deck);
				vm.StoreToObject_Name(deck, VariableManager.OWNER, p);
			}
		}


		//////Variable assagnments start here

		// store all field variable
		for (f : model.board.fields) {
			vm.StoreToObject_Name(f, "tokenCount", 0)
			for (v : f.variables) {
				vm.Store(v, f)
			}
		}

		game.Init(model, players, decks);
		return game;
	}


}


