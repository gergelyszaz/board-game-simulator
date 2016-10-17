package hu.bme.aut.gergelyszaz.BGS.manager;

import hu.bme.aut.gergelyszaz.BGS.core.Game;
import hu.bme.aut.gergelyszaz.BGS.core.VariableManager;
import hu.bme.aut.gergelyszaz.BGS.core.model.Card;
import hu.bme.aut.gergelyszaz.BGS.core.model.Deck;
import hu.bme.aut.gergelyszaz.BGS.core.model.Player;
import hu.bme.aut.gergelyszaz.bGL.Field;
import hu.bme.aut.gergelyszaz.bGL.Model;
import hu.bme.aut.gergelyszaz.bGL.SimpleAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GameFactory {

	public Game CreateGame(Model model) throws IllegalAccessException {

		VariableManager variableManager = new VariableManager();
		List<Player> players = _setupPlayers(model, variableManager);
		List<Deck> decks = _setupDecks(model, variableManager);
		_setupPlayerDecks(model, variableManager, players, decks);
		_setupGlobalVariables(model, variableManager);
		_setupFields(model, variableManager);
		Game game = new Game(variableManager);
		game.Init(model, players, decks);
		return game;
	}

	private List<Player> _setupPlayers(Model model, VariableManager
		 variableManager) throws IllegalAccessException {

		List<Player> players = new ArrayList<>();
		for (int id = 0; id < model.getPlayer().getPlayercount(); id++) {
			int generatedId = id + 1;
			Player player = new Player(generatedId);
			players.add(player);
			for (SimpleAssignment variableModel : model.getPlayer()
				 .getVariables()) {
				String variableName = variableModel.getName();
				Object reference = variableManager.GetReference(variableModel
					 .getAttribute());
				variableManager.Store(player, variableName, reference);
			}
		}
		return players;
	}

	private List<Deck> _setupDecks(Model model, VariableManager variableManager)
		 throws IllegalAccessException {

		List<Deck> decks = new ArrayList<>();

		for (hu.bme.aut.gergelyszaz.bGL.Deck deckModel : model.getBoard()
			 .getDecks()) {
			Stack<Card> cardModels = new Stack<Card>();
			for (hu.bme.aut.gergelyszaz.bGL.Card cardModel : deckModel
				 .getCards()) {
				Card card = new Card(variableManager, cardModel);
				cardModels.add(card);
				for (SimpleAssignment variable : cardModel.getVariables()) {
					String variableName = variable.getName();
					Object reference = variableManager.GetReference(variable
						 .getAttribute());
					variableManager.Store(card, variableName, reference);
				}

			}
			Deck deck = new Deck(variableManager, cardModels, null,
				 deckModel.getVisibility());
			decks.add(deck);
			variableManager.Store(null, deckModel.getName(), deck);
			variableManager.Store(deck, VariableManager.OWNER, null);
		}

		return decks;
	}

	private void _setupGlobalVariables(Model model,
												  VariableManager variableManager)
		 throws IllegalAccessException {

		variableManager.Store(null, VariableManager.NULL, null);
		for (SimpleAssignment variable : model.getBoard().getVariables()) {
			String variableName = variable.getName();
			Object reference = variableManager.GetReference(variable
				 .getAttribute());
			variableManager.Store(null, variableName, reference);
		}

		for (Field field : model.getBoard().getFields()) {
			variableManager.Store(null, field.getName(), field);
		}
	}

	private void _setupPlayerDecks(Model model, VariableManager
		 variableManager, List<Player> players, List<Deck> decks)
		 throws IllegalAccessException {

		for (hu.bme.aut.gergelyszaz.bGL.Deck deckModel : model.getPlayer()
			 .getDecks()) {
			for (Player player : players) {
				Stack<Card> cards = new Stack<>();
				for (hu.bme.aut.gergelyszaz.bGL.Card cardModel : deckModel
					 .getCards()) {
					cards.add(new Card(variableManager, cardModel));
					for (SimpleAssignment variable : cardModel.getVariables()) {
						String variableName = variable.getName();
						Object reference = variableManager.GetReference(variable
							 .getAttribute());
						variableManager.Store(cardModel, variableName, reference);
					}
				}
				Deck deck = new Deck(variableManager, cards, player,
					 deckModel.getVisibility());
				decks.add(deck);
				variableManager.Store(player, deckModel.getName(), deck);
				variableManager.Store(deck, VariableManager.OWNER, player);
			}
		}
	}

	private void _setupFields(Model model, VariableManager variableManager)
		 throws IllegalAccessException {

		for (Field fieldModel : model.getBoard().getFields()) {
			variableManager.Store(fieldModel, "tokenCount", 0);
			for (SimpleAssignment v : fieldModel.getVariables()) {
				String variableName = v.getName();
				Object reference = variableManager.GetReference(v
					 .getAttribute());
				variableManager.Store(fieldModel, variableName, reference);
			}
		}
	}

}


