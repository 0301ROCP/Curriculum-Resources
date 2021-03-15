package com.revature.service;

import java.util.List;
import java.util.Map;

import com.revature.models.Food;

public interface Kitchen {
	
	
	public double calculateOrder(Map<Food,Integer> order);
	
	public List<Food> displayAllFood();
	
	public List<Food> displayDiscountFood();

}
