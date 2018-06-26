package hu.gergelyszaz.bgs.server;

import hu.gergelyszaz.bgs.util.FileUtil;


import java.io.InputStream;
import java.util.Properties;
import java.util.logging.*;

import org.glassfish.tyrus.server.Server;

public class WebSocketServer {

	private static Properties configFile = new Properties();
	private static Logger logger = Logger.getLogger(WebSocketServer.class.getName());
	private static volatile boolean running = false;
	private static Server server = null;

	public static void stopServer() {
		if (running) {
			server.stop();
			server = null;
			running = false;
		}
	}

	public static void main(String[] args) throws Exception {
		logger.log(Level.INFO, "Starting server");

		int port = 8025;
		String portString = System.getenv("PORT");
		if (portString != null) {
			port = Integer.parseInt(portString);
		}
		WebSocketServer.runServer("0.0.0.0", port, "", "/config/games.properties");
		while (WebSocketServer.isRunning()) {
			Thread.sleep(1000);
		}
	}

	public static boolean runServer(String hostName, int port, String rootpath, String gamesPath) {
		running = true;
		try {
			server = new Server(hostName, port, rootpath, null, BGSServer.class);
			
			InputStream input = WebSocketServer.class.getResourceAsStream(gamesPath);
			configFile.load(input);
			for (Object k : configFile.values()) {
				System.out.println((String) k);
				String gameString = FileUtil.readFile((String) k);
				GameManagerSingleton.getGameManagerInstance().modelManager.LoadModel(gameString);
			}
			server.start();
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getMessage());
			running = false;
		}
		logger.log(Level.INFO, "Server Started");
		return running;
	}

	public static boolean isRunning() {
		return running;
	}
}
