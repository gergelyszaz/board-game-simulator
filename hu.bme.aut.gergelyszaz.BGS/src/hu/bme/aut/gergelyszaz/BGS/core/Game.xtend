package hu.bme.aut.gergelyszaz.BGS.core

import hu.bme.aut.gergelyszaz.bGL.Action
import hu.bme.aut.gergelyszaz.bGL.Field
import hu.bme.aut.gergelyszaz.bGL.Model
import hu.bme.aut.gergelyszaz.bGL.PlayerSetup
import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Random
import javax.swing.JOptionPane

class Game implements IController {
	String name
	Object lock=new Object
	List<Player> players = new ArrayList<Player>
	HashMap<String, Action> labels = new HashMap
	IView view = null
	int turnCount = 1
	Action currentAction = null
	LinkedList<Action> actionHistory = new LinkedList
	val tokens = new ArrayList<Token>
	var varManager = new VariableManager
	boolean gameEnded = false
	public volatile var waitForInput = false

	def Player getCurrentPlayer() { varManager.GetReference(VariableManager.CURRENTPLAYER, null) as Player }

	def void setCurrentPlayer(Player player) { varManager.StoreToObject_Name(null, VariableManager.CURRENTPLAYER, player) }

	Model model

	def Field getSelectedField() { varManager.GetReference(VariableManager.SELECTEDFIELD, null) as Field }

	override setSelectedField(Field field) { varManager.StoreToObject_Name(null, VariableManager.SELECTEDFIELD, field) }

	def Token getSelectedToken() { varManager.GetReference(VariableManager.SELECTEDTOKEN, null) as Token }

	override setSelectedToken(Token token) {
		varManager.StoreToObject_Name(null, VariableManager.SELECTEDTOKEN, token)
		for (f : model.board.fields) {
			varManager.StoreToObject_Name(f, VariableManager.DISTANCE_FROM_SELECTED_TOKEN, -1)
		}
		token.field.setupDistance(0)

	}

	private def void setupDistance(Field field, int distance) {
		val dist = varManager.GetValue(VariableManager.DISTANCE_FROM_SELECTED_TOKEN, field)
		if(dist > -1 && dist <= distance) return;
		varManager.StoreToObject_Name(field, VariableManager.DISTANCE_FROM_SELECTED_TOKEN, distance)
		for (f : field.neighbours) {
			f.setupDistance(distance + 1)
		}
	}

	override getVarManager() { return varManager }

	def Init(String n, List<Player> p, Model m) {
		name = n
		players.addAll(p)
		model = m
		currentPlayer = players.get(0)

		for (f : model.board.fields) {
			varManager.StoreToObject_Name(null, f.name, f)
		}
		for (f : model.board.fields) {
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

	def Step(){
	if (!waitForInput) {
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
			} else {
				synchronized(lock)
				{
					lock.wait
				}
			}
			view.Refresh
	}
	
	def Start(){
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
	}
	
	def Run() {
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

	private def ExecuteAction(Action action) {
		if (action.name == "SELECT") {
			waitForInput = true
			val List<Object> activebuttons = new ArrayList<Object>
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
							if(varManager.Evaluate(action.filter)) activebuttons.add(t)
						}
					} else {
						varManager.StoreToObject_Name(null, VariableManager.THIS, t)
						if(varManager.Evaluate(action.filter)) activebuttons.add(t)
					}
				}
			} else if (action.objectOfSelect == 'FIELD') {
				for (f : model.board.fields) {
					varManager.StoreToObject_Name(null, VariableManager.THIS, f)
					if(varManager.Evaluate(action.filter)) activebuttons.add(f)
				}
			}
			if (!activebuttons.empty) {
				view.EnableButtons(activebuttons)
			} else {
				// TODO step back
				JOptionPane.showMessageDialog(null, "No moves available", "Warning", JOptionPane.INFORMATION_MESSAGE);
				Lose
				waitForInput = false
				println(actionHistory.pop)
				println(actionHistory.pop)
				println(currentAction = actionHistory.peek)
			}

		} else if (action.name == "SPAWN") {
			val token = new Token(varManager, action.token.name)
			token.field = selectedField
			tokens.add(token)
			token.owner = currentPlayer
			view.AddToken(token)

		} else if (action.name == "MOVE") {
			selectedToken.field = selectedField

		} else if (action.name == "DESTROY") {
			selectedToken.Destroy
			tokens.remove(selectedToken)
			view.RemoveButton(selectedToken)

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

	override Restart() {
		varManager = new VariableManager
	}

	override setView(IView v) {
		view = v

	}

	private def Lose() {
		gameEnded=true
		JOptionPane.showMessageDialog(null, "Player " + currentPlayer.id + " loses!", "Warning",
			JOptionPane.INFORMATION_MESSAGE);
	}

	private def Win() {
		gameEnded=true
		JOptionPane.showMessageDialog(null, "Player " + currentPlayer.id + " wins!", "Warning",
			JOptionPane.INFORMATION_MESSAGE);
	}

	override setWaitForInput(boolean b) {
		waitForInput = b
	}
	
	override getLock() {
		return lock
	}

}