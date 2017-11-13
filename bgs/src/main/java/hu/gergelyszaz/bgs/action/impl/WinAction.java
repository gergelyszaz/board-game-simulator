package hu.gergelyszaz.bgs.action.impl;

import hu.gergelyszaz.bgs.action.AbstractAction;
import hu.gergelyszaz.bgs.game.*;
import hu.gergelyszaz.bgs.game.internal.Player;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class WinAction extends AbstractAction {

	private final InternalManager internalManager;

	public WinAction(VariableManager variableManager,
						  InternalManager internalManager) {

		super(variableManager, null);
		this.internalManager=internalManager;
	}

	@Override
	public void Execute() throws IllegalAccessException {

		Player player =
			 (Player) variableManager.getReference(null, VariableManager
				  .GLOBAL.CURRENTPLAYER);
		internalManager.addWinner(player);
	}

}
