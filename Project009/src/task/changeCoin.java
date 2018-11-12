package task;

public class changeCoin {
	int count = 0;
	int type = 0;
	int[] coins = { 1, 5, 10, 25, 50 };

	public int calCoinCase(int money, int coin) {
		for (int i = 0; i <= money / coins[coin - 1]; i++) {
			if (money == 0 || coin == 1) {
				type++;
				break;
			}
			calCoinCase(money - coins[coin - 1] * i, coin - 1);
		}
		return type;
	}
	
	public int minimalCase(int money, int coin) {
		int i = money / coins[coin - 1];
		count += i;
		if (money == 0 || coin == 1) {
			return count;
		}
		return minimalCase(money - coins[coin - 1] * i, coin - 1);
	}

	public static void main(String[] args) {
		changeCoin cc = new changeCoin();
		System.out.println("동전은 1, 5, 10, 25, 50원의 종류가 있다.");
		System.out.println(1425 + "원을 " + 5 + "종류의 동전으로 나누는 방법은 " + cc.calCoinCase(1425, 5) + "가지 이고");
		System.out.println("최소 동전의 수로 나눌 때, 동전의 개수는 " + cc.minimalCase(1425, 5) + "개이다.");
	}
}