package com.revature.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.revature.maths.Calculator;


public class CalculatorTest {
	
	/*
	 * Why do we test in the first place? 
	 * 
	 * 	Testing allows us to have checks to ensure that our cide is working. We can create automated tests, 
	 * 	so that during a development lifecycle we can check our code regularly without hindering the flow. 
	 * 	An example of tests are unit tests and integration testing. 
	 * 
	 * What is JUnit?
	 * 
	 * 	JUnit is a testing framework. It provides us with the methods that makes our lives easier!
	 */


	@Test //We need to provide metate to the JVM to tell it, that the follwing method is a testing method
	public void testAdd() {
		
		Calculator calc = new Calculator();
		
		assertEquals(5, calc.add(2, 3));
		assertEquals(0, calc.add(0, 0));
		assertEquals(15, calc.add(10, 5));
		
//		assertEquals(7, calc.add(3, 3)); //REALLY IMPORTANT TO MAKE SURE THAT YOUR UNIT TESTS CORRECT
		
		
		assertEquals(6, calc.add(1.0,2.00,3.000),0.0001); // 5.9999 < actual value < 6.0001
		
		assertEquals(20, calc.add(15.00001,2.00,3.000),0.001); // 5.9999 < actual value < 6.0001
	}
	
	@Test
	public void testMinus() {
		
		Calculator calc = new Calculator();
		
		assertEquals(5, calc.minus(10, 5));
		assertEquals(10, calc.minus(20, 10));
		
		assertNotEquals(11, calc.minus(2, 7));
		assertNotEquals(12, calc.minus(27, 4));
		assertNotEquals(56, calc.minus(200, 7));
		
	}
	
	@Test
	public void testIsEven() {
		
		Calculator calc = new Calculator();
		
		assertEquals(true, calc.isEven(2));
		assertEquals(true, calc.isEven(20));
		assertEquals(true, calc.isEven(202));
		
		assertNotEquals(true, calc.isEven(31));
		
	}
}
