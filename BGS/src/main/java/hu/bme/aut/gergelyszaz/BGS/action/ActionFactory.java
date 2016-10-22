package hu.bme.aut.gergelyszaz.BGS.action;

import hu.bme.aut.gergelyszaz.BGS.action.impl.*;
import hu.bme.aut.gergelyszaz.BGS.game.InternalManager;
import hu.bme.aut.gergelyszaz.BGS.game.VariableManager;
import hu.bme.aut.gergelyszaz.BGS.state.IDManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class ActionFactory {

	private final VariableManager variableManager;
	private final IDManager idManager;
	private final ActionManager actionManager;
	private final InternalManager internalManager;

	public ActionFactory(VariableManager variableManager, IDManager idManager, ActionManager actionManager, InternalManager internalManager) {
		this.variableManager = variableManager;
		this.idManager = idManager;
		this.actionManager = actionManager;
		this.internalManager=internalManager;
	}

	public List<Action> createActionSequence(
		 List<hu.bme.aut.gergelyszaz.bGL.Action> actions)
		 throws IllegalAccessException {

		List<Action> returnActions = new ArrayList<>();

		for (hu.bme.aut.gergelyszaz.bGL.Action action : actions) {
			returnActions.add(createAction(action));
			//TODO nestedActions in IF and WHILE
		}

		return returnActions;
	}

	public Action createAction(hu.bme.aut.gergelyszaz.bGL.Action action)
		 throws IllegalAccessException {

		Action returnAction;

		switch (action.getName()) {
			case "SELECT":
				returnAction =
					 new SelectAction(variableManager, action,
						  internalManager.getSelectableManager());
				break;
			case "SPAWN":
				returnAction = new SpawnAction(variableManager, action, internalManager);
				break;
			case "MOVE":
				returnAction = new MoveAction(variableManager, action);
				break;
			case "SHUFFLE":
				returnAction = new ShuffleAction(variableManager, action);
				break;
			case "DESTROY":
				returnAction = new DestroyAction(variableManager, action, internalManager);
				break;
			case "WIN":
				returnAction = new WinAction(variableManager, internalManager);
				break;
			case "LOSE":
				returnAction = new LoseAction(variableManager, internalManager);
				break;
			case "IF":
				returnAction = new IfAction(variableManager, action, actionManager);
				break;
			case "WHILE":
				returnAction =
					 new WhileAction(variableManager, action, actionManager);
				break;
			case "END TURN":
				returnAction =
					 new EndTurnAction(variableManager, actionManager,null);
				break;
			case "ROLL":
				returnAction = new RollAction(variableManager, action);
				break;
			default:
				returnAction = new AssignmentAction(variableManager, action);
				break;
		}
		return returnAction;

	}
}
