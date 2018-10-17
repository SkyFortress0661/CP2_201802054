package practice;

import java.util.Scanner;

public class DivideByZero {
	public static void main(String[] args) {
		int x, y;
		Scanner scan = new Scanner(System.in);

		System.out.print("피젯수 : ");
		x = scan.nextInt();
		System.out.print("젯수 : ");
		y = scan.nextInt();

		try {
			int result = x / y;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("프로그램은 계속 진행 됩니다.");
	}
}
