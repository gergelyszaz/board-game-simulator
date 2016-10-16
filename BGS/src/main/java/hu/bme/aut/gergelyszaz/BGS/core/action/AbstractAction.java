package hu.bme.aut.gergelyszaz.BGS.core.action;

import hu.bme.aut.gergelyszaz.BGS.core.VariableManager;

/**
 * Created by mad on 2016. 10. 12..
 */
public abstract class AbstractAction implements hu.bme.aut.gergelyszaz.BGS.core.action.Action {

	protected final VariableManager variableManager;
	protected hu.bme.aut.gergelyszaz.bGL.Action action;

    public AbstractAction(VariableManager variableManager, hu.bme.aut.gergelyszaz.bGL.Action action){
		this.variableManager=variableManager;
		this.action=action;
	}
}
