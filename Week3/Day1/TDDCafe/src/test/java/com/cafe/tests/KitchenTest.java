package com.cafe.tests;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.revature.models.Food;
import com.revature.repository.Freezeer;
import com.revature.service.Kitchen;
import com.revature.service.KitchenImpl;

public class KitchenTest {
	
	
	static Kitchen kitchen; // service layer , we're not mocking this because we don't want a perfect kitchen
							// we want one that doesn't work if the applicaiton isn't working!
	
	@Mock
	static Freezeer freezer; // Dao layer 
	
	@BeforeClass
	public static void setup() {
		
		freezer = Mockito.mock(Freezeer.class); // Mockito know to handle it! 
		
		//This is me creating a fakeFood list!
		List<Food> fakeyfakeList = new ArrayList<>();
		Food fakeFood = new Food("fake food", 10, 1000);
		fakeyfakeList.add(fakeFood);
		
		//when i invoke .selectAllFood() , I tell it to return a fake list
		Mockito.when(freezer.selectAllFood()).thenReturn(fakeyfakeList);
		
		//when i invoke .removeFood() , I tell it to return a true
		Mockito.when(freezer.removeFood(fakeFood)).thenReturn(true);
		
		
		Mockito.when(freezer.removeFood(null)).thenThrow(new NullPointerException());
		
		kitchen = new KitchenImpl(freezer);
		
	}
	
	@Test
	public void testDisplayMenu() {
		
		assertNotNull(kitchen.displayAllFood()); // I'm checking I get something!
		
		
	}

}
