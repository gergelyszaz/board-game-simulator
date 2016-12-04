package hu.bme.aut.gergelyszaz.BGS.action;

import hu.bme.aut.gergelyszaz.BGS.game.*;
import hu.bme.aut.gergelyszaz.BGS.manager.*;
import hu.bme.aut.gergelyszaz.BGS.util.FileUtil;
import hu.bme.aut.gergelyszaz.bGL.Model;
import org.junit.*;

import java.util.Map;

import static org.junit.Assert.*;

public class ActionTest {

	GameFactory gameFactory;
	ModelManager modelManager;

	@Before
	public void setUp() throws Exception {
		gameFactory = new GameFactory();
		modelManager = new ModelManager();
	}

	@Test
	public void SpawnTest(){
		
	}

}
