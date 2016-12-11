package hu.gergelyszaz.BGS.action.impl;

import hu.gergelyszaz.BGS.action.Action;
import hu.gergelyszaz.BGS.action.ActionManager;

/**
 * Created by mad on 2016. 10. 24..
 */
public class GotoAction implements Action {

	private final ActionManager actionManager;
	private final Action toAction;

	public GotoAction(Action toAction, ActionManager actionManager){
		this.toAction=toAction;
		this.actionManager=actionManager;
	}
	@Override
	public void Execute() throws IllegalAccessException {
		actionManager.setNextAction(toAction);
	}

	@Override
	public String toString(){
		return this.getClass().getSimpleName();
	}
}
