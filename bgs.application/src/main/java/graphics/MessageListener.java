package graphics;

import hu.gergelyszaz.bgs.client.Connection;
import hu.gergelyszaz.bgs.client.StateListener;
import hu.gergelyszaz.bgs.state.GameState;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by mad on 2016. 04. 01..
 */
public class MessageListener implements StateListener {
    Stack<GameState> states = new Stack<>();
    Connection client;
    Set<StateListener> recieverList = new HashSet<>();

    public MessageListener() {
        states.add(
                GameState.emptyGameState());
    }

    public boolean IsEmpty() {
        return states.isEmpty();
    }

    public GameState getCurrentState() {
        return states.peek();
    }

    public void addStateReciever(StateListener sr) {
        recieverList.add(sr);
    }

    public Connection getClient() {
        return client;
    }

    public void setClient(Connection c) {
        client = c;
    }

    @Override
    public void UpdateGameState(GameState state) {
        states.push(state);
        if (state == null) {
            System.out.println("null");
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                for (StateListener reciever : recieverList) {
                    reciever.UpdateGameState(state);
                }

            }
        });
    }
}
