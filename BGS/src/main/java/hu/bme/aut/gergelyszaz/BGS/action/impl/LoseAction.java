package hu.bme.aut.gergelyszaz.BGS.action.impl;

import hu.bme.aut.gergelyszaz.BGS.action.AbstractAction;
import hu.bme.aut.gergelyszaz.BGS.game.*;
import hu.bme.aut.gergelyszaz.BGS.game.internal.Player;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class LoseAction extends AbstractAction {

	private final InternalManager internalManager;

	public LoseAction(VariableManager variableManager,
							InternalManager internalManager) {

		super(variableManager, null);
		this.internalManager = internalManager;
	}

	@Override
	public void Execute() throws IllegalAccessException {

		Player player = (Player) variableManager.getReference(null,
				VariableManager.GLOBAL.CURRENTPLAYER);
		internalManager.addLoser(player);
	}

}
