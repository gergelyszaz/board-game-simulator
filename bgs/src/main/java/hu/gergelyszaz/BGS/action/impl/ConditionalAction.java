package hu.gergelyszaz.BGS.action.impl;

import hu.gergelyszaz.BGS.action.AbstractAction;
import hu.gergelyszaz.BGS.action.ActionManager;
import hu.gergelyszaz.BGS.game.VariableManager;
import hu.gergelyszaz.bGL.Action;

/**
 * Created by mad on 2016. 10. 24..
 */
public abstract class ConditionalAction extends AbstractAction {
    protected hu.gergelyszaz.BGS.action.Action skipAction;
    protected ActionManager actionManager;

    public ConditionalAction(VariableManager variableManager,
                             Action action, ActionManager actionManager) {

        super(variableManager, action);
        this.actionManager = actionManager;

    }

    public void setSkipAction(hu.gergelyszaz.BGS.action.Action action) {
        this.skipAction = action;
    }

    @Override
    public void Execute() throws IllegalAccessException {
        if (!variableManager.evaluate(action.getCondition())) {
            actionManager.setNextAction(skipAction);
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }


}
