package hu.gergelyszaz.bgs.game;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Manages selectable objects
 * Created by mad on 2016. 10. 18..
 */
public class SelectableManager {

	private Set<Object> allObjects=new HashSet<>();
	private List<Object> selectableObjects=new ArrayList<>();
	private String selectableName="";
	private boolean isSelectionDone=true;

	public List<Object> getSelectableObjects() {
		return selectableObjects;
	}

	public void setSelectableObjects(Predicate<? super Object> predicate, String toVar) {
		selectableObjects=allObjects.stream().filter(predicate).collect
				(Collectors.toList());
		if(selectableObjects.isEmpty())
			throw new RuntimeException("Nothing selectable");
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

	public boolean notWaitingForSelection() {
		return isSelectionDone;
	}

	public void finishSelection() {
		isSelectionDone=true;
	}
}
