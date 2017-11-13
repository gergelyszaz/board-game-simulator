package hu.gergelyszaz.bgs.client;

import hu.gergelyszaz.bgs.state.GameState;

/**
 * Created by mad on 2016. 04. 01..
 */
public interface StateListener {
	void UpdateGameState(GameState state);
}
