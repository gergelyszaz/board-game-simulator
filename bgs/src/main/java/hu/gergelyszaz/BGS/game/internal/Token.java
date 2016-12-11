package hu.gergelyszaz.BGS.game.internal;

import hu.gergelyszaz.BGS.game.VariableManager;
import hu.gergelyszaz.bGL.Field;

public class Token {
	public String type;
	private VariableManager varManager;

	public Token(VariableManager vm, String t) {
		varManager = vm;
		type = t;
	}

	public Field getField() throws IllegalAccessException {
		return (Field) varManager.getReference(this, VariableManager.TOKEN.FIELD);
	}

	public void setField(Field field) {
		varManager.store(this, VariableManager.TOKEN.FIELD, field);
	}

	public Player getOwner() throws IllegalAccessException {
		return (Player) varManager.getReference(this, VariableManager.TOKEN.OWNER);
	}

	public void setOwner(Player player) {
		varManager.store(this, VariableManager.TOKEN.OWNER, player);
	}

	public void Destroy() {
		setField(null);
		varManager.remove(this);
	}

}
