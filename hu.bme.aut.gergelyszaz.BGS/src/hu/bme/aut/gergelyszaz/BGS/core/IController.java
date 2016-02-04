package hu.bme.aut.gergelyszaz.BGS.core;

import hu.bme.aut.gergelyszaz.BGS.state.GameState;

public interface IController {

	public abstract boolean setSelectedField(int fieldID);

	public abstract boolean setSelectedToken(int tokenID);
	
	public abstract void AddView(IView v);
	
	public abstract GameState getCurrentState(String playerID);
	
}
