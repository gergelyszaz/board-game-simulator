package hu.bme.aut.gergelyszaz.BGS.action;

import java.util.List;

/**
 * Created by mad on 2016. 10. 09..
 */
public class ActionManager {

	private final List<Action> actions;

	private Action currentAction;
	private Action nextAction;

	public ActionManager(List<Action> actions){
		this.actions=actions;
		currentAction=null;
		nextAction=null;
	}

	/**
	 * Sets currentAction to the next action in the list.
	 * If the end is reached, goes back to the first action, and returns true.
	 * @return
	 */
	public boolean step(){
		if(nextAction!=null){
			currentAction=nextAction;
			nextAction=null;
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


}
