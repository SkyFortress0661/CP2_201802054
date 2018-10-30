package blackjack;

import java.util.ArrayList;

public class Dealer extends Player{
	CardDeck cd;
	public Dealer() {
		cd = new CardDeck();
		cd.shuffle();
	}
	public String HideCard() {
		String condition = "{";
		for(int i = 0;i<hand.size();i++) {
			if(i>0) {
				condition+=" [####_#]";
				continue;
			}
			condition += " " + hand.get(i);
		}
		condition += " }";
		return condition;
	}
	public void DealerHand() {
		while(score<16) {
			PutOnACard(cd.popCard());
		}
	}
}
