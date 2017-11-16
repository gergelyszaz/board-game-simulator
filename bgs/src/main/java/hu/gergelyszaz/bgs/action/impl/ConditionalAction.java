package hu.gergelyszaz.bgs.action.impl;

import hu.gergelyszaz.bgs.action.AbstractAction;
import hu.gergelyszaz.bgs.action.ActionManager;
import hu.gergelyszaz.bgs.game.*;
import hu.gergelyszaz.bGL.Action;

/**
 * Created by mad on 2016. 10. 24..
 */
public abstract class ConditionalAction extends AbstractAction {
    protected hu.gergelyszaz.bgs.action.Action skipAction;
    protected ActionManager actionManager;
    private ArithmeticManager arithmeticManager ;

    public ConditionalAction(VariableManager variableManager,
                             Action action, ActionManager actionManager) {

        super(variableManager, action);
        this.actionManager = actionManager;
        this.arithmeticManager = new ArithmeticManager(variableManager);
    }

    public void setSkipAction(hu.gergelyszaz.bgs.action.Action action) {
        this.skipAction = action;
    }

    @Override
    public void Execute() throws IllegalAccessException {
        if (!arithmeticManager.evaluate(action.getCondition())) {
            actionManager.setNextAction(skipAction);
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }


}
