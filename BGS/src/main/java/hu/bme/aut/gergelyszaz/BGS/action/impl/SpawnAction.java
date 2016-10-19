package hu.bme.aut.gergelyszaz.BGS.action.impl;

import hu.bme.aut.gergelyszaz.BGS.action.AbstractAction;
import hu.bme.aut.gergelyszaz.BGS.game.Game;
import hu.bme.aut.gergelyszaz.BGS.game.VariableManager;
import hu.bme.aut.gergelyszaz.BGS.game.internal.Player;
import hu.bme.aut.gergelyszaz.BGS.game.internal.Token;
import hu.bme.aut.gergelyszaz.bGL.AttributeName;
import hu.bme.aut.gergelyszaz.bGL.Field;
import hu.bme.aut.gergelyszaz.bGL.SimpleAssignment;

import java.util.List;

/**
 * Created by mad on 2016. 10. 12..
 */
public class SpawnAction extends AbstractAction {

	Game game;
	String tokenTypeName;
	List<SimpleAssignment> variables;
	AttributeName fieldName;
	AttributeName tokenName;

	public SpawnAction(
		 VariableManager variableManager, hu.bme.aut.gergelyszaz.bGL.Action
		 action, Game game) {

		super(variableManager,action);

		this.game = game;
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
		game.addToken(token);
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
