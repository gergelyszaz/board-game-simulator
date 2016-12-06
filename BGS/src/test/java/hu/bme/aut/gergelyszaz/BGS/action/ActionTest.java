package hu.bme.aut.gergelyszaz.BGS.action;

import hu.bme.aut.gergelyszaz.BGS.game.*;
import hu.bme.aut.gergelyszaz.BGS.manager.*;
import hu.bme.aut.gergelyszaz.BGS.util.FileUtil;
import hu.bme.aut.gergelyszaz.bGL.Model;
import org.junit.*;

import static org.junit.Assert.*;

public class ActionTest {

	private VariableManager variableManager;
	private GameImpl gameImpl;

	@Test
	public void AssignmentTest() throws Exception {

		Init("AssignmentTest");
		Assert.fail();
	}

	public void Init(String testName) throws Exception {

		GameFactory gameFactory = new GameFactory();
		ModelManager modelManager = new ModelManager();
		Model model = modelManager.LoadModel(FileUtil.readFile(
				"/ActionTest/" + testName + ".bgl"));
		gameImpl = gameFactory.CreateGame(model);
		variableManager = gameImpl.getVariableManager();
	}

	@Test
	public void DestroyTest() throws Exception {

		Init("DestroyTest");
		Assert.fail();
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
		Assert.fail();
	}

	@Test
	public void MovetokenTest() throws Exception {

		Init("MovetokenTest");
		Assert.fail();
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
	public void ShuffleTest() throws Exception {

		Init("ShuffleTest");
		Assert.fail();
	}

	@Test
	public void SpawnTest() throws Exception {

		Init("SpawnTest");
		Assert.fail();
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
