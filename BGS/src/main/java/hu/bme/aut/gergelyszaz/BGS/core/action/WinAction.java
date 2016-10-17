package hu.bme.aut.gergelyszaz.BGS.core.action;

import hu.bme.aut.gergelyszaz.BGS.core.Game;
import hu.bme.aut.gergelyszaz.BGS.core.VariableManager;
import hu.bme.aut.gergelyszaz.BGS.core.model.Player;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class WinAction extends AbstractAction {

	private final Game game;

	public WinAction(VariableManager variableManager, Game game) {

		super(variableManager, null);
		this.game = game;
	}

	@Override
	public void Execute() throws IllegalAccessException {

		Player player =
			 (Player) variableManager.GetReference(null, VariableManager
				  .CURRENTPLAYER);
		game.Win(player);
	}
}
