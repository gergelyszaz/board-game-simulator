package hu.bme.aut.gergelyszaz.BGS.core


import hu.bme.aut.gergelyszaz.bGL.Field

class Token {
	public String type
	public Field field=null
	public Player owner=null
	
	new(String t) {
		type = t
	}


}
