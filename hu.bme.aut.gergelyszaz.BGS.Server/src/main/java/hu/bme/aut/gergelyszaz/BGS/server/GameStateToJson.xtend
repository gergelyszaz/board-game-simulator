package hu.bme.aut.gergelyszaz.BGS.server

import hu.bme.aut.gergelyszaz.BGS.state.GameState
import org.json.JSONArray
import org.json.JSONObject

class GameStateToJson {
	static def JSONObject JSONify(GameState state){
		val ret=new JSONObject
		ret.put("name",state.name)
		ret.put("version",state.version)
		ret.put("turnCount",state.turncount)
		ret.put("players",state.players)
		val fields=new JSONArray
		for(f:state.fields){
			val field=new JSONObject
			field.put("ID",f.id)
			field.put("x",f.x)
			field.put("y",f.y)
			field.put("z",f.z)
			field.put("neighbors",f.neighbours)
			fields.put(field)
		}
		ret.put("fields",fields)
		val tokens=new JSONArray
		for(t:state.tokens){
			val token=new JSONObject
			token.put("ID",t.id)
			token.put("ownerID",t.owner)
			token.put("fieldID",t.field)
			tokens.put(token)
		} 
		ret.put("tokens",tokens)
		ret.put("selectables",state.selectables)
		return ret
	}
}