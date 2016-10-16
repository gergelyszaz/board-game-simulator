package hu.bme.aut.gergelyszaz.BGS.core.action;

import hu.bme.aut.gergelyszaz.BGS.core.VariableManager;
import hu.bme.aut.gergelyszaz.bGL.*;
import hu.bme.aut.gergelyszaz.bGL.Action;

import java.util.List;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class AssignmentAction extends AbstractAction{
    public AssignmentAction(VariableManager variableManager, Action action) {
        super(variableManager,action);
    }

    @Override
    public void Execute() throws IllegalAccessException {
        ValueAssignment assignment=action.getAssignment();
        Object reference = variableManager.GetReference(assignment
                .getAddition());

        List<String> variablePath = variableManager.getVariablePath
                (assignment.getName());
        variableManager.Store(variablePath, reference);
    }
}
