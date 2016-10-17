package hu.bme.aut.gergelyszaz.BGS.core;

import hu.bme.aut.gergelyszaz.BGS.core.action.ActionFactory;
import hu.bme.aut.gergelyszaz.BGS.core.action.ActionManager;
import hu.bme.aut.gergelyszaz.BGS.core.model.Card;
import hu.bme.aut.gergelyszaz.BGS.core.model.Deck;
import hu.bme.aut.gergelyszaz.BGS.core.model.Player;
import hu.bme.aut.gergelyszaz.BGS.core.model.Token;
import hu.bme.aut.gergelyszaz.BGS.manager.IDManager;
import hu.bme.aut.gergelyszaz.BGS.state.*;
import hu.bme.aut.gergelyszaz.BGS.state.util.StateStore;
import hu.bme.aut.gergelyszaz.bGL.Action;
import hu.bme.aut.gergelyszaz.bGL.Field;
import hu.bme.aut.gergelyszaz.bGL.Model;
import hu.bme.aut.gergelyszaz.bGL.PlayerSetup;
import org.eclipse.emf.common.util.EList;

import java.util.*;
import java.util.stream.Collectors;

public class Game implements IController {

	Model gameModel;
	String name;

	VariableManager variableManager;
	ActionManager actionManager;

	StateStore gameStates = new StateStore();

	IDManager IDStore = new IDManager();

	boolean gameEnded = false;
	volatile boolean waitForInput = false;
	Set<IView> views = new HashSet<>();

	List<Player> players;
	ArrayList<Token> tokens = new ArrayList<>();
	List<Deck> decks;
	List<Integer> losers = new ArrayList<>();
	List<Integer> winners = new ArrayList<>();

	Set<Object> objects = new HashSet<>();
	private Set<Integer> activebuttons = new HashSet<>();
	private Iterable<? extends Object> ojects;
	private ActionManager startActionManager;

	public Game(VariableManager variableManager, ActionManager actionManager) {

		this.variableManager = variableManager;
		this.actionManager = actionManager;
	}

	private static void _setupPlayerStartRules(
		 VariableManager variableManager,
		 Player player,
		 PlayerSetup setup,
		 Game game
	) throws IllegalAccessException {

		variableManager.Store(null, VariableManager.CURRENTPLAYER, player);
		variableManager.Store(null, VariableManager.THIS, player);

		ActionManager startActionManager =
			 new ActionManager(setup.getSetupRule()
				  .getActions());
		do {
			game.ExecuteAction(startActionManager.getCurrentAction());
		} while (!startActionManager.Step());

		variableManager.Store(null, VariableManager.THIS, null);
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
			 .Store(null, VariableManager.CURRENTPLAYER, players.get(0));

		objects.addAll(gameModel.getBoard().getFields().stream()
			 .collect(Collectors.toList()));
		for (Deck deck : decks) {
			objects.add(deck);
			objects.addAll(deck.cards.stream().collect(Collectors.toList()));
		}
		objects.addAll(players.stream().collect(Collectors.toList()));
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
	public void AddView(IView v) {

		views.add(v);
	}

	@Override
	public GameState getCurrentState(String sessionID) {

		GameState gs = gameStates.getCurrentState();

		Player p = null;
		for (Player player :
			 players) {
			if (Objects.equals(player.getSessionID(), sessionID)) p = player;
		}

		return gs.getPublicState(IDStore.get(p));
	}

	@Override
	public boolean setSelected(String playerID, int selectedID) {

		try {
			if (!Objects.equals(playerID, getCurrentPlayer().getSessionID())) {
				return false;
			}
			if (!activebuttons.contains(selectedID)) return false;

			if (Objects
				 .equals(actionManager.getCurrentAction().getName(), "SELECT")) {

				Object object = IDStore.get(selectedID);
				List<String> variablePath = variableManager.getVariablePath
					 (actionManager.getCurrentAction().getToVar());
				variableManager.Store(variablePath, object);

				if (object instanceof Token) {
					for (Field f : gameModel.getBoard().getFields()) {
						variableManager
							 .Store(f, VariableManager.DISTANCE_FROM_SELECTED_TOKEN,
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

	public Player getNextPlayer() throws IllegalAccessException {

		int playerIndex = players.lastIndexOf(getCurrentPlayer());
		playerIndex++;
		if (playerIndex >= players.size()) playerIndex = 0;
		return players.get(playerIndex);
	}

	public void Lose() throws IllegalAccessException {

		losers.add(IDStore.get(getCurrentPlayer()));
		// TODO think about it: does the game end, or only the player is removed from game
		_saveCurrentState();
		_updateViews();
		gameEnded = true;
	}

	public void Win() throws IllegalAccessException {

		winners.add(IDStore.get(getCurrentPlayer()));
		// TODO think about it: does the game end, or only the player is removed from game
		_saveCurrentState();
		_updateViews();
		gameEnded = true;
	}

	public void addToken(Token token) {

		tokens.add(token);
		objects.add(token);
	}

	public void waitForInput(boolean wait) {

		this.waitForInput = wait;
	}

	public void setSelectableObjects(Set<Integer> ids)
		 throws IllegalAccessException {

		waitForInput(true);

		activebuttons.addAll(ids);

		if (activebuttons.isEmpty()) {
			Lose();
			waitForInput = false;
		}
		_saveCurrentState();

		_updateViews();
	}

	public Set<Object> getObjects() {

		return objects;
	}

	public void DestroyToken(Token t) {

		tokens.remove(t);
		objects.remove(t);
	}

	private Player getCurrentPlayer() throws IllegalAccessException {

		return (Player) variableManager
			 .GetReference(null, VariableManager.CURRENTPLAYER);
	}

	private EList<Field> getFields() {

		return gameModel.getBoard().getFields();
	}

	private void setupDistance(Field startingField, int distance)
		 throws IllegalAccessException {

		//	TODO write without recursion and use BFS instead of DFS
		int dist = variableManager.GetValue(startingField,
			 VariableManager.DISTANCE_FROM_SELECTED_TOKEN);
		if ((dist > -1 && dist <= distance)) return;
		variableManager
			 .Store(startingField, VariableManager.DISTANCE_FROM_SELECTED_TOKEN,
				  distance);
		for (Field field : startingField.getNeighbours()) {
			{
				setupDistance(field, distance + 1);
			}
		}
	}

	private void ExecuteAction(Action action) {

		try {
			activebuttons.clear();
			ActionFactory actionFactory =
				 new ActionFactory(variableManager, IDStore, actionManager, this);
			actionFactory.createAction(action).Execute();

		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	private void _updateViews() {

		views.forEach(IView::Refresh);
	}

	private void _saveCurrentState() throws IllegalAccessException {

		List<PlayerState> plist = new ArrayList<>();
		for (Player p : players) {
			PlayerState ps = new PlayerState();
			ps.id = IDStore.get(p);
			ps.name = p.getName();
			plist.add(ps);
		}
		List<FieldState> flist = new ArrayList<>();
		for (Field f : getFields()) {
			FieldState fs = new FieldState();
			fs.id = IDStore.get(f);
			fs.name = f.getName();
			fs.neighbours.addAll(
				 f.getNeighbours().stream().map(n -> IDStore.get(n))
					  .collect(Collectors.toList()));
			flist.add(fs);
		}
		List<TokenState> tlist = new ArrayList<>();
		for (Token t : tokens) {
			TokenState ts = new TokenState();
			ts.id = IDStore.get(t);
			ts.field = IDStore.get(t.getField());
			ts.owner = IDStore.get(t.getOwner());
			ts.type = t.type;
			tlist.add(ts);
		}

		int stateVersion = gameStates.getCurrentVersion() + 1;

		List<DeckState> deckstates = new ArrayList<>();
		for (Deck deck : decks) {
			DeckState deckState = new DeckState();
			switch (deck.visibility) {
				case "PUBLIC":
					deckState.visible = 2;
					break;
				case "PROTECTED":
					deckState.visible = 1;
					break;
				case "PRIVATE":
					deckState.visible = 0;
					break;
			}
			deckstates.add(deckState);
			deckState.id = IDStore.get(deck);
			if (deck.owner != null) deckState.owner = IDStore.get(deck.owner);
			for (Card c : deck.cards) {
				CardState cs = new CardState(IDStore.get(c), c.getType());
				deckState.cards.add(cs);
			}
		}

		GameState state =
			 new GameState(this.gameModel.getName(), stateVersion,
				  IDStore.get(getCurrentPlayer()), plist, flist, tlist,
				  new ArrayList<>(activebuttons), winners, losers, deckstates, -1);
		gameStates.addState(state);

	}
}