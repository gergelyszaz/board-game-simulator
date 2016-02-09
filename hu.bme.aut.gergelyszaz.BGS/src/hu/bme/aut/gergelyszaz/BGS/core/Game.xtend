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

class Game implements IController {
	Model model
	String name
	val players = new ArrayList<Player>
	val labels = new HashMap<String, Action>
	val views = new HashSet<IView>
	int turnCount = 1
	Action currentAction = null
	val actionHistory = new LinkedList<Action>
	val tokens = new ArrayList<Token>
	val gameStates = new Stack<GameState>
	val varManager = new VariableManager
	boolean gameEnded = false
	volatile var waitForInput = false

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
		val f = model.board.fields.findFirst[it.hashCode == fieldID]
		if(f == null) return false
		varManager.StoreToObject_Name(null, VariableManager.SELECTEDFIELD, f)
		waitForInput = false
		return true
	}

	private def Token getSelectedToken() { varManager.GetReference(VariableManager.SELECTEDTOKEN, null) as Token }

	private def setSelectedToken(int tokenID) {
		if(!activebuttons.contains(tokenID)) return false
		val t = tokens.findFirst[it.hashCode == tokenID]
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
				p.id = clientID
				SaveCurrentState
				return true
			}
		}
		return false
	}

	def boolean IsFull() {
		return players.forall[IsConnected]
	}

	def Init(String n, List<Player> p, Model m) {
		name = n
		players.addAll(p)
		model = m
		currentPlayer = players.get(0)

		// store all field
		for (f : model.board.fields) {
			varManager.StoreToObject_Name(null, f.name, f)
		}
		// variables may contain reference to token
		for (f : model.board.fields) {
			varManager.StoreToObject_Name(f, "tokenCount", 0)
			for (v : f.variables) {
				varManager.Store(v, f)
			}
		}

		for (a : model.rules) {
			if (a.label != null) {
				labels.put(a.label.name, a)
			}
		}
	}

	private def getNextPlayer() {
		for (var i = 0; i < players.length - 1; i++) {
			if(currentPlayer == players.get(i)) return players.get(i + 1)
		}
		return players.get(0)
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
							if(varManager.Evaluate(action.filter)) activebuttons.add(t.hashCode)
						}
					} else {
						varManager.StoreToObject_Name(null, VariableManager.THIS, t)
						if(varManager.Evaluate(action.filter)) activebuttons.add(t.hashCode)
					}
				}
			} else if (action.objectOfSelect == 'FIELD') {
				for (f : model.board.fields) {
					varManager.StoreToObject_Name(null, VariableManager.THIS, f)
					if(varManager.Evaluate(action.filter)) activebuttons.add(f.hashCode)
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
			selectedToken.field = selectedField

		} else if (action.name == "DESTROY") {
			selectedToken.Destroy
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

	override AddView(IView v) {
		views.add(v)
	}

	private def Lose() {
		losers.add(currentPlayer.hashCode)
		// TODO think about it: does the game end, or only the player is removed from game
		SaveCurrentState
		views.forEach[Refresh]
		gameEnded = true
	}

	private def Win() {
		winners.add(currentPlayer.hashCode)
		// TODO think about it: does the game end, or only the player is removed from game
		SaveCurrentState
		views.forEach[Refresh]
		gameEnded = true
	}

	override getCurrentState(String playerID) {		
		val gamestate = gameStates.peek
		var gs=gamestate
		var p = players.findFirst[it.hashCode == gamestate.currentplayer]
		if (p.id != playerID){			
			gs = gs.publicState
			}
		return gs
	}

	private def SaveCurrentState() {
		val plist = new ArrayList<PlayerState>
		for (p : players) {
			val ps=new PlayerState
			ps.id=p.hashCode
			ps.name=p.name
			plist.add(ps)
		}
		val flist = new ArrayList<FieldState>
		for (f : fields) {
			val fs = new FieldState
			fs.id = f.hashCode
			fs.x = f.x;
			fs.y = f.y;
			fs.z = f.z;
			for (n : f.neighbours) {
				fs.neighbours.add(n.hashCode)
			}
			flist.add(fs)
		}
		val tlist = new ArrayList<TokenState>
		for (t : tokens) {
			val ts = new TokenState
			ts.id = t.hashCode
			ts.field = t.field.hashCode
			ts.owner = t.owner.hashCode
			tlist.add(ts)
		}

		var i = 0 as int
		if (!gameStates.empty()) {
			i = gameStates.peek.version + 1
		}
		val state = new GameState(this.model.name, i, turnCount, currentPlayer.hashCode, plist, flist, tlist,
			activebuttons.toList, winners, losers)
		gameStates.push(state)

	}

	override setSelected(String playerID, int ID) {
		if(playerID != currentPlayer.id) return false
		return ( (selectedField = ID) || (selectedToken = ID))

	}

}