package com.revature.repository;

import java.util.Set;

import com.revature.models.MenuItems;

public interface Freezer {
	
	
	public Set<MenuItems> getFoods();
	
	
	public boolean addFood(MenuItems m);
	
	public boolean removeFood(MenuItems m);
	
	public boolean updateFood(MenuItems oldFood, double newPrice);

}
