package hu.bme.aut.gergelyszaz.BGS.action.impl;

import hu.bme.aut.gergelyszaz.BGS.action.AbstractAction;
import hu.bme.aut.gergelyszaz.BGS.game.SelectableManager;
import hu.bme.aut.gergelyszaz.BGS.game.VariableManager;
import hu.bme.aut.gergelyszaz.bGL.Action;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class SelectAction extends AbstractAction {

    private final SelectableManager selectableManager;

    public SelectAction(VariableManager variableManager, Action action,
								SelectableManager selectableManager) {
        super(variableManager,action);
		 this.selectableManager = selectableManager;
    }

    @Override
    public void Execute() throws IllegalAccessException {
        Set<Object> selectables=new HashSet<>();

        for (Object o : selectableManager.getAllObjects()) {
			  variableManager.store(null, VariableManager.THIS, o);
			  if (variableManager.evaluate(action.getCondition())) {
				  selectables.add(o);
			  }
		  }

		 if(selectables.isEmpty()){
			 //TODO game.Lose
		 } else {
			 selectableManager.setSelectableObjects(selectables);
			 //TODO game.wait
			 //TODO game.save
			 //TODO game.refreshViews
		 }
    }
}
