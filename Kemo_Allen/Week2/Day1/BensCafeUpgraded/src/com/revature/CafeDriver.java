package com.revature;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.revature.models.MenuItems;

public class CafeDriver {
	
	static void entry() {};
	
	/*
	 * What would be useful data stuctures to have?
	 * 
	 * 	SET
	 * 
	 * 	LIST
	 * 
	 *  QUEUE
	 * 
	 * 	MAP 
	 */
	
	static Set<MenuItems> preppingFood() {
		
	
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
		
		
		
		
		return setOfItems;
		
	}
	
	static void greetinCustomer(Set<MenuItems> myMenu) {
		System.out.println("Welcome to my Cafe, here's the list of items: ");
		
		for(MenuItems i: myMenu) { //Anything iterable can follow the enhanced for loop
			System.out.println("Food: " + i.name + " | Price: $" + i.price);
		}
		
	}
	
	public static void main(String[] args) {
		
		
		
		//Create my menu
		Set<MenuItems> myMenu = preppingFood();
		
		
		//provide an interactive menu for the customer
		greetinCustomer(myMenu);
		
		//allow them to order and track it 
		boolean ordering = true; //we start of by ordering food!
		Scanner sc = new Scanner(System.in);
		int totalPrice = 0;
	
		
		//With a Map we can have key value pairs: (Scones):(number of Scones)
		Map<String,Integer> orderDetails = new HashMap<>(); // Don't need to use LinkedHashMap or a TreeMap
		
		
		while(ordering) {
		
			System.out.println("What would you like?");
			String orderedItemString = sc.nextLine();
			
			System.out.println("How much would you like?");
			String amountString = sc.nextLine();
			int amount = Integer.parseInt(amountString);
			
			for(MenuItems m: myMenu) {
				
				if(m.name.toLowerCase().equals(orderedItemString)) {
					totalPrice+= m.price*amount;
					
					orderDetails.put(m.name, amount);
					
					System.out.println(totalPrice);
					
		
				}
				
			}
			
			System.out.println("Are you done? ");
			String done = sc.nextLine();
			
			if(done.equals("yes")) {
				ordering = false;
			}
		}
		
		System.out.println("Here's your total price: " + totalPrice);
		System.out.println("Here are all the items you ordered");
		
		//Map does not implement Iterable (I) 
		orderDetails.keySet(); //Set of STrings
		orderDetails.values(); //Collection of Integers
		orderDetails.entrySet(); //Returns a Set of Entry values
		
		
		
//		entry(); //lowercase with a parenthesis, method
//		entry; // variable 
//		Entry; //Class 
		
		for(Entry<String,Integer> item: orderDetails.entrySet()) {
			System.out.println("Food " + item.getKey() + " and the amount " + item.getValue());
		}
	
		
		//return the order and the total price 
		
	}

}
