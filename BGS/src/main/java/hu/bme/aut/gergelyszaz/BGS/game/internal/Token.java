package hu.bme.aut.gergelyszaz.BGS.game.internal;

import hu.bme.aut.gergelyszaz.BGS.game.VariableManager;
import hu.bme.aut.gergelyszaz.bGL.Field;

public class Token {
	public String type;
	private VariableManager varManager;

	public Token(VariableManager vm, String t) {
		varManager = vm;
		type = t;
	}

	public Field getField() throws IllegalAccessException {
		return (Field) varManager.getReference(this, varManager.FIELD);
	}

	public void setField(Field field) {
		varManager.store(this, varManager.FIELD, field);
	}

	public Player getOwner() throws IllegalAccessException {
		return (Player) varManager.getReference(this, varManager.OWNER);
	}

	public void setOwner(Player player) {
		varManager.store(this, varManager.OWNER, player);
	}

	public void Destroy() {
		setField(null);
		varManager.remove(this);
	}

}
