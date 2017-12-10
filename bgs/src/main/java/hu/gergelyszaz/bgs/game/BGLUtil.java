package hu.gergelyszaz.bgs.game;

import hu.gergelyszaz.bGL.*;

public class BGLUtil {
	public String toString(AttributeOrInt attributeOrInt) {
		if (attributeOrInt.getAttribute() == null) {
			return Integer.toString(attributeOrInt.getValue());
		} else {
			return toString(attributeOrInt.getAttribute());
		}
	}

	public String toString(AttributeName attributeName) {
		String variable = "";
		AttributeName child = attributeName;
		while (child != null) {
			variable += child.getName();
			if (child.getChild() != null) {
				variable += '.';
			}
			child = child.getChild();
		}
		return variable;
	}
}
