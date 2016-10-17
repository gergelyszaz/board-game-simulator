package hu.bme.aut.gergelyszaz.BGS.state.util;

import hu.bme.aut.gergelyszaz.BGS.state.GameState;

/**
 * Created by mad on 2016. 10. 05..
 */
public class GameStateValidator {

	public static boolean isValid(GameState gameState) {

		if (
			 gameState == null ||
				  gameState.getPlayers() == null ||
				  gameState.getSelectables() == null ||
				  gameState.getDecks() == null ||
				  gameState.getFields() == null ||
				  gameState.getLosers() == null ||
				  gameState.getTokens() == null ||
				  gameState.getWinners() == null
			 ) {
			return false;
		}
		return true;
	}
}
