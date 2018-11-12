package practice;

public class Fibonacci {
	public static int fibonacci(int n) {
		if (n <= 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		int n = 15;
		System.out.println(n + "번째 달까지의 토끼 쌍의 증가 : ");
		for (int i = 1; i <= n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}
}
