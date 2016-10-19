package hu.bme.aut.gergelyszaz.BGS.game;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mad on 2016. 10. 18..
 */
public class SelectableManager {

	private Set<Object> allObjects=new HashSet<>();
	private Set<Object> selectableObjects=new HashSet<>();

	public Iterable<? extends Object> getSelectableObjects() {

		return selectableObjects;
	}

	public void setSelectableObjects(
		 Iterable<? extends Object> selectableObjects) {

		this.selectableObjects.clear();
		selectableObjects.forEach(o -> this.selectableObjects.add(o));
	}

	public Iterable<? extends Object> getAllObjects() {

		return allObjects;
	}

	public void add(Object object) {

		allObjects.add(object);
	}

	public void remove(Object object) {

		allObjects.remove(object);
	}

	public void clear(){
		selectableObjects=new HashSet<>();
	}

	public boolean isSelectable(Object object){
		return selectableObjects.contains(object);
	}
}
