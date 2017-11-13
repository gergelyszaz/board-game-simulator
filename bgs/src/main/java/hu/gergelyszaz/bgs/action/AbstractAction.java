package hu.gergelyszaz.bgs.action;

import hu.gergelyszaz.bgs.game.VariableManager;

/**
 * Created by mad on 2016. 10. 12..
 */
public abstract class AbstractAction implements hu.gergelyszaz.bgs.action.Action {

    protected final VariableManager variableManager;
    protected hu.gergelyszaz.bGL.Action action;
    protected String name;

    public AbstractAction(VariableManager variableManager, hu.gergelyszaz.bGL.Action action) {
        this.variableManager = variableManager;
        this.action = action;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
