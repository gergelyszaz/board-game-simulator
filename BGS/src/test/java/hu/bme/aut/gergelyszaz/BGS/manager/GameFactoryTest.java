package hu.bme.aut.gergelyszaz.BGS.manager;

import hu.bme.aut.gergelyszaz.BGS.game.*;
import hu.bme.aut.gergelyszaz.bGL.Model;
import org.junit.*;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by gergely.szaz on 2016. 10. 30..
 */
public class GameFactoryTest {

	GameFactory gameFactory;
	ModelManager modelManager;
	String rules = "GAME TestGame\n" + "PLAYERS 2{" + "variable=10" + " } \n" +
			"BOARD {\n" + "    x=1\n" + "\tF1{tokenCount=2}\n" + "}\n" +
			"TOKEN token{}\n" + "RULES {\n" + "}";

	@Before
	public void setUp() throws Exception {

		gameFactory = new GameFactory();
		modelManager = new ModelManager();

	}

	@Test
	public void PlayerCountTest() throws Exception {

		Model model = modelManager.LoadModel(
				"GAME PlayerCountTest PLAYERS 1 {} BOARD { RULES {}}");
		GameImpl game = gameFactory.CreateGame(model);
		VariableManager variableManager = game.getVariableManager();

		Map variables = variableManager.getVariables(null);
		assertEquals(2, variables.size());
		assertTrue(variableManager.getVariables(null)
				.containsKey("currentPlayer"));
	}

	@Test
	public void CommonPlayerVariableTest() throws Exception {

		Model model = modelManager.LoadModel(
				"GAME PlayerVariableTest PLAYERS 1 {a=5 b=9} BOARD { RULES {}}");
		GameImpl game = gameFactory.CreateGame(model);
		VariableManager variableManager = game.getVariableManager();

		Map variables = variableManager.getVariables(null);
		assertEquals(2, variables.size());
		assertEquals(5,
				variableManager.getReference(variableManager.getReference(null,
						"currentPlayer"), "a"));
		assertEquals(9,
				variableManager.getReference(variableManager.getReference(null,
						"currentPlayer"), "b"));
	}

	@Test
	public void UniquePlayerVariableTest() throws Exception {

		Model model = modelManager.LoadModel(
				"GAME PlayerVariableTest PLAYERS 4 {a=5 b=9 } BOARD { RULES {}}");
		GameImpl game = gameFactory.CreateGame(model);
		VariableManager variableManager = game.getVariableManager();

		Map variables = variableManager.getVariables(null);
		assertEquals(2, variables.size());
		assertEquals(5,
				variableManager.getReference(variableManager.getReference(null,
						"currentPlayer"), "a"));
		assertEquals(9,
				variableManager.getReference(variableManager.getReference(null,
						"currentPlayer"), "b"));
	}
}