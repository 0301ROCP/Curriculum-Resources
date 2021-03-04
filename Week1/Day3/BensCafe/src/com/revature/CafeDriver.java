package com.revature;

import java.util.Scanner;

import com.revature.models.MenuItems;

public class CafeDriver {
	
	/*
	 * What would be useful data stuctures to have?
	 * 
	 * 	SET
	 * 
	 * 	LIST
	 * 
	 * 	MAP 
	 */
	
	static MenuItems[] preppingFood() {
		
		MenuItems[] listOfItems = new MenuItems[5];
		int[] a;
		Object[] b; 
		
		MenuItems scones = new MenuItems(2,"Scone",true);
		MenuItems cupcakes = new MenuItems(2,"Cupcakes",true);
		MenuItems tea = new MenuItems(1,"Tea",false);
		MenuItems coffee  = new MenuItems(1,"Coffee",false);
		MenuItems milkshake = new MenuItems(1,"MilkShake",false);
		
		listOfItems[0] = scones;
		listOfItems[1] = cupcakes;
		listOfItems[2] = tea;
		listOfItems[3] = coffee;
		listOfItems[4] = milkshake;
		
		return listOfItems;
		
	}
	
	static void greetinCustomer(MenuItems[] myMenu) {
		System.out.println("Welcome to my Cafe, here's the list of items: ");
		
		for(MenuItems i: myMenu) {
			System.out.println("Food: " + i.name + " | Price: $" + i.price);
		}
		
	}
	
	public static void main(String[] args) {
		
		
		
		//Create my menu
		MenuItems[] myMenu = preppingFood();
		
		
		//provide an interactive menu for the customer
		greetinCustomer(myMenu);
		
		//allow them to order and track it 
		boolean ordering = true; //we start of by ordering food!
		Scanner sc = new Scanner(System.in);
		int totalPrice = 0;
		
		System.out.println("How many different items do you want?");
		String numberOfItemsString = sc.nextLine();
		int numberOfItems = Integer.parseInt(numberOfItemsString);
		
		String[] nameTrack = new String[numberOfItems]; // [scones, tea, coffee]
		int[] totalTrack = new int[numberOfItems]; // [2,1,1]
		int dummytrack = 0; //because our arrays start at index 0;
		
		while(ordering) {
		
			
			System.out.println("What would you like?");
			String orderedItemString = sc.nextLine();
			
			System.out.println("How much would you like?");
			String amountString = sc.nextLine();
			int amount = Integer.parseInt(amountString);
			

			
			for(MenuItems m: myMenu) {
				
				if(m.name.toLowerCase().equals(orderedItemString)) {
					totalPrice+= m.price*amount;
					nameTrack[dummytrack] = m.name;
					totalTrack[dummytrack] = amount;
					
					System.out.println(totalPrice);
					System.out.println(nameTrack[dummytrack]);
					System.out.println(totalTrack[dummytrack]);
					dummytrack++;
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
		
		for(int i = 0; i < nameTrack.length; i++) {
			System.out.println("Food " + nameTrack[i] + " and the amount " + totalTrack[i]);
			
		} 
		
		//return the order and the total price 
		
	}

}
