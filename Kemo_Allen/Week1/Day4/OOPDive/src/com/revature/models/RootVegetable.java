package com.revature.models;

public class RootVegetable extends Vegetable{
	
	boolean goodInSoup;
	
	public RootVegetable(String name, double fibreContent,double price, boolean goodInSoup) {
		this.name = name;
		this.fibreContent = fibreContent;
		this.goodInSoup = goodInSoup;
		this.price = price;
	}

}
