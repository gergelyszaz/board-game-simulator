package hu.gergelyszaz.bgs.game;

import hu.gergelyszaz.bGL.*;

import java.util.*;

/**
 * The order of parameters:
 * parent, name, objectToStore
 */
public class VariableManager {

	private Map<Object, Map<String, Object>> references = new HashMap<>();


	public String getVariables() {

		StringBuilder stringBuilder = new StringBuilder();

		references.forEach((o, stringObjectMap) -> {
			stringBuilder.append(o).append("\n");
			stringObjectMap.forEach((s, o1) -> {
				stringBuilder.append("	")
						.append(s)
						.append(": ")
						.append(o1)
						.append("\n");
			});
		});

		return stringBuilder.toString();
	}

	public int getValue(Object parent, String variableName) {

		Object variable = getReference(parent, variableName);
		if (!(variable instanceof Integer)) {
			throw new IllegalAccessError(
					variableName + " of " + parent + " is not a number");
		}
		return (int) (Integer) variable;
	}

	public Object getReference(Object parent, String variableName) {

		if (!getVariables(parent).containsKey(variableName)) {
			throw new IllegalAccessError(parent + " has no " + variableName);
		}

		Object variable = getVariables(parent).get(variableName);
		return variable;
	}

	public Map<String, Object> getVariables(Object parent) {

		Map<String, Object> variables = references.get(parent);
		if (variables == null) {
			throw new IllegalAccessError(parent + " has no variables");
		}
		return variables;
	}

	public void remove(Object object) {

		references.remove(object);
	}

	public void store(String variable, Object objectToStore) {

		List<String> variablePath = Arrays.asList(variable.split("\\."));

		if (variablePath.size() == 0) {
			throw new IllegalAccessError(
					objectToStore + "cannot be stored with empty path ");
		}
		String variableName = variablePath.get(variablePath.size() - 1);
		Object parent = null;
		if (variablePath.size() > 1) {
			List<String> parentPath =
					variablePath.subList(0, variablePath.size() - 1);
			parent = getReference(String.join(".",parentPath));
		}
		store(parent, variableName, objectToStore);
	}

	public Object getReference(String variablePath) {

		Object parent = null;
		for (String variable : variablePath.split("\\.")) {
			parent = getReference(parent, variable);
		}

		return parent;
	}

	public void store(Object parent, String name, Object objectToStore) {

		Map<String, Object> variables = references.get(parent);
		if (variables == null) {
			variables = new HashMap<>();
			references.put(parent, variables);
		}
		variables.put(name, objectToStore);
	}

	public static class GLOBAL {

		public static final String THIS = "this";
		public static final String CURRENTPLAYER = "currentPlayer";
		public static final String NULL = "null";
		public static final String DISTANCE_FROM_SELECTED_TOKEN =
				"distanceFromSelectedToken";
	}

	public static class PLAYER {

	}

	public static class FIELD {

	}

	public static class DECK {

		public static final String OWNER = "owner";
		public static final String TOP = "top";
		public static final String CARDCOUNT = "cardCount";
	}

	public static class CARD {

		public static final String DECK = "deck";
	}

	public static class TOKEN {

		public static final String OWNER = "owner";
		public static final String FIELD = "field";
	}
}