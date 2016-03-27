package hu.bme.aut.gergelyszaz.BGS.core.model;

import hu.bme.aut.gergelyszaz.BGS.core.VariableManager;

/**
 * Created by mad on 2016-03-19.
 */
public class Card {
    private VariableManager vm;
    private hu.bme.aut.gergelyszaz.bGL.Card cardBase;
    public Card(VariableManager variableManager, hu.bme.aut.gergelyszaz.bGL.Card cardBase){
        vm=variableManager;
        this.cardBase=cardBase;
    }
    private Deck deck;

    public void MoveTo(Deck toDeck){
        deck.RemoveCard(this);
        deck=toDeck;
        vm.StoreToObject_Name(this,"deck",deck);
        toDeck.AddCard(this);
    }
}
