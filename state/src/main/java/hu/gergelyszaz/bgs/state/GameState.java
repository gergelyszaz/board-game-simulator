package hu.gergelyszaz.bgs.state;

import java.util.*;

public class GameState {

    public final List<PlayerState> players;
    public final List<FieldState> fields;
    public final List<TokenState> tokens;
    public final List<Integer> selectables;
    public final String name;
    public final int currentplayer;
    public final List<Integer> winners;
    public final List<Integer> losers;
    public final List<DeckState> decks;
    public final int playerID;
    public final int version;

    public GameState(String name, int version, int currentplayer, List<PlayerState> players,
                     List<FieldState> fields, List<TokenState> tokens, List<Integer> selectables, List<Integer> winners, List<Integer> losers, List<DeckState> decks, int playerID) {
        super();
        this.name = name;
        this.version = version;
        this.currentplayer = currentplayer;
        this.players = players;
        this.fields = fields;
        this.tokens = tokens;
        this.selectables = selectables;
        this.winners = winners;
        this.losers = losers;
        this.decks = decks;
        this.playerID = playerID;
    }

    public static GameState emptyGameState() {
        return new GameState("", -1, 0, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(),
                new ArrayList<>(), new ArrayList<>(), -1);
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

        return new GameState(name, version, currentplayer, players, fields, tokens,
              publicselectables, winners, losers, publicdecks, playerID);
    }
}