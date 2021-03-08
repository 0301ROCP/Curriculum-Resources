package com.revature.service;

import java.util.Map;
import java.util.Set;

import com.revature.exceptions.FoodDoesNotExist;
import com.revature.models.MenuItems;
import com.revature.repository.Freezer;

public class KitchenImpl implements Kitchen{
	
	
	public KitchenImpl(Freezer coldPlace) {
		super();
		this.coldPlace = coldPlace;
	}

	Freezer coldPlace;

	@Override
	public Set<MenuItems> prepFood() {

		MenuItems tea = new MenuItems(1, "Tea", false);
		MenuItems scone = new MenuItems(2, "Coffee", true);
		
		coldPlace.addFood(tea);
		coldPlace.addFood(scone);
		
		return coldPlace.getFoods();
	}

	@Override
	public double checkFoodTime(MenuItems m) throws FoodDoesNotExist {
		
		/*
		 * Illustrating try-catch-finally block 
		 */
		
		double time = 0;
		
		Set<MenuItems> freezerFood = coldPlace.getFoods();
		
		MenuItems caviar =new  MenuItems(10, "Caviar", true);
		MenuItems scone = new MenuItems(2,"Scone",true);
		boolean i = false;
		
		try {
			if(i) {
				throw new FoodDoesNotExist();
			}
			return time;
		} catch (FoodDoesNotExist e) {
			// TODO Auto-generated catch block
			e.printStackTrace(scone.name);
			return time;
			
		} finally {
			// block of code, that runs regardless of whether an exception was thrown or not!
			System.out.println("Goodbye!");
		}
		
		
	}

	@Override
	public double calculateOrderPrice(Map<MenuItems, Integer> completedFoodOrder) {

		/*
		 * if(orderPrice < 10){
		 * 	throw new NotEnoughItems()
		 * }
		 */
		return 0;
	}

	@Override
	public void cleanUp() {
		// TODO Auto-generated method stub
		
	}

}
