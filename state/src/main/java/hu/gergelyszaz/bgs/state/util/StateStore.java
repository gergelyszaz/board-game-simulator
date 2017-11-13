package hu.gergelyszaz.bgs.state.util;

import hu.gergelyszaz.bgs.state.GameState;

import java.util.Stack;

/**
 * Created by mad on 2016. 10. 07..
 */
public class StateStore {
	private Stack<GameState> gameStates = new Stack<>();

	public void addState(GameState gameState) {
		gameStates.add(gameState);
	}

	public GameState getCurrentState() {
		return gameStates.peek();
	}

	public int getCurrentVersion() {
		if (gameStates.isEmpty()) return -1;
		return getCurrentState().version;
	}

}
