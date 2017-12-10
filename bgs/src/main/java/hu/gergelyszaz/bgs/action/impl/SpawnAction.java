package hu.gergelyszaz.bgs.action.impl;

import hu.gergelyszaz.bGL.*;
import hu.gergelyszaz.bGL.Field;
import hu.gergelyszaz.bgs.action.AbstractAction;
import hu.gergelyszaz.bgs.game.*;
import hu.gergelyszaz.bgs.game.internal.Player;
import hu.gergelyszaz.bgs.game.internal.Token;

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
	BGLUtil bglUtil = new BGLUtil();

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
			Object reference = a.getAttribute().getValue();
			variableManager.store(token, variableName, reference);
		}
		token.setOwner(
			 (Player) variableManager.getReference(null, "currentPlayer"));
		token.setField((Field) variableManager.getReference(bglUtil.toString
				(fieldName)));
	}

	private void addTokenToVariableManager(Token token)
		 throws IllegalAccessException {

		String variablePath = bglUtil.toString(tokenName);
		variableManager.store(variablePath, token);
	}
}
