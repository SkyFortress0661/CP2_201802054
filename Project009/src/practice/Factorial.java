package practice;

public class Factorial {
	public static long factorial(int input) {
		long result = 1;
		for (int i = 1; i <= input; i++) {
			result *= i;
		}
		return result;
	}

	public static long factorialfor(int input) {
		if (input <= 1)
			return 1;
		return input * factorialfor(input - 1);
	}

	public static void main(String[] args) {
		System.out.println("The value of 5! should be " + 5 * 4 * 3 * 2 * 1);
		System.out.println("The value of 5! is " + factorial(5));
		System.out.println("The value of 0! should be 1");
		System.out.println("The value of 0! is " + factorial(0));
		System.out.println("--------------------------");
		System.out.println("The value of 5! should be " + 5 * 4 * 3 * 2 * 1);
		System.out.println("The value of 5! is " + factorialfor(5));
		System.out.println("The value of 0! should be 1");
		System.out.println("The value of 0! is " + factorialfor(0));
	}
}
