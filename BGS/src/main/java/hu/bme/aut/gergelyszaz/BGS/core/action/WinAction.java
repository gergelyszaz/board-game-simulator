package hu.bme.aut.gergelyszaz.BGS.core.action;

import hu.bme.aut.gergelyszaz.BGS.core.Game;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class WinAction implements Action{
    private final Game game;

    public WinAction(Game game) {
        this.game=game;
    }

    @Override
    public void Execute() throws IllegalAccessException {
        game.Win();
    }
}
