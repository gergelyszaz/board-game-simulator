package hu.bme.aut.gergelyszaz.BGS.state;

import java.util.HashMap;

/**
 * Generates and manages small ids for objects.
 * An object is retrievable by id and an object has only one id
 * Used for simple
 * Created by mad on 2016. 03. 08..
 */
public class IDManager {
	private int lastID = 0;
	private HashMap<Object, Integer> idmap = new HashMap<>();
	private HashMap<Integer, Object> reverseidmap = new HashMap<>();

	/**
	 * Returns the id of object
	 * @param object
	 * @return
	 */
	public int get(Object object) {
		if (!idmap.containsKey(object)) {
			++lastID;
			reverseidmap.put(lastID, object);
			idmap.put(object, lastID);
		}
		return idmap.get(object);
	}

	public Object get(int id) {
		return reverseidmap.get(id);
	}

}
