package hu.gergelyszaz.BGS.server;

import hu.gergelyszaz.BGS.manager.GameFactory;
import hu.gergelyszaz.BGS.manager.GameManager;
import hu.gergelyszaz.BGS.manager.ModelManager;

/**
 * Created by mad on 2016. 09. 25..
 */
public class GameManagerSingleton {
	private static GameManager gameManager = null;
	private static Object lock = new Object();

	public static GameManager getGameManagerInstance() {
		synchronized (lock) {
			if (gameManager == null) {
				ModelManager modelManager = new ModelManager();
//                modelManager.Initialize();
				GameFactory gameFactory = new GameFactory();
				gameManager = new GameManager(gameFactory, modelManager);
				new Thread(gameManager).start();
			}
			return gameManager;
		}
	}
}
