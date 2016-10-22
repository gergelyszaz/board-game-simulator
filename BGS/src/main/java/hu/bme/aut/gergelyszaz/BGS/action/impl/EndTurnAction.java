package hu.bme.aut.gergelyszaz.BGS.action.impl;

import hu.bme.aut.gergelyszaz.BGS.action.AbstractAction;
import hu.bme.aut.gergelyszaz.BGS.action.ActionManager;
import hu.bme.aut.gergelyszaz.BGS.game.GameImpl;
import hu.bme.aut.gergelyszaz.BGS.game.VariableManager;
import hu.bme.aut.gergelyszaz.BGS.game.internal.Player;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class EndTurnAction extends AbstractAction {
    private final ActionManager actionManager;
    private final GameImpl game;

    public EndTurnAction(VariableManager variableManager, ActionManager actionManager, GameImpl game) {
        super(variableManager,null);
        this.actionManager=actionManager;
        this.game=game;
    }



    @Override
    public void Execute() throws IllegalAccessException {
       actionManager.reset();
		 Player player= (Player) variableManager.getReference(null,VariableManager
			  .CURRENTPLAYER);
		 variableManager.store(null,VariableManager.CURRENTPLAYER,game
			  .getNextPlayer(player));
    }
}
