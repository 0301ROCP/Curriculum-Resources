package com.revature.modifiers.access;

public class User {
	
	/*
	 * Access modifiers 
	 * 		public : this is accessible anywhere, as long as you can reference it!
	 * 		protected : this resource is only available to classes within the same package OR if it is a child class!
	 * 		(default) : this resource is only available to classes within the same package
	 * 		private : the variable or the method, is only accessible within the class
	 */
	
	private String username;
	private String password;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	
	public String displayCredentials() {
		System.out.println(this.username);
		System.out.println(this.password);
		return this.username;
	}
	
	public void changeCredential(String newUsername) {
		
		if(newUsername.equals("Admin")){
			System.out.println("You can't be admin, amte.");
		}else {
			this.username = newUsername;
		}
		
		
	}

}
