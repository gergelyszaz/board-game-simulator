package hu.bme.aut.gergelyszaz.BGS.action.impl;

import hu.bme.aut.gergelyszaz.BGS.action.AbstractAction;
import hu.bme.aut.gergelyszaz.BGS.game.VariableManager;
import hu.bme.aut.gergelyszaz.BGS.game.internal.Card;
import hu.bme.aut.gergelyszaz.BGS.game.internal.Deck;
import hu.bme.aut.gergelyszaz.BGS.game.internal.Token;
import hu.bme.aut.gergelyszaz.bGL.*;

import java.util.Objects;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class MoveAction extends AbstractAction {

    public MoveAction(VariableManager variableManager, hu.bme.aut.gergelyszaz.bGL.Action action) {
        super(variableManager,action);
    }

    @Override
    public void Execute() throws IllegalAccessException {
        if (Objects.equals(action.getType(), "CARD")) {
            ((Card) variableManager.getReference(action.getSelected()))
                    .MoveTo((Deck) variableManager.getReference(action.getMoveTo()));
        }
        else {
            ((Token) variableManager.getReference(action.getSelected())).setField(
                    (Field) variableManager.getReference(action.getMoveTo()));
        }
    }
}
