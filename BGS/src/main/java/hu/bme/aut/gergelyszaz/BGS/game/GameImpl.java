package hu.bme.aut.gergelyszaz.BGS.game;

import hu.bme.aut.gergelyszaz.BGS.action.ActionManager;
import hu.bme.aut.gergelyszaz.BGS.action.impl.SelectAction;
import hu.bme.aut.gergelyszaz.BGS.game.internal.Deck;
import hu.bme.aut.gergelyszaz.BGS.game.internal.Player;
import hu.bme.aut.gergelyszaz.BGS.game.internal.Token;
import hu.bme.aut.gergelyszaz.BGS.state.GameState;
import hu.bme.aut.gergelyszaz.BGS.state.GameStateFactory;
import hu.bme.aut.gergelyszaz.BGS.state.IDManager;
import hu.bme.aut.gergelyszaz.BGS.state.util.StateStore;
import hu.bme.aut.gergelyszaz.BGS.view.Controller;
import hu.bme.aut.gergelyszaz.BGS.view.View;
import hu.bme.aut.gergelyszaz.bGL.Field;
import hu.bme.aut.gergelyszaz.bGL.Model;
import org.eclipse.emf.common.util.EList;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class GameImpl implements Controller, Game {

    String name;

    VariableManager variableManager;
    ActionManager actionManager;
    IDManager idManager;
    StateStore stateStore;
    InternalManager internalManager;

    boolean gameEnded = false;
    volatile boolean waitForInput = false;
    Set<View> views = new HashSet<>();
    private EList<Field> fields;

    public GameImpl(VariableManager variableManager, ActionManager actionManager,
                    IDManager idManager, StateStore stateStore,
                    InternalManager internalManager) {
        this.internalManager = internalManager;
        this.variableManager = variableManager;
        this.actionManager = actionManager;
        this.idManager = idManager;
        this.stateStore = stateStore;

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
        SelectableManager selectableManager = internalManager.getSelectableManager();

        name = gameModel.getName();
        fields = gameModel.getBoard().getFields();
        internalManager.getPlayers().addAll(players);
        internalManager.getDecks().addAll(decks);


    }

    @Override
    public void Step() throws IllegalAccessException {
        if (waitForInput || gameEnded) return;
        actionManager.step();
        actionManager.getCurrentAction().Execute();
    }

    @Override
    public void Start() throws IllegalAccessException {
        _saveCurrentState();
    }

    @Override
    public boolean IsFinished() {
        return gameEnded;
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


            if (actionManager.getCurrentAction() instanceof SelectAction) {

                Object object = idManager.get(selectedID);
                variableManager.store(null, internalManager.getSelectableManager()
                        .getSelectableName(), object);

                if (object instanceof Token) {
                    for (Field f : fields) {
                        variableManager
                                .store(f, VariableManager.DISTANCE_FROM_SELECTED_TOKEN,
                                        -1);
                    }
                    _setupDistance(((Token) object).getField(), 0);
                }
            }

            //Probably would be better with synchronization
            waitForInput = false;
            return true;
        } catch (IllegalAccessException e) {
            System.out.println(variableManager.getVariables());
            e.printStackTrace();
            return false;
        }
    }

    public Player getNextPlayer(Player player) throws IllegalAccessException {
        List<Player> players = internalManager.getPlayers();
        int playerIndex = players.lastIndexOf(player);
        playerIndex++;
        if (playerIndex >= players.size()) playerIndex = 0;
        return players.get(playerIndex);
    }


    private Player _getCurrentPlayer() throws IllegalAccessException {

        return (Player) variableManager
                .getReference(null, VariableManager.CURRENTPLAYER);
    }

    private void _setupDistance(Field startingField, int distance)
            throws IllegalAccessException {

        //	TODO write without recursion and use BFS instead of DFS
        int dist = variableManager.getValue(startingField,
                VariableManager.DISTANCE_FROM_SELECTED_TOKEN);
        if ((dist > -1 && dist <= distance)) return;
        variableManager
                .store(startingField, VariableManager.DISTANCE_FROM_SELECTED_TOKEN,
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