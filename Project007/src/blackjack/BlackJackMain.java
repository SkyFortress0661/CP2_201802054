package blackjack;

import java.util.*;

public class BlackJackMain {

	public static void main(String[] args) {
		Dealer d = new Dealer();
		Player p = new Player();
		Scanner scan = new Scanner(System.in);
		char conti = 0;
		String special = "";
		System.out.println("--- [BlackJack] ---");
		System.out.println("딜러가 덱을 셔플합니다.");
		System.out.println("딜러가 카드를 받습니다.");
		System.out.println("플레이어에게 카드 2장을 줍니다.");
		d.DealerHand();
		p.PutOnACard(d.cd.popCard());
		p.PutOnACard(d.cd.popCard());
		while (true) {
			if (p.score > 21) {
				special = "Burst!!";
				break;
			}
			System.out.println("<현재 카드 상태>");
			System.out.println("Dealer : " + d.HideCard());
			System.out.println("Player : " + p.ShowCard() + " / Score : " + p.score);
			System.out.print("카드를 더 받으시겠습니까?(y/n) : ");
			conti = scan.next().charAt(0);
			if (conti == 'y') {
				p.PutOnACard(d.cd.popCard());
			} else if (conti == 'n') {
				System.out.println();
				break;
			} else {
				System.out.println("다시 입력하시오.");
			}
			System.out.println();
		}
		System.out.println("승패를 결정합니다!!");
		if (p.score > d.score && p.score <= 21)
			System.out.println("플레이어의 승리");
		else
			System.out.println("딜러의 승리");
		if (p.hand.size() == 2 && p.score == 21)
			special = "BlackJack!!";
		System.out.println("<모든 카드 공개>");
		System.out.println("Dealer : " + d.ShowCard() + " / Score : " + d.score);
		System.out.println("Player : " + p.ShowCard() + " / Score : " + p.score + " " + special);
	}
}
