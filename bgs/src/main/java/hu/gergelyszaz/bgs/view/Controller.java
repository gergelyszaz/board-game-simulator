package hu.gergelyszaz.bgs.view;

import hu.gergelyszaz.bgs.state.GameState;

public interface Controller {

	boolean setSelected(String playerID, int ID);

	void AddView(View v);

	GameState getCurrentState(String playerID);

}
