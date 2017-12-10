package hu.gergelyszaz.bgs.game.internal;

import hu.gergelyszaz.bgs.game.VariableManager;

/**
 * Created by Gergely Száz
 */
public class Card {

	private final String cardType;
	private VariableManager vm;
	private Deck deck = null;

	public Card(VariableManager variableManager, String cardType) {
		vm = variableManager;
		this.cardType = cardType;
	}

	public String getType() {
		return cardType;
	}

	public void SetDeck(Deck deck) {
		this.deck = deck;
		vm.store(this, VariableManager.CARD.DECK, deck);
	}

	public void MoveTo(Deck toDeck) {
		deck.RemoveCard(this);
		SetDeck(toDeck);
		toDeck.AddCard(this);
	}
}
