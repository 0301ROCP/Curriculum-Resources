package com.revature.modifiers.access;

public class AccessExample {
	
	public static void accessAcount(User u) {
		if(u.displayCredentials().equals("Admin")) {
			System.out.println("You've got admin privilieges!");
		}else {
			System.out.println("You don't have admin privilegs");
		}
	}
	
	public static void main(String[] args) {
		
//		User u = new User("Bob","password1");
		
//		u.username = "Admin";
		
//		u.password = "something else";
		
		
//		u.changeCredential("Timmy");
//		u.displayCredentials();
		
//		u.username = "Admin";
//		System.out.println(u.username);
//		
//		u.password = "Whatever I want!";
		
//		AccessExample.accessAcount(u);
		
		
//		Car c = new Car(80);
//		c.startUp();
//		c.name;
//		c.fuel;
//		c.suspension = true;
//		c.driversId = "a";
//		
//		System.out.println(c.engineStatus);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Car c1 = new Car(0);
//		c1.startUp();
//		c1.gasPump(1000);
//		c1.startUp();
		
//		System.out.println(c1.engineStatus);
//		
//		c1.fuel = 1000;
//		c1.engineStatus = true;
		
		
		Motorbike mb = new Motorbike();
		mb.startUp();
		mb.gasPump(50);
		mb.startUp();
		
		
	}

}
