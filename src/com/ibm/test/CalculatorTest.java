package com.ibm.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.ibm.Calculator;


public class CalculatorTest {

	@Test
	public void addDigitsTest() {
		Calculator calculator = new Calculator();
		int expectedResult = calculator.addDigits(120, 120);
		int actualResult = 240;
		Assertions.assertEquals(new Integer(expectedResult), new Integer(actualResult));
	}
	  
	@Test
	public void subtractDigitsTest() {
		Calculator calculator = new Calculator();
		int expectedResult = calculator.subtractDigits(500, 400);
		int actualResult = 100;
		Assertions.assertEquals(new Integer(expectedResult), new Integer(actualResult));
	}
	
	@Test
	public void multiDigitsTest() {
		Calculator calculator = new Calculator();
		int expectedResult = calculator.multiplicationDigits(10, 20);
		int actualResult = 200;
		Assertions.assertEquals(new Integer(expectedResult), new Integer(actualResult));
	}
	
	@Test
	public void divisionDigitsTest() {
		Calculator calculator = new Calculator();
		int expectedResult = calculator.divisioDigits(100, 20);
		int actualResult = 5;
		Assertions.assertEquals(new Integer(expectedResult), new Integer(actualResult));
	}
}