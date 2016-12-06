package hu.bme.aut.gergelyszaz.BGS.action.impl;

import hu.bme.aut.gergelyszaz.BGS.action.AbstractAction;
import hu.bme.aut.gergelyszaz.BGS.game.VariableManager;

import java.util.*;

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

        List<Integer> results=new ArrayList<>();
        for (int i = 0; i < action.getNumberOfDice(); i++) {
            int rollresult = r.nextInt(action.getTo()-action.getFrom()) + action
                  .getFrom();
            results.add(rollresult);
        }

        int result = 0;
        for (int i : results) {
            result += i;
        }

        List<String> variablePath = variableManager.getVariablePath(action.getToVar());
        variableManager.store(variablePath, result);

        //TODO store independent values

    }
}
