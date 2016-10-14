package hu.bme.aut.gergelyszaz.BGS.core.action;

import hu.bme.aut.gergelyszaz.BGS.core.VariableManager;

/**
 * Created by mad on 2016. 10. 12..
 */
public abstract class AbstractAction implements Action{

	protected final VariableManager variableManager;

	public AbstractAction(VariableManager variableManager){
		this.variableManager=variableManager;
	}
}
