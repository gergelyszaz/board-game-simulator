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
	Model model
	String name

	val gameStates = new Stack<GameState>
	val VariableManager varManager;
	boolean gameEnded = false
	volatile var waitForInput = false

	IDManager IDs=new IDManager

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

/*
	private def Field getSelectedField() { varManager.GetReference(VariableManager.SELECTEDFIELD, null) as Field }

	private def setSelectedField(int fieldID) {
		val f = model.board.fields.findFirst[IDs.getID(it) == fieldID]
		if(f == null) return false
		varManager.StoreToObject_Name(null, VariableManager.SELECTEDFIELD, f)
		return true
	}

	private def Token getSelectedToken() { varManager.GetReference(VariableManager.SELECTEDTOKEN, null) as Token }

	private def setSelectedToken(int tokenID) {
		val t = tokens.findFirst[IDs.getID(it)== tokenID]
		if(t == null) return false
		selectedToken = t
		return true
	}

	private def setSelectedToken(Token t) {
		varManager.StoreToObject_Name(null, VariableManager.SELECTEDTOKEN, t)
		for (f : model.board.fields) {
			varManager.StoreToObject_Name(f, VariableManager.DISTANCE_FROM_SELECTED_TOKEN, -1)
		}
		t.field.setupDistance(0)
	}

	private def setSelectedDeck(int deckID) {
		val t = decks.findFirst[IDs.getID(it)== deckID]
		if(t == null) return false
		selectedDeck= t
		return true
	}
	private def void setSelectedDeck(Deck d){
		varManager.StoreToObject_Name(null, VariableManager.SELECTEDDECK, d)
	}

	private def Deck getSelectedDeck(){
		return varManager.GetReference(VariableManager.SELECTEDDECK, null) as Deck;
	}

	private def setSelectedCard(int cID) {
		var Card cs=null;
		for(d:decks){
			for(c:d.cards){
				if(IDs.getID(c)==cID) cs=c;
			}
		}
		if(cs == null) return false;
		varManager.StoreToObject_Name(null, VariableManager.SELECTEDFIELD, cs)
		return true;
	}
	private def void setSelectedCard(Card c){
		varManager.StoreToObject_Name(null, VariableManager.SELECTEDCARD, c)
	}
	private def getSelectedCard(){
		return varManager.GetReference(VariableManager.SELECTEDCARD, null) as Card
	}
*/
	private def void setupDistance(Field field, int distance) {

		//	TODO rewrite without and use BFS instead of DFS
		val dist = varManager.GetValue(VariableManager.DISTANCE_FROM_SELECTED_TOKEN, field)
		if((dist > -1 && dist <= distance)) return;
		varManager.StoreToObject_Name(field, VariableManager.DISTANCE_FROM_SELECTED_TOKEN, distance)
		for (f : field.neighbours) {
			{
				f.setupDistance(distance + 1)
			}
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
		for(field:model.board.fields){
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
		currentAction = GetNextAction(model.rule.actions)
		ExecuteAction(currentAction)
		if (currentAction == model.rule.actions.last && actionStack.isEmpty) {
			if (!gameEnded) {
				//currentPlayer = nextPlayer
				//if (currentPlayer == players.get(0)) {
					//turnCount++
					//varManager.StoreToObject_Name(null, VariableManager.TURNCOUNT, turnCount)
				//}
			}
		}

	}

	def Start() {
		for (PlayerSetup setup : model.player.playerSetups) {
			if (setup.id < 1 || setup.id > players.size)
				throw new IllegalAccessException("Invalid player id: Player " + setup.id)
			currentPlayer = players.get(setup.id - 1)
			varManager.StoreToObject_Name(null, VariableManager.THIS, currentPlayer)
			for (s : model.player.variables) {
				varManager.Store(s, currentPlayer)
			}

			currentAction = GetNextAction(setup.setupRule.actions)
			ExecuteAction(currentAction)
			while (currentAction != setup.setupRule.actions.last) {
				ExecuteAction(currentAction = GetNextAction(setup.setupRule.actions))
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
				if(actionStack.peek.name=="WHILE"&&varManager.Evaluate(actionStack.peek.condition)){
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
				varManager.StoreToObject_Name(null, VariableManager.THIS, o)
				if(varManager.Evaluate(action.condition)) {
					//println(o)
					activebuttons.add(IDs.get(o))
				}
			}
			if (activebuttons.empty) {
				Lose
				waitForInput = false
			}
			//Was in front of "if"
			SaveCurrentState
			views.forEach[Refresh]

		} else if (action.name == "SPAWN") {
			val token = new Token(varManager, action.token.name)
			for(a:action.token.variables){
				varManager.Store(a,token)
			}
			token.setOwner(currentPlayer)
			token.field=varManager.GetReference(action.spawnTo) as Field
			varManager.Store(action.toVar,token)
			tokens.add(token)
			objects.add(token)


		} else if (action.name == "MOVE") {
			if(action.type=="CARD"){
				(varManager.GetReference(action.selected) as Card).MoveTo(varManager.GetReference(action.moveTo) as Deck);
			}
			else{
				(varManager.GetReference(action.selected) as Token).field=(varManager.GetReference(action.moveTo) as Field);
			}
		} else if (action.name == "SHUFFLE") {
			(varManager.GetReference(action.selected) as Deck).Shuffle();
		} else if (action.name == "DESTROY") {
			var Token t;
			(t=varManager.GetReference(action.selected) as Token).Destroy();
			tokens.remove(t)
			objects.remove(t)
		} else if (action.name == "WIN") {
			Win
		} else if (action.name == "LOSE") {
			Lose
		} else if(action.name=="IF"|| action.name=="WHILE"){
			if(varManager.Evaluate(action.condition)) {
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
			varManager.Store(action.toVar,result);
		} else if (action.assignment != null) {
			val ref = varManager.GetReference(action.assignment.addition)
			if (ref != null) {
				varManager.Store(action.assignment.name, ref)
			} else {
				val value = varManager.GetValue(action.assignment.addition)
				varManager.Store(action.assignment.name, value)
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
		losers.add(IDs.get(currentPlayer))
		// TODO think about it: does the game end, or only the player is removed from game
		SaveCurrentState
		views.forEach[Refresh]
		gameEnded = true
	}

	private def Win() {
		winners.add(IDs.get(currentPlayer))
		// TODO think about it: does the game end, or only the player is removed from game
		SaveCurrentState
		views.forEach[Refresh]
		gameEnded = true
	}

	override getCurrentState(String sessionID) {
		val gamestate = gameStates.peek
		var gs=gamestate
		var p = players.findFirst[it.sessionID==sessionID]
		return gs.getPublicState(IDs.get(p));
	}

	private def SaveCurrentState() {
		val plist = new ArrayList<PlayerState>
		for (p : players) {
			val ps=new PlayerState
			ps.id=IDs.get(p)
			ps.name=p.name
			plist.add(ps)
		}
		val flist = new ArrayList<FieldState>
		for (f : fields) {
			val fs = new FieldState
			fs.id = IDs.get(f)
			fs.name=f.name;
			for (n : f.neighbours) {
				fs.neighbours.add(IDs.get(n))
			}
			flist.add(fs)
		}
		val tlist = new ArrayList<TokenState>
		for (t : tokens) {
			val ts = new TokenState
			ts.id = IDs.get(t)
			ts.field = IDs.get(t.field)
			ts.owner = IDs.get(t.owner)
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
			ds.id=IDs.get(d)
			if(d.owner!=null) ds.owner=IDs.get(d.owner)
			for(c:d.cards){
				val cs=new CardState(IDs.get(c),c.getType());
				ds.cards.add(cs)
			}
		}
		val state = new GameState(this.model.name, i, turnCount, IDs.get(currentPlayer), plist, flist, tlist,
			activebuttons.toList, winners, losers, deckstates,-1)
		gameStates.push(state)

	}

	override setSelected(String playerID, int ID) {
		if(playerID != currentPlayer.sessionID) return false;
		if(!activebuttons.contains(ID)) return false;

		if(currentAction.name=="SELECT"){
			val o=IDs.get(ID);
			varManager.Store( currentAction.toVar,o);

			if(o instanceof Token) {
				for(f : model.board.fields) {
					varManager.StoreToObject_Name(f, VariableManager.DISTANCE_FROM_SELECTED_TOKEN, -1)
				}
				o.field.setupDistance(0)
			}
		}


		//Probably would be better with synchronization
		waitForInput = false;
		return true;

	}



}