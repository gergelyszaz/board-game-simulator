package hu.gergelyszaz.bgs.action.impl;

import hu.gergelyszaz.bgs.action.*;
import hu.gergelyszaz.bgs.game.*;
import hu.gergelyszaz.bgs.game.internal.Player;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class EndTurnAction extends AbstractAction {

	private final ActionManager actionManager;
	private final InternalManager internalManager;

	public EndTurnAction(VariableManager variableManager,
								ActionManager actionManager,
								InternalManager internalManager) {

		super(variableManager, null);
		this.actionManager = actionManager;
		this.internalManager = internalManager;
	}

	@Override
	public void Execute() throws IllegalAccessException {

		actionManager.reset();
		Player player = (Player) variableManager.getReference(null,
				VariableManager.GLOBAL.CURRENTPLAYER);
		Player nextPlayer = internalManager.getNextPlayer(player);
		internalManager.setCurrentPlayer(nextPlayer,variableManager);
		actionManager.reset();
	}


}
