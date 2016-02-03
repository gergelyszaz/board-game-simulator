package hu.bme.aut.gergelyszaz.BGS.Server

import hu.bme.aut.gergelyszaz.BGS.state.GameState
import org.json.JSONArray
import org.json.JSONObject

class GameToJsonSerializer {
	static def JSONObject JSONify(GameState state){
		val ret=new JSONObject
		ret.put("name",state.name)
		ret.put("turncount",state.turncount)
		val players=new JSONArray
		for(p:state.players){
			val player=new JSONObject
			player.put("ID",p)
			players.put(player)
		}
		ret.put("players",players)
		val fields=new JSONArray
		for(f:state.fields){
			val field=new JSONObject
			field.put("ID",f.id)
			field.put("x",f.x)
			field.put("y",f.y)
			field.put("z",f.z)
			field.put("neighbours",state)
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
		return ret
	}
}