package hu.bme.aut.gergelyszaz.BGS.manager;

import hu.bme.aut.gergelyszaz.BGS.game.*;
import hu.bme.aut.gergelyszaz.BGS.util.FileUtil;
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

	@Before
	public void setUp() throws Exception {

		gameFactory = new GameFactory();
		modelManager = new ModelManager();

	}

	@Test
	public void PlayerCountTest() throws Exception {

		Model model = modelManager.LoadModel(FileUtil.readFile(
				"/GameFactoryTest/PlayerCountTest.bgl"));
		GameImpl game = gameFactory.CreateGame(model);
		VariableManager variableManager = game.getVariableManager();

		Map variables = variableManager.getVariables(null);
		assertEquals(2, variables.size());
		assertTrue(variableManager.getVariables(null)
				.containsKey("currentPlayer"));
	}

	@Test
	public void CommonPlayerVariableTest() throws Exception {

		Model model = modelManager.LoadModel(FileUtil.readFile(
				"/GameFactoryTest/CommonPlayerVariableTest.bgl"));
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

		Model model = modelManager.LoadModel(FileUtil.readFile(
				"/GameFactoryTest/UniquePlayerVariableTest.bgl"));
		GameImpl game = gameFactory.CreateGame(model);
		VariableManager variableManager = game.getVariableManager();

		Map variables = variableManager.getVariables(null);
		assertEquals(6,
				variableManager.getReference(variableManager.getReference(null,
						"currentPlayer"), "a"));
		assertEquals(7,
				variableManager.getReference(variableManager.getReference(null,
						"currentPlayer"), "b"));
	}

	@Test
	public void FieldTest() throws Exception {

		Model model = modelManager.LoadModel(FileUtil.readFile(
				"/GameFactoryTest/FieldTest.bgl"));
		GameImpl game = gameFactory.CreateGame(model);
		VariableManager variableManager = game.getVariableManager();

		Object F1 = variableManager.getReference(null, "F1");
		Object F2 = variableManager.getReference(null, "F2");
		assertEquals(F2, variableManager.getReference(F1, "a"));
		assertEquals(F1, variableManager.getReference(F2, "a"));
	}

	@Test
	public void TokenTest() throws Exception {

		Model model = modelManager.LoadModel(FileUtil.readFile(
				"/GameFactoryTest/TokenTest.bgl"));
		GameImpl game = gameFactory.CreateGame(model);
		VariableManager variableManager = game.getVariableManager();

		game.Step();
		game.Step();

		Object field=variableManager.getReference(null,"F2");
		Object token2=variableManager.getReference(null,"T2");

		assertNotNull(variableManager.getReference(null,"T1"));
		assertNotNull(field);
		assertNotNull(token2);
		assertEquals(field,variableManager.getReference(token2,"field"));
		//assertNull(variableManager.getReference(variableManager.getReference
			//	(null,"T1"),"field"));

	}
}