package hu.bme.aut.gergelyszaz.BGS.action.impl;

import hu.bme.aut.gergelyszaz.BGS.action.AbstractAction;
import hu.bme.aut.gergelyszaz.BGS.game.VariableManager;
import hu.bme.aut.gergelyszaz.bGL.Action;
import hu.bme.aut.gergelyszaz.bGL.ValueAssignment;

import java.util.List;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class AssignmentAction extends AbstractAction {
    public AssignmentAction(VariableManager variableManager, Action action) {
        super(variableManager, action);
    }

    @Override
    public void Execute() throws IllegalAccessException {
        ValueAssignment assignment = action.getAssignment();
        Object reference = variableManager.getReference(assignment
                .getAddition());

        List<String> variablePath = variableManager.getVariablePath
                (assignment.getName());
        variableManager.store(variablePath, reference);
    }

    @Override
    public String toString() {

        return super.toString();
    }
}
