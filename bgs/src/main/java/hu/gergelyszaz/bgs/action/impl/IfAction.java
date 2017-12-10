package hu.gergelyszaz.bgs.action.impl;

import hu.gergelyszaz.bGL.Action;
import hu.gergelyszaz.bgs.action.ActionManager;
import hu.gergelyszaz.bgs.game.VariableManager;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class IfAction extends ConditionalAction {

    public IfAction(VariableManager variableManager, Action action,
                    ActionManager actionManager) {

        super(variableManager, action, actionManager);

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
