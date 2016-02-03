package hu.bme.aut.gergelyszaz.BGS.core;

import hu.bme.aut.gergelyszaz.BGS.state.GameState;

public interface IController {

	public abstract boolean setSelectedField(String fieldID);

	public abstract boolean setSelectedToken(String tokenID);

	public abstract boolean setWaitForInput(boolean b);
	
	public abstract void setView(IView v);
	
	public abstract Object getLock();
	
	public abstract GameState getCurrentState(String playerID);
	
}
