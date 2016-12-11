package hu.gergelyszaz.BGS.action;

import hu.gergelyszaz.BGS.game.*;
import hu.gergelyszaz.BGS.manager.*;
import hu.gergelyszaz.BGS.util.FileUtil;
import hu.gergelyszaz.bGL.Model;
import org.junit.*;

import static org.junit.Assert.*;

public class ActionTest {

	private VariableManager variableManager;
	private GameImpl gameImpl;
	private InternalManager internalManager;

	public void Init(String testName) throws Exception {

		GameFactory gameFactory = new GameFactory();
		ModelManager modelManager = new ModelManager();
		Model model = modelManager.LoadModel(FileUtil.readFile(
				"/ActionTest/" + testName + ".bgl"));
		gameImpl = gameFactory.CreateGame(model);
		variableManager = gameImpl.getVariableManager();
		internalManager=gameImpl.getInternalManager();
	}

	@Test
	public void AssignmentTest() throws Exception {

		Init("AssignmentTest");
		gameImpl.Step();
		assertEquals(1, variableManager.getValue(null, "a"));
		gameImpl.Step();
		assertEquals(2, variableManager.getValue(null, "b"));
		gameImpl.Step();
		assertEquals(12, variableManager.getValue(null, "c"));
	}

	@Test
	public void DestroyTest() throws Exception {

		Init("DestroyTest");
		gameImpl.Step();
		Object token = variableManager.getReference(null, "token");
		assertNotNull(variableManager.getReference(token,
				VariableManager.TOKEN.FIELD));
		gameImpl.Step();
		//		assertNull(variableManager.getReference(token,VariableManager.TOKEN.FIELD));

	}

	@Test
	public void EndturnTest() throws Exception {

		Init("EndturnTest");
		Object player1 = variableManager.getReference(null,
				VariableManager.GLOBAL.CURRENTPLAYER);
		gameImpl.Step();
		Object player2 = variableManager.getReference(null,
				VariableManager.GLOBAL.CURRENTPLAYER);

		assertNotSame(player1, player2);
		gameImpl.Step();
		assertSame(player1,
				variableManager.getReference(null,
						VariableManager.GLOBAL.CURRENTPLAYER));
		assertEquals(0, variableManager.getValue(null, "a"));
	}

	@Test
	public void IfTest() throws Exception {

		Init("IfTest");
		while (!gameImpl.IsFinished()) {
			gameImpl.Step();
		}
		assertEquals(1, variableManager.getValue(null, "a"));
		assertEquals(1, variableManager.getValue(null, "b"));
	}

	@Test
	public void LoseTest() throws Exception {

		Init("LoseTest");
		gameImpl.Step();
		assertTrue(gameImpl.IsFinished());
	}

	@Test
	public void MovecardTest() throws Exception {

		Init("MovecardTest");
		Object deck1 = variableManager.getReference(null, "deck1");
		Object deck2 = variableManager.getReference(null, "deck2");
		assertEquals(1,
				variableManager.getReference(deck1,
						VariableManager.DECK.CARDCOUNT));
		assertEquals(0,
				variableManager.getReference(deck2,
						VariableManager.DECK.CARDCOUNT));
		gameImpl.Step();
		assertEquals(0,
				variableManager.getReference(deck1,
						VariableManager.DECK.CARDCOUNT));
		assertEquals(1,
				variableManager.getReference(deck2,
						VariableManager.DECK.CARDCOUNT));
	}

	@Test
	public void MovetokenTest() throws Exception {

		Init("MovetokenTest");

		gameImpl.Step();
		Object token = variableManager.getReference(null, "token");

		assertEquals(variableManager.getReference(null, "field1"),
				variableManager.getReference(token, "field"));
		gameImpl.Step();
		assertEquals(variableManager.getReference(null, "field2"),
				variableManager.getReference(token, "field"));

	}

	@Test
	public void RollTest() throws Exception {

		Init("RollTest");
		gameImpl.Step();
		int roll = variableManager.getValue(null, "roll");
		if (roll < 5 || roll > 6) {
			fail("Rolled: " + roll);
		}

	}

	@Test
	public void SelectTest() throws Exception {

		Init("SelectTest");
		Object field1=variableManager.getReference(null, "field1");
		Object field2=variableManager.getReference(null, "field2");

		assertEquals(0,internalManager.getSelectableManager()
				.getSelectableObjects()
				.size());
		gameImpl.Step();
		assertEquals(2,internalManager.getSelectableManager()
				.getSelectableObjects().size());
		assertTrue(internalManager.getSelectableManager().getSelectableObjects
				().contains(field1));
		assertTrue(internalManager.getSelectableManager().getSelectableObjects
				().contains(field2));
	}

	@Test
	public void ShuffleTest() throws Exception {

		Init("ShuffleTest");
		gameImpl.Step();
	}

	@Test
	public void SpawnTest() throws Exception {

		Init("SpawnTest");
		while (!gameImpl.IsFinished()) {
			gameImpl.Step();
		}

		Object token1 = variableManager.getReference(null, "token1");
		Object token2 = variableManager.getReference(null, "token2");
		Object token3 = variableManager.getReference(null, "token3");
		Object field = variableManager.getReference(null, "field");

		assertEquals(field, variableManager.getReference(token1, "field"));
		assertEquals(1, variableManager.getValue(token3, "a"));
		assertEquals(2, variableManager.getValue(token3, "b"));

	}

	@Test
	public void WhileTest() throws Exception {

		Init("WhileTest");

		int i = 0;
		while (!gameImpl.IsFinished()) {
			if (i++ > 30) {
				Assert.fail(); //The loop went on for too long
			}
			gameImpl.Step();
		}
		assertEquals(6, variableManager.getValue(null, "i"));
	}

	@Test
	public void WinTest() throws Exception {

		Init("WinTest");
		gameImpl.Step();
		assertTrue(gameImpl.IsFinished());
	}

}
