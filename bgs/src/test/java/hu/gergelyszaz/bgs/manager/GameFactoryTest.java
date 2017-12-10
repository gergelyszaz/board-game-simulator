package hu.gergelyszaz.bgs.manager;

import hu.gergelyszaz.bGL.Model;
import hu.gergelyszaz.bgs.game.*;
import hu.gergelyszaz.bgs.util.FileUtil;
import org.junit.*;

import java.util.Map;

import static org.junit.Assert.*;

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

		Map variables = variableManager.listVariables(null);
		assertEquals(2, variables.size());
		assertTrue(variableManager.listVariables(null)
				.containsKey("currentPlayer"));
	}

	@Test
	public void CommonPlayerVariableTest() throws Exception {

		Model model = modelManager.LoadModel(FileUtil.readFile(
				"/GameFactoryTest/CommonPlayerVariableTest.bgl"));
		GameImpl game = gameFactory.CreateGame(model);
		VariableManager variableManager = game.getVariableManager();

		Map variables = variableManager.listVariables(null);
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

		Map variables = variableManager.listVariables(null);
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
	public void CardTest() throws Exception {

		Model model = modelManager.LoadModel(FileUtil.readFile(
				"/GameFactoryTest/CardTest.bgl"));
		GameImpl game = gameFactory.CreateGame(model);
		VariableManager variableManager = game.getVariableManager();

		Object deck = variableManager.getReference(null, "deck");
		Object card =
				variableManager.getReference(deck, VariableManager.DECK.TOP);

		assertEquals(deck,
				variableManager.getReference(card, VariableManager.CARD.DECK));

	}

	@Test
	public void DeckTest() throws Exception {

		Model model = modelManager.LoadModel(FileUtil.readFile(
				"/GameFactoryTest/DeckTest.bgl"));
		GameImpl game = gameFactory.CreateGame(model);
		VariableManager variableManager = game.getVariableManager();

		Object d1 = variableManager.getReference(null, "d1");
		Object d2 = variableManager.getReference(null, "d2");
		Object currentPlayer = variableManager.getReference(null,
				VariableManager.GLOBAL.CURRENTPLAYER);
		Object deck = variableManager.getReference(currentPlayer, "deck");

		assertNotNull(d1);
		assertNotNull(d2);

		assertEquals(0,
				variableManager.getValue(d1, VariableManager.DECK.CARDCOUNT));
		assertEquals(2,
				variableManager.getValue(d2, VariableManager.DECK.CARDCOUNT));

		assertNull(variableManager.getReference(d1, VariableManager.DECK.OWNER));
		assertEquals(currentPlayer,
				variableManager.getReference(deck, VariableManager.DECK.OWNER));

		assertNotNull(variableManager.getReference(d2, VariableManager.DECK.TOP));
	}

	@Test
	public void TokenTest() throws Exception {

		Model model = modelManager.LoadModel(FileUtil.readFile(
				"/GameFactoryTest/TokenTest.bgl"));
		GameImpl game = gameFactory.CreateGame(model);
		VariableManager variableManager = game.getVariableManager();

		game.Step();
		game.Step();

		Object field = variableManager.getReference(null, "F2");
		Object t2 = variableManager.getReference(null, "t2");
		Object currentPlayer = variableManager.getReference(null,
				VariableManager.GLOBAL.CURRENTPLAYER);

		assertNotNull(variableManager.getReference(null, "t1"));
		assertNotNull(t2);
		assertEquals(field, variableManager.getReference(t2, "field"));
		assertEquals(5, variableManager.getValue(t2, "a"));
		assertEquals(currentPlayer,
				variableManager.getReference(t2, VariableManager.TOKEN.OWNER));
	}
}