package hu.bme.aut.gergelyszaz.BGS.action.impl;

import hu.bme.aut.gergelyszaz.BGS.action.AbstractAction;
import hu.bme.aut.gergelyszaz.BGS.action.ActionManager;
import hu.bme.aut.gergelyszaz.BGS.game.VariableManager;
import hu.bme.aut.gergelyszaz.bGL.Action;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class IfAction extends AbstractAction {
    private final ActionManager actionManager;

    public IfAction(VariableManager variableManager, Action action, ActionManager actionManager) {
        super(variableManager,action);
        this.actionManager=actionManager;
    }

    @Override
    public void Execute() throws IllegalAccessException {
        if (variableManager.evaluate(action.getCondition())) {
            actionManager.stepIntoNested();
        }
    }
}
