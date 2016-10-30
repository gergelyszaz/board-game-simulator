package hu.bme.aut.gergelyszaz.BGS.game;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by mad on 22/10/2016.
 */
public class SelectableManagerTest {

    SelectableManager selectableManager;


    @Before
    public void setUp() throws Exception {
        selectableManager=new SelectableManager();
    }

    @Test
    public void getSelectableObjects() throws Exception {
        selectableManager.getSelectableObjects();

    }

    @Test
    public void setSelectableObjects() throws Exception {
        Object object=new Object();
        selectableManager.add(object);
        selectableManager.setSelectableObjects(o -> true, "name");
        Set<Object> selectables=selectableManager.getSelectableObjects();
        assertTrue(selectables.size()==1);
        assertTrue(selectables.contains(object));
        assertFalse(selectableManager.isSelectionDone());
    }

    @Test
    public void add() throws Exception {
        selectableManager.add(new Object());
    }

    @Test
    public void remove() throws Exception {
        Object object=new Object();
        selectableManager.remove(object);
        selectableManager.add(object);
        selectableManager.remove(object);
    }

    @Test
    public void getSelectableName()throws Exception {
        assertEquals("",selectableManager.getSelectableName());
    }
}