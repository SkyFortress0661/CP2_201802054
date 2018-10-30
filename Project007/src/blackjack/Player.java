package blackjack;

import java.util.ArrayList;

public class Player {
	ArrayList<String> hand;
	public int score;

	public Player() {
		CardDeck c = new CardDeck();
		hand = new ArrayList<String>();
		score = 0;
	}

	public void PutOnACard(String compS) {
		String compNum = "";
		hand.add(compS);
		char comp = 0;
		int count = 1;
		for (int i = 1; i < compS.length(); i++) {
			comp = compS.charAt(i - 1);
			if (comp == '_')
				break;
			count++;
		}
		for (int i = count; i < compS.length(); i++) {
			comp = compS.charAt(i);
			if (comp == ']')
				break;
			compNum += comp;
		}
		if (compNum.equals("A") && score < 11)
			score += 11;
		else if (compNum.equals("A") && score >= 11)
			score += 1;
		else if (compNum.equals("2"))
			score += 2;
		else if (compNum.equals("3"))
			score += 3;
		else if (compNum.equals("4"))
			score += 4;
		else if (compNum.equals("5"))
			score += 5;
		else if (compNum.equals("6"))
			score += 6;
		else if (compNum.equals("7"))
			score += 7;
		else if (compNum.equals("8"))
			score += 8;
		else if (compNum.equals("9"))
			score += 9;
		else if (compNum.equals("10") || compNum.equals("J") || compNum.equals("Q") || compNum.equals("K"))
			score += 10;
	}

	public String ShowCard() {
		String condition = "{";
		for (int i = 0; i < hand.size(); i++) {
			condition += " " + hand.get(i);
		}
		condition += " }";
		return condition;
	}
}
