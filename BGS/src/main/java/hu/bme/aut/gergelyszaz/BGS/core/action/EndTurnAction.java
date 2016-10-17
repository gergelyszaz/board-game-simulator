package hu.bme.aut.gergelyszaz.BGS.core.action;

import hu.bme.aut.gergelyszaz.BGS.core.Game;
import hu.bme.aut.gergelyszaz.BGS.core.VariableManager;
import hu.bme.aut.gergelyszaz.BGS.core.model.Player;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class EndTurnAction extends AbstractAction{
    private final ActionManager actionManager;
    private final Game game;

    public EndTurnAction(VariableManager variableManager, ActionManager actionManager, Game game) {
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
