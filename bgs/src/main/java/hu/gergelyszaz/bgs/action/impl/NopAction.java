package hu.gergelyszaz.bgs.action.impl;

import hu.gergelyszaz.bgs.action.Action;

/**
 * Created by mad on 2016. 10. 24..
 */
public class NopAction implements Action {

	@Override
	public void Execute() throws IllegalAccessException {
		//Intentionally left empty
	}

	@Override
	public String toString(){
		return this.getClass().getSimpleName();
	}
}
