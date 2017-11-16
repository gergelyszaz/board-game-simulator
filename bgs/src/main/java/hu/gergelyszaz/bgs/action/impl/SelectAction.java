package hu.gergelyszaz.bgs.action.impl;

import hu.gergelyszaz.bgs.action.AbstractAction;
import hu.gergelyszaz.bgs.game.*;
import hu.gergelyszaz.bGL.Action;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class SelectAction extends AbstractAction {

	private final SelectableManager selectableManager;
	private String toVar;
	private ArithmeticManager arithmeticManager;

	public SelectAction(VariableManager variableManager,
							  Action action,
							  SelectableManager selectableManager) {

		super(variableManager, action);
		this.selectableManager = selectableManager;
		this.toVar = action.getToVar().getName();

		this.arithmeticManager = new ArithmeticManager(variableManager);
	}

	@Override
	public void Execute() throws IllegalAccessException {
		selectableManager.setSelectableObjects(o -> {
			variableManager.store(VariableManager.GLOBAL.THIS, o);
			return arithmeticManager.evaluate(action.getCondition());
		}, this.toVar);
	}

	@Override
	public String toString() {

		return super.toString() + " " +
				selectableManager.getSelectableObjects().size();
	}
}
