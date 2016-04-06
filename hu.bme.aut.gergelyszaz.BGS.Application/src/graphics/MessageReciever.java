package graphics;

import com.google.gson.Gson;
import hu.bme.aut.gergelyszaz.BGS.client.BGSClient;
import hu.bme.aut.gergelyszaz.BGS.client.IMessageReciever;
import hu.bme.aut.gergelyszaz.BGS.state.DeckState;
import hu.bme.aut.gergelyszaz.BGS.state.GameState;
import org.json.JSONObject;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by mad on 2016. 04. 01..
 */
public class MessageReciever implements IMessageReciever {
    Stack<GameState> states = new Stack<GameState>();


    public boolean IsEmpty(){
        return states.isEmpty();
    }

    public GameState getCurrentState(){
        return states.peek();
    }

    public MessageReciever(){
        states.add(
                new GameState("", 0, 0, -1, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(),
                        new ArrayList(),new ArrayList<DeckState>()));
    }


    public void addStateReciever(IStateReciever sr){
        recieverList.add(sr);
    }

    BGSClient client;
    public BGSClient getClient(){return client;}
    public void setClient(BGSClient c) {
        client = c;
    }
    Set<IStateReciever> recieverList=new HashSet<IStateReciever>();
    @Override
    public void RecieveMessage(JSONObject obj) {
        System.out.println(obj.toString());
        Gson gson = new Gson();
        if (obj.getString("name") == null) return;
        GameState state = gson.fromJson(obj.toString(), GameState.class);
        states.push(state);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                for(IStateReciever reciever:recieverList){
                    reciever.UpdateGameState(state);
                }

            }
        });
    }

    public void SendSelect(int id){
        client.SendMessage(
                new JSONObject().put("action", "select").put("parameter", id)
        );
    }
}
