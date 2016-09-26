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
		var variableManager=new VariableManager
		val game = new Game(variableManager)
		val players = new ArrayList<Player>
		val decks=new ArrayList<Deck>

		//Player setup
		for (var id = 0; id < model.player.playercount; id++) {
			val generatedId=id+1;
			val player = new Player(generatedId)
			players.add(player)
			for(variableModel:model.player.variables){
				variableManager.Store(variableModel,player)
			}
		}

		variableManager.StoreToObjectWithName(null, VariableManager.NULL, null);
		for(variable:model.board.variables){
			variableManager.Store(variable,null)
		}


		for(field:model.board.fields){
			variableManager.StoreToObjectWithName(null, field.name, field)
		}

		for(deckModel: model.board.decks){
			var cardModels=new Stack<Card>();
			for(cardModel:deckModel.cards){
				var card=new Card(variableManager,cardModel)
				cardModels.add(card);
				for(variable:cardModel.variables){
					variableManager.Store(variable,card)
				}

			}
			var deck=new Deck(variableManager,cardModels,null,deckModel.visibility);
			decks.add(deck);
			variableManager.StoreToObjectWithName(null, deckModel.name, deck);
			variableManager.StoreToObjectWithName(deck, VariableManager.OWNER, null);
		}


		for(deckModel : model.player.decks){
			for(player:players){
				var cards=new Stack<Card>();
				for(cardModel:deckModel.cards){
					cards.add(new Card(variableManager,cardModel));
					for(variable:cardModel.variables){
						variableManager.Store(variable,cardModel)
					}
				}
				var deck=new Deck(variableManager,cards,player,deckModel.visibility);
				decks.add(deck);
				variableManager.StoreToObjectWithName(player, deckModel.name, deck);
				variableManager.StoreToObjectWithName(deck, VariableManager.OWNER, player);
			}
		}


		//////Variable assagnments start here

		// store all field variable
		for (fieldModel : model.board.fields) {
			variableManager.StoreToObjectWithName(fieldModel, "tokenCount", 0)
			for (v : fieldModel.variables) {
				variableManager.Store(v, fieldModel)
			}
		}

		game.Init(model, players, decks);
		return game;
	}

}


