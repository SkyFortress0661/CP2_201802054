package Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		BasicCalculator cal = new BasicCalculator();
		
		System.out.println("13과 20을 더한 결과 입니다. : "+cal.addition(13,20));
		System.out.println("242과 123을 뺀 결과 입니다. : "+cal.substraction(242,123));
		System.out.println("56과 75을 곱한 결과 입니다. : "+cal.multiplication(56,75));
		System.out.println("362과 94을 나눈 결과 입니다. : "+cal.division(362,94));
		System.out.println("349과 0을 나눈 결과 입니다. : "+cal.division(349,0));
	}

}
