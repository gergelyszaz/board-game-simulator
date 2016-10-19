package hu.bme.aut.gergelyszaz.BGS.game;

import hu.bme.aut.gergelyszaz.BGS.action.ActionFactory;
import hu.bme.aut.gergelyszaz.BGS.action.ActionManager;
import hu.bme.aut.gergelyszaz.BGS.game.internal.Deck;
import hu.bme.aut.gergelyszaz.BGS.game.internal.Player;
import hu.bme.aut.gergelyszaz.BGS.game.internal.Token;
import hu.bme.aut.gergelyszaz.BGS.state.GameStateFactory;
import hu.bme.aut.gergelyszaz.BGS.state.IDManager;
import hu.bme.aut.gergelyszaz.BGS.state.GameState;
import hu.bme.aut.gergelyszaz.BGS.state.util.StateStore;
import hu.bme.aut.gergelyszaz.BGS.view.Controller;
import hu.bme.aut.gergelyszaz.BGS.view.View;
import hu.bme.aut.gergelyszaz.bGL.Action;
import hu.bme.aut.gergelyszaz.bGL.Field;
import hu.bme.aut.gergelyszaz.bGL.Model;
import hu.bme.aut.gergelyszaz.bGL.PlayerSetup;
import org.eclipse.emf.common.util.EList;

import java.util.*;

public class Game implements Controller {

	Model gameModel;
	String name;

	VariableManager variableManager;
	ActionManager actionManager;
	IDManager idManager;
	ActionFactory actionFactory;
	StateStore stateStore;
	SelectableManager selectableManager;

	boolean gameEnded = false;
	volatile boolean waitForInput = false;
	Set<View> views = new HashSet<>();

	List<Player> players;
	ArrayList<Token> tokens = new ArrayList<>();
	List<Deck> decks;
	List<Integer> losers = new ArrayList<>();
	List<Integer> winners = new ArrayList<>();

	public Game(VariableManager variableManager, ActionManager actionManager,
					IDManager idManager, StateStore stateStore,
					SelectableManager selectableManager) {

		this.variableManager = variableManager;
		this.actionManager = actionManager;
		this.idManager = idManager;
		this.stateStore=stateStore;
		this.selectableManager = selectableManager;
	}

	private static void _setupPlayerStartRules(
		 VariableManager variableManager,
		 Player player,
		 PlayerSetup setup,
		 Game game
	) throws IllegalAccessException {

		variableManager.store(null, VariableManager.CURRENTPLAYER, player);
		variableManager.store(null, VariableManager.THIS, player);

		ActionManager startActionManager =
			 new ActionManager(setup.getSetupRule()
				  .getActions());
		do {
			game.ExecuteAction(startActionManager.getCurrentAction());
		} while (!startActionManager.Step());

		variableManager.store(null, VariableManager.THIS, null);
	}

	private static void _setupPlayersStartRules(Model model, VariableManager
		 variableManager, Game game, List<Player> players)
		 throws IllegalAccessException {

		for (PlayerSetup setup : model.getPlayer().getPlayerSetups()) {
			int setupId = setup.getId();
			if (setupId < 1 || setupId > players.size()) {
				throw new IllegalAccessException(
					 "Invalid player id: " + setupId);
			}
			Player player = players.get(setupId - 1);
			_setupPlayerStartRules(variableManager, player, setup, game);

		}
	}

	public boolean Join(String clientID) throws IllegalAccessException {

		for (Player player : players) {
			if (!player.IsConnected()) {
				player.setSessionID(clientID);
				_saveCurrentState();
				return true;
			}
		}
		return false;
	}

	public boolean IsFull() {

		boolean isFull = true;
		for (Player player :
			 players) {
			isFull &= player.IsConnected();
		}
		return isFull;
	}

	public void Init(Model gameModel, List<Player> players, List<Deck> decks) {

		name = gameModel.getName();
		this.players = players;
		this.decks = decks;
		this.gameModel = gameModel;
		variableManager
			 .store(null, VariableManager.CURRENTPLAYER, players.get(0));

		gameModel.getBoard().getFields().forEach(field ->
			 selectableManager.add(field));
		for (Deck deck : decks) {
			selectableManager.add(deck);
			deck.cards.forEach(card -> selectableManager
				 .add(card));
		}
		players.forEach(player -> selectableManager.add(player));
	}

	public void Step() throws IllegalAccessException {

		if (waitForInput || gameEnded) return;
		actionManager.Step();

		ExecuteAction(actionManager.getCurrentAction());

	}

	public void Start() throws IllegalAccessException {

		_setupPlayersStartRules(gameModel, variableManager, this, players);
		_saveCurrentState();
	}

	public boolean IsFinished() {

		return gameEnded;
	}

	@Override
	public void AddView(View v) {

		views.add(v);
	}

	@Override
	public GameState getCurrentState(String sessionID) {

		GameState gs = stateStore.getCurrentState();

		Player p = null;
		for (Player player :
			 players) {
			if (Objects.equals(player.getSessionID(), sessionID)) p = player;
		}

		return gs.getPublicState(idManager.get(p));
	}

	@Override
	public boolean setSelected(String playerID, int selectedID) {

		try {
			if (!Objects.equals(playerID, _getCurrentPlayer().getSessionID())) {
				return false;
			}

			if(!selectableManager.isSelectable(idManager.get(selectedID)))
				return false;


			if (Objects
				 .equals(actionManager.getCurrentAction().getName(), "SELECT")) {

				Object object = idManager.get(selectedID);
				List<String> variablePath = variableManager.getVariablePath
					 (actionManager.getCurrentAction().getToVar());
				variableManager.store(variablePath, object);

				if (object instanceof Token) {
					for (Field f : gameModel.getBoard().getFields()) {
						variableManager
							 .store(f, VariableManager.DISTANCE_FROM_SELECTED_TOKEN,
								  -1);
					}
					setupDistance(((Token) object).getField(), 0);
				}
			}

			//Probably would be better with synchronization
			waitForInput = false;
			return true;
		} catch (IllegalAccessException e) {
			System.out.println(variableManager.getVariables());
			e.printStackTrace();
			return false;
		}
	}

	public Player getNextPlayer(Player player) throws IllegalAccessException {

		int playerIndex = players.lastIndexOf(player);
		playerIndex++;
		if (playerIndex >= players.size()) playerIndex = 0;
		return players.get(playerIndex);
	}

	public void Lose(Player player) throws IllegalAccessException {

		losers.add(idManager.get(player));
		// TODO think about it: does the game end, or only the player is removed from game
		_saveCurrentState();
		_updateViews();
		gameEnded = true;
	}

	public void Win(Player player) throws IllegalAccessException {

		winners.add(idManager.get(player));
		// TODO think about it: does the game end, or only the player is removed from game
		_saveCurrentState();
		_updateViews();
		gameEnded = true;
	}

	public void addToken(Token token) {
		tokens.add(token);
		selectableManager.add(token);
	}

	public void waitForInput(boolean wait) {

		this.waitForInput = wait;
	}

	public Iterable<?> getObjects() {

		return selectableManager.getAllObjects();
	}

	public void DestroyToken(Token t) {

		tokens.remove(t);
		selectableManager.remove(t);
	}

	private Player _getCurrentPlayer() throws IllegalAccessException {

		return (Player) variableManager
			 .getReference(null, VariableManager.CURRENTPLAYER);
	}

	private EList<Field> getFields() {

		return gameModel.getBoard().getFields();
	}

	private void setupDistance(Field startingField, int distance)
		 throws IllegalAccessException {

		//	TODO write without recursion and use BFS instead of DFS
		int dist = variableManager.getValue(startingField,
			 VariableManager.DISTANCE_FROM_SELECTED_TOKEN);
		if ((dist > -1 && dist <= distance)) return;
		variableManager
			 .store(startingField, VariableManager.DISTANCE_FROM_SELECTED_TOKEN,
				  distance);
		for (Field field : startingField.getNeighbours()) {
			{
				setupDistance(field, distance + 1);
			}
		}
	}

	private void ExecuteAction(Action action) {

		try {
			selectableManager.clear();
			actionFactory =
				 new ActionFactory(variableManager, idManager, actionManager,
					  selectableManager,
					  this);
			actionFactory.createAction(action).Execute();

		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	private void _updateViews() {

		views.forEach(View::Refresh);
	}

	private void _saveCurrentState() throws IllegalAccessException {

		int stateVersion = stateStore.getCurrentVersion() + 1;
		Iterable selectables= selectableManager.getSelectableObjects();
		Set<Integer> activebuttons=new HashSet<>();
		selectables.forEach(o -> activebuttons.add(idManager.get(o)));

		GameState gameState =
			 GameStateFactory.createGameState(gameModel.getName(),
				  idManager,
				  stateVersion, _getCurrentPlayer(), players, getFields(),
				  tokens, decks,
				  activebuttons, winners, losers);

		stateStore.addState(gameState);
	}

}