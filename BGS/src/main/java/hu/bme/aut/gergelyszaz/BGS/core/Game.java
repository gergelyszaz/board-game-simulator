package hu.bme.aut.gergelyszaz.BGS.core;

import hu.bme.aut.gergelyszaz.BGS.core.action.*;
import hu.bme.aut.gergelyszaz.BGS.core.model.Card;
import hu.bme.aut.gergelyszaz.BGS.core.model.Deck;
import hu.bme.aut.gergelyszaz.BGS.core.model.Player;
import hu.bme.aut.gergelyszaz.BGS.core.model.Token;
import hu.bme.aut.gergelyszaz.BGS.manager.IDManager;
import hu.bme.aut.gergelyszaz.BGS.state.*;
import hu.bme.aut.gergelyszaz.BGS.state.util.StateStore;
import hu.bme.aut.gergelyszaz.bGL.*;
import hu.bme.aut.gergelyszaz.bGL.Action;
import org.eclipse.emf.common.util.EList;

import java.util.*;
import java.util.stream.Collectors;

public class Game implements IController {

	Model gameModel;
	String name;
	StateStore gameStates = new StateStore();

	VariableManager variableManager;
	boolean gameEnded = false;
	volatile boolean waitForInput = false;

	IDManager IDStore = new IDManager();

	Set<IView> views = new HashSet<>();
	int turnCount = 1;
	ActionManager actionManager;

	List<Player> players;
	ArrayList<Token> tokens = new ArrayList<>();
	List<Deck> decks;
	List<Integer> losers = new ArrayList<>();
	List<Integer> winners = new ArrayList<>();

	Set<Object> objects = new HashSet<>();
	private Set<Integer> activebuttons = new HashSet<>();
	private Iterable<? extends Object> ojects;

	public Game(VariableManager variableManager) {

		this.variableManager = variableManager;
	}

	public boolean Join(String clientID) throws IllegalAccessException {

		for (Player player : players) {
			if (!player.IsConnected()) {
				player.setSessionID(clientID);
				SaveCurrentState();
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

		setCurrentPlayer(players.get(0));
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

		for (PlayerSetup setup : gameModel.getPlayer().getPlayerSetups()) {

			int setupId = setup.getId();
			if (setupId < 1 || setupId > players.size()) {
				throw new IllegalAccessException(
					 "Invalid player id: Player " + setupId);
			}
			setCurrentPlayer(players.get(setupId - 1));

			variableManager.Store(null, VariableManager.THIS, getCurrentPlayer());
			for (SimpleAssignment variable : gameModel.getPlayer()
				 .getVariables()) {
				String variableName = variable.getName();
				Object reference = variableManager.GetReference(
					 variable.getAttribute());
				variableManager.Store(getCurrentPlayer(), variableName, reference);
			}

			ActionManager startActionManager =
				 new ActionManager(setup.getSetupRule()
					  .getActions());
			do {
				ExecuteAction(startActionManager.getCurrentAction());
			} while (!startActionManager.Step());

			variableManager.Store(null, VariableManager.THIS, null);

		}
		actionManager = new ActionManager(gameModel.getRule().getActions());
		SaveCurrentState();
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

	private Player getCurrentPlayer() throws IllegalAccessException {

		return (Player) variableManager
			 .GetReference(null, VariableManager.CURRENTPLAYER);
	}

	public void setCurrentPlayer(Player player) {

		variableManager.Store(null, VariableManager.CURRENTPLAYER, player);
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

	public Player getNextPlayer() throws IllegalAccessException {

		int playerIndex=players.lastIndexOf(getCurrentPlayer());
		playerIndex++;
		if(playerIndex>=players.size()) playerIndex=0;
		return players.get(playerIndex);
	}

	private void ExecuteAction(Action action) {

		try {
			activebuttons.clear();

			switch (action.getName()) {
				case "SELECT":
					ExecuteSelect(action);
					break;
				case "SPAWN":
					ExecuteSpawn(action);
					break;
				case "MOVE":
					ExecuteMove(action);
					break;
				case "SHUFFLE":
					ExecuteShuffle(action);
					break;
				case "DESTROY":
					ExecuteDestroy(action);
					break;
				case "WIN":
					ExecuteWin();
					break;
				case "LOSE":
					ExecuteLose();
					break;
				case "IF":
					ExecuteIf(action);
					break;
				case "WHILE":
					ExecuteWhile(action);
					break;
				case "END TURN":
					ExecuteEndTurn();
					break;
				case "ROLL":
					ExecuteRoll(action);
					break;

				default:
					ValueAssignment assignment=action.getAssignment();
					Object reference = variableManager.GetReference(assignment
						 .getAddition());

					List<String> variablePath = variableManager.getVariablePath
						 (assignment.getName());
					variableManager.Store(variablePath, reference);
					break;
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	private void ExecuteRoll(Action action) throws IllegalAccessException {
		new RollAction(variableManager,action).Execute();
	}

	private void ExecuteEndTurn() throws IllegalAccessException {
		new EndTurnAction(variableManager, actionManager,this).Execute();
	}

	private void ExecuteMove(Action action) throws IllegalAccessException {
		new MoveAction(variableManager,action).Execute();
	}

	private void ExecuteSpawn(Action action) throws IllegalAccessException {
		new SpawnAction(variableManager,action,this).Execute();
	}

	private void ExecuteSelect(Action action) throws IllegalAccessException {
		new SelectAction(variableManager,action,IDStore,this).Execute();
	}

	private void ExecuteWin() throws IllegalAccessException {
		new WinAction(this).Execute();
	}

	private void ExecuteLose() throws IllegalAccessException {
		new LoseAction(this).Execute();
	}

	private void ExecuteIf(Action action) throws IllegalAccessException {
		new IfAction(variableManager,action,actionManager).Execute();
	}

	private void ExecuteWhile(Action action) throws IllegalAccessException {
		new WhileAction(variableManager,action,actionManager).Execute();
	}

	private void ExecuteDestroy(Action action) throws IllegalAccessException {
		new DestroyAction(variableManager,action,this).Execute();
	}

	private void ExecuteShuffle(Action action) throws IllegalAccessException {
		new ShuffleAction(variableManager,action).Execute();
	}

	public void Lose() throws IllegalAccessException {

		losers.add(IDStore.get(getCurrentPlayer()));
		// TODO think about it: does the game end, or only the player is removed from game
		SaveCurrentState();
		_updateViews();
		gameEnded = true;
	}

	public void Win() throws IllegalAccessException {

		winners.add(IDStore.get(getCurrentPlayer()));
		// TODO think about it: does the game end, or only the player is removed from game
		SaveCurrentState();
		_updateViews();
		gameEnded = true;
	}

	private void _updateViews(){
		views.forEach(IView::Refresh);
	}

	private void SaveCurrentState() throws IllegalAccessException {

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
				  turnCount, IDStore.get(getCurrentPlayer()), plist, flist, tlist,
				  new ArrayList<>(activebuttons), winners, losers, deckstates, -1);
		gameStates.addState(state);

	}

	public void addToken(Token token){
		tokens.add(token);
		objects.add(token);
	}

	public void waitForInput(boolean wait) {
		this.waitForInput=wait;
	}

	public void setSelectableObjects(Set<Integer> ids) throws IllegalAccessException {
		waitForInput(true);


		activebuttons.addAll(ids);

		if (activebuttons.isEmpty()) {
			Lose();
			waitForInput = false;
		}
		SaveCurrentState();

		_updateViews();
	}

	public Set<Object> getObjects() {
		return objects;
	}

	public void DestroyToken(Token t) {
		tokens.remove(t);
		objects.remove(t);
	}
}