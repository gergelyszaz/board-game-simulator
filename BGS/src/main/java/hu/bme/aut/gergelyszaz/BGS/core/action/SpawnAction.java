package hu.bme.aut.gergelyszaz.BGS.core.action;

import hu.bme.aut.gergelyszaz.BGS.core.Game;
import hu.bme.aut.gergelyszaz.BGS.core.VariableManager;
import hu.bme.aut.gergelyszaz.BGS.core.model.Player;
import hu.bme.aut.gergelyszaz.BGS.core.model.Token;
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

		super(variableManager);

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
			Object reference = variableManager.GetReference(a.getAttribute());
			variableManager.Store(token, variableName, reference);
		}
		token.setOwner(
			 (Player) variableManager.GetReference(null, "currentPlayer"));
		token.setField((Field) variableManager.GetReference(fieldName));
	}

	private void addTokenToVariableManager(Token token)
		 throws IllegalAccessException {

		List<String> variablePath = variableManager.getVariablePath(tokenName);
		variableManager.Store(variablePath, token);
	}
}
