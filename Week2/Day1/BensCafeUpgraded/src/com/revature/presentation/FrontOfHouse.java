package com.revature.presentation;

import java.util.Map;
import java.util.Set;

import com.revature.models.MenuItems;

public interface FrontOfHouse {
	
	void greetingCustomer();
	
	void showMenu();
	
	void collectOrder();
	
	void showCompleteOrder(Map<String,Integer> orderDetails);

}
