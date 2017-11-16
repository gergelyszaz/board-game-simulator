package hu.gergelyszaz.bgs.action.impl;

import hu.gergelyszaz.bgs.action.AbstractAction;
import hu.gergelyszaz.bgs.game.*;
import hu.gergelyszaz.bgs.game.internal.Card;
import hu.gergelyszaz.bgs.game.internal.Deck;
import hu.gergelyszaz.bgs.game.internal.Token;
import hu.gergelyszaz.bGL.*;

import java.util.Objects;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class MoveAction extends AbstractAction {

    BGLUtil bglUtil = new BGLUtil();

    public MoveAction(VariableManager variableManager, hu.gergelyszaz.bGL.Action action) {
        super(variableManager,action);
    }

    @Override
    public void Execute() throws IllegalAccessException {
        if (Objects.equals(action.getType(), "CARD")) {
            ((Card) variableManager.getReference(bglUtil.toString(action.getSelected())))
                    .MoveTo((Deck) variableManager.getReference(bglUtil.toString(action
                          .getMoveTo())));
        }
        else {
            ((Token) variableManager.getReference(bglUtil.toString(action.getSelected())))
                  .setField((Field) variableManager.getReference(bglUtil.toString(
                        action.getMoveTo())));
        }
    }
}
