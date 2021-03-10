package com.revature;

import com.revature.exceptions.FoodDoesNotExist;
import com.revature.models.MenuItems;
import com.revature.presentation.FrontOfHouse;
import com.revature.presentation.FrontOfHouseImpl;
import com.revature.repository.Freezer;
import com.revature.repository.FreezerImpl;
import com.revature.repository.FreezerImplButBetter;
import com.revature.service.Kitchen;
import com.revature.service.KitchenImpl;

public class FullDriver {
	
	public static void main(String[] args)  {
		
		
		Freezer myFreezer = new FreezerImpl(); //My Freezer can work stand alone
		
		Kitchen myKitchen = new KitchenImpl(myFreezer); //My Kitchen will need a Freezer to get the list of food items
		
		FrontOfHouse myCafe = new FrontOfHouseImpl(myKitchen); //My Cafe front needs a kitchen to complete any orders
		
		
//		myCafe.greetingCustomer();
//		myCafe.showMenu();
//		myCafe.showCompleteOrder();
		
		MenuItems caviar =new  MenuItems(10, "Caviar", true);
		MenuItems scone = new MenuItems(2,"Scone",true);
		boolean i = false;
		
		try {
			
		}catch (RuntimeException e) {
			
		}
		
		try {
			if(i) {
				throw new FoodDoesNotExist();
			}
		} catch (FoodDoesNotExist e) {
			// TODO Auto-generated catch block
			e.printStackTrace(scone.name);
		} finally {
			// block of code, that runs regardless of whether an exception was thrown or not!
			System.out.println("Goodbye!");
		}
		
		
		try {
			
		}finally {
			// block of code, that runs regardless of whether an exception was thrown or not!
			System.out.println("Goodbye!");
		}
		
		
	}

}
