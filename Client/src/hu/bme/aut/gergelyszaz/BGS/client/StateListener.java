package hu.bme.aut.gergelyszaz.BGS.client;

import hu.bme.aut.gergelyszaz.BGS.state.GameState;

/**
 * Created by mad on 2016. 04. 01..
 */
public interface StateListener {
	void UpdateGameState(GameState state);
}
