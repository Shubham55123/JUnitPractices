package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.ibm.Calculator1;

public class Calculator1Test {

	@Test
	public void testAdd() {
		Calculator1 calculator = new Calculator1();
		int a = 23454;
		int b = 23446;
		int actual = calculator.add(a, b);
		int expected = 46900;
		Assertions.assertEquals(new Integer(expected), new Integer(actual));
		//assertEquals(expected, actual);
	}
	
	@Test
	public void testsubtract() {
		Calculator1 calculator = new Calculator1();
		int a = 1000;
		int b = 500;
		int actual = calculator.subtract(a, b);
		int expected = 500;
		assertEquals(expected, actual);
	}
	
 }