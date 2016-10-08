package hu.bme.aut.gergelyszaz.BGS.core;

import hu.bme.aut.gergelyszaz.bGL.*;

import java.util.*;

/**
 * The order of parameters:
 * parent, name, objectToStore
 */
public class VariableManager {
	public static String THIS = "this";
	public static String CURRENTPLAYER = "currentPlayer";
	public static String OWNER = "owner";
	public static String NULL = "null";
	public static String FIELD = "field";
	public static String TOP = "top";
	public static String CARDCOUNT = "cardCount";
	public static String DISTANCE_FROM_SELECTED_TOKEN = "distanceFromSelectedToken";

	private Map<Object, Map<String, Object>> references = new HashMap<>();

	public boolean Evaluate(OrExp exp) throws IllegalAccessException {
		boolean result = false;
		for (AndExp e : exp.getExpressions()) {
			result = (result || Evaluate(e));
		}
		return result;
	}

	public Object GetReference(AttributeName variable)
					throws IllegalAccessException {
		List<String> variablePath = getVariablePath(variable);
		return getReference(variablePath);
	}

	public Object GetReference(Object parent, String variableName)
					throws IllegalAccessException {
		Object variable = getVariables(parent).get(variableName);
		if (variable == null)
			throw new IllegalAccessException(parent + " has no " + variableName);
		return variable;
	}

	public int GetValue(Object parent, String variableName)
					throws IllegalAccessException {
		Object variable = GetReference(parent, variableName);
		if (!(variable instanceof Integer))
			throw new IllegalAccessException(
							variableName + " of " + parent + " is not a number");
		return (int) (Integer) variable;
	}

	public int GetValue(AdditionExp additionExp)
					throws IllegalAccessException {
		int i = 0;
		int value = GetValue(additionExp.getExpressions().get(i));
		for (String operator :
						additionExp.getOperators()) {
			MultiplicationExp multiplicationExp = additionExp.getExpressions().get(i);
			if (Objects.equals(operator, "+"))
				value += GetValue(multiplicationExp);
			else
				value -= GetValue(multiplicationExp);
		}
		return value;
	}

	public int GetValue(MultiplicationExp multiplicationExp)
					throws IllegalAccessException {
		if (multiplicationExp.getNestedExp() != null) {
			return GetValue(multiplicationExp.getNestedExp());
		}
		int i = 0;
		int value = GetValue(multiplicationExp.getExpressions().get(i));
		for (String operator :
						multiplicationExp.getOperators()) {
			AttributeOrInt attributeOrInt = multiplicationExp.getExpressions().get(i);
			if (Objects.equals(operator, "*"))
				value *= GetValue(attributeOrInt);
			else
				value /= GetValue(attributeOrInt);
		}
		return value;
	}

	public void Remove(Object object) {
		references.remove(object);
	}

	public void Store(List<String> variablePath, Object objectToStore)
					throws IllegalAccessException {
		if (variablePath.size() == 0)
			throw new IllegalAccessException(
							objectToStore + "cannot be stored with empty path ");
		String variableName = variablePath.get(variablePath.size() - 1);
		Object parent = null;
		if (variablePath.size() > 1) {
			List<String> parentPath =
							variablePath.subList(0, variablePath.size() - 1);
			parent = getReference(parentPath);
		}
		Store(parent, variableName, objectToStore);
	}

	public void Store(Object parent, SimpleAssignment simpleAssignment) {
		Store(parent, simpleAssignment.getName(), simpleAssignment.getAttribute());
	}

	public void Store(Object parent, String name, Object objectToStore) {
		Map<String, Object> variables = references.get(parent);
		if (variables == null) {
			variables = new HashMap<>();
			references.put(parent, variables);
		}
		variables.put(name, objectToStore);
	}

	public void Store(AttributeName variable, Object objectToStore)
					throws IllegalAccessException {
		List<String> variablePath = getVariablePath(variable);
		Store(variablePath, objectToStore);
	}

	public void Store(ValueAssignment assignment)
					throws IllegalAccessException {
		List<MultiplicationExp> expressions =
						assignment.getAddition().getExpressions();
		assignment.getName();

		if (expressions.size() == 1 &&
						expressions.get(0).getNestedExp() == null) {
			AttributeOrInt attributeOrInt = expressions.get(0).getExpressions().get(0);
			Store(getVariablePath(assignment.getName()), GetReference(attributeOrInt));
		}

		int value = GetValue(assignment.getAddition());
		Store(assignment.getName(), value);

	}

	public Map<String, Object> getVariables(Object parent)
					throws IllegalAccessException {
		Map<String, Object> variables = references.get(parent);
		if (variables == null)
			throw new IllegalAccessException(parent + " has no variables");
		return variables;
	}

	private boolean Evaluate(AndExp exp) throws IllegalAccessException {
		boolean result = true;
		for (BooleanExp e : exp.getExpressions()) {
			result = (result && Evaluate(e));
		}
		return result;
	}

	private boolean Evaluate(BooleanExp exp) throws IllegalAccessException {
		boolean not = (exp.getNot() != null);
		if (exp.getNestedExp() != null)
			return not != Evaluate(exp.getNestedExp());

		Object left = GetReference(exp.getLeft());
		Object right = GetReference(exp.getRight());

		int rightValue = 0, leftValue = 0;
		//It is a number comparation
		if (exp.getName().length() == 2) {
			if (!(left instanceof Integer))
				throw new IllegalAccessException(left + " is not a number");
			if (!(right instanceof Integer))
				throw new IllegalAccessException(right + " is not a number");
			leftValue = (Integer) left;
			rightValue = (Integer) right;
		}

		boolean result = false;
		switch (exp.getName()) {
			case "===":
			case "==":
				result = Objects.equals(left, right);
				break;
			case "!==":
			case "!=":
				result = !Objects.equals(left, right);
				break;
			case "<=":
				result = leftValue <= rightValue;
				break;
			case ">=":
				result = leftValue >= rightValue;
				break;
			case ">":
				result = leftValue > rightValue;
				break;
			case "<":
				result = leftValue < rightValue;
				break;
			default:
				result = false;
				break;
		}
		return not != result;

	}

	private int GetValue(AttributeOrInt attributeOrInt)
					throws IllegalAccessException {
		if (attributeOrInt.getAttribute() == null)
			return attributeOrInt.getValue();

		Object reference = GetReference(attributeOrInt);
		if (!(reference instanceof Integer))
			throw new IllegalAccessException(
							attributeOrInt + " cannot be resolved");
		return (Integer) reference;
	}

	private List<String> getVariablePath(AttributeName attribute) {
		List<String> variablePath = new ArrayList<>();
		AttributeName child = attribute;
		while (child != null) {
			variablePath.add(child.getName());
			child = child.getChild();
		}
		return variablePath;
	}

	private Object GetReference(AttributeOrInt variable)
					throws IllegalAccessException {
		if (variable.getAttribute() == null) {
			return variable.getValue();
		}
		return GetReference(variable.getAttribute());
	}

	private Object getReference(List<String> variablePath)
					throws IllegalAccessException {
		Object parent = null;
		for (String variable :
						variablePath) {
			parent = GetReference(parent, variable);
		}
		return parent;
	}
}