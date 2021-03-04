package com.revature.models;

public class Vegetable extends Food{
	
	public double fibreContent;
	
	public Vegetable() {
		
	}
	
	public Vegetable(String name, double price, double fibreContent) {
		this.name = name;
		this.price = price;
		this.fibreContent = fibreContent;
	}

}
