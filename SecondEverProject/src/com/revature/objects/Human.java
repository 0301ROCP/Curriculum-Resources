package com.revature.objects;

public class Human {
	
	String name;
	double weight;
	double height; 
	int age; 
	
	String[] organs = {"Brain", "Kidney(s)", "Heart", "Skin"};
	
	//Has (a) relationship . 
	Shoe[] myShoes = {new Shoe(), new Shoe(), new Shoe()}; 
	
	//To create a cookie cutter method for creating a "Bobby"
	void toMakeABobby(int myAge, double myWeight, double myHeight) {
		this.name = "Bobby";
		this.age = myAge;
		this.weight = myWeight;
		this.height = myHeight;
	}
	
	//discount version of .toString(), this will print out all the information we want about the human 
	void givingDetails() {
		System.out.println(this.age);
		System.out.println(this.height);
		System.out.println(this.weight);
		System.out.println(this.name);
	}
	
	//Let the user decide which shoe they want to modify from their list, and give the properties for the new shoe!
	boolean pimpMyShoes() {
		Shoe myPumaShoe = new Shoe();
		
		myPumaShoe.colour = "blue";
		myPumaShoe.name = "puma";
		myPumaShoe.size = 22;
		
		for(int i = 0; i< myShoes.length; i++) {
			this.myShoes[i] = myPumaShoe;
		}
		
		return true;
	}
	
	void showOfMyShoes() {
		for(Shoe myShoe: this.myShoes) {
			System.out.println(myShoe.name);
			System.out.println(myShoe.size);
			System.out.println(myShoe.colour);
		}
		
	}

}
