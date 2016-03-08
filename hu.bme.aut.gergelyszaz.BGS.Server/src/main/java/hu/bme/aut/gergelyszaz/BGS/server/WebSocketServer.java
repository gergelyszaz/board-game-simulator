package hu.bme.aut.gergelyszaz.BGS.server;

import hu.bme.aut.gergelyszaz.BGS.manager.GameManager;
import org.glassfish.tyrus.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class WebSocketServer {

    private static Properties configFile = new Properties();

    public static void main(String[] args) {
        runServer("localhost", 8025, "/websockets");
    }

    private static boolean running = false;

    public static boolean isRunning() {
        return running;
    }

    public static void stopServer() {
        running = false;
    }

    public static void runServer(String hostName, int port, String rootpath) {

        try {
            InputStream input = WebSocketServer.class.getResourceAsStream("/config/games.properties");
            //new FileInputStream("games.properties");
            configFile.load(input);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        for (Object k : configFile.values()) {
            System.out.println((String) k);
            try {
                GameManager.getInstance().mm.LoadModel((String) k);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        Server server = new Server(hostName, port, "/" + rootpath, BGSServer.class);

        try {
            server.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Please press a key to stop the server.");
            running = true;
            while
                    (running) {
                Thread.yield();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            server.stop();
        }
    }
}
