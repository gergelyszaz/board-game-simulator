package hu.gergelyszaz.bgs.game;

import hu.gergelyszaz.bGL.*;

import java.util.Objects;

public class ArithmeticManager {

	private VariableManager variableManager;
	private BGLUtil bglUtil = new BGLUtil();

	public ArithmeticManager(VariableManager variableManager) {

		this.variableManager = variableManager;
	}

	public Object resolveReference(AttributeOrInt attributeOrInt) {

		if (attributeOrInt.getAttribute() == null) {
			return attributeOrInt.getValue();
		} else {
			return variableManager.getReference(bglUtil.toString(attributeOrInt));
		}
	}

	public boolean evaluate(OrExp exp) {

		boolean result = false;
		for (AndExp e : exp.getExpressions()) {
			result = (result || evaluate(e));
		}
		return result;
	}

	public boolean evaluate(AndExp exp) {

		boolean result = true;
		for (BooleanExp e : exp.getExpressions()) {
			result = (result && evaluate(e));
		}
		return result;
	}

	public boolean isNumber(String text){
		if (text == null) {
			return false;
		}
		int length = text.length();
		if (length == 0) {
			return false;
		}
		int i = 0;
		if (text.charAt(0) == '-') {
			if (length == 1) {
				return false;
			}
			i = 1;
		}
		for (; i < length; i++) {
			char c = text.charAt(i);
			if (c < '0' || c > '9') {
				return false;
			}
		}
		return true;
	}

	public boolean evaluate(BooleanExp exp) {

		boolean not = (exp.getNot() != null);
		if (exp.getNestedExp() != null) {
			return not != evaluate(exp.getNestedExp());
		}

		Object left;
		Object right;
		try {
			String leftText = bglUtil.toString(exp.getLeft());
			if(isNumber(leftText)) {
				left = Integer.parseInt(leftText);
			} else {
				left = variableManager.getReference(leftText);
			}

			String rightText = bglUtil.toString(exp.getRight());
			if(isNumber(rightText)) {
				right = Integer.parseInt(rightText);
			} else {
				right = variableManager.getReference(rightText);
			}

		}
		catch (IllegalAccessError e) {
			return false;
		}

		boolean result = false;
		switch (exp.getName()) {
			case "===":
			case "==":
				result = Objects.equals(left, right);
				return not != result;
			case "!==":
			case "!=":
				result = !Objects.equals(left, right);
				return not != result;
		}

		int rightValue = 0, leftValue = 0;
		//It is a number comparision
		if (exp.getName().length() <= 2) {
			if (!(left instanceof Integer)) {
				throw new IllegalAccessError(left + " is not a number");
			}
			if (!(right instanceof Integer)) {
				throw new IllegalAccessError(right + " is not a number");
			}
			leftValue = (Integer) left;
			rightValue = (Integer) right;
		}

		switch (exp.getName()) {
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
				throw new IllegalAccessError(
						exp.getName() + " operator not " + "found");
		}
		return not != result;

	}
}
