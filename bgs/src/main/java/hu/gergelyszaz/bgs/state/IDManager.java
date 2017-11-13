package hu.gergelyszaz.bgs.state;

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
	 * Returns the id of object. It is generated at the first call.
	 * One object has one id and vica versa.
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

	/**
	 * Returns the object with the given id. If there is no object with that
	 * id (yet) an exception is thrown.
	 * @param id
	 * @return
	 */
	public Object get(int id)
	{
		Object object=reverseidmap.get(id);
		if(object==null) throw new IllegalAccessError(object+" has no ID " +
			 "yet");
		return object;
	}

}
