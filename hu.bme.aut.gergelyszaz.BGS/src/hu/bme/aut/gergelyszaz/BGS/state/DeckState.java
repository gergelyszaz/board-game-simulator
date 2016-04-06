package hu.bme.aut.gergelyszaz.BGS.state;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mad on 2016-03-27.
 */
public class DeckState {
    public int id;
    public List<CardState> cards=new ArrayList<>();
    public int owner=-1;

}
