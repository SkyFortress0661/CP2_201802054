package Calculator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Calculator.BasicCalculator;

class BasicCalculatorTest {

	@Test
	void testAddition() {
		BasicCalculator bc = new BasicCalculator();
		assertEquals(32, bc.addition(12, 20));
	}

	@Test
	void testSubstraction() {
		BasicCalculator bc = new BasicCalculator();
		assertEquals(-8, bc.substraction(12, 20));
	}

	@Test
	void testMultiplication() {
		BasicCalculator bc = new BasicCalculator();
		assertEquals(240, bc.multiplication(12, 20));
	}

	@Test
	void testDivision() {
		BasicCalculator bc = new BasicCalculator();
		assertEquals(5, bc.division(100, 20));
	}
	
	@Test
	void testDivisionZero() {
		BasicCalculator bc = new BasicCalculator();
		assertEquals(0, bc.division(153, 0));
	}

}
