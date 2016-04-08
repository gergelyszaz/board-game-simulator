package hu.bme.aut.gergelyszaz.BGS.state;

import java.util.ArrayList;
import java.util.List;

public class GameState {

    public GameState(String name, int version, int turncount, int currentplayer, List<PlayerState> players,
                     List<FieldState> fields, List<TokenState> tokens, List<Integer> selectables, List<Integer> winners, List<Integer> losers, List<DeckState> decks) {
        super();
        this.name = name;
        this.version = version;
        this.currentplayer = currentplayer;
        this.turncount = turncount;
        this.players = players;
        this.fields = fields;
        this.tokens = tokens;
        this.selectables = selectables;
        this.winners = winners;
        this.losers = losers;
        this.decks = decks;
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

    public List<PlayerState> getPlayers() {
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

    public List<Integer> getWinners() {
        return winners;
    }

    public List<Integer> getLosers() {
        return losers;
    }

    public List<DeckState> getDecks() {
        return decks;
    }

    final int version;
    final int turncount;
    final List<PlayerState> players;
    final List<FieldState> fields;
    final List<TokenState> tokens;
    final List<Integer> selectables;
    final String name;
    final int currentplayer;
    final List<Integer> winners;
    final List<Integer> losers;
    final List<DeckState> decks;

    public int getCurrentplayer() {
        return currentplayer;
    }

    public GameState getPublicState(int playerID) {
        List<DeckState> publicdecks = new ArrayList<DeckState>();
        for (DeckState d : decks) {
            if (d.visible == 2 || (d.visible == 1 && playerID == d.owner)) {
                publicdecks.add(d);
            } else {
                publicdecks.add(new DeckState().CopyWithHiddenCards(d));
            }
        }

        List<Integer> publicselectables;
        if (playerID == currentplayer) {
            publicselectables = selectables;
        } else {
            publicselectables = new ArrayList<>();
        }


        return new GameState(name, version, turncount, currentplayer, players, fields, tokens, publicselectables, winners, losers, publicdecks);
    }

}
