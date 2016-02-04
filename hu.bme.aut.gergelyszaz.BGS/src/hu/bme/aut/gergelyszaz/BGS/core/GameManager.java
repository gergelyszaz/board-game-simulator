package hu.bme.aut.gergelyszaz.BGS.core;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import hu.bme.aut.gergelyszaz.BGS.core.Game;
import hu.bme.aut.gergelyszaz.BGS.factory.GameFactory;
import hu.bme.aut.gergelyszaz.BGS.state.GameState;


public class GameManager {
	GameFactory gf=new GameFactory();
	public ModelManager mm=new ModelManager();
	public Hashtable<String, Game> availableGames=new Hashtable<String, Game>();
	public Hashtable<String, Game> playerConnections=new Hashtable<String, Game>();
	public List<Game> runningGames=new ArrayList<Game>();
	
	private GameManager()
	{
		Initialize();
	}
	
	private static GameManager gm=null;
	public static GameManager getInstance(){
		
		if(gm==null) gm=new GameManager();
		return gm;
	}
	
	public void Initialize(){
		mm.Initialize();
		mm.LoadAllModels();
	}
	
	
	
	public IController JoinGame(String clientID, String gameName) throws Exception{
		if(playerConnections.contains(clientID)) return playerConnections.get(clientID);
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
		return g;
	}
	
	public GameState getCurrentState(String clientID){
		Game g=playerConnections.get(clientID);
		g.SaveCurrentState();
		return g.getCurrentState(clientID);
	}
	
	public void Run()
	{
		while(true){
			for(Game g:runningGames){
				g.Step();
			}
			Thread.yield();
		}
	}
	
}
