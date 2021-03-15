package com.revature.service;

import java.util.List;
import java.util.Map;

import com.revature.models.Food;
import com.revature.repository.Freezeer;

public class KitchenImpl implements Kitchen {
	
	private Freezeer kitchenFreezer;
	
	

	public KitchenImpl(Freezeer kitchenFreezer) {
		super();
		this.kitchenFreezer = kitchenFreezer;
	}

	@Override
	public double calculateOrder(Map<Food, Integer> order) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Food> displayAllFood() {
	/*
	 * bunch of business logic
	 */
		
		return kitchenFreezer.selectAllFood();
	}

	@Override
	public List<Food> displayDiscountFood() {
		// TODO Auto-generated method stub
		return null;
	}

}
