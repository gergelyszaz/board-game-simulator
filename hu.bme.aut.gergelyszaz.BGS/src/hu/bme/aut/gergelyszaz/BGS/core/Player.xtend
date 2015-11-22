package hu.bme.aut.gergelyszaz.BGS.core

import java.awt.Color
import java.util.Random

class Player {
	int ID
	Color color

	new(int id) {
		ID = id
		val r=new Random(id)
		color=new Color(r.nextFloat,r.nextFloat,r.nextFloat)
	}
	
	def getColor(){color}

}
