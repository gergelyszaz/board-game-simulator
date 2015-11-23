package hu.bme.aut.gergelyszaz.BGS.core;

import hu.bme.aut.gergelyszaz.bGL.Field;
import hu.bme.aut.gergelyszaz.BGS.core.Token;

public interface IController {

	public abstract VariableManager getVarManager();

	public abstract void setSelectedField(Field field);

	public abstract void setSelectedToken(Token token);

	public abstract void Restart();

	public abstract boolean setWaitForInput(boolean b);
	
	public abstract void setView(IView v);
	
	
}
