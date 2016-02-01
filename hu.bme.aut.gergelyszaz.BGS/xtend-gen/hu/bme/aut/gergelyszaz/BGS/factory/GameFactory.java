package hu.bme.aut.gergelyszaz.BGS.factory;

import hu.bme.aut.gergelyszaz.BGS.core.Game;
import hu.bme.aut.gergelyszaz.BGS.core.Player;
import hu.bme.aut.gergelyszaz.bGL.Model;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GameFactory {
  public Game CreateGame(final Model model) {
    Game _xblockexpression = null;
    {
      final Game game = new Game();
      final ArrayList<Player> players = new ArrayList<Player>();
      for (int id = 0; (id < model.getPlayer().getPlayercount()); id++) {
        {
          final Player player = new Player((id + 1));
          players.add(player);
        }
      }
      String _name = model.getName();
      game.Init(_name, players, model);
      _xblockexpression = game;
    }
    return _xblockexpression;
  }
}
