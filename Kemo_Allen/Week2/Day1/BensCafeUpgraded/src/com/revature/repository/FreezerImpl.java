package com.revature.repository;

import java.util.HashSet;
import java.util.Set;

import com.revature.models.MenuItems;

public class FreezerImpl implements Freezer{
	
	private Set<MenuItems> stock; //HAS a stock - Set<MenuItems>

	
	/*
	 * get methods  - READ
	 * 
	 * add methods  - CREATE
	 * 
	 * delete methods - DELETE
	 * 
	 * update methods - UPDATE
	 */
	
	
	@Override
	public Set<MenuItems> getFoods() {
		return this.stock;
	}

	@Override
	public boolean addFood(MenuItems m) {
	
//		if(this.stock.add(m)) {
//			return true;
//			//If food is added, then the method will return true;
//		}else {
//			return false;
//			//If food is not added, then the method will return false;
//		}
		
		return this.stock.add(m);
	}

	
	@Override
	public boolean removeFood(MenuItems m) {
		return this.stock.remove(m);
	}
	
	@Override
	public boolean updateFood(MenuItems oldFood, double newPrice) {
		return false;
		
	}

}
