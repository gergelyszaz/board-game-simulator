package hu.gergelyszaz.bgs.action;

import java.util.List;

/**
 * Created by mad on 2016. 10. 09..
 */
public class ActionManager {

	private List<Action> actions;
	private Action currentAction;
	private Action nextAction;

	public void setActions(List<Action> actions){
		this.actions=actions;
	}

	public ActionManager() {
		currentAction=null;
		nextAction=null;
		actions=null;
	}

	/**
	 * Sets currentAction to the next action in the list.
	 * If the end is reached, goes back to the first action, and returns true.
	 * @return
	 */
	public boolean step(){
		if(actions==null||actions.isEmpty()){
			throw new IllegalAccessError("Action list cannot be empty");
		}

		if(nextAction!=null){
			currentAction=nextAction;
			nextAction=null;
			return false;
		}

		if(currentAction==null){
			currentAction=actions.get(0);
			return false;
		}

		int nextIndex=actions.lastIndexOf(currentAction)+1;

		if(nextIndex>=actions.size()){
			nextIndex=0;
		}
		currentAction=actions.get(nextIndex);

		return nextIndex==0;
	}

	public Action getCurrentAction(){
		return  currentAction;
	}

	public void setNextAction(Action action){
		this.nextAction=action;
	}

	public void reset() {
		currentAction=null;
	}
}
