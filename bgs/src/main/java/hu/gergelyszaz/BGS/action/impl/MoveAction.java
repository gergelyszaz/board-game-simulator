package hu.gergelyszaz.BGS.action.impl;

import hu.gergelyszaz.BGS.action.AbstractAction;
import hu.gergelyszaz.BGS.game.VariableManager;
import hu.gergelyszaz.BGS.game.internal.Card;
import hu.gergelyszaz.BGS.game.internal.Deck;
import hu.gergelyszaz.BGS.game.internal.Token;
import hu.gergelyszaz.bGL.*;

import java.util.Objects;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class MoveAction extends AbstractAction {

    public MoveAction(VariableManager variableManager, hu.gergelyszaz.bGL.Action action) {
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
