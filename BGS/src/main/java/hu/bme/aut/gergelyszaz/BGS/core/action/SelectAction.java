package hu.bme.aut.gergelyszaz.BGS.core.action;

import hu.bme.aut.gergelyszaz.BGS.core.Game;
import hu.bme.aut.gergelyszaz.BGS.core.VariableManager;
import hu.bme.aut.gergelyszaz.BGS.manager.IDManager;
import hu.bme.aut.gergelyszaz.bGL.Action;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class SelectAction extends AbstractAction {

    private final Game game;
    private final IDManager idManager;

    public SelectAction(VariableManager variableManager, Action action, IDManager idManager, Game game) {
        super(variableManager,action);
        this.game=game;
        this.idManager=idManager;
    }

    @Override
    public void Execute() throws IllegalAccessException {
        Set<Integer> ids=new HashSet<>();

        for (Object o : game.getObjects()) {
            variableManager.Store(null, VariableManager.THIS, o);
            if (variableManager.Evaluate(action.getCondition())) {
                ids.add(idManager.get(o));
            }
        }

        game.setSelectableObjects(ids);
    }
}
