package hu.bme.aut.gergelyszaz.BGS.core.model;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Field {
	public Set<Field> getNeighbors() {
		return neighbors;
	}
	public String getName() {
		return name;
	}

	Set<Field> neighbors=new HashSet<>();
	int x,y,z;
	String name;
	public void Init(hu.bme.aut.gergelyszaz.bGL.Field field, HashMap<String,Field> fields) {

		name=field.getName();
		field.getNeighbours().forEach(field1 -> neighbors.add(fields.get(field1.getName())));
	}


}
