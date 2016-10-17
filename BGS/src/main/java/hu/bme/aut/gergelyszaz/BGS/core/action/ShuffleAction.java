package hu.bme.aut.gergelyszaz.BGS.core.action;

import hu.bme.aut.gergelyszaz.BGS.core.VariableManager;
import hu.bme.aut.gergelyszaz.bGL.Action;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class ShuffleAction extends AbstractAction{
    public ShuffleAction(VariableManager variableManager, Action action) {
        super(variableManager,action);
    }

    @Override
    public void Execute() throws IllegalAccessException {
        ((hu.bme.aut.gergelyszaz.BGS.core.model.Deck) variableManager.getReference(action.getSelected())).Shuffle();

    }
}
