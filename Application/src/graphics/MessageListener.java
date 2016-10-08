package graphics;

import hu.bme.aut.gergelyszaz.BGS.client.Connection;
import hu.bme.aut.gergelyszaz.BGS.client.StateListener;
import hu.bme.aut.gergelyszaz.BGS.state.DeckState;
import hu.bme.aut.gergelyszaz.BGS.state.GameState;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by mad on 2016. 04. 01..
 */
public class MessageListener implements hu.bme.aut.gergelyszaz.BGS.client.StateListener {
	Stack<GameState> states = new Stack<>();
	Connection client;
	Set<StateListener> recieverList = new HashSet<>();

	public MessageListener() {
		states.add(
						new GameState("", 0, 0, -1, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(),
										new ArrayList(), new ArrayList<DeckState>(), -1));
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
