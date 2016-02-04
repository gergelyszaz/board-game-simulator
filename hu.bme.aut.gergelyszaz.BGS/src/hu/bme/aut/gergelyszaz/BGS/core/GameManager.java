package hu.bme.aut.gergelyszaz.BGS.core;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import hu.bme.aut.gergelyszaz.BGS.factory.GameFactory;


public class GameManager implements Runnable{
	GameFactory gf=new GameFactory();
	public ModelManager mm=new ModelManager();
	public Hashtable<String, Game> availableGames=new Hashtable<String, Game>();
	public Hashtable<String, Game> playerConnections=new Hashtable<String, Game>();
	public List<Game> runningGames=new ArrayList<Game>();
	
	private GameManager()
	{
		
	}
	
	private static GameManager gm=null;
	public static GameManager getInstance(){
		
		if(gm==null) {
			gm=new GameManager();
			gm.Initialize();
			new Thread(gm).start();;
		}
		
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
		//TODO what happens if multiple clients try connect at the same time
		Game g=availableGames.get(gameName);
		g.Join(clientID);
		playerConnections.put(clientID, g);
		if(g.IsFull()){
			availableGames.remove(gameName);
			g.Start();
			runningGames.add(g);
			
		}
		return g;
	}
	
	
	
	@Override
	public void run()
	{
		while(true){
			List<Game> rg=runningGames;
			for(Game g:rg){
				g.Step();
				if(g.IsFinished()) runningGames.remove(g);
			}
			Thread.yield();
		}
	}

}
