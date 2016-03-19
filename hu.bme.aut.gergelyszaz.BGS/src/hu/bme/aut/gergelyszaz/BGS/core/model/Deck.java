package hu.bme.aut.gergelyszaz.BGS.core.model;

import hu.bme.aut.gergelyszaz.BGS.core.VariableManager;

import java.util.Collections;
import java.util.Stack;

/**
 * Created by mad on 2016-03-19.
 */
public class Deck {
    private Stack<Card> cards;
    VariableManager vm;
    public Deck(VariableManager variableManager, Stack<Card> cards){
        vm=variableManager;
        this.cards=cards;
    }

    public void Shuffle(){
        Collections.shuffle(cards);
        UpdateTop();
    }

    private void UpdateTop(){
        cards.peek();
        vm.StoreToObject_Name(this,"top",cards.peek());
    }

    public void RemoveCard(Card card){
        cards.remove(card);
        UpdateTop();
    }
    public void AddCard(Card card){
        cards.push(card);
    }
}
