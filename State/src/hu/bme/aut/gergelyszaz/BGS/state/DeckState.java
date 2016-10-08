package hu.bme.aut.gergelyszaz.BGS.state;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mad on 2016-03-27.
 */
public class DeckState {
	public int id;
	public List<CardState> cards = new ArrayList<>();
	public int owner = -1;
	public int visible = 2; //0 private, 1 protected, 2 public

	public DeckState CopyWithHiddenCards(DeckState ds) {
		cards = new ArrayList<>();
		for (int i = 0; i < ds.cards.size(); i++) {
			cards.add(new CardState(-1, ""));
		}
		visible = ds.visible;
		return this;
	}
}
