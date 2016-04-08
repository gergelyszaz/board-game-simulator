package hu.bme.aut.gergelyszaz.BGS.core

import hu.bme.aut.gergelyszaz.BGS.state.FieldState
import hu.bme.aut.gergelyszaz.BGS.state.GameState
import hu.bme.aut.gergelyszaz.BGS.state.TokenState
import hu.bme.aut.gergelyszaz.bGL.Action
import hu.bme.aut.gergelyszaz.bGL.Field
import hu.bme.aut.gergelyszaz.bGL.Model
import hu.bme.aut.gergelyszaz.bGL.PlayerSetup
import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedList
import java.util.List
import java.util.Random
import java.util.Set
import java.util.Stack
import hu.bme.aut.gergelyszaz.BGS.state.PlayerState
import hu.bme.aut.gergelyszaz.BGS.manager.IDManager
import hu.bme.aut.gergelyszaz.BGS.core.model.Player
import hu.bme.aut.gergelyszaz.BGS.core.model.Deck
import hu.bme.aut.gergelyszaz.BGS.core.model.Card
import hu.bme.aut.gergelyszaz.BGS.state.DeckState
import hu.bme.aut.gergelyszaz.BGS.state.CardState

class Game implements IController {
	Model model
	String name
	List<Player> players;
	val labels = new HashMap<String, Action>
	val views = new HashSet<IView>
	List<Deck> decks;
	int turnCount = 1
	Action currentAction = null
	val actionHistory = new LinkedList<Action>
	val tokens = new ArrayList<Token>
	val gameStates = new Stack<GameState>
	val VariableManager varManager;
	boolean gameEnded = false
	volatile var waitForInput = false

	IDManager IDs=new IDManager

	new(VariableManager vm){
		varManager=vm;
	}

	private def Player getCurrentPlayer() { varManager.GetReference(VariableManager.CURRENTPLAYER, null) as Player }

	private def void setCurrentPlayer(Player player) {
		varManager.StoreToObject_Name(null, VariableManager.CURRENTPLAYER, player)
	}

	private def getFields() {
		return model.board.fields
	}

	private def Field getSelectedField() { varManager.GetReference(VariableManager.SELECTEDFIELD, null) as Field }

	private def setSelectedField(int fieldID) {
		if(!activebuttons.contains(fieldID)) return false
		val f = model.board.fields.findFirst[IDs.getID(it) == fieldID]
		if(f == null) return false
		varManager.StoreToObject_Name(null, VariableManager.SELECTEDFIELD, f)
		waitForInput = false
		return true
	}

	private def Token getSelectedToken() { varManager.GetReference(VariableManager.SELECTEDTOKEN, null) as Token }

	private def setSelectedToken(int tokenID) {
		if(!activebuttons.contains(tokenID)) return false
		val t = tokens.findFirst[IDs.getID(it)== tokenID]
		if(t == null) return false
		selectedToken = t
		waitForInput = false
		return true
	}

	private def setSelectedToken(Token t) {
		varManager.StoreToObject_Name(null, VariableManager.SELECTEDTOKEN, t)
		for (f : model.board.fields) {
			varManager.StoreToObject_Name(f, VariableManager.DISTANCE_FROM_SELECTED_TOKEN, -1)
		}
		t.field.setupDistance(0)
	}

	private def void setSelectedDeck(Deck d){
		varManager.StoreToObject_Name(null, VariableManager.SELECTEDDECK, d)
	}

	private def Deck getSelectedDeck(){
		return varManager.GetReference(VariableManager.SELECTEDDECK, null) as Deck;
	}

	private def void setSelectedCard(Card c){
		varManager.StoreToObject_Name(null, VariableManager.SELECTEDCARD, c)
	}
	private def getSelectedCard(){
		return varManager.GetReference(VariableManager.SELECTEDCARD, null) as Card
	}

	private def void setupDistance(Field field, int distance) {
		val dist = varManager.GetValue(VariableManager.DISTANCE_FROM_SELECTED_TOKEN, field)
		if(dist > -1 && dist <= distance) return;
		varManager.StoreToObject_Name(field, VariableManager.DISTANCE_FROM_SELECTED_TOKEN, distance)
		for (f : field.neighbours) {
			f.setupDistance(distance + 1)
		}
	}

	def boolean Join(String clientID) {
		for (p : players) {
			if (!p.IsConnected) {
				p.sessionID = clientID
				SaveCurrentState
				return true
			}
		}
		return false
	}

	def boolean IsFull() {
		return players.forall[IsConnected]
	}

	def Init(Model m,List<Player> p,List<Deck> d) {
		name = m.name;
		players=p;
		decks=d;
		model = m;

		currentPlayer = players.get(0);
		for (a : model.rules) {
			if (a.label != null) {
				labels.put(a.label.name, a);
			}
		}
	}

	private def getNextPlayer() {
		for (var i = 0; i < players.length - 1; i++) {
			if(currentPlayer == players.get(i)) return players.get(i + 1)
		}
		return players.get(0);
	}

	def Step() {
		if(waitForInput || gameEnded) return;
		actionHistory.push(currentAction = GetNextAction(model.rules))
		ExecuteAction(currentAction)
		if (currentAction == model.rules.last) {
			if (model.winCondition != null && varManager.Evaluate(model.winCondition)) {
				Win
			}
			if (model.loseCondition != null && varManager.Evaluate(model.loseCondition)) {
				Lose
			}

			if (!gameEnded) {
				currentPlayer = nextPlayer
				if (currentPlayer == players.get(0)) {
					turnCount++
					varManager.StoreToObject_Name(null, VariableManager.TURNCOUNT, turnCount)
				}
			}
		}

	}

	def Start() {
		varManager.StoreToObject_Name(null, VariableManager.TURNCOUNT, turnCount)

		for (PlayerSetup setup : model.player.playerSetups) {
			if (setup.id < 1 || setup.id > players.size)
				throw new IllegalAccessException("Invalid player id: Player " + setup.id)
			currentPlayer = players.get(setup.id - 1)
			varManager.StoreToObject_Name(null, VariableManager.THIS, currentPlayer)
			for (s : model.player.variables) {
				varManager.Store(s, currentPlayer)
			}

			ExecuteAction(currentAction = GetNextAction(setup.setupRules))
			while (currentAction != setup.setupRules.last) {
				ExecuteAction(currentAction = GetNextAction(setup.setupRules))
			}
			varManager.StoreToObject_Name(null, VariableManager.THIS, null)
			currentAction = null
		}
		SaveCurrentState
	}

	def IsFinished() {
		return gameEnded
	}

	def run() {
		Start
		while (!gameEnded) {
			Step
			Thread.yield
		}
	}

	private def GetNextAction(Collection<Action> actions) {
		if (currentAction == null || currentAction == actions.last) {
			return actions.get(0)
		}

		for (var i = 0; i < actions.length - 1; i++) {
			if (currentAction == actions.get(i)) {
				return actions.get(i + 1)
			}
		}
	}

	private Set<Integer> activebuttons = new HashSet<Integer>

	List<Integer> losers=new ArrayList

	List<Integer> winners=new ArrayList

	private def ExecuteAction(Action action) {
		try{
		activebuttons.clear
		if (action.name == "SELECT") {
			waitForInput = true
			if (action.objectOfSelect == 'TOKEN') {
				val nextAction = GetNextAction(model.rules)
				for (t : tokens) {
					if (nextAction.name == "SELECT" && nextAction.objectOfSelect == "FIELD") {
						selectedToken = t
						var possibilities = 0
						for (f : model.board.fields) {
							varManager.StoreToObject_Name(null, VariableManager.THIS, f)
							if(varManager.Evaluate(nextAction.filter)) possibilities++
						}
						if (possibilities > 0) {
							varManager.StoreToObject_Name(null, VariableManager.THIS, t)
							if(varManager.Evaluate(action.filter)) activebuttons.add(IDs.getID(t))
						}
					} else {
						varManager.StoreToObject_Name(null, VariableManager.THIS, t)
						if(varManager.Evaluate(action.filter)) activebuttons.add(IDs.getID(t))
					}
				}
			} else if (action.objectOfSelect == 'FIELD') {
				for (f : model.board.fields) {
					varManager.StoreToObject_Name(null, VariableManager.THIS, f)
					if(varManager.Evaluate(action.filter)) activebuttons.add(IDs.getID(f))
				}
			} else if(action.objectOfSelect=='DECK'){
				for(d:decks){
					varManager.StoreToObject_Name(null, VariableManager.THIS, d)
					if(varManager.Evaluate(action.filter)) activebuttons.add(IDs.getID(d))
				}
			} else if(action.objectOfSelect=='CARD'){
				for(d:decks){
					for(c:d.cards){
						varManager.StoreToObject_Name(null, VariableManager.THIS, c)
						if(varManager.Evaluate(action.filter)) activebuttons.add(IDs.getID(c))
					}
				}
			}

			SaveCurrentState
			views.forEach[Refresh]

			if (activebuttons.empty) {
				// TODO step back?
				Lose
				waitForInput = false
			}

		} else if (action.name == "SPAWN") {
			val token = new Token(varManager, action.token.name)
			token.field = selectedField
			tokens.add(token)
			token.owner = currentPlayer

		} else if (action.name == "MOVE") {
			if(action.objectOfSelect=="CARD"){
				selectedCard.MoveTo(selectedDeck);
			}
			else{
				selectedToken.field = selectedField;
			}
		} else if (action.name == "SHUFFLE") {
			selectedDeck.Shuffle();
		} else if (action.name == "DESTROY") {
			selectedToken.Destroy();
			tokens.remove(selectedToken)

		} else if (action.name == "WIN") {
			Win
		} else if (action.name == "LOSE") {
			Lose
		} else if (action.name == "ROLL") {

			val r = new Random
			var result = 0
			for (var i = 1; i < action.numberOfDice + 1; i++) {
				var rollresult = r.nextInt(action.to) + action.from
				result += rollresult
				varManager.StoreToObject_Name(null, VariableManager.ROLLRESULT + i, rollresult)
			}
			varManager.StoreToObject_Name(null, VariableManager.ROLLRESULT, result)

		} else if (action.assignment != null) {
			val ref = varManager.GetReference(action.assignment.addition)
			if (ref != null) {
				varManager.Store(action.assignment.name, ref)
			} else {
				val value = varManager.GetValue(action.assignment.addition)
				varManager.Store(action.assignment.name, value)
			}

		} else if (action.gotoCondition != null) {
			if (varManager.Evaluate(action.gotoCondition.condition)) {
				val name = action.gotoCondition.goto.name

				currentAction = labels.get(name)
			} else {
			}
		} else if (action.label != null) {
		}
		}
		catch(Exception e){
			System.err.println(e);
			System.err.println("	at Action: "+action);
			if(action.assignment!=null) {
				System.err.println("		"+action.assignment.addition+" could not be resolved.");
			}

		}
	}

	override AddView(IView v) {
		views.add(v)
	}

	private def Lose() {
		losers.add(IDs.getID(currentPlayer))
		// TODO think about it: does the game end, or only the player is removed from game
		SaveCurrentState
		views.forEach[Refresh]
		gameEnded = true
	}

	private def Win() {
		winners.add(IDs.getID(currentPlayer))
		// TODO think about it: does the game end, or only the player is removed from game
		SaveCurrentState
		views.forEach[Refresh]
		gameEnded = true
	}

	override getCurrentState(String sessionID) {
		val gamestate = gameStates.peek
		var gs=gamestate
		var p = players.findFirst[it.sessionID==sessionID]
		return gs.getPublicState(IDs.getID(p));
	}

	private def SaveCurrentState() {
		val plist = new ArrayList<PlayerState>
		for (p : players) {
			val ps=new PlayerState
			ps.id=IDs.getID(p)
			ps.name=p.name
			plist.add(ps)
		}
		val flist = new ArrayList<FieldState>
		for (f : fields) {
			val fs = new FieldState
			fs.id = IDs.getID(f)
			fs.name=f.name;
			for (n : f.neighbours) {
				fs.neighbours.add(IDs.getID(n))
			}
			flist.add(fs)
		}
		val tlist = new ArrayList<TokenState>
		for (t : tokens) {
			val ts = new TokenState
			ts.id = IDs.getID(t)
			ts.field = IDs.getID(t.field)
			ts.owner = IDs.getID(t.owner)
			tlist.add(ts)
		}

		var i = 0
		if (!gameStates.empty()) {
			i = gameStates.peek.version + 1
		}

		var deckstates=new ArrayList<DeckState>
		for(d: decks){
			val ds=new DeckState
			switch(d.visibility){
				case "PUBLIC": ds.visible=2
				case "PROTECTED": ds.visible=1
				case "PRIVATE": ds.visible=0
			}
			deckstates.add(ds)
			ds.id=IDs.getID(d)
			if(d.owner!=null) ds.owner=IDs.getID(d.owner)
			for(c:d.cards){
				val cs=new CardState(IDs.getID(c),c.getType());

				ds.cards.add(cs)
			}
		}
		val state = new GameState(this.model.name, i, turnCount, IDs.getID(currentPlayer), plist, flist, tlist,
			activebuttons.toList, winners, losers, deckstates)
		gameStates.push(state)

	}

	override setSelected(String playerID, int ID) {
		if(playerID != currentPlayer.sessionID) return false
		return ( (selectedField = ID) || (selectedToken = ID))

	}



}