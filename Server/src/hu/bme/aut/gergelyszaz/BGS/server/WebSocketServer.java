package hu.bme.aut.gergelyszaz.BGS.server;

import hu.bme.aut.gergelyszaz.BGS.manager.ModelManager;
import org.glassfish.tyrus.server.Server;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebSocketServer {

    private static Properties configFile = new Properties();
    private static Logger logger = Logger.getLogger(WebSocketServer.class.getName());
    private static volatile boolean running = false;
    private static Server server = null;

    public static boolean isRunning() {
        return running;
    }

    public static void stopServer() {
        if (running) {
            server.stop();
            server = null;
            running = false;
        }
    }

    public static boolean runServer(String hostName, int port, String rootpath, String gamesPath) {
        running=true;
        try {
            server = new Server(hostName, port, "/" + rootpath, BGSServer.class);
            InputStream input = WebSocketServer.class.getResourceAsStream(gamesPath);
            configFile.load(input);
            for (Object k : configFile.values()) {
                System.out.println((String) k);
                String gameString=new String(Files.readAllBytes(Paths.get(ModelManager.class.getResource((String) k).toURI())));
                GameManagerSingleton.getGameManagerInstance().modelManager.LoadModel(gameString);
            }
            server.start();
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage());
            running = false;
        } finally {
            return  running;
        }
    }

    public static void main(String[] args){
        logger.log(Level.INFO, "Starting server");

        int port=8025;
        String portString=System.getenv("PORT");
        if(portString!=null){
            port=Integer.parseInt(portString);
        }
        WebSocketServer.runServer("0.0.0.0", port, "websockets", "/config/games.properties");
        logger.log(Level.INFO, "Server Started");
        while(WebSocketServer.isRunning()){
            Thread.yield();
        }
    }
}
