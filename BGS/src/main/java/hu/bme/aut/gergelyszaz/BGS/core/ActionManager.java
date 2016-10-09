package hu.bme.aut.gergelyszaz.BGS.core;

import hu.bme.aut.gergelyszaz.bGL.Action;

import java.util.List;
import java.util.Objects;
import java.util.Stack;

/**
 * Created by mad on 2016. 10. 09..
 */
public class ActionManager {

	Stack<List<Action>> actionStack = new Stack<>();
	Stack<Action> currentActions = new Stack<>();
	Stack<Action> ifs = new Stack<>();
	private boolean steppedIn = false;
	private boolean steppedInOnce=false;

	ActionManager(List<Action> actions) {

		actionStack.push(actions);
		currentActions.push(actions.get(0));
	}

	/**
	 * Returns the Action after action in actions. If action was the last one,
	 * returns null.
	 *
	 * @param actions
	 * @param action
	 * @return
	 * @throws IllegalAccessException
	 */
	private static Action getNextAction(List<Action> actions, Action action)
		 throws IllegalAccessException {

		int nextActionIndex = actions.lastIndexOf(action) + 1;
		if (nextActionIndex == 0) {
			throw new IllegalAccessException(action + " is " +
				 "not part of " + actions);
		}
		if (nextActionIndex == actions.size()) {
			return null;
		}
		else {
			return actions.get(nextActionIndex);
		}
	}

	public Action getCurrentAction() {

		return currentActions.peek();
	}

	/**
	 * @return true, if went back to the first action
	 * @throws IllegalAccessException
	 */
	public boolean Step() throws IllegalAccessException {

		if (currentActions.isEmpty()) {
			currentActions.push(actionStack.peek().get(0));
			return false;
		}

		if (steppedIn) {
			_stepIntoNested();
			steppedIn = false;
			return false;
		}


		Action nextAction = getNextAction(actionStack.peek(), getCurrentAction());

		if (nextAction == null) {
			if (actionStack.size() > 1) {
				stepOutNested();
				if(Objects.equals(getCurrentAction().getName(), "IF")){
					Step();
				}
			}
			else {
				reset();
				return true;
			}
			return false;

		}

		currentActions.pop();
		currentActions.push(nextAction);
		return false;
	}

	/**
	 * Resets back to the first action.
	 */
	public void reset() {

		List<Action> actions = actionStack.get(0);

		actionStack.clear();
		actionStack.push(actions);

		currentActions.clear();
	}

	public void stepIntoNested() {

		steppedIn = true;
	}




	/**
	 * Steps into nested action if current action has nested actions,
	 * otherwise throws an exception.
	 *
	 * @throws IllegalAccessException
	 */
	private void _stepIntoNested() throws IllegalAccessException {

		if (getCurrentAction().getNestedAction() != null) {
			List<Action> actions = getCurrentAction().getNestedAction()
				 .getActions();
			actionStack.push(actions);
			currentActions.push(actions.get(0));
		}
		else {
			throw new IllegalAccessException("");
		}
	}

	/**
	 * Steps out of nested action
	 */
	private void stepOutNested() throws IllegalAccessException {

		currentActions.pop();
		actionStack.pop();
	}

}
