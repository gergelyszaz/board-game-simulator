package hu.gergelyszaz.bgs.action.impl;

import hu.gergelyszaz.bgs.action.AbstractAction;
import hu.gergelyszaz.bgs.game.VariableManager;
import hu.gergelyszaz.bGL.*;

import java.util.*;

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
        Object reference = getReference(assignment.getExpression());

        List<String> variablePath = variableManager.getVariablePath
                (assignment.getName());
        variableManager.store(variablePath, reference);
    }

    @Override
    public String toString() {

        return super.toString();
    }

    public Object getReference(ArithmeticExp arithmeticExp)
    {
        //just a simple reference
        List<Expression> expressions =
              arithmeticExp.getExpressions();
        if (expressions.size() == 1 && expressions.get(0).getAttributeOrInt()
              !=null){
            AttributeOrInt attributeOrInt = expressions.get(0).getAttributeOrInt();
            return variableManager.getReference(attributeOrInt);
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

    public int getReference(Expression expression)
    {
        Object reference = null;
        if(expression.getAttributeOrInt()!=null) {
            reference= variableManager.getReference(expression
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
