//package com.revature.CafaProject;
//
//import java.util.Scanner;
//
//public class miniChallenge {
//	
/*Cafe challenge!
//*>Customers can access your cafe using the terminal. 
//>They are able to order food and drinks from a menu.
//>Customers may choose to order any amount of food: 
//	e.g. 2 cups of tea and 3 scones. 
//
//>After the customer has finished with their order, 
//the app will display all the items they've ordered 
//and the total cost of the order. 
//
//Stretch goal: 
//	>As well as the total cost, display the total drinks 
//	cost and food items cost separately. 
//
//(You do need to persist the information after the app has terminated)
//	 */


		
// public static void main(String[] args) {
//	 
//	 //Initialize variables
//	 int totalPrice = 0;
//	 
//
//	 boolean doneOrdering = false;
//	 	 
//	 System.out.println("Welcome to the cafe! Here's our order: ");
//	 System.out.println("--Food-- \n sandwich $3 \n muffin   $2 ");
//	 System.out.println("--Drinks-- \n coffee $2 \n tea    $2 \n OJ     $1");
//	 
//	 System.out.println("Are you ready to order? (y/n)");
//	 
//////	 String ready = sc.nextLine();
////	 
////	 boolean startOrder = false;
////	 
//////	 if(ready.equals("y")) {
////		/ startOrder = true;		 
//////	 
//////	 }else { //put this in a loop
////		 System.out.println("Take your time!");
////	 }
////	 
////	 if(startOrder) {
////		 
////		 String[]allStuffOrdered = new String[8];
////		 String[] orderItem = OrderMethod();
////		 
////		 allStuffOrdered[counter] = OrderItem[0];
////		 
////		 System.out.println("Does that complete your order? (y/n) ");
////		 String done = sc.nextLine();
////		 
//////		 if(done.equals("y")) {
//////			 
//////		 doneOrdering = true;
//////		 }
////		 
////		 System.out.println("You ordered: ");
////		 System.out.println(foodOrdered[0] + quantity);
////		 System.out.println("Your total cost is ");
////		 System.out.println(totalCost);
////		 
////		 
////		 }
////	 
////	 
////	 //Method that sums the cost items and keeps a list of all items
////	 //return receipt
////	
////}
//// 
//// public static String[] OrderMethod() {
////	 
////	 Scanner sc = new Scanner(System.in);
////	 
////	 int sandwichPrice = 3;
////	 int muffinPrice = 2;
////	 int coffeePrice = 2;
////	 int teaPrice = 2;
////	
////	 String[] OrderItem = new String[2];
////	 
////	 System.out.println("What will you like to order?");//if they type gibberish, do something
////	 String Item = sc.nextLine();
////	 
////	 OrderItem[0] = Item;
////	 
////	 System.out.println("How many " + Item +"'s would you like?");
////	 String quantity = sc.nextLine();
////	 int intQuantity = Integer.parseInt(quantity);
////	 
////	 OrderItem[1] = quantity;
////	 
////	 int totalCost = 0;
////	 
////	 switch(Item) {
////	 case "muffin":
////		 totalCost += muffinPrice*intQuantity;
////	 case "sandwich":
////		 totalCost += sandwichPrice*intQuantity;
////	 case "coffee":
////		 totalCost += coffeePrice*intQuantity;
////	 case "tea":
////		 totalCost += teaPrice*intQuantity;
////	default:
////		System.out.println("That is not on the menu");
////		 
////	 }
////	 
////	 return OrderItem;
////	 
//// }
////
////}
