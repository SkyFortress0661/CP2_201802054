package blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {

	ArrayList<String> list;
	Card card;

	CardDeck() {
		card = new Card();
		int i;
		list = new ArrayList<String>();
		for (i = 0; i < 52; i++) {
			switch (i % 13) {
			case 0:card.rank = "A";break;
			case 1:card.rank = "2";break;
			case 2:card.rank = "3";break;
			case 3:card.rank = "4";break;
			case 4:card.rank = "5";break;
			case 5:card.rank = "6";break;
			case 6:card.rank = "7";break;
			case 7:card.rank = "8";break;
			case 8:card.rank = "9";break;
			case 9:card.rank = "10";break;
			case 10:card.rank = "J";break;
			case 11:card.rank = "Q";break;
			case 12:card.rank = "K";break;
			default:break;
			}
			if (i % 13 == 0) {
				if (i == 0) {
					card.suit = "Spade";
				} else if (i == 13) {
					card.suit = "Diamond";
				} else if (i == 26) {
					card.suit = "Heart";
				} else if (i == 39) {
					card.suit = "Club";
				}
			}
			list.add("[" + card.suit + "_" + card.rank + "]");
		}
	}

	public String popCard() {
		return list.remove(0);
	}

	public void shuffle() {
		Collections.shuffle(list);
	}
}
