package hu.bme.aut.gergelyszaz.BGS.core

import java.util.Hashtable
import java.awt.Color
import java.util.Random

class Player {
	int ID
	Color color;
	Hashtable<String, Integer> attributes

	new(int id) {
		ID = id
		val r=new Random(id)
		color=new Color(r.nextFloat,r.nextFloat,r.nextFloat)
	}
	
	def getColor(){color}

	def Init(Hashtable<String, Integer> hashtable) {
		attributes = hashtable
	}

}
