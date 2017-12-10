package hu.gergelyszaz.bgs.action.impl;

import hu.gergelyszaz.bGL.*;
import hu.gergelyszaz.bgs.action.AbstractAction;
import hu.gergelyszaz.bgs.game.*;

import java.util.List;

/**
 * Created by Gergely Száz
 */
public class AssignmentAction extends AbstractAction {
    private BGLUtil bglUtil = new BGLUtil();
    private ArithmeticManager arithmeticManager;

    public AssignmentAction(VariableManager variableManager, Action action) {
        super(variableManager, action);
        arithmeticManager = new ArithmeticManager(variableManager);
    }

    @Override
    public void Execute() throws IllegalAccessException {
        ValueAssignment assignment = action.getAssignment();
        Object reference = getReference(assignment.getExpression());

        String variablePath = bglUtil.toString(
                assignment.getName());

        variableManager.store(variablePath, reference);
    }

    @Override
    public String toString() {

        return super.toString();
    }

    private Object getReference(ArithmeticExp arithmeticExp)
    {
        ArithmeticManager arithmeticManager = new ArithmeticManager(variableManager);

        //just a simple reference
        List<Expression> expressions =
              arithmeticExp.getExpressions();
        if (expressions.size() == 1 &&
              expressions.get(0).getAttributeOrInt() != null) {
            AttributeOrInt attributeOrInt =
                  expressions.get(0).getAttributeOrInt();
            return arithmeticManager.resolveReference(attributeOrInt);
        }

        //an expression
        int i = 0;
        int value = getReference(arithmeticExp.getExpressions().get(i));
        for (String operator :
              arithmeticExp.getOperators()) {
            i++;

            int expressionValue=getReference(expressions.get(i));
            switch (operator){
                case "+":
                    value += expressionValue;
                    break;
                case "-":         value -= expressionValue; break;
                case "%":         value %= expressionValue;break;
                case "*":         value *= expressionValue;break;
                case "/":         value /= expressionValue;break;
            }
        }
        return value;
    }

    private int getReference(Expression expression)
    {
        Object reference = null;
        if(expression.getAttributeOrInt()!=null) {
            reference= arithmeticManager.resolveReference(expression
                  .getAttributeOrInt());
        }
        if(expression.getArithmeticExp()!=null) {
            reference= getReference(expression
                  .getArithmeticExp());
        }

        if(!(reference instanceof Integer)){
            throw new IllegalAccessError("Could not get value of"+reference);
        }
        return (Integer) reference;
    }
}
