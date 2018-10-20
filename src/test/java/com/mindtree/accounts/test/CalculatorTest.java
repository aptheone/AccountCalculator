package com.mindtree.accounts.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.mintree.accounts.Calculator;

public class CalculatorTest {

	static Calculator calculator=null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calculator= new Calculator();
	}

	@Test
	public void testAdd() {
		int result =calculator.add(2, 10);
		assertEquals(12, result);
		
		 result =calculator.add(-2, -10);
		assertEquals(-12, result);
		
	//	fail("Not yet implemented");
	}

	@Test
	public void testSubstract() {
		int result =calculator.substract(10, 2);
		assertEquals(8, result);
		
		 result =calculator.substract(2, 10);
		assertEquals(8, result);
		//fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		int result =calculator.multiply(2, 10);
		assertEquals(20, result);
		//fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		double result =calculator.divide(10,5);
		assertEquals(2, result, 0);
		
		//fail("Not yet implemented");
	}

}
