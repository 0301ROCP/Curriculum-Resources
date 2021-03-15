package com.revature.repository;

import java.util.List;

import com.revature.models.Food;

public class FreezeerImpl implements Freezeer { //Going to be hardcoding a lot of this. "FoodDao"
	
	//replacement database
	private List<Food> stock;
	
	


	public FreezeerImpl(List<Food> stock) {
	super();
	this.stock = stock;
}


	@Override
	public List<Food> selectAllFood() {
//		return this.stock;
		return null;
	}


	@Override
	public boolean addFood(Food f) {
		return this.stock.add(f);
	}


	@Override
	public boolean removeFood(Food f) {
		return this.stock.remove(f);
	}


	@Override
	public void updateFood(Food f) {
		// TODO Auto-generated method stub
		
	}

}
