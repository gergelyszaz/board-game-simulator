package hu.gergelyszaz.bgs.game;

import com.google.common.collect.Lists;
import hu.gergelyszaz.bgs.game.internal.*;
import hu.gergelyszaz.bgs.state.IDManager;
import hu.gergelyszaz.bGL.Field;

import java.util.*;

/**
 * Created by mad on 2016. 10. 19..
 */
public class InternalManager {

    private List<Player> players=new ArrayList<>();
    private List<Field> fields=new ArrayList<>();
    private List<Token> tokens=new ArrayList<>();
    private List<Deck> decks=new ArrayList<>();
    private List<Player> winners=new ArrayList<>();
    private List<Player> losers=new ArrayList<>();
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

    public List<Integer> getSelectables(IDManager idManager) {
        return Lists.transform(selectableManager.getSelectableObjects(),
              o->idManager.get(o)) ;
    }

    public List<Player> getWinners() {
        return winners;
    }

    public List<Player> getLosers() {
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
        variableManager.store(null,VariableManager.GLOBAL.CURRENTPLAYER,currentPlayer);
    }

    public void addWinner(Player player) {
        if(!winners.contains(player)) {
            winners.add(player);
        }
    }

    public void addLoser(Player player) {
        if(!losers.contains(player)) {
            losers.add(player);
        }
    }

    public Player getNextPlayer(Player player) throws IllegalAccessException {
        int playerIndex = players.lastIndexOf(player);
        playerIndex++;
        if (playerIndex >= players.size()) playerIndex = 0;
        return players.get(playerIndex);
    }
}
