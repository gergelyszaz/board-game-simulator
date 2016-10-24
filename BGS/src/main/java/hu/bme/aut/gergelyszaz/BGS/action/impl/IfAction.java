package hu.bme.aut.gergelyszaz.BGS.action.impl;

import hu.bme.aut.gergelyszaz.BGS.action.ActionManager;
import hu.bme.aut.gergelyszaz.BGS.action.ConditionalAction;
import hu.bme.aut.gergelyszaz.BGS.game.VariableManager;
import hu.bme.aut.gergelyszaz.bGL.Action;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class IfAction extends ConditionalAction {

	private final ActionManager actionManager;

	public IfAction(VariableManager variableManager, Action action,
						 ActionManager actionManager) {

		super(variableManager, action, actionManager);
		this.actionManager = actionManager;
	}

	@Override
	public void Execute() throws IllegalAccessException {

		super.Execute();
	}
}
