package hu.gergelyszaz.bgs.action.impl;

import hu.gergelyszaz.bGL.Action;
import hu.gergelyszaz.bgs.action.ActionManager;
import hu.gergelyszaz.bgs.game.VariableManager;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class WhileAction extends ConditionalAction {

	public WhileAction(VariableManager variableManager, Action action,
							 ActionManager actionManager) {

		super(variableManager, action, actionManager);
	}

	@Override
	public void Execute() throws IllegalAccessException {

		super.Execute();
	}

}
