package hu.bme.aut.gergelyszaz.BGS.core.action;

import hu.bme.aut.gergelyszaz.BGS.core.Game;
import hu.bme.aut.gergelyszaz.BGS.core.VariableManager;
import hu.bme.aut.gergelyszaz.BGS.core.model.*;
import hu.bme.aut.gergelyszaz.bGL.*;
import hu.bme.aut.gergelyszaz.bGL.Action;
import hu.bme.aut.gergelyszaz.bGL.Token;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class DestroyAction extends AbstractAction{
    private final Game game;

    public DestroyAction(VariableManager variableManager, Action action, Game game) {
        super(variableManager,action);
        this.game=game;
    }

    @Override
    public void Execute() throws IllegalAccessException {

        hu.bme.aut.gergelyszaz.BGS.core.model.Token t;
        (t = (hu.bme.aut.gergelyszaz.BGS.core.model.Token) variableManager.GetReference(action.getSelected()))
                .Destroy();
        game.DestroyToken(t);

    }
}
