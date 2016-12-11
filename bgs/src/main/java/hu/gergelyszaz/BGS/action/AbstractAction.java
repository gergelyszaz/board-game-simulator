package hu.gergelyszaz.BGS.action;

import hu.gergelyszaz.BGS.game.VariableManager;

/**
 * Created by mad on 2016. 10. 12..
 */
public abstract class AbstractAction implements hu.gergelyszaz.BGS.action.Action {

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
