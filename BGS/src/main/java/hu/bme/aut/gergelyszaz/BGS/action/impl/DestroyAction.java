package hu.bme.aut.gergelyszaz.BGS.action.impl;

import hu.bme.aut.gergelyszaz.BGS.action.AbstractAction;
import hu.bme.aut.gergelyszaz.BGS.game.*;
import hu.bme.aut.gergelyszaz.BGS.game.internal.Token;
import hu.bme.aut.gergelyszaz.bGL.Action;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class DestroyAction extends AbstractAction {

	private final InternalManager internalManager;

	public DestroyAction(VariableManager variableManager,
								Action action,
								InternalManager game) {

		super(variableManager, action);
		this.internalManager = game;
	}

	@Override
	public void Execute() throws IllegalAccessException {

		Object object = variableManager.getReference(action.getSelected());
		if (!(object instanceof Token)) {
			throw new IllegalAccessException(object + " is not a TOKEN");
		}

		Token token = ((Token) object);
		token.Destroy();
		internalManager.removeToken(token);

	}
}
