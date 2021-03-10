package com.revature.cafe;

import java.util.Scanner;

public class CafeChallenge {
	
	Scanner sc;
	

public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String menu = "MENU:\n FOOD - Scone, Croissant \n Drink - Coffee, Tea";
		System.out.println(menu);
		
		String coffee = "Coffee"; double coffeePrice = 1;
		//Food coffee = new Food("Coffee", 1);
		String tea = "Tea"; double teaPrice =2;
		String scone = "Scone"; double sconePrice = 3;
		String croissant = "Croissant"; double croissantPrice = 4;
//		System.out.println(drinkMenu);
//		System.out.println(foodMenu);
		double costDrink = 0;
		double costFood = 10;
		double totalCost = 0;
		String totalOrder = "";
		
		
		while(true) {
//			System.out.println("Place food order (enter each item separately)");
			System.out.println("Which FOOD item?");
			String orderFood = sc.nextLine(); 
			System.out.println("How many?");
			String foodNumber = sc.nextLine();
			int number = Integer.parseInt(foodNumber);
			System.out.println("Order another item? yes/no");
			String more = sc.nextLine();
			
			/*
			 * switch(foodOrder){
			 * case coffee.name:
			 * 		totalcost = totalCost + coffee.price*foodNumber;
			 * case tea.name:
			 * 
			 * default:
			 * 		syso("food doesn't exist");
			 * 		
			 */
			
			totalCost = totalCost + number * 5;
			totalOrder = totalOrder + "+" + orderFood;
			
			if (more.equals("no") | more.equals("No")) {
				break;
			}
			
			
//			if(orderDrink.equals(coffee) |) {
//				totalCost = totalCost + costDrink
			
//			System.out.println("Place drink order");
//			String orderDrink = sc.nextLine();
			
			
		}			
		System.out.println("your order is: " + totalOrder);
		System.out.println(totalCost);

	}
}












