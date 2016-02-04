package hu.bme.aut.gergelyszaz.BGS.server;

import hu.bme.aut.gergelyszaz.BGS.state.FieldState;
import hu.bme.aut.gergelyszaz.BGS.state.GameState;
import hu.bme.aut.gergelyszaz.BGS.state.TokenState;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@SuppressWarnings("all")
public class GameStateToJson {
  public static JSONObject JSONify(final GameState state) {
    final JSONObject ret = new JSONObject();
    String _name = state.getName();
    ret.put("name", _name);
    int _turncount = state.getTurncount();
    ret.put("turnCount", _turncount);
    List<String> _players = state.getPlayers();
    ret.put("players", _players);
    final JSONArray fields = new JSONArray();
    List<FieldState> _fields = state.getFields();
    for (final FieldState f : _fields) {
      {
        final JSONObject field = new JSONObject();
        field.put("ID", f.id);
        field.put("x", f.x);
        field.put("y", f.y);
        field.put("z", f.z);
        field.put("neighbors", f.neighbours);
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
    List<Integer> _selectables = state.getSelectables();
    ret.put("selectables", _selectables);
    return ret;
  }
}
