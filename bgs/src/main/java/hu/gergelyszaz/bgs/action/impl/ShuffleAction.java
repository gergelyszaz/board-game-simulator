package hu.gergelyszaz.bgs.action.impl;

import hu.gergelyszaz.bgs.action.AbstractAction;
import hu.gergelyszaz.bgs.game.VariableManager;
import hu.gergelyszaz.bgs.game.internal.Deck;
import hu.gergelyszaz.bGL.Action;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class ShuffleAction extends AbstractAction {

	public ShuffleAction(VariableManager variableManager, Action action) {

		super(variableManager, action);
	}

	@Override
	public void Execute() throws IllegalAccessException {

		Object object = variableManager.getReference(action.getSelected());
		if (!(object instanceof Deck)) {
			throw new IllegalAccessException(object + " is not a DECK");
		}
		((Deck) object).Shuffle();

	}
}
