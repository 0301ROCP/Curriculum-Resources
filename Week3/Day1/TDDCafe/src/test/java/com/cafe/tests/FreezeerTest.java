package com.cafe.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.models.Food;
import com.revature.repository.Freezeer;
import com.revature.repository.FreezeerImpl;

public class FreezeerTest {
	
	
	/*
	 * 
	 * Test Driven Development (TDD)
	 * 
	 * 	1) Write a unit test
	 * 	2) Run the test -> test will fail 
	 * 	3) Fix the test by writing applicaiton code 
	 * 	4) Retest until the test passes 
	 * 	5) Repeat 
	 * 
	 * 	Following the TDD process, we will always have unit tests!
	 * 	Forces us to plan  - keeps in scope. 
	 * 	When refactoriing code, we can have more confidence because the changed source code won't 
	 * 		break existing cuntionality!
	 */
	
	static Freezeer freeze;
	static List<Food> foodList = new ArrayList<Food>();
	
	@BeforeClass
	public static void stockUpFreezer() {
		
		Food apples = new Food("apple", 1, 50);
		Food chips = new Food("chippys", 2, 500);
		Food tea = new Food("tea",1,10);
		
//		List<Food> foodList = new ArrayList<Food>();
		
		foodList.add(tea);
		foodList.add(apples);
		foodList.add(chips);
		
		
		freeze = new FreezeerImpl(foodList);
	}
	
	@AfterClass
	public static void removeDummyData() {
		freeze = null; // this is my version of deleting data!
	}
	
	@Test
	public void testSelectAllFood() {
		
//		Assert.assertArrayEquals(foodList, freeze.selectAllFood());
		
		assertTrue(freeze.selectAllFood().containsAll(foodList));
		
	}
	
	@Before
	public void resettingStock() {
		freeze = new FreezeerImpl(foodList);
	}
	
	
	
	@Test
	public void testAddFood() {
		
		// When adding an item to a database, what do we expect to happen!
		// size increase by one!
		// expect a true return 
		// you'd expect the item to be there!
		
		Food kiwi = new Food("kiwi", 1, 20);
		
		int originalSize = freeze.selectAllFood().size();
		
		assertTrue(freeze.addFood(kiwi)); //checking if the method is returning true!
		
		int newSize = freeze.selectAllFood().size();
		
		assertEquals(originalSize + 1, newSize); // a new element has been added 
		
		assertTrue(freeze.selectAllFood().contains(kiwi)); //checking that the database contains kiwi
		
		
		
		
	}
	
	@Test
	public void testRemoveFood() {
		
		
		// size of the "db" should be one less element 
		// db should not contain the food item!
		
		Food tea = foodList.get(0);
		
		assertTrue(freeze.removeFood(tea)); //expecting to get a true and apples to be remove
		
		assertFalse(freeze.selectAllFood().contains(tea)); //making sure database doesn't contain that element!
		
		
	}

}
