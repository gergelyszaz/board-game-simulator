package hu.gergelyszaz.bgs.action.impl;

import hu.gergelyszaz.bgs.action.AbstractAction;
import hu.gergelyszaz.bgs.game.InternalManager;
import hu.gergelyszaz.bgs.game.VariableManager;
import hu.gergelyszaz.bgs.game.internal.Player;
import hu.gergelyszaz.bgs.game.internal.Token;
import hu.gergelyszaz.bGL.Action;
import hu.gergelyszaz.bGL.AttributeName;
import hu.gergelyszaz.bGL.Field;
import hu.gergelyszaz.bGL.SimpleAssignment;

import java.util.List;

/**
 * Created by mad on 2016. 10. 12..
 */
public class SpawnAction extends AbstractAction {

	private final InternalManager internalManager;
	private final String tokenTypeName;
	private final List<SimpleAssignment> variables;
	private final AttributeName fieldName;
	private final AttributeName tokenName;

	public SpawnAction(
            VariableManager variableManager, Action
		 action, InternalManager internalManager) {

		super(variableManager,action);
		this.internalManager=internalManager;

		tokenTypeName = action.getToken().getName();
		variables = action.getToken().getVariables();
		fieldName = action.getSpawnTo();
		tokenName = action.getToVar();
	}

	@Override
	public void Execute() throws IllegalAccessException {

		Token token = new Token(variableManager, tokenTypeName);
		setupVariables(token);
		addTokenToVariableManager(token);
		internalManager.addToken(token);
	}

	private void setupVariables(Token token) throws IllegalAccessException {

		for (SimpleAssignment a : variables) {
			String variableName = a.getName();
			Object reference = variableManager.getReference(a.getAttribute());
			variableManager.store(token, variableName, reference);
		}
		token.setOwner(
			 (Player) variableManager.getReference(null, "currentPlayer"));
		token.setField((Field) variableManager.getReference(fieldName));
	}

	private void addTokenToVariableManager(Token token)
		 throws IllegalAccessException {

		List<String> variablePath = variableManager.getVariablePath(tokenName);
		variableManager.store(variablePath, token);
	}
}
