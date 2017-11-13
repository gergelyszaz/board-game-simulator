package hu.gergelyszaz.bgs.manager;

import hu.gergelyszaz.bgs.action.*;
import hu.gergelyszaz.bgs.game.*;
import hu.gergelyszaz.bgs.game.internal.Card;
import hu.gergelyszaz.bgs.game.internal.Deck;
import hu.gergelyszaz.bgs.game.internal.Player;
import hu.gergelyszaz.bgs.state.IDManager;
import hu.gergelyszaz.bgs.state.util.StateStore;
import hu.gergelyszaz.bGL.Field;
import hu.gergelyszaz.bGL.*;

import java.util.*;

public class GameFactory {

	public GameImpl CreateGame(Model model) throws IllegalAccessException {

		VariableManager variableManager = new VariableManager();
		ActionManager actionManager = new ActionManager();
		IDManager idManager = new IDManager();
		StateStore stateStore = new StateStore();
		SelectableManager selectableManager = new SelectableManager();
		InternalManager internalManager = new InternalManager(selectableManager);

		ActionFactory actionFactory = new ActionFactory(variableManager,
				idManager,
				actionManager,
				internalManager);
		actionManager.setActions(actionFactory.createActionSequence(model.getRule()
				.getActions()));

		List<Player> players = _setupPlayers(model, variableManager);
		List<Deck> decks = _setupDecks(model, variableManager);
		List<Field> fields = _setupFields(model, variableManager);

		_setupPlayerDecks(model, variableManager, players, decks);
		_setupGlobalVariables(model, variableManager);
		_setupPlayersStartRules(model,
				variableManager,
				players,
				actionManager,
				internalManager,
				idManager);

		fields.forEach(field -> selectableManager.add(field));
		decks.forEach(deck -> deck.cards.forEach(card -> selectableManager.add(
				card)));
		players.forEach(player -> selectableManager.add(player));

		GameImpl game = new GameImpl(variableManager,
				actionManager,
				idManager,
				stateStore,
				internalManager);
		game.Init(model, players, decks);
		return game;
	}

	private List<Player> _setupPlayers(Model model,
												  VariableManager variableManager)
			throws IllegalAccessException {

		List<Player> players = new ArrayList<>();
		for (int id = 0; id < model.getPlayer().getPlayercount(); id++) {
			int generatedId = id + 1;
			Player player = new Player(generatedId);
			players.add(player);
			for (SimpleAssignment variableModel : model.getPlayer()
					.getVariables()) {
				String variableName = variableModel.getName();
				Object reference =
						variableManager.getReference(variableModel.getAttribute());
				variableManager.store(player, variableName, reference);
			}
		}
		return players;
	}

	private List<Deck> _setupDecks(Model model, VariableManager variableManager)
			throws IllegalAccessException {

		if (model.getDecks() == null) {
			return new ArrayList<>();
		}
		List<Deck> decks = new ArrayList<>();

		for (hu.gergelyszaz.bGL.Deck deckModel : model.getDecks()) {
			Stack<Card> cardModels = new Stack<>();
			for (hu.gergelyszaz.bGL.Card cardModel : deckModel.getCards()) {
				Card card = new Card(variableManager, cardModel);
				cardModels.add(card);
				for (SimpleAssignment variable : cardModel.getVariables()) {
					String variableName = variable.getName();
					Object reference =
							variableManager.getReference(variable.getAttribute());
					variableManager.store(card, variableName, reference);
				}

			}
			Deck deck = new Deck(variableManager,
					cardModels,
					null,
					deckModel.getVisibility());
			decks.add(deck);
			variableManager.store(null, deckModel.getName(), deck);
			variableManager.store(deck, VariableManager.DECK.OWNER, null);
		}

		return decks;
	}

	private List<Field> _setupFields(Model model,
												VariableManager variableManager)
			throws IllegalAccessException {

		List<Field> fields = model.getFields();

		for (Field field : fields) {
			variableManager.store(null, field.getName(), field);
		}

		for (Field field : fields) {
			variableManager.store(field, "tokenCount", 0);
			for (SimpleAssignment v : field.getVariables()) {
				String variableName = v.getName();
				Object reference = variableManager.getReference(v.getAttribute());
				variableManager.store(field, variableName, reference);
			}
		}
		return fields;
	}

	private void _setupPlayerDecks(Model model,
											 VariableManager variableManager,
											 List<Player> players,
											 List<Deck> decks)
			throws IllegalAccessException {

		for (hu.gergelyszaz.bGL.Deck deckModel : model.getPlayer()
				.getDecks()) {
			for (Player player : players) {
				Stack<Card> cards = new Stack<>();
				for (hu.gergelyszaz.bGL.Card cardModel : deckModel.getCards()) {
					cards.add(new Card(variableManager, cardModel));
					for (SimpleAssignment variable : cardModel.getVariables()) {
						String variableName = variable.getName();
						Object reference =
								variableManager.getReference(variable.getAttribute());
						variableManager.store(cardModel, variableName, reference);
					}
				}
				Deck deck = new Deck(variableManager,
						cards,
						player,
						deckModel.getVisibility());
				decks.add(deck);
				variableManager.store(player, deckModel.getName(), deck);
				variableManager.store(deck, VariableManager.DECK.OWNER, player);
			}
		}
	}

	private void _setupGlobalVariables(Model model,
												  VariableManager variableManager)
			throws IllegalAccessException {

		variableManager.store(null, VariableManager.GLOBAL.NULL, null);
		for (SimpleAssignment variable : model.getVariables()) {
			String variableName = variable.getName();
			Object reference =
					variableManager.getReference(variable.getAttribute());
			variableManager.store(null, variableName, reference);
		}

		for (Field field : model.getFields()) {
			variableManager.store(null, field.getName(), field);
		}
	}

	private static void _setupPlayersStartRules(Model model,
															  VariableManager variableManager,
															  List<Player> players,
															  ActionManager actionManager,
															  InternalManager internalManager,
															  IDManager idManager)
			throws IllegalAccessException {

		for (PlayerSetup setup : model.getPlayer().getPlayerSetups()) {
			int setupId = setup.getId();
			if (setupId < 1 || setupId > players.size()) {
				throw new IllegalAccessException("Invalid player id: " + setupId);
			}
			Player player = players.get(setupId - 1);
			_setupPlayerStartRules(variableManager,
					player,
					setup,
					idManager,
					actionManager,
					internalManager);

		}
	}

	private static void _setupPlayerStartRules(VariableManager variableManager,
															 Player player,
															 PlayerSetup setup,
															 IDManager idManager,
															 ActionManager actionManager,
															 InternalManager internalManager)
			throws IllegalAccessException {

		variableManager.store(null, VariableManager.GLOBAL.CURRENTPLAYER, player);
		variableManager.store(null, VariableManager.GLOBAL.THIS, player);

		ActionManager startActionManager = new ActionManager();
		ActionFactory actionFactory = new ActionFactory(variableManager,
				idManager,
				actionManager,
				internalManager);
		startActionManager.setActions(actionFactory.createActionSequence(setup.getSetupRule()
				.getActions()));

		while (!startActionManager.step()) {
			startActionManager.getCurrentAction().Execute();
		}

		variableManager.store(null, VariableManager.GLOBAL.THIS, null);
	}

}