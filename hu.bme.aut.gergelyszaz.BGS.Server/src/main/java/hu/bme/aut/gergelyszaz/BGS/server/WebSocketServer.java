package hu.bme.aut.gergelyszaz.BGS.server;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.glassfish.tyrus.server.Server;

import hu.bme.aut.gergelyszaz.BGS.core.GameManager;

public class WebSocketServer {

	private static Properties configFile = new Properties();

	public static void main(String[] args) {
		runServer();
	}

	public static void runServer() {
		
		try {
			InputStream input = new FileInputStream("games.properties");
			configFile.load(input);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		for (Object k : configFile.values()) {
			System.out.println((String) k);
			try {
				GameManager.getInstance().mm.LoadModel((String)k);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		Server server = new Server("localhost", 8025, "/websockets", BGSServer.class);
		
		try {
			server.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Please press a key to stop the server.");
			reader.readLine();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			server.stop();
		}
	}

	public static void LoadAllModels() {
		
	}
}