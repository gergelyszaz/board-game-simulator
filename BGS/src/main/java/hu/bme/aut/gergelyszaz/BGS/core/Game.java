package hu.bme.aut.gergelyszaz.BGS.core;

import hu.bme.aut.gergelyszaz.BGS.core.model.Card;
import hu.bme.aut.gergelyszaz.BGS.core.model.Deck;
import hu.bme.aut.gergelyszaz.BGS.core.model.Player;
import hu.bme.aut.gergelyszaz.BGS.core.model.Token;
import hu.bme.aut.gergelyszaz.BGS.manager.IDManager;
import hu.bme.aut.gergelyszaz.BGS.state.*;
import hu.bme.aut.gergelyszaz.BGS.state.util.StateStore;
import hu.bme.aut.gergelyszaz.bGL.*;
import org.eclipse.emf.common.util.EList;

import java.util.*;

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
	Action currentAction = null;
	Stack<Action> actionStack = new Stack<>();
	List<Player> players;
	ArrayList<Token> tokens = new ArrayList<>();
	List<Deck> decks;
	List<Integer> losers = new ArrayList<>();
	List<Integer> winners = new ArrayList<>();
	//TODO add everything selectable to objects
	Set<Object> objects = new HashSet<>();
	private Set<Integer> activebuttons = new HashSet<>();

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
		boolean isFull = false;
		for (Player player :
						players) {
			isFull |= player.IsConnected();
		}
		return isFull;
	}

	public void Init(Model gameModel, List<Player> players, List<Deck> decks) {
		name = gameModel.getName();
		this.players = players;
		this.decks = decks;
		this.gameModel = gameModel;

		setCurrentPlayer(players.get(0));
		for (Field field : gameModel.getBoard().getFields()) {
			objects.add(field);
		}
		for (Deck deck : decks) {
			objects.add(deck);
			for (Card c : deck.cards) {
				objects.add(c);
			}
		}
		for (Player player : players) {
			objects.add(player);
		}
	}

	public void Step() throws IllegalAccessException {
		if (waitForInput || gameEnded) return;
		currentAction = GetNextAction(gameModel.getRule().getActions());
		ExecuteAction(currentAction);
	}

	public void Start() throws IllegalAccessException {
		for (PlayerSetup setup : gameModel.getPlayer().getPlayerSetups()) {
			int setupId = setup.getId();
			if (setupId < 1 || setupId > players.size())
				throw new IllegalAccessException("Invalid player id: Player " + setupId);
			setCurrentPlayer(players.get(setupId - 1));
			variableManager.Store(null, VariableManager.THIS, getCurrentPlayer());
			for (SimpleAssignment variable : gameModel.getPlayer().getVariables()) {
				variableManager.Store(getCurrentPlayer(), variable);
			}

			currentAction = GetNextAction(setup.getSetupRule().getActions());
			ExecuteAction(currentAction);

			EList<Action> actions = setup.getSetupRule().getActions();
			while (actions.lastIndexOf(currentAction) < actions.size() - 1) {
				ExecuteAction(currentAction = GetNextAction(setup.getSetupRule().getActions()));
			}
			variableManager.Store(null, VariableManager.THIS, null);
			currentAction = null;
		}
		SaveCurrentState();
	}

	public boolean IsFinished() {
		return gameEnded;
	}

	public void run() throws IllegalAccessException {
		Start();
		while (!gameEnded) {
			Step();
			Thread.yield();
		}
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
	public boolean setSelected(String playerID, int selectedID){
		try {
			if (!Objects.equals(playerID, getCurrentPlayer().getSessionID()))
				return false;
			if (!activebuttons.contains(selectedID)) return false;

			if (Objects.equals(currentAction.getName(), "SELECT")) {
				Object object = IDStore.get(selectedID);
				variableManager.Store(currentAction.getToVar(), object);

				if (object instanceof Token) {
					for (Field f : gameModel.getBoard().getFields()) {
						variableManager.Store(f, VariableManager.DISTANCE_FROM_SELECTED_TOKEN, -1);
					}
					setupDistance(((Token) object).getField(), 0);
				}
			}

			//Probably would be better with synchronization
			waitForInput = false;
			return true;
		}
		catch (IllegalAccessException e){
			e.printStackTrace();
			return false;
		}
	}

	private Player getCurrentPlayer() throws IllegalAccessException {
		return (Player) variableManager.GetReference(null, VariableManager.CURRENTPLAYER);
	}

	private void setCurrentPlayer(Player player) {
		variableManager.Store(null, VariableManager.CURRENTPLAYER, player);
	}

	private EList<Field> getFields() {
		return gameModel.getBoard().getFields();
	}

	private void setupDistance(Field startingField, int distance) throws IllegalAccessException {

		//	TODO write without recursion and use BFS instead of DFS
		int dist = variableManager.GetValue(startingField, VariableManager.DISTANCE_FROM_SELECTED_TOKEN);
		if ((dist > -1 && dist <= distance)) return;
		variableManager.Store(startingField, VariableManager.DISTANCE_FROM_SELECTED_TOKEN, distance);
		for (Field field : startingField.getNeighbours()) {
			{
				setupDistance(field, distance + 1);
			}
		}
	}

	private Player getNextPlayer() throws IllegalAccessException {
		for (int i = 0; i < players.size() - 1; i++) {
			if (getCurrentPlayer() == players.get(i)) return players.get(i + 1);
		}
		return players.get(0);
	}

	private Action GetNextAction(List<Action> actions) throws IllegalAccessException {
		//current action was not set before
		if (currentAction == null) return actions.get(0);

		if (!actionStack.isEmpty()) {
			//Nested action was entered
			if (actionStack.peek() == currentAction) {
				return actionStack.peek().getNestedAction().getActions().get(0);
			}
			//Last element of nested action
			actions = actionStack.peek().getNestedAction().getActions();
			if (actions.lastIndexOf(currentAction) == actions.size() - 1) {
				//WHILE loop returns first nested element if condition is met
				if (Objects.equals(actionStack.peek().getName(), "WHILE") &&
								variableManager.Evaluate(actionStack.peek().getCondition())) {
					return actionStack.peek().getNestedAction().getActions().get(0);
				}
				//Step out of nested action
				currentAction = actionStack.pop();
				return GetNextAction(actions);
			}
			//Get next element in nested action
			EList<Action> nested = actionStack.peek().getNestedAction().getActions();
			for (int i = 0; i < nested.size() - 1; i++) {
				if (currentAction == nested.get(i)) {
					return nested.get(i + 1);
				}
			}
		}

		//No nested action

		if (actions.lastIndexOf(currentAction) == actions.size() - 1) {
			if (actionStack.isEmpty()) {
				return actions.get(0);
			}
		}
		for (int i = 0; i < actions.size() - 1; i++) {
			if (currentAction == actions.get(i)) {
				return actions.get(i + 1);
			}
		}
		return null;
	}

	private void ExecuteAction(Action action) {
		try {
			activebuttons.clear();

			if (Objects.equals(action.getName(), "SELECT")) {
				waitForInput = true;
				for (Object o : objects) {
					variableManager.Store(null, VariableManager.THIS, o);
					if (variableManager.Evaluate(action.getCondition())) {
						activebuttons.add(IDStore.get(o));
					}
				}
				if (activebuttons.isEmpty()) {
					Lose();
					waitForInput = false;
				}
				SaveCurrentState();
				views.forEach(IView::Refresh);

			} else if (Objects.equals(action.getName(), "SPAWN")) {
				Token token = new Token(variableManager, action.getToken().getName());
				for (SimpleAssignment a : action.getToken().getVariables()) {
					variableManager.Store(token, a);
				}
				token.setOwner(getCurrentPlayer());
				token.setField((Field) variableManager.GetReference(action.getSpawnTo()));
				variableManager.Store(action.getToVar(), token);
				tokens.add(token);
				objects.add(token);

			} else if (Objects.equals(action.getName(), "MOVE")) {
				if (Objects.equals(action.getType(), "CARD")) {
					((Card) variableManager.GetReference(action.getSelected())).MoveTo((Deck) variableManager.GetReference(action.getMoveTo()));
				} else {
					((Token) variableManager.GetReference(action.getSelected())).setField((Field) variableManager.GetReference(action.getMoveTo()));
				}
			} else if (Objects.equals(action.getName(), "SHUFFLE")) {
				((Deck) variableManager.GetReference(action.getSelected())).Shuffle();
			} else if (Objects.equals(action.getName(), "DESTROY")) {
				Token t;
				(t = (Token) variableManager.GetReference(action.getSelected())).Destroy();
				tokens.remove(t);
				objects.remove(t);
			} else if (Objects.equals(action.getName(), "WIN")) {
				Win();
			} else if (Objects.equals(action.getName(), "LOSE")) {
				Lose();
			} else if (Objects.equals(action.getName(), "IF") || Objects.equals(action.getName(), "WHILE")) {
				if (variableManager.Evaluate(action.getCondition())) {
					actionStack.push(action);
				}
			} else if (Objects.equals(action.getName(), "END TURN")) {
				actionStack.clear();
				setCurrentPlayer(getNextPlayer());
				currentAction = null;
			} else if (Objects.equals(action.getName(), "ROLL")) {

				Random r = new Random();
				int result = 0;
				for (int i = 1; i < action.getNumberOfDice() + 1; i++) {
					int rollresult = r.nextInt(action.getTo()) + action.getFrom();
					result += rollresult;
				}
				variableManager.Store(action.getToVar(), result);
			} else if (action.getAssignment() != null) {
				variableManager.Store(action.getAssignment());

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("	at Action: " + action);
			if (action.getAssignment() != null) {
				System.err.println("		" + action.getAssignment().getAddition() + " could not be resolved.");
			}

		}
	}

	private void Lose() throws IllegalAccessException {
		losers.add(IDStore.get(getCurrentPlayer()));
		// TODO think about it: does the game end, or only the player is removed from game
		SaveCurrentState();
		views.forEach(IView::Refresh);
		gameEnded = true;
	}

	private void Win() throws IllegalAccessException {
		winners.add(IDStore.get(getCurrentPlayer()));
		// TODO think about it: does the game end, or only the player is removed from game
		SaveCurrentState();
		views.forEach(IView::Refresh);
		gameEnded = true;
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
			for (Field n : f.getNeighbours()) {
				fs.neighbours.add(IDStore.get(n));
			}
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

		List<DeckState> deckstates = new ArrayList<DeckState>();
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

}