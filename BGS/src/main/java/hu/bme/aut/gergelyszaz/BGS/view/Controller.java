package hu.bme.aut.gergelyszaz.BGS.view;

import hu.bme.aut.gergelyszaz.BGS.state.GameState;

public interface Controller {

	boolean setSelected(String playerID, int ID);

	void AddView(View v);

	GameState getCurrentState(String playerID);

}
