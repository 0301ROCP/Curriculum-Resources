package com.revature.presentation;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import com.revature.models.MenuItems;
import com.revature.service.Kitchen;

public class FrontOfHouseImpl implements FrontOfHouse{
	
	
	
	public FrontOfHouseImpl(Kitchen kitchen) {
		super();
		this.kitchen = kitchen;
	}

	public Kitchen kitchen;

	@Override
	public void greetingCustomer() {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to my Cafe, here's the list of items: ");
		
		this.showMenu();
		
	}

	@Override
	public void showMenu() {
		
		Set<MenuItems> myMenu = kitchen.prepFood();
		
		for(MenuItems i: myMenu) { //Anything iterable can follow the enhanced for loop
			System.out.println("Food: " + i.name + " | Price: $" + i.price);
		}
		
		this.collectOrder();
		
	}
	
	

	@Override
	public void showCompleteOrder(Map<String,Integer> orderDetails) {
		
		for(Entry<String,Integer> item: orderDetails.entrySet()) {
			System.out.println("Food " + item.getKey() + " and the amount " + item.getValue());
		}
		
	}

	@Override
	public void collectOrder() {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 
		 */
		sc.close();
		
	}

}
