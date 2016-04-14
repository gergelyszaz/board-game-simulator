package graphics;

import hu.bme.aut.gergelyszaz.BGS.state.CardState;
import hu.bme.aut.gergelyszaz.BGS.state.DeckState;
import hu.bme.aut.gergelyszaz.BGS.state.GameState;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

/**
 * Created by mad on 2016. 04. 13..
 */
public class CardPanel extends JPanel implements IStateReciever {
    HashMap<DeckState,DefaultListModel> deckListModels=new HashMap<>();

    DefaultListModel<String> selectableCardsModel=new DefaultListModel<>();
    public CardPanel(){
        JList<String> cardlist=new JList<>();
        this.add(new JLabel("Selectables: "));
        cardlist.setModel(selectableCardsModel);
        cardlist.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(cardlist.getModel().getSize()<1) return;
                client.SendSelect(Integer.parseInt(cardlist.getSelectedValue()));
            }
        } );
        this.add(cardlist);
    }

    MessageReciever client;
    public void setMessageReciever(MessageReciever c){
        client=c;
    }
    @Override
    public void UpdateGameState(GameState state) {
        for(DeckState ds: state.getDecks()){
            if(!deckListModels.containsKey(ds)){
                DefaultListModel<String> dsm=new DefaultListModel<>();
                deckListModels.put(ds,dsm);
                JScrollPane scrollPane=new JScrollPane(new JList<>(dsm));

                scrollPane.setMinimumSize(new Dimension(100,100));

                add(scrollPane);
            }

            DefaultListModel<String> cardsModel=deckListModels.get(ds);
                for(CardState cs:ds.cards) {
                    String text=cs.id+": "+ cs.type;
                    if (!cardsModel.contains(text)){
                        cardsModel.addElement(text);
                    }
                }
        }

        if(state.getCurrentplayer()==state.getPlayerID()){
            for(int id:state.getSelectables()) {


                if (!selectableCardsModel.contains(id+"")) {
                    selectableCardsModel.addElement(id+"");
                }
            }
        }
    }
}
