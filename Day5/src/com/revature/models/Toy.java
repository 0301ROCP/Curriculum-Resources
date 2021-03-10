package com.revature.models;

public class Toy {
	
	
	public String toString() {
		
		return "Toy [name=" + name  + ", price=" + price + "]";
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		
		
		Toy[] toyArray = new Toy[4];
		
		toyArray[0] = new Toy("Teddy Bear", 10);
		toyArray[1] = new Toy("Teddy Bear", 11);
		toyArray[2] = new Toy("Doll", 3);
		
		for(Toy t: toyArray) {
			System.out.println(t);
		}
	}

}
