package hu.bme.aut.gergelyszaz.BGS.action;

import hu.bme.aut.gergelyszaz.bGL.Action;
import hu.bme.aut.gergelyszaz.bGL.NestedAction;
import org.eclipse.emf.common.util.BasicEList;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class ActionManagerTest {

	@Test
	public void step() throws Exception {

	}

	@Test
	public void getCurrentAction() throws Exception {

	}

	@Test
	public void setNextAction() throws Exception {

	}

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



}