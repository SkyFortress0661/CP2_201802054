package practice;

public class Power {
	public static float power(float input1, int input2) {
		if (input2 == 0)
			return 1;
		if (input2 < 0) 
			return 1 / input1 * power(input1, input2 + 1);
		return input1 * power(input1, input2 - 1);
	}

	public static void main(String[] args) {
		System.out.println("5 to the 0 is " + power(5, 0));
		System.out.println("4 to the 1 is " + power(4, 1));
		System.out.println("8 to the 2 is " + power(8, 2));
		System.out.println("7 to the 3 is " + power(7, 3));
		System.out.println("3 to the 4 is " + power(3, 4));
		System.out.println("5 to the -1 is " + power(5, -1));
	}
}
