package hu.bme.aut.gergelyszaz.BGS.state;

import java.util.List;

public class GameState {

	public GameState(String name, int version, int turncount, String currentplayer, List<String> players,
			List<FieldState> fields, List<TokenState> tokens, List<Integer> selectables) {
		super();
		this.name = name;
		this.version = version;
		this.currentplayer = currentplayer;
		this.turncount = turncount;
		this.players = players;
		this.fields = fields;
		this.tokens = tokens;
		this.selectables = selectables;
	}

	public String getName() {
		return name;
	}

	public int getVersion() {
		return version;
	}

	public int getTurncount() {
		return turncount;
	}

	public List<String> getPlayers() {
		return players;
	}

	public List<FieldState> getFields() {
		return fields;
	}

	public List<TokenState> getTokens() {
		return tokens;
	}

	public List<Integer> getSelectables() {
		return selectables;
	}

	final int version;
	final int turncount;
	final List<String> players;
	final List<FieldState> fields;
	final List<TokenState> tokens;
	final List<Integer> selectables;
	final String name;
	final String currentplayer;

	public String getCurrentplayer() {
		return currentplayer;
	}

	public GameState getPublicState() {
		return new GameState(name, version, turncount, currentplayer, players, fields, tokens, null);
	}

}
