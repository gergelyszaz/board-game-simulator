package hu.bme.aut.gergelyszaz.BGS.game;

import hu.bme.aut.gergelyszaz.BGS.game.internal.Deck;
import hu.bme.aut.gergelyszaz.BGS.game.internal.Player;
import hu.bme.aut.gergelyszaz.BGS.game.internal.Token;
import hu.bme.aut.gergelyszaz.bGL.Field;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by mad on 2016. 10. 19..
 */
public class InternalManager {

    private List<Player> players=new ArrayList<>();
    private List<Field> fields=new ArrayList<>();
    private List<Token> tokens=new ArrayList<>();
    private List<Deck> decks=new ArrayList<>();
    private Set<Integer> selectables=new HashSet<>();
    private List<Integer> winners=new ArrayList<>();
    private List<Integer> losers=new ArrayList<>();
    private SelectableManager selectableManager;
    private Player currentPlayer;

    public InternalManager(SelectableManager selectableManager) {
        this.selectableManager=selectableManager;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Field> getFields() {
        return fields;
    }

    public List<Token> getTokens() {
        return tokens;
    }

    public List<Deck> getDecks() {
        return decks;
    }

    public Set<Integer> getSelectables() {
        return selectables;
    }

    public List<Integer> getWinners() {
        return winners;
    }

    public List<Integer> getLosers() {
        return losers;
    }

    public SelectableManager getSelectableManager() {
        return selectableManager;
    }

    public void removeToken(Token token) {
        tokens.remove(token);
        selectableManager.remove(token);
    }

    public void addToken(Token token) {
        tokens.add(token);
        selectableManager.add(token);
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer, VariableManager variableManager) {
        this.currentPlayer=currentPlayer;
        variableManager.store(null,"currentPlayer",currentPlayer);
    }
}
