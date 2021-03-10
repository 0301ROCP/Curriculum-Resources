package com.revature.models;

public class Fruit extends Food{
	

	public double sugarContent;
	
	public Fruit(String name, double price,double sugarContent) {
		super(name, price);
//		this.name = name;
//		this.price = price;
		this.sugarContent = sugarContent;
	}

}
