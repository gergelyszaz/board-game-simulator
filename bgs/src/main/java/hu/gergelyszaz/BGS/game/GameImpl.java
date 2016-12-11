package hu.gergelyszaz.BGS.game;

import com.google.common.collect.Lists;
import hu.gergelyszaz.BGS.action.ActionManager;
import hu.gergelyszaz.BGS.action.impl.SelectAction;
import hu.gergelyszaz.BGS.game.internal.Deck;
import hu.gergelyszaz.BGS.game.internal.Player;
import hu.gergelyszaz.BGS.game.internal.Token;
import hu.gergelyszaz.BGS.state.*;
import hu.gergelyszaz.BGS.state.util.StateStore;
import hu.gergelyszaz.BGS.view.*;
import hu.gergelyszaz.bGL.Field;
import hu.gergelyszaz.bGL.*;

import java.util.*;

public class GameImpl implements Controller, Game {

    String name;
    VariableManager variableManager;
    ActionManager actionManager;
    IDManager idManager;
    StateStore stateStore;
    InternalManager internalManager;
    Set<View> views = new HashSet<>();

    public GameImpl(VariableManager variableManager, ActionManager actionManager,
                    IDManager idManager, StateStore stateStore,
                    InternalManager internalManager) {
        this.internalManager = internalManager;
        this.variableManager = variableManager;
        this.actionManager = actionManager;
        this.idManager = idManager;
        this.stateStore = stateStore;

    }

    public VariableManager getVariableManager() {
        return variableManager;
    }

    public InternalManager getInternalManager() {
        return internalManager;
    }

    @Override
    public boolean Join(String clientID) throws IllegalAccessException {

        for (Player player : internalManager.getPlayers()) {
            if (!player.IsConnected()) {
                player.setSessionID(clientID);
                _saveCurrentState();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean IsFull() {

        boolean isFull = true;
        for (Player player :
                internalManager.getPlayers()) {
            isFull &= player.IsConnected();
        }
        return isFull;
    }

    public void Init(Model gameModel, List<Player> players, List<Deck> decks) {

        name = gameModel.getName();
        internalManager.getFields().addAll( gameModel.getFields());
        internalManager.getPlayers().addAll(players);
        internalManager.getDecks().addAll(decks);

        internalManager.setCurrentPlayer(players.get(0), variableManager);

    }

    @Override
    public void Step() throws IllegalAccessException {
        if (!internalManager.getSelectableManager().isSelectionDone() ||
              IsFinished()) {
            return;
        }
        actionManager.step();
        System.out.println(actionManager.getCurrentAction().toString());
        actionManager.getCurrentAction().Execute();
        _saveCurrentState();
        views.forEach(View::Refresh);
    }

    @Override
    public void Start() throws IllegalAccessException {
        _saveCurrentState();
    }

    @Override
    public boolean IsFinished() {
        List<Player> winners=internalManager.getWinners();
        List<Player> losers=internalManager.getLosers();
        List<Player> players= Lists.newArrayList(internalManager.getPlayers());

        players.removeAll(winners);
        players.removeAll(losers);
        if(players.size()>=2){
            return false;
        }
        if(players.size()==1 && internalManager.getPlayers().size()==1){
            return false;
        }
        return true;
    }

    @Override
    public void AddView(View v) {
        views.add(v);
    }

    @Override
    public GameState getCurrentState(String sessionID) {
        GameState gs = stateStore.getCurrentState();
        Player p = internalManager.getPlayers().stream().filter(player -> player.getSessionID() == sessionID).findFirst().get();
        return gs.getPublicState(idManager.get(p));
    }

    @Override
    public boolean setSelected(String playerID, int selectedID) {

        try {
            if (!Objects.equals(playerID, _getCurrentPlayer().getSessionID())) {
                return false;
            }

            if (!internalManager.getSelectableManager().getSelectableObjects().contains(idManager.get(selectedID)))
                return false;

            if (!(actionManager.getCurrentAction() instanceof SelectAction)) {
                return false;
            }

            Object object = idManager.get(selectedID);
            variableManager.store(null, internalManager.getSelectableManager()
                    .getSelectableName(), object);

            if (object instanceof Token) {
                for (Field f : internalManager.getFields()) {
                    variableManager
                            .store(f, VariableManager
                                        .GLOBAL.DISTANCE_FROM_SELECTED_TOKEN,
                                    -1);
                }
                _setupDistance(((Token) object).getField(), 0);
            }

            internalManager.getSelectableManager().finishSelection();
            return true;
        } catch (IllegalAccessException e) {
            System.out.println(variableManager.getVariables());
            e.printStackTrace();
            return false;
        }
    }




    private Player _getCurrentPlayer() throws IllegalAccessException {

        return (Player) variableManager
                .getReference(null, VariableManager.GLOBAL.CURRENTPLAYER);
    }

    private void _setupDistance(Field startingField, int distance)
            throws IllegalAccessException {

        //	TODO write without recursion and use BFS instead of DFS
        int dist = variableManager.getValue(startingField,
                VariableManager.GLOBAL.DISTANCE_FROM_SELECTED_TOKEN);
        if ((dist > -1 && dist <= distance)) return;
        variableManager
                .store(startingField, VariableManager
                            .GLOBAL.DISTANCE_FROM_SELECTED_TOKEN,
                        distance);
        for (Field field : startingField.getNeighbours()) {
            {
                _setupDistance(field, distance + 1);
            }
        }
    }

    private void _saveCurrentState() throws IllegalAccessException {
        int stateVersion = stateStore.getCurrentVersion() + 1;

        GameState gameState = GameStateFactory.createGameState(
                name,
                idManager,
                stateVersion,
                internalManager);

        stateStore.addState(gameState);
    }

}