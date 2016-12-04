package hu.bme.aut.gergelyszaz.BGS.game;

import hu.bme.aut.gergelyszaz.bGL.*;

import java.util.*;

/**
 * The order of parameters:
 * parent, name, objectToStore
 */
public class VariableManager {
	public static class GLOBAL{
		public static final String THIS = "this";
		public static final String CURRENTPLAYER = "currentPlayer";
		public static final String NULL = "null";
		public static final String DISTANCE_FROM_SELECTED_TOKEN = "distanceFromSelectedToken";
	}

	public static class PLAYER{

	}

	public static class FIELD{

	}

	public static class DECK{

		public static final String OWNER = "owner" ;
		public static final String TOP = "top";
		public static final String CARDCOUNT = "cardCount";
	}

	public static class CARD{
		public static final String DECK = "deck";
	}

	public static class TOKEN{
		public static final String OWNER = "owner";
		public static final String FIELD = "field";
	}

	private Map<Object, Map<String, Object>> references = new HashMap<>();

	public boolean evaluate(OrExp exp){
		boolean result = false;
		for (AndExp e : exp.getExpressions()) {
			result = (result || evaluate(e));
		}
		return result;
	}

	public String getVariables(){
		StringBuilder stringBuilder=new StringBuilder();

		references.forEach(
			 (o, stringObjectMap) ->
			 {
				 stringBuilder.append(o).append("\n");
				 stringObjectMap.forEach((s, o1) ->
				 {
					 stringBuilder.append("	").append(s).append(": ").append(o1)
						  .append("\n");
				 });
			 }
		);

		return stringBuilder.toString();
	}

	public Object getReference(AttributeName variable)
					{
		List<String> variablePath = getVariablePath(variable);
		return getReference(variablePath);
	}

	public Object getReference(Object parent, String variableName) {
		if (!getVariables(parent).containsKey(variableName)) {
			throw new IllegalAccessError(parent + " has no " + variableName);
		}

		Object variable = getVariables(parent).get(variableName);
		return variable;
	}

	public int getValue(Object parent, String variableName)
					{
		Object variable = getReference(parent, variableName);
		if (!(variable instanceof Integer))
			throw new IllegalAccessError(
							variableName + " of " + parent + " is not a number");
		return (int) (Integer) variable;
	}

	public int calculate(AdditionExp additionExp)
					{
		Object reference= getReference(additionExp);
		if(!(reference instanceof Integer))
			throw new IllegalAccessError("Could not get value of"+additionExp);
		return (Integer) reference;
	}

	public int calculate(MultiplicationExp multiplicationExp)
					{
		if (multiplicationExp.getNestedExp() != null) {
			return calculate(multiplicationExp.getNestedExp());
		}
		int i = 0;
		int value = calculate(multiplicationExp.getExpressions().get(i));
		for (String operator :
						multiplicationExp.getOperators()) {
			i++;
			AttributeOrInt attributeOrInt = multiplicationExp.getExpressions().get(i);
			if (Objects.equals(operator, "*"))
				value *= calculate(attributeOrInt);
			else
				value /= calculate(attributeOrInt);
		}
		return value;
	}

	public void remove(Object object) {
		references.remove(object);
	}

	public void store(List<String> variablePath, Object objectToStore)
					{
		if (variablePath.size() == 0)
			throw new IllegalAccessError(
							objectToStore + "cannot be stored with empty path ");
		String variableName = variablePath.get(variablePath.size() - 1);
		Object parent = null;
		if (variablePath.size() > 1) {
			List<String> parentPath =
							variablePath.subList(0, variablePath.size() - 1);
			parent = getReference(parentPath);
		}
		store(parent, variableName, objectToStore);
	}

	public void store(Object parent, String name, Object objectToStore) {
		Map<String, Object> variables = references.get(parent);
		if (variables == null) {
			variables = new HashMap<>();
			references.put(parent, variables);
		}
		variables.put(name, objectToStore);
	}

	public Object getReference(AdditionExp additionExp)
		 {

		//just a simple reference
		List<MultiplicationExp> expressions =
			 additionExp.getExpressions();
		if (expressions.size() == 1 &&
			 expressions.get(0).getNestedExp() == null) {
			AttributeOrInt attributeOrInt = expressions.get(0).getExpressions().get(0);
			return getReference(attributeOrInt);
		}

		//an expression
		int i = 0;
		int value = calculate(additionExp.getExpressions().get(i));
		for (String operator :
			 additionExp.getOperators()) {
			i++;
			MultiplicationExp multiplicationExp = additionExp.getExpressions().get(i);
			if (Objects.equals(operator, "+"))
				value += calculate(multiplicationExp);
			else
				value -= calculate(multiplicationExp);
		}
		return value;
	}

	public Map<String, Object> getVariables(Object parent)
					 {
		Map<String, Object> variables = references.get(parent);
		if (variables == null)
			throw new IllegalAccessError(parent + " has no variables");
		return variables;
	}

	public boolean evaluate(AndExp exp){
		boolean result = true;
		for (BooleanExp e : exp.getExpressions()) {
			result = (result && evaluate(e));
		}
		return result;
	}

	public boolean evaluate(BooleanExp exp){
		boolean not = (exp.getNot() != null);
		if (exp.getNestedExp() != null)
			return not != evaluate(exp.getNestedExp());

		Object left;
		Object right;
		try {
			left = getReference(exp.getLeft());
			right = getReference(exp.getRight());
		} catch (IllegalAccessError e){
			return false;
		}

		int rightValue = 0, leftValue = 0;
		//It is a number comparation
		if (exp.getName().length() <= 2) {
			if (!(left instanceof Integer))
				throw new IllegalAccessError(left + " is not a number");
			if (!(right instanceof Integer))
				throw new IllegalAccessError(right + " is not a number");
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
			case ">":
				result = leftValue > rightValue;
				break;
			case "<":
				result = leftValue < rightValue;
				break;
			case "<=":
				result = leftValue <= rightValue;
				break;
			case ">=":
				result = leftValue >= rightValue;
				break;

			default:
				throw new IllegalAccessError(exp.getName()+ " operator not " +
					 "found");
		}
		return not != result;

	}

	public int calculate(AttributeOrInt attributeOrInt)
					{
		Object reference = getReference(attributeOrInt);
		if (!(reference instanceof Integer))
			throw new IllegalAccessError(
							attributeOrInt + " is not a number");
		return (Integer) reference;
	}

	public List<String> getVariablePath(AttributeName attribute) {
		List<String> variablePath = new ArrayList<>();
		AttributeName child = attribute;
		while (child != null) {
			variablePath.add(child.getName());
			child = child.getChild();
		}
		return variablePath;
	}

	public Object getReference(AttributeOrInt variable)
					 {
		if (variable.getAttribute() == null) {
			return variable.getValue();
		}
		return getReference(variable.getAttribute());
	}

	public Object getReference(List<String> variablePath)
					{
		Object parent = null;
		for (String variable :
						variablePath) {
			parent = getReference(parent, variable);
		}
		return parent;
	}
}