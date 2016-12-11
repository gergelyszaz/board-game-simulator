package hu.gergelyszaz.BGS.state.util;

import hu.gergelyszaz.BGS.state.GameState;

/**
 * Created by mad on 2016. 10. 05..
 */
public class GameStateValidator {

	public static boolean isValid(GameState gameState) {

		if (
			 gameState == null ||
				  gameState.players == null ||
				  gameState.selectables == null ||
				  gameState.decks == null ||
				  gameState.fields == null ||
				  gameState.losers == null ||
				  gameState.tokens == null ||
				  gameState.winners == null
			 ) {
			return false;
		}
		return true;
	}
}
