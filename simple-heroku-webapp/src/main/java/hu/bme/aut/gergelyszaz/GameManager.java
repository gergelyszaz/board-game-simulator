package hu.bme.aut.gergelyszaz;

import java.util.ArrayList;
import java.util.Hashtable;

import hu.bme.aut.gergelyszaz.BGS.core.Game;
import hu.bme.aut.gergelyszaz.BGS.factory.GameFactory;

public class GameManager {
	GameFactory gf=new GameFactory();
	ModelManager mm=new ModelManager();
	Hashtable<String, ArrayList<Game>> games=new Hashtable<String, ArrayList<Game>>();
	public void Run()
	{
		
		mm.Initialize();
		mm.LoadAllModels();
		
		StartNewGame("TicTacToe");
		StartNewGame("Mills");
	}
	
	public void StartNewGame(String name){
		Game g=gf.CreateGame(mm.Get(name));
		if(!games.containsKey(name)){
			games.put(name, new ArrayList<Game>());
		}
		games.get(name).add(g);
	}
}
