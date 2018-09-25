package Calculator;

public class BasicCalculator{
	public BasicCalculator() {
		
	}
	public int addition(int a, int b) {
		return a+b;
		
	}
	public int substraction(int a, int b) {
		return a-b;
			
	}
	public int multiplication(int a, int b) {
		return a*b;
		
	}
	public int division(int a, int b) {
		if(b==0) {
			b=0;
			return b;
		}
		return a/b;		
	}
}