package com.revature.repository;

import java.util.HashSet;
import java.util.Set;

import com.revature.models.MenuItems;

public class FreezerImplButBetter implements Freezer{
	
	/*
	 * Example of a modified Freezer that does a better implementation of our Freezer: 
	 * 		e.g. better performance, more items, etc. 
	 * 
	 * By implementing Freezer, we still know what methods are available to us.
	 */

	@Override
	public Set<MenuItems> getFoods() {
		// TODO Auto-generated method stub
		MenuItems scones = new MenuItems(2,"Scone",true);
		MenuItems cupcakes = new MenuItems(2,"Cupcakes",true);
		MenuItems tea = new MenuItems(1,"Tea",false);
		MenuItems coffee  = new MenuItems(1,"Coffee",false);
		MenuItems milkshake = new MenuItems(1,"MilkShake",false);

		Set<MenuItems> setOfItems = new HashSet<>();
		
		setOfItems.add(milkshake);
		setOfItems.add(coffee);
		setOfItems.add(tea);
		setOfItems.add(cupcakes);
		setOfItems.add(scones);
		setOfItems.add(milkshake);
		setOfItems.add(coffee);
		setOfItems.add(tea);
		setOfItems.add(cupcakes);
		setOfItems.add(scones);
		
		return setOfItems;
	}

	@Override
	public boolean addFood(MenuItems m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeFood(MenuItems m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateFood(MenuItems oldFood, double newPrice) {
		// TODO Auto-generated method stub
		return false;
	}

}
