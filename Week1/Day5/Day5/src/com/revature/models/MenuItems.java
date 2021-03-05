package com.revature.models;

public class MenuItems{
	
	private String name;
	private double price;
	
	
	public MenuItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MenuItems(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	} 
	
	
	
	//override the toString method!
	
	@Override
	public String toString() {
		return "Food item: " + this.name + " and the price is: " + this.price;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean isTheSame = false;
		
		MenuItems m = (MenuItems) o;
		if(m.name.equals(this.name) && m.price == this.price) {
			isTheSame = true;
		}
		
		return isTheSame;
	}
	
	
	

}
