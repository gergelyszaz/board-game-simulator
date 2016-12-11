package hu.gergelyszaz.BGS.action.impl;

import hu.gergelyszaz.BGS.action.AbstractAction;
import hu.gergelyszaz.BGS.game.SelectableManager;
import hu.gergelyszaz.BGS.game.VariableManager;
import hu.gergelyszaz.bGL.Action;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class SelectAction extends AbstractAction {

    private final SelectableManager selectableManager;
	private String toVar;

	public SelectAction(VariableManager variableManager, Action action,
								SelectableManager selectableManager) {
        super(variableManager,action);
		 this.selectableManager = selectableManager;
		this.toVar=action.getToVar().getName();
    }

    @Override
    public void Execute() throws IllegalAccessException {
		selectableManager.setSelectableObjects(o -> {
			variableManager.store(null, VariableManager.GLOBAL.THIS, o);
			return variableManager.evaluate(action.getCondition());
		},this.toVar);
    }

    @Override
	public String toString(){
		 return super.toString()+ " "+ selectableManager.getSelectableObjects()
				 .size();
	 }
}
