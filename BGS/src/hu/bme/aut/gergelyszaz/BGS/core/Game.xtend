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
import java.util.HashSet
import java.util.List
import java.util.Random
import java.util.Set
import java.util.Stack
import hu.bme.aut.gergelyszaz.BGS.state.PlayerState
import hu.bme.aut.gergelyszaz.BGS.manager.IDManager
import hu.bme.aut.gergelyszaz.BGS.core.model.Player
import hu.bme.aut.gergelyszaz.BGS.core.model.Deck
import hu.bme.aut.gergelyszaz.BGS.core.model.Card
import hu.bme.aut.gergelyszaz.BGS.core.model.Token
import hu.bme.aut.gergelyszaz.BGS.state.DeckState
import hu.bme.aut.gergelyszaz.BGS.state.CardState

class Game implements IController {
	Model gameModel
	String name

	val gameStates = new Stack<GameState>
	val VariableManager variableManager;
	boolean gameEnded = false
	volatile var waitForInput = false

	IDManager IDStore=new IDManager

	val views = new HashSet<IView>
	int turnCount = 1
	Action currentAction = null
	val actionStack = new Stack<Action>

	private Set<Integer> activebuttons = new HashSet<Integer>
	List<Player> players;
	val tokens = new ArrayList<Token>
	List<Deck> decks;
	List<Integer> losers=new ArrayList
	List<Integer> winners=new ArrayList
	//TODO add everything selectable to objects
	Set<Object> objects=new HashSet


	new(VariableManager variableManager){
		this.variableManager=variableManager;
	}

	private def Player getCurrentPlayer() { variableManager.GetReference(VariableManager.CURRENTPLAYER, null) as Player }

	private def void setCurrentPlayer(Player player) {
		variableManager.StoreToObjectWithName(null, VariableManager.CURRENTPLAYER, player)
	}

	private def getFields() {
		return gameModel.board.fields
	}

	private def void setupDistance(Field startingField, int distance) {

		//	TODO write without recursion and use BFS instead of DFS
		val dist = variableManager.GetValue(VariableManager.DISTANCE_FROM_SELECTED_TOKEN, startingField)
		if((dist > -1 && dist <= distance)) return;
		variableManager.StoreToObjectWithName(startingField, VariableManager.DISTANCE_FROM_SELECTED_TOKEN, distance)
		for (field : startingField.neighbours) {
			{
				field.setupDistance(distance + 1)
			}
		}
	}

	def boolean Join(String clientID) {
		for (player : players) {
			if (!player.IsConnected) {
				player.sessionID = clientID
				SaveCurrentState
				return true
			}
		}
		return false
	}

	def boolean IsFull() {
		return players.forall[IsConnected]
	}

	def Init(Model gameModel,List<Player> players,List<Deck> decks) {
		name = gameModel.name;
		this.players=players;
		this.decks=decks;
		this.gameModel = gameModel;

		currentPlayer = players.get(0);
		for(field:gameModel.board.fields){
			objects.add(field)
		}
		for(deck:decks){
			objects.add(deck)
			for(c:deck.cards){
				objects.add(c)
			}
		}
		for(player:players){
			objects.add(player)
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
		currentAction = GetNextAction(gameModel.rule.actions)
		ExecuteAction(currentAction)
	}

	def Start() {
		for (PlayerSetup setup : gameModel.player.playerSetups) {
			if (setup.id < 1 || setup.id > players.size)
				throw new IllegalAccessException("Invalid player id: Player " + setup.id)
			currentPlayer = players.get(setup.id - 1)
			variableManager.StoreToObjectWithName(null, VariableManager.THIS, currentPlayer)
			for (s : gameModel.player.variables) {
				variableManager.Store(s, currentPlayer)
			}

			currentAction = GetNextAction(setup.setupRule.actions)
			ExecuteAction(currentAction)
			while (currentAction != setup.setupRule.actions.last) {
				ExecuteAction(currentAction = GetNextAction(setup.setupRule.actions))
			}
			variableManager.StoreToObjectWithName(null, VariableManager.THIS, null)
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

	private def Action GetNextAction(Collection<Action> actions) {
		//current action was not set before
		if(currentAction==null) return actions.get(0);

		if(!actionStack.isEmpty()){
			//Nested action was entered
			if(actionStack.peek()==currentAction){
				return actionStack.peek().nestedAction.actions.get(0);
			}
			//Last element of nested action
			if(currentAction==actionStack.peek.nestedAction.actions.last){
				//WHILE loop returns first nested element if condition is met
				if(actionStack.peek.name=="WHILE"&&variableManager.Evaluate(actionStack.peek.condition)){
					return actionStack.peek.nestedAction.actions.get(0)
				}
				//Step out of nested action
				currentAction=actionStack.pop
				return GetNextAction(actions)
			}
			//Get next element in nested action
			val nested=actionStack.peek.nestedAction.actions
			for (var i = 0; i < nested.length - 1; i++) {
				if (currentAction== nested.get(i)) {
					return nested.get(i + 1)
				}
			}
		}

		//No nested action
		if ( currentAction == actions.last) {
			if(actionStack.isEmpty){	return actions.get(0)}
		}
		for (var i = 0; i < actions.length - 1; i++) {
			if (currentAction== actions.get(i)) {
				return actions.get(i + 1)
			}
		}
	}


	private def ExecuteAction(Action action) {
		try{
		activebuttons.clear

		if (action.name == "SELECT") {
			waitForInput = true;
			for(o:objects) {
				variableManager.StoreToObjectWithName(null, VariableManager.THIS, o)
				if(variableManager.Evaluate(action.condition)) {
					activebuttons.add(IDStore.get(o))
				}
			}
			if (activebuttons.empty) {
				Lose
				waitForInput = false
			}
			SaveCurrentState
			views.forEach[Refresh]

		} else if (action.name == "SPAWN") {
			val token = new Token(variableManager, action.token.name)
			for(a:action.token.variables){
				variableManager.Store(a,token)
			}
			token.setOwner(currentPlayer)
			token.field=variableManager.GetReference(action.spawnTo) as Field
			variableManager.Store(action.toVar,token)
			tokens.add(token)
			objects.add(token)


		} else if (action.name == "MOVE") {
			if(action.type=="CARD"){
				(variableManager.GetReference(action.selected) as Card).MoveTo(variableManager.GetReference(action.moveTo) as Deck);
			}
			else{
				(variableManager.GetReference(action.selected) as Token).field=(variableManager.GetReference(action.moveTo) as Field);
			}
		} else if (action.name == "SHUFFLE") {
			(variableManager.GetReference(action.selected) as Deck).Shuffle();
		} else if (action.name == "DESTROY") {
			var Token t;
			(t=variableManager.GetReference(action.selected) as Token).Destroy();
			tokens.remove(t)
			objects.remove(t)
		} else if (action.name == "WIN") {
			Win
		} else if (action.name == "LOSE") {
			Lose
		} else if(action.name=="IF"|| action.name=="WHILE"){
			if(variableManager.Evaluate(action.condition)) {
				actionStack.push(action);
			}
		} else if(action.name=="END TURN"){
			actionStack.clear
			currentPlayer=nextPlayer
			currentAction=null
		}
		else if (action.name == "ROLL") {

			val r = new Random
			var result = 0
			for (var i = 1; i < action.numberOfDice + 1; i++) {
				var rollresult = r.nextInt(action.to) + action.from
				result += rollresult
				//varManager.StoreToObject_Name(null, VariableManager.ROLLRESULT + i, rollresult)
			}
			variableManager.Store(action.toVar,result);
		} else if (action.assignment != null) {
			val ref = variableManager.GetReference(action.assignment.addition)
			if (ref != null) {
				variableManager.Store(action.assignment.name, ref)
			} else {
				val value = variableManager.GetValue(action.assignment.addition)
				variableManager.Store(action.assignment.name, value)
			}

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
		losers.add(IDStore.get(currentPlayer))
		// TODO think about it: does the game end, or only the player is removed from game
		SaveCurrentState
		views.forEach[Refresh]
		gameEnded = true
	}

	private def Win() {
		winners.add(IDStore.get(currentPlayer))
		// TODO think about it: does the game end, or only the player is removed from game
		SaveCurrentState
		views.forEach[Refresh]
		gameEnded = true
	}

	override getCurrentState(String sessionID) {
		val gamestate = gameStates.peek
		var gs=gamestate
		var p = players.findFirst[it.sessionID==sessionID]
		return gs.getPublicState(IDStore.get(p));
	}

	private def SaveCurrentState() {
		val plist = new ArrayList<PlayerState>
		for (p : players) {
			val ps=new PlayerState
			ps.id=IDStore.get(p)
			ps.name=p.name
			plist.add(ps)
		}
		val flist = new ArrayList<FieldState>
		for (f : fields) {
			val fs = new FieldState
			fs.id = IDStore.get(f)
			fs.name=f.name;
			for (n : f.neighbours) {
				fs.neighbours.add(IDStore.get(n))
			}
			flist.add(fs)
		}
		val tlist = new ArrayList<TokenState>
		for (t : tokens) {
			val ts = new TokenState
			ts.id = IDStore.get(t)
			ts.field = IDStore.get(t.field)
			ts.owner = IDStore.get(t.owner)
			ts.type=t.type;
			tlist.add(ts)
		}

		var stateVersion = 0
		if (!gameStates.empty()) {
			stateVersion = gameStates.peek.version + 1
		}

		var deckstates=new ArrayList<DeckState>
		for(deck: decks){
			val deckState=new DeckState
			switch(deck.visibility){
				case "PUBLIC": deckState.visible=2
				case "PROTECTED": deckState.visible=1
				case "PRIVATE": deckState.visible=0
			}
			deckstates.add(deckState)
			deckState.id=IDStore.get(deck)
			if(deck.owner!=null) deckState.owner=IDStore.get(deck.owner)
			for(c:deck.cards){
				val cs=new CardState(IDStore.get(c),c.getType());
				deckState.cards.add(cs)
			}
		}
		val state = new GameState(this.gameModel.name, stateVersion, turnCount, IDStore.get(currentPlayer), plist, flist, tlist,
			activebuttons.toList, winners, losers, deckstates,-1)
		gameStates.push(state)

	}

	override setSelected(String playerID, int selectedID) {
		if(playerID != currentPlayer.sessionID) return false;
		if(!activebuttons.contains(selectedID)) return false;

		if(currentAction.name=="SELECT"){
			val object=IDStore.get(selectedID);
			variableManager.Store( currentAction.toVar,object);

			if(object instanceof Token) {
				for(f : gameModel.board.fields) {
					variableManager.StoreToObjectWithName(f, VariableManager.DISTANCE_FROM_SELECTED_TOKEN, -1)
				}
				object.field.setupDistance(0)
			}
		}


		//Probably would be better with synchronization
		waitForInput = false;
		return true;

	}



}