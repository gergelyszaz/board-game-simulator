package hu.gergelyszaz.BGS.game.internal;

import hu.gergelyszaz.BGS.game.VariableManager;

/**
 * Created by mad on 2016-03-19.
 */
public class Card {
	private VariableManager vm;
	private hu.gergelyszaz.bGL.Card cardBase;
	private Deck deck = null;

	public Card(VariableManager variableManager, hu.gergelyszaz.bGL.Card cardBase) {
		vm = variableManager;
		this.cardBase = cardBase;
	}

	public String getType() {
		return cardBase.getName();
	}

	public void SetDeck(Deck deck) {
		this.deck = deck;
		vm.store(this, "deck", deck);
	}

	public void MoveTo(Deck toDeck) {
		deck.RemoveCard(this);
		SetDeck(toDeck);
		toDeck.AddCard(this);
	}
}
