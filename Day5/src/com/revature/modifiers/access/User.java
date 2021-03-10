package com.revature.modifiers.access;

public class User {
	
	private String username;
	private String password;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public void displayCredentials() {
		System.out.println(this.username);
		System.out.println(this.password);
	}
	
	public void changeCredential(String newUsername) {
		
		this.username = newUsername;
		
	}
	
}
