package com.revature.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.exceptions.PressedWrongButton;
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

	
	static Calculator calc;
	
	
	@BeforeClass //declares a setup method that runs once, before all other methods in the class!
	public static void initialSetup() { //method has to be static, because it's invoked before the class is instantiated.
		calc = new Calculator();
		
		System.out.println("Initial setup!");
	}
	
	@AfterClass 
	public static void finishingUp() {
		System.out.println("Everything is done!!!!!");
	}
	
	
	@Before // declares a setup method that runs before each test method
	public void beforeEachMethodSetup() {
		
		calc = new Calculator(); //resetting the calculator by pointing somewhere else in memory 
		
		System.out.println("--------------------------");
		System.out.println(" BEfore each method!!!!");
		System.out.println("--------------------------");
	}
	
	@After // declares a tear-down method that runs after each test method
	public void afterEachMethodTearDown() {
		System.out.println("--------------------------");
		System.out.println(" After each method!!!");
		System.out.println("--------------------------");
	}
	

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
		
//		Calculator calc = new Calculator();
		
		assertEquals(5, calc.minus(10, 5));
		assertEquals(10, calc.minus(20, 10));
		
		assertNotEquals(11, calc.minus(2, 7));
		assertNotEquals(12, calc.minus(27, 4));
		assertNotEquals(56, calc.minus(200, 7));
		
	}
	
	@Test
	public void testIsEven() {
		
//		Calculator calc = new Calculator();
		
		assertEquals(true, calc.isEven(2));
		assertEquals(true, calc.isEven(20));
		assertEquals(true, calc.isEven(202));
		
		assertNotEquals(true, calc.isEven(31));
		
		assertTrue(calc.isEven(4));
		assertFalse(calc.isEven(73));
		
	}
	
	@Test
	public void testToggleMagic() {
		
//		Calculator calc = new Calculator();
		
		assertFalse(calc.magic);
		
		calc.toggleMagic();
		
		assertTrue(calc.magic);
		
	}
	
	@Test(expected = PressedWrongButton.class)
	public void testPressingMethod() {
		
		calc.pressingButtons();
	}
}
