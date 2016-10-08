package hu.bme.aut.gergelyszaz.BGS.core.model;

import hu.bme.aut.gergelyszaz.BGS.core.VariableManager;
import hu.bme.aut.gergelyszaz.bGL.Field;

public class Token {
	public String type;
	private VariableManager varManager;

	public Token(VariableManager vm, String t) {
		varManager = vm;
		type = t;
	}

	public Field getField() throws IllegalAccessException {
		return (Field) varManager.GetReference(this, varManager.FIELD);
	}

	public void setField(Field field) {
		varManager.Store(this, varManager.FIELD, field);
	}

	public Player getOwner() throws IllegalAccessException {
		return (Player) varManager.GetReference(this, varManager.OWNER);
	}

	public void setOwner(Player player) {
		varManager.Store(this, varManager.OWNER, player);
	}

	public void Destroy() {
		setField(null);
		varManager.Remove(this);
	}

}
