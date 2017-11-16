package hu.gergelyszaz.bgs.action.impl;

import hu.gergelyszaz.bgs.action.AbstractAction;
import hu.gergelyszaz.bgs.game.*;

import java.util.*;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class RollAction extends AbstractAction {
    private BGLUtil bglUtil = new BGLUtil();
    public RollAction(VariableManager variableManager, hu.gergelyszaz.bGL.Action action) {
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

        String variablePath = bglUtil.toString(action.getToVar());
        variableManager.store(variablePath, result);

        //TODO store independent values

    }
}
