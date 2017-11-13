package hu.gergelyszaz.bgs.action;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class ActionManagerTest {

	ActionManager actionManager;
	List<Action> actions;
	Action firstAction;
	Action secondAction;

	@Test(expected = IllegalAccessError.class)
	public void emptyList() throws Exception {

		ActionManager actionManager = new ActionManager();
		actionManager.step();

	}

	@Test
	public void fullCycle() throws Exception {

		assertEquals(null, actionManager.getCurrentAction());
		actionManager.step();
		assertEquals(firstAction, actionManager.getCurrentAction());
		actionManager.step();
		assertEquals(secondAction, actionManager.getCurrentAction());
		actionManager.step();
		assertEquals(firstAction, actionManager.getCurrentAction());
	}

	@Test
	public void setNextAction() throws Exception {

		actionManager.step();
		assertEquals(firstAction, actionManager.getCurrentAction());
		actionManager.setNextAction(firstAction);
		assertEquals(firstAction, actionManager.getCurrentAction());
	}

	@Before
	public void setUp() throws Exception {

		firstAction = mock(Action.class);
		secondAction = mock(Action.class);

		actions = new ArrayList<>(Arrays.asList(
			 firstAction, secondAction
		));

		actionManager = new ActionManager();
		actionManager.setActions(actions);

	}

}