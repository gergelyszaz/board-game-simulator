package hu.bme.aut.gergelyszaz.BGS.action.impl;

import hu.bme.aut.gergelyszaz.BGS.action.AbstractAction;
import hu.bme.aut.gergelyszaz.BGS.game.InternalManager;
import hu.bme.aut.gergelyszaz.BGS.game.VariableManager;
import hu.bme.aut.gergelyszaz.bGL.Action;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class DestroyAction extends AbstractAction {

    private final InternalManager internalManager;

    public DestroyAction(VariableManager variableManager, Action action, InternalManager game) {
        super(variableManager,action);
        this.internalManager=game;
    }

    @Override
    public void Execute() throws IllegalAccessException {

        hu.bme.aut.gergelyszaz.BGS.game.internal.Token t;
        (t = (hu.bme.aut.gergelyszaz.BGS.game.internal.Token) variableManager.getReference(action.getSelected()))
                .Destroy();
        internalManager.removeToken(t);

    }
}
