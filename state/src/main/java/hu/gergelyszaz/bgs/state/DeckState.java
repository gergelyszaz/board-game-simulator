package hu.gergelyszaz.bgs.state;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mad on 2016-03-27.
 */
public class DeckState extends AbstractState{
	public List<CardState> cards = new ArrayList<>();
	public int owner = -1;
	public int visible = 2; //0 private, 1 protected, 2 public

	public DeckState CopyWithHiddenCards(DeckState ds) {
		cards = new ArrayList<>();
		for (int i = 0; i < ds.cards.size(); i++) {
			CardState cardState=new CardState();
			cardState.type="";
			cardState.id=-1;
			cards.add(new CardState());
		}
		visible = ds.visible;
		return this;
	}
}
