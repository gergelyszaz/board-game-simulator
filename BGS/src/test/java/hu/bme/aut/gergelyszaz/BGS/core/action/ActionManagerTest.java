package hu.bme.aut.gergelyszaz.BGS.core.action;

import hu.bme.aut.gergelyszaz.bGL.NestedAction;
import org.eclipse.emf.common.util.BasicEList;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import hu.bme.aut.gergelyszaz.bGL.Action;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class ActionManagerTest {

    List<Action> actions;
    Action nestedAction;
    Action firstAction;
    Action secondAction;
    @Before
    public void setUp() throws Exception {

        firstAction=mock(Action.class);
        secondAction=mock(Action.class);
        nestedAction=mock(Action.class);
        NestedAction nested=mock(NestedAction.class);
        when(secondAction.getNestedAction()).thenReturn(
                nested
        );
        when(secondAction.getNestedAction().getActions()).thenReturn(
                new BasicEList<>(Arrays.asList(nestedAction))
        );

        actions=new ArrayList<>(Arrays.asList(
                firstAction,secondAction
        ));

    }

    @Test
    public void getCurrentActionEmpty() throws Exception {
        ActionManager actionManager=new ActionManager(new ArrayList<>());
        Action action=actionManager.getCurrentAction();
        assertEquals(null,action);
    }

    @Test
    public void getCurrentAction() throws Exception {
        ActionManager actionManager=new ActionManager(actions);
        Action action=actionManager.getCurrentAction();
        assertEquals(firstAction,action);
    }

    @Test
    public void step() throws Exception {
        ActionManager actionManager=new ActionManager(actions);
        actionManager.Step();
        Action action=actionManager.getCurrentAction();
        assertEquals(secondAction,action);
    }

    @Test
    public void reset() throws Exception {
        ActionManager actionManager=new ActionManager(actions);
        actionManager.Step();
        actionManager.reset();
        Action action=actionManager.getCurrentAction();
        assertEquals(firstAction,action);
    }

    @Test
    public void stepIntoNested() throws Exception {
        ActionManager actionManager=new ActionManager(actions);
        actionManager.Step();
        actionManager.stepIntoNested();

        //Does not actually step in
        Action action=actionManager.getCurrentAction();
        assertEquals(secondAction,action);

        //Only at the next step
        actionManager.Step();
        action=actionManager.getCurrentAction();
        assertEquals(nestedAction,action);

        //No more nested actions, step out
        actionManager.Step();
        action=actionManager.getCurrentAction();
        assertEquals(secondAction,action);
    }

    @Test
    public void fullTurn()throws Exception {
        ActionManager actionManager=new ActionManager(actions);
        for(Action ignored :actions){
            actionManager.Step();
        }
        actionManager.Step();
        Action action=actionManager.getCurrentAction();
        assertEquals(secondAction,action);
    }

}