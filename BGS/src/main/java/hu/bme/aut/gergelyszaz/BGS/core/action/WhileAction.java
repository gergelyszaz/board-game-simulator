package hu.bme.aut.gergelyszaz.BGS.core.action;

import hu.bme.aut.gergelyszaz.BGS.core.VariableManager;
import hu.bme.aut.gergelyszaz.bGL.Action;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class WhileAction extends AbstractAction{

    private final ActionManager actionManager;

    public WhileAction(VariableManager variableManager, Action action, ActionManager actionManager) {
            super(variableManager,action);
            this.actionManager=actionManager;
        }

        @Override
        public void Execute() throws IllegalAccessException {
            if (variableManager.evaluate(action.getCondition())) {
                actionManager.stepIntoNested();
            }
        }

}
