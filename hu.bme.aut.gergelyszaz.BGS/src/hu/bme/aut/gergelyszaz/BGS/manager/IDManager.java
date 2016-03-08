package hu.bme.aut.gergelyszaz.BGS.manager;

import java.util.HashMap;

/**
 * Created by mad on 2016. 03. 08..
 */
public class IDManager {
    private int lastID=0;
    private HashMap<Object,Integer> idmap=new HashMap<>();

    public int getID(Object o){
        if(!idmap.containsKey(o))
        {
            idmap.put(o,++lastID);
        }
        return idmap.get(o);
    }

}
