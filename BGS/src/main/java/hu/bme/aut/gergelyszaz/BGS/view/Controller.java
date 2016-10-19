package hu.bme.aut.gergelyszaz.BGS.view;

import hu.bme.aut.gergelyszaz.BGS.state.GameState;

public interface Controller {

	public abstract boolean setSelected(String playerID, int ID);

	public abstract void AddView(View v);

	public abstract GameState getCurrentState(String playerID);

}
