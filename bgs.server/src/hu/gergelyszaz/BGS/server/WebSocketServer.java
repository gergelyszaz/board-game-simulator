package hu.gergelyszaz.BGS.server;

import hu.gergelyszaz.BGS.util.FileUtil;
import org.glassfish.tyrus.server.Server;

import java.io.InputStream;
import java.util.Properties;
import java.util.logging.*;

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

	public static void main(String[] args) {
		logger.log(Level.INFO, "Starting server");

		int port = 8025;
		String portString = System.getenv("PORT");
		if (portString != null) {
			port = Integer.parseInt(portString);
		}
		WebSocketServer.runServer("0.0.0.0", port, "websockets", "/config/games.properties");
		logger.log(Level.INFO, "Server Started");
		while (WebSocketServer.isRunning()) {
			Thread.yield();
		}
	}

	public static boolean runServer(String hostName, int port, String rootpath, String gamesPath) {
		running = true;
		try {
			server = new Server(hostName, port, "/" + rootpath, BGSServer.class);
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
		} finally {
			return running;
		}
	}

	public static boolean isRunning() {
		return running;
	}
}
