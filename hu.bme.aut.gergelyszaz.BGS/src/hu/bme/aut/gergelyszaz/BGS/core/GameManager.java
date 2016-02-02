package hu.bme.aut.gergelyszaz.BGS.core;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import hu.bme.aut.gergelyszaz.BGS.core.Game;
import hu.bme.aut.gergelyszaz.BGS.factory.GameFactory;


public class GameManager {
	GameFactory gf=new GameFactory();
	public ModelManager mm=new ModelManager();
	public Hashtable<String, Game> availableGames=new Hashtable<String, Game>();
	public Hashtable<String, Game> playerConnections=new Hashtable<String, Game>();
	public List<Game> runningGames=new ArrayList<Game>();
	
	public GameManager()
	{
		Initialize();
	}
	
	public void Initialize(){
		mm.Initialize();
		mm.LoadAllModels();
	}
	
	
	
	public void JoinGame(String clientID, String gameName) throws Exception{
		if(availableGames.get(gameName)==null){
			availableGames.put(gameName, gf.CreateGame(mm.Get(gameName)));
		}
		Game g=availableGames.get(gameName);
		g.Join(clientID);
		playerConnections.put(clientID, g);
		if(g.IsFull()){
			availableGames.remove(gameName);
			runningGames.add(g);
		}
		
	}
	
	
}
