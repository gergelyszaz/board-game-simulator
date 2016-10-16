package hu.bme.aut.gergelyszaz.BGS.core.action;

import hu.bme.aut.gergelyszaz.BGS.core.Game;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class LoseAction implements Action{
    private final Game game;

    public LoseAction(Game game) {
        this.game=game;
    }

    @Override
    public void Execute() throws IllegalAccessException {
        game.Lose();
    }
}
