package hu.gergelyszaz.BGS.game;

import hu.gergelyszaz.BGS.view.Controller;

/**
 * Created by mad on 23/10/2016.
 */
public interface Game extends Controller{

    boolean Join(String clientID) throws IllegalAccessException;

    boolean IsFull();

    void Step() throws IllegalAccessException;

    void Start() throws IllegalAccessException;

    boolean IsFinished();
}
