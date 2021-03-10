package com.revature.service;

import java.util.Map;
import java.util.Set;

import com.revature.exceptions.FoodDoesNotExist;
import com.revature.models.MenuItems;

public interface Kitchen {
	
	
	Set<MenuItems> prepFood(); //for example if foodName is not valid, order is not complete, "false" is returned. 
	
	double checkFoodTime(MenuItems m) throws FoodDoesNotExist;
	
	double calculateOrderPrice(Map<MenuItems, Integer> completedFoodOrder);
	
	void cleanUp();
	
	

}
