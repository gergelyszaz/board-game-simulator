package hu.bme.aut.gergelyszaz.BGS.core.action;

import hu.bme.aut.gergelyszaz.BGS.core.VariableManager;
import hu.bme.aut.gergelyszaz.bGL.*;
import hu.bme.aut.gergelyszaz.bGL.Action;

import java.util.List;
import java.util.Random;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class RollAction extends AbstractAction {

    public RollAction(VariableManager variableManager, hu.bme.aut.gergelyszaz.bGL.Action action) {
        super(variableManager,action);
    }

    @Override
    public void Execute() throws IllegalAccessException {
        Random r = new Random();
        int result = 0;
        for (int i = 1; i < action.getNumberOfDice() + 1; i++) {
            int rollresult = r.nextInt(action.getTo()) + action.getFrom();
            result += rollresult;
        }
        List<String> variablePath = variableManager.getVariablePath(action.getToVar());
        variableManager.Store(variablePath, result);
    }
}
