package hu.gergelyszaz.bgs.action;

import hu.gergelyszaz.bgs.action.impl.*;
import hu.gergelyszaz.bgs.game.InternalManager;
import hu.gergelyszaz.bgs.game.VariableManager;
import hu.gergelyszaz.bgs.state.IDManager;
import hu.gergelyszaz.bGL.AttributeName;
import hu.gergelyszaz.bGL.NestedAction;
import hu.gergelyszaz.bGL.Token;
import org.eclipse.emf.common.util.BasicEList;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by mad on 2016. 10. 25..
 */
public class ActionFactoryTest {

	ActionFactory actionFactory;
	hu.gergelyszaz.bGL.Action assingmentAction, destroyAction,
		 endTurnAction, ifAction, loseAction, moveAction, rollAction,
		 selectAction,
		 shuffleAction, spawnAction, whileAction, winAction;

	@Before
	public void setUp() throws Exception {

		actionFactory = new ActionFactory(mock(VariableManager.class), mock(
			 IDManager.class), mock(ActionManager.class),
			 mock(InternalManager.class));



		assingmentAction = mock(hu.gergelyszaz.bGL.Action.class);
		when(assingmentAction.getName()).thenReturn(null);

		NestedAction nestedAction=mock(NestedAction.class);
		when(nestedAction.getActions()).thenReturn(new BasicEList(Arrays.asList
			 (assingmentAction)));

		destroyAction = mock(hu.gergelyszaz.bGL.Action.class);
		when(destroyAction.getName()).thenReturn(ActionFactory.DESTROY);

		endTurnAction = mock(hu.gergelyszaz.bGL.Action.class);
		when(endTurnAction.getName()).thenReturn(ActionFactory.ENDTURN);

		ifAction = mock(hu.gergelyszaz.bGL.Action.class);
		when(ifAction.getName()).thenReturn(ActionFactory.IF);
		when(ifAction.getNestedAction()).thenReturn(nestedAction);

		loseAction = mock(hu.gergelyszaz.bGL.Action.class);
		when(loseAction.getName()).thenReturn(ActionFactory.LOSE);

		moveAction = mock(hu.gergelyszaz.bGL.Action.class);
		when(moveAction.getName()).thenReturn(ActionFactory.MOVE);

		rollAction = mock(hu.gergelyszaz.bGL.Action.class);
		when(rollAction.getName()).thenReturn(ActionFactory.ROLL);

		selectAction = mock(hu.gergelyszaz.bGL.Action.class);
		when(selectAction.getName()).thenReturn(ActionFactory.SELECT);
		AttributeName attributeName = mock(AttributeName.class);
		when(attributeName.getName()).thenReturn("X");
		when(selectAction.getToVar()).thenReturn(attributeName);

		shuffleAction = mock(hu.gergelyszaz.bGL.Action.class);
		when(shuffleAction.getName()).thenReturn(ActionFactory.SHUFFLE);

		spawnAction = mock(hu.gergelyszaz.bGL.Action.class);
		when(spawnAction.getName()).thenReturn(ActionFactory.SPAWN);
		Token token = mock(Token.class);
		when(spawnAction.getToken()).thenReturn(token);

		whileAction = mock(hu.gergelyszaz.bGL.Action.class);
		when(whileAction.getName()).thenReturn(ActionFactory.WHILE);
		when(whileAction.getNestedAction()).thenReturn(nestedAction);

		winAction = mock(hu.gergelyszaz.bGL.Action.class);
		when(winAction.getName()).thenReturn(ActionFactory.WIN);

	}

	@Test
	public void createAction() throws Exception {

		assertTrue(actionFactory
			 .createAction(assingmentAction) instanceof AssignmentAction);

		assertTrue(actionFactory.createAction(destroyAction) instanceof
			 DestroyAction);
		assertTrue(actionFactory.createAction(endTurnAction) instanceof
			 EndTurnAction);
		assertTrue(actionFactory.createAction(ifAction) instanceof IfAction);
		assertTrue(actionFactory.createAction(loseAction) instanceof LoseAction);
		assertTrue(actionFactory.createAction(moveAction) instanceof MoveAction);
		assertTrue(actionFactory.createAction(rollAction) instanceof RollAction);
		assertTrue(actionFactory.createAction(selectAction) instanceof
			 SelectAction);
		assertTrue(actionFactory.createAction(shuffleAction) instanceof
			 ShuffleAction);
		assertTrue(actionFactory.createAction(spawnAction) instanceof
			 SpawnAction);
		assertTrue(actionFactory.createAction(whileAction) instanceof
			 WhileAction);
		assertTrue(actionFactory.createAction(winAction) instanceof WinAction);
	}

	@Test
	public void createWhileActionSequence() throws Exception {
		List<Action> actions=actionFactory.createActionSequence(Arrays.asList
			 (whileAction));
		assertTrue(actions.size()==4);
		assertTrue(actions.get(0) instanceof WhileAction);
		assertTrue(actions.get(1) instanceof AssignmentAction);
		assertTrue(actions.get(2) instanceof GotoAction);
		assertTrue(actions.get(3) instanceof NopAction);
	}

	@Test
	public void createIfActionSequence() throws Exception {
		List<Action> actions=actionFactory.createActionSequence(Arrays.asList
			 (ifAction));
		assertTrue(actions.size()==3);
		assertTrue(actions.get(0) instanceof IfAction);
		assertTrue(actions.get(1) instanceof AssignmentAction);
		assertTrue(actions.get(2) instanceof NopAction);
	}

	@Test
	public void createEmptySequnce() throws Exception {
		List<Action> actions=actionFactory.createActionSequence(Arrays.asList
			 ());
		assertTrue(actions.size()==1);
		assertTrue(actions.get(0) instanceof NopAction);
	}
}