package hu.gergelyszaz.bgs.manager;

import hu.gergelyszaz.bgs.game.Game;
import hu.gergelyszaz.bgs.view.Controller;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import hu.gergelyszaz.bGL.*;

public class GameManager implements Runnable {
	public ModelManager modelManager;
	public Hashtable<String, Game> availableGames = new Hashtable<>();
	public Hashtable<String, Game> playerConnections = new Hashtable<>();
	public List<Game> runningGames = new ArrayList<>();
	private GameFactory gameFactory;

	public GameManager(GameFactory gameFactory, ModelManager modelManager) {
		this.gameFactory = gameFactory;
		this.modelManager = modelManager;
	}

	public Controller JoinGame(String clientID, String gameName) throws Exception {
		if (playerConnections.contains(clientID))
			return playerConnections.get(clientID);
		if (availableGames.get(gameName) == null) {
			Model model=modelManager.Get(gameName);
			if(model==null) throw new RuntimeException("Game "+ gameName + " not found!");
			availableGames.put(gameName, gameFactory.CreateGame(model));
		}
		//TODO what happens if multiple clients try connect at the same time?
		Game game = availableGames.get(gameName);
		game.Join(clientID);
		playerConnections.put(clientID, game);
		if (game.IsFull()) {
			availableGames.remove(gameName);
			game.Start();
			runningGames.add(game);

		}
		return game;
	}

	@Override
	public void run() {
		while (true) {
			List<Game> rg = new ArrayList<>();
			rg.addAll(runningGames);
			for (Game g : rg) {
				try {
					g.Step();
					if (g.IsFinished()) runningGames.remove(g);
				} catch (Exception e) {
					e.printStackTrace();
					runningGames.remove(g);
				}
			}
			Thread.yield();
		}
	}

}
