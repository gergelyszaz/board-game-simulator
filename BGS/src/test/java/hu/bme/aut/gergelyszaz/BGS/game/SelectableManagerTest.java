package hu.bme.aut.gergelyszaz.BGS.game;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static junit.framework.Assert.assertTrue;

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
        selectableManager.setSelectableObjects(o -> true);
        Set<Object> selectables=selectableManager.getSelectableObjects();
        assertTrue(selectables.size()==1);
        assertTrue(selectables.contains(object));
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


}