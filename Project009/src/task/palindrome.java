package task;

import java.util.*;

public class palindrome {
	static int i = 0;

	public static String Palindrome(String input, int leng) {
		if (input.charAt(i) != input.charAt(leng)) {
			return "회문이 아닙니다.";
		}
		if (i == input.length() / 2 - 1 || input.length() == 1)
			return "회문입니다.";
		i++;
		return Palindrome(input, leng - 1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		while (true) {
			System.out.print("판단하고자 하는 문자를 입력하세요. : ");
			input = scan.nextLine();
			if (input.length() == 0)
				break;
			int leng = input.length() - 1;
			input = input.toLowerCase();
			System.out.println(Palindrome(input, leng));
			i=0;
		}
	}
}
