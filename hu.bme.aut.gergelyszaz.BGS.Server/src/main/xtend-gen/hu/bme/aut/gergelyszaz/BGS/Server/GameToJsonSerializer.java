package hu.bme.aut.gergelyszaz.BGS.Server;

import hu.bme.aut.gergelyszaz.BGS.state.FieldState;
import hu.bme.aut.gergelyszaz.BGS.state.GameState;
import hu.bme.aut.gergelyszaz.BGS.state.TokenState;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@SuppressWarnings("all")
public class GameToJsonSerializer {
  public static JSONObject JSONify(final GameState state) {
    final JSONObject ret = new JSONObject();
    String _name = state.getName();
    ret.put("name", _name);
    int _turncount = state.getTurncount();
    ret.put("turncount", _turncount);
    final JSONArray players = new JSONArray();
    List<String> _players = state.getPlayers();
    for (final String p : _players) {
      {
        final JSONObject player = new JSONObject();
        player.put("ID", p);
        players.put(player);
      }
    }
    ret.put("players", players);
    final JSONArray fields = new JSONArray();
    List<FieldState> _fields = state.getFields();
    for (final FieldState f : _fields) {
      {
        final JSONObject field = new JSONObject();
        field.put("ID", f.id);
        field.put("x", f.x);
        field.put("y", f.y);
        field.put("z", f.z);
        field.put("neighbours", state);
        fields.put(field);
      }
    }
    ret.put("fields", fields);
    final JSONArray tokens = new JSONArray();
    List<TokenState> _tokens = state.getTokens();
    for (final TokenState t : _tokens) {
      {
        final JSONObject token = new JSONObject();
        token.put("ID", t.id);
        token.put("ownerID", t.owner);
        token.put("fieldID", t.field);
        tokens.put(token);
      }
    }
    ret.put("tokens", tokens);
    return ret;
  }
}
