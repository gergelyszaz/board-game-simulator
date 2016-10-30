package hu.bme.aut.gergelyszaz.BGS.manager;

import hu.bme.aut.gergelyszaz.BGS.action.ActionFactory;
import hu.bme.aut.gergelyszaz.BGS.action.ActionManager;
import hu.bme.aut.gergelyszaz.BGS.game.GameImpl;
import hu.bme.aut.gergelyszaz.BGS.game.InternalManager;
import hu.bme.aut.gergelyszaz.BGS.game.SelectableManager;
import hu.bme.aut.gergelyszaz.BGS.game.VariableManager;
import hu.bme.aut.gergelyszaz.BGS.game.internal.Card;
import hu.bme.aut.gergelyszaz.BGS.game.internal.Deck;
import hu.bme.aut.gergelyszaz.BGS.game.internal.Player;
import hu.bme.aut.gergelyszaz.BGS.state.IDManager;
import hu.bme.aut.gergelyszaz.BGS.state.util.StateStore;
import hu.bme.aut.gergelyszaz.bGL.Field;
import hu.bme.aut.gergelyszaz.bGL.Model;
import hu.bme.aut.gergelyszaz.bGL.PlayerSetup;
import hu.bme.aut.gergelyszaz.bGL.SimpleAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GameFactory {

	public GameImpl CreateGame(Model model) throws IllegalAccessException {

		VariableManager variableManager = new VariableManager();
		ActionManager actionManager=new ActionManager();
		IDManager idManager=new IDManager();
		StateStore stateStore=new StateStore();
		SelectableManager selectableManager =new SelectableManager();
		InternalManager internalManager=new InternalManager(selectableManager);

		ActionFactory actionFactory=new ActionFactory(variableManager,
			 idManager,actionManager,internalManager);
		actionManager.setActions(actionFactory.createActionSequence(model
			 .getRule().getActions()));

		List<Player> players = _setupPlayers(model, variableManager);
		List<Deck> decks = _setupDecks(model, variableManager);

		_setupPlayerDecks(model, variableManager, players, decks);
		_setupGlobalVariables(model, variableManager);
		_setupFields(model, variableManager);
		_setupPlayersStartRules(model,variableManager,players,actionManager,internalManager,idManager);

		model.getBoard().getFields().forEach(field ->selectableManager.add(field));
		decks.forEach(deck -> deck.cards.forEach(card -> selectableManager.add(card)));
		players.forEach(player -> selectableManager.add(player));

		GameImpl game = new GameImpl(variableManager, actionManager, idManager, stateStore, internalManager);
		game.Init(model, players, decks);
		return game;
	}

	private static void _setupPlayerStartRules(
			VariableManager variableManager,
			Player player,
			PlayerSetup setup,
			IDManager idManager, ActionManager actionManager, InternalManager internalManager) throws IllegalAccessException {

		variableManager.store(null, VariableManager.CURRENTPLAYER, player);
		variableManager.store(null, VariableManager.THIS, player);

		ActionManager startActionManager =
				new ActionManager();
		ActionFactory actionFactory =
			 new ActionFactory(variableManager, idManager, actionManager,
				  internalManager );
		startActionManager.setActions(actionFactory.createActionSequence(setup
			 .getSetupRule().getActions()));


		while (!startActionManager.step()){
			startActionManager.getCurrentAction().Execute();
		}

		variableManager.store(null, VariableManager.THIS, null);
	}

	private static void _setupPlayersStartRules(Model model, VariableManager
			variableManager, List<Player> players, ActionManager actionManager, InternalManager internalManager, IDManager idManager)
			throws IllegalAccessException {

		for (PlayerSetup setup : model.getPlayer().getPlayerSetups()) {
			int setupId = setup.getId();
			if (setupId < 1 || setupId > players.size()) {
				throw new IllegalAccessException(
						"Invalid player id: " + setupId);
			}
			Player player = players.get(setupId - 1);
			_setupPlayerStartRules(variableManager, player, setup, idManager, actionManager, internalManager);

		}
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
				Object reference = variableManager.getReference(variableModel
					 .getAttribute());
				variableManager.store(player, variableName, reference);
			}
		}
		return players;
	}

	private List<Deck> _setupDecks(Model model, VariableManager variableManager)
		 throws IllegalAccessException {
		if(model.getBoard().getDecks()==null) return new ArrayList<>();
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
					Object reference = variableManager.getReference(variable
						 .getAttribute());
					variableManager.store(card, variableName, reference);
				}

			}
			Deck deck = new Deck(variableManager, cardModels, null,
				 deckModel.getVisibility());
			decks.add(deck);
			variableManager.store(null, deckModel.getName(), deck);
			variableManager.store(deck, VariableManager.OWNER, null);
		}

		return decks;
	}

	private void _setupGlobalVariables(Model model,
												  VariableManager variableManager)
		 throws IllegalAccessException {

		variableManager.store(null, VariableManager.NULL, null);
		for (SimpleAssignment variable : model.getBoard().getVariables()) {
			String variableName = variable.getName();
			Object reference = variableManager.getReference(variable
				 .getAttribute());
			variableManager.store(null, variableName, reference);
		}

		for (Field field : model.getBoard().getFields()) {
			variableManager.store(null, field.getName(), field);
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
						Object reference = variableManager.getReference(variable
							 .getAttribute());
						variableManager.store(cardModel, variableName, reference);
					}
				}
				Deck deck = new Deck(variableManager, cards, player,
					 deckModel.getVisibility());
				decks.add(deck);
				variableManager.store(player, deckModel.getName(), deck);
				variableManager.store(deck, VariableManager.OWNER, player);
			}
		}
	}

	private void _setupFields(Model model, VariableManager variableManager)
		 throws IllegalAccessException {

		for (Field fieldModel : model.getBoard().getFields()) {
			variableManager.store(fieldModel, "tokenCount", 0);
			for (SimpleAssignment v : fieldModel.getVariables()) {
				String variableName = v.getName();
				Object reference = variableManager.getReference(v
					 .getAttribute());
				variableManager.store(fieldModel, variableName, reference);
			}
		}
	}

}


