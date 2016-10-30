package hu.bme.aut.gergelyszaz.BGS.game;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Manages selectable objects
 * Created by mad on 2016. 10. 18..
 */
public class SelectableManager {

	private Set<Object> allObjects=new HashSet<>();
	private Set<Object> selectableObjects=new HashSet<>();
	private String selectableName="";
	private boolean isSelectionDone=true;

	public Set<Object> getSelectableObjects() {
		return selectableObjects;
	}

	public void setSelectableObjects(Predicate<? super Object> predicate, String toVar) {
		selectableObjects=allObjects.stream().filter(predicate).collect(Collectors.toSet());
		selectableName=toVar;
		isSelectionDone=false;
	}

	public void add(Object object) {

		allObjects.add(object);
	}

	public void remove(Object object) {

		allObjects.remove(object);
	}

	public String getSelectableName(){
		return selectableName;
	}

	public boolean isSelectionDone() {
		return isSelectionDone;
	}

	public void finishSelection() {
		isSelectionDone=true;
	}
}
