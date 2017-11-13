package hu.gergelyszaz.bgs.action.impl;

import hu.gergelyszaz.bgs.action.ActionManager;
import hu.gergelyszaz.bgs.game.VariableManager;
import hu.gergelyszaz.bGL.Action;

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

    @Override
    public String toString() {
        return "IF " + super.toString();
    }
}
