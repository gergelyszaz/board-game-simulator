package hu.gergelyszaz.bgs.game;

import hu.gergelyszaz.bgs.view.Controller;

/**
 * Created by mad on 23/10/2016.
 */
public interface Game extends Controller{

    boolean Join(String clientID) throws IllegalAccessException;

    boolean IsFull();
    
    boolean IsNotWaitingForInput();

    void Step() throws IllegalAccessException;

    void Start() throws IllegalAccessException;

    boolean IsFinished();

	void Disconnect(String clientID);
}
