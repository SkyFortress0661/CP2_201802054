package chocolatejargame;

import java.util.Random;
import java.util.Scanner;

public class ChocolateJarMain {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		ChocolateJar chocolateJar = new ChocolateJar();
		int user, count = 1;
		System.out.println("게임을 시작합니다.");
		System.out.println("항아리에는 지금 " + chocolateJar.getItem() + "개가 있습니다.");
		System.out.println(chocolateJar.status());
		System.out.println("1~3개의 아이템을 꺼낼 수 있으며 칠리를 꺼내면 패배합니다.");
		System.out.println("시작!");
		while (true) {
			System.out.println();
			System.out.println("+------"+count+"번째턴------+");
			System.out.print("몇개를 뽑을까요?(1~3) : ");
			user = scan.nextInt();
			if (user < 1 || user > 3) {
				System.out.println("양이 적거나 많습니다.");
				continue;
			}
			if(chocolateJar.getChocolate()<user) {
				System.out.println("플레이어가 남은 초콜릿을 모두 꺼냈습니다.");
			}
			else {
				System.out.println("플레이어는 " + user + "개의 초콜릿을 꺼냈습니다.");
			}
			chocolateJar.takeItem(user);
			System.out.println(chocolateJar.status());
			if(chocolateJar.isEmpty()==true){
				System.out.println("플레이어 승리!!");
				break;
			}
			int maxtake = Math.min(3, chocolateJar.getItem() - 1);
			int take = random.nextInt(1000) % maxtake % 3 + 1;
			if(chocolateJar.getChocolate()<take) {
				System.out.println("컴퓨터가 남은 초콜릿을 모두 꺼냈습니다.");
			}
			else {
				System.out.println("컴퓨터는 " + take + "개의 초콜릿을 꺼냈습니다.");
			}
			chocolateJar.takeItem(take);
			System.out.println(chocolateJar.status());
			count++;
			if(chocolateJar.isEmpty()==true){
				System.out.println("컴퓨터 승리!!");
				break;
			}
		}
		scan.close();
	}
}
