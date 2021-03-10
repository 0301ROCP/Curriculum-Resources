package com.revature.modifiers.access;

public class AccessExample {
	
	
	public static void accessAccount(User u) {
		if(u.username.equals("Admin")) {
			System.out.println("admin privilieges");
		}else {
			System.out.println("no admin privliges");
		}
		
	}

	public static void main(String[] args) {
		
		User u = new User("Bob","password1");
		
		u.username = "Admin";
		u.displayCredentials();
		
//		u.username = "Admin";
//		System.out.println(username);
		
//		u.password = "something";
		
		AccessExample.accessAccount(u);
	}
	
}
