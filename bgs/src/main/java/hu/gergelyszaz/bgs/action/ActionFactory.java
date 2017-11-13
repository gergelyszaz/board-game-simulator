package hu.gergelyszaz.bgs.action;

import hu.gergelyszaz.bgs.action.impl.*;
import hu.gergelyszaz.bgs.game.InternalManager;
import hu.gergelyszaz.bgs.game.VariableManager;
import hu.gergelyszaz.bgs.state.IDManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class ActionFactory {

	public static final String DESTROY = "DESTROY";
	public static final String IF = "IF";
	public static final String WHILE = "WHILE";
	public static final String ENDTURN = "END TURN";
	public static final String MOVE = "MOVE";
	public static final String LOSE = "LOSE";
	public static final String WIN = "WIN";
	public static final String ROLL = "ROLL";
	public static final String SELECT = "SELECT";
	public static final String SHUFFLE = "SHUFFLE";
	public static final String SPAWN = "SPAWN";
	public static final String ASSIGNMENT = "ASSIGNMENT";

	private final VariableManager variableManager;
	private final IDManager idManager;
	private final ActionManager actionManager;
	private final InternalManager internalManager;

	public ActionFactory(VariableManager variableManager, IDManager idManager,
								ActionManager actionManager,
								InternalManager internalManager) {

		this.variableManager = variableManager;
		this.idManager = idManager;
		this.actionManager = actionManager;
		this.internalManager = internalManager;
	}

	public List<Action> createActionSequence(
		 List<hu.gergelyszaz.bGL.Action> actions)
		 throws IllegalAccessException {

		List<Action> returnActions = new ArrayList<>();

		for (hu.gergelyszaz.bGL.Action action : actions) {
			returnActions.addAll(_createActionSequence(action));
		}

		if (actions.size() == 0) {
			returnActions.add(new NopAction());
		}

		return returnActions;
	}

	public Action createAction(hu.gergelyszaz.bGL.Action action)
		 throws IllegalAccessException {

		Action returnAction = null;
		String actionName=action.getName();
		if(actionName==null)
			actionName=ASSIGNMENT;
		switch (actionName) {
			case SELECT:
				returnAction =
					 new SelectAction(variableManager, action,
						  internalManager.getSelectableManager());
				break;
			case SPAWN:
				returnAction =
					 new SpawnAction(variableManager, action, internalManager);
				break;
			case MOVE:
				returnAction = new MoveAction(variableManager, action);
				break;
			case SHUFFLE:
				returnAction = new ShuffleAction(variableManager, action);
				break;
			case DESTROY:
				returnAction =
					 new DestroyAction(variableManager, action, internalManager);
				break;
			case WIN:
				returnAction = new WinAction(variableManager, internalManager);
				break;
			case LOSE:
				returnAction = new LoseAction(variableManager, internalManager);
				break;
			case IF:
				returnAction = new IfAction(variableManager, action,
					 actionManager);
				break;
			case WHILE:
				returnAction =
					 new WhileAction(variableManager, action, actionManager);
				break;
			case ENDTURN:
				returnAction =
					 new EndTurnAction(variableManager, actionManager, internalManager);
				break;
			case ROLL:
				returnAction = new RollAction(variableManager, action);
				break;
			case ASSIGNMENT:
				returnAction = new AssignmentAction(variableManager, action);
				break;
			default:
				break;
		}
		return returnAction;

	}

	private List<Action> _createActionSequence(hu.gergelyszaz.bGL
																  .Action action)
		 throws IllegalAccessException {

		List<Action> returnActions = new ArrayList<>();
		Action newAction = createAction(action);
		returnActions.add(newAction);

		if (action.getNestedAction() != null) {
			returnActions.addAll(
				 createActionSequence(action.getNestedAction().getActions()));

			if (Objects.equals(action.getName(), WHILE)) {
				returnActions.add(new GotoAction(newAction, actionManager));
			}

			Action nopAction = new NopAction();
			returnActions.add(nopAction);
			((ConditionalAction) newAction).setSkipAction(nopAction);

		}

		return returnActions;
	}
}
