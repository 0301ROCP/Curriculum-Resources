package com.byMyself;

public class Switch {
	
	//Switch Statements
	
	public static void main(String[] args) {
		//Variables
		int II = 5;
		double DD = 10.55;
		String poke = "Pokemon";
		
		switch(II) {
			case 1 :
				System.out.println("nothing");
			break;
			case 5: 
				System.out.println("Its me");
			break;
		} 
		
		switch (poke) {
			case "p":
				System.out.println("charmander");
			break;
			case "po":
				System.out.println(poke);
			break;
			case "poke":
				System.out.println("Pikachu");
			break;
			case "Pokemon":
				System.out.println("Tyranitar");
			break;
		}
	}

}
