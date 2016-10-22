package hu.bme.aut.gergelyszaz.BGS.action.impl;

import hu.bme.aut.gergelyszaz.BGS.action.AbstractAction;
import hu.bme.aut.gergelyszaz.BGS.game.InternalManager;
import hu.bme.aut.gergelyszaz.BGS.game.VariableManager;
import hu.bme.aut.gergelyszaz.BGS.game.internal.Player;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class WinAction extends AbstractAction {


	private final InternalManager internalManager;

	public WinAction(VariableManager variableManager, InternalManager game) {

		super(variableManager, null);
		this.internalManager=game;
	}

	@Override
	public void Execute() throws IllegalAccessException {

		Player player =
			 (Player) variableManager.getReference(null, VariableManager
				  .CURRENTPLAYER);
		//TODO
	}
}
