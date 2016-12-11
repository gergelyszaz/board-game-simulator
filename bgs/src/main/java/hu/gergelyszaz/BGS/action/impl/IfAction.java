package hu.gergelyszaz.BGS.action.impl;

import hu.gergelyszaz.BGS.action.ActionManager;
import hu.gergelyszaz.BGS.game.VariableManager;
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
