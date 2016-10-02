package hu.bme.aut.gergelyszaz.BGS.manager;

import java.util.HashMap;

/**
 * Created by mad on 2016. 03. 08..
 */
public class IDManager {
    private int lastID=0;
    private HashMap<Object,Integer> idmap=new HashMap<>();
    private HashMap<Integer,Object> reverseidmap=new HashMap<>();

    public int get(Object o){
        if(!idmap.containsKey(o))
        {
            ++lastID;
            reverseidmap.put(lastID,o);
            idmap.put(o,lastID);
        }
        return idmap.get(o);
    }

    public Object get(int id){
        return reverseidmap.get(id);
    }

}
