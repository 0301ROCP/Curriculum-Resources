package com.revature.repository;

import java.util.List;

import com.revature.models.Food;

public interface Freezeer {
	
	public List<Food> selectAllFood();
	
	public boolean addFood(Food f);
	
	public boolean removeFood(Food f);
	
	public void updateFood(Food f);

}
