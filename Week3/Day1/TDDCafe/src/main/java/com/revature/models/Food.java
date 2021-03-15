package com.revature.models;

public class Food {
	
	private String name;
	private double price;
	private int calories;
	
	
	
	
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Food(String name, double price, int calories) {
		super();
		this.name = name;
		this.price = price;
		this.calories = calories;
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
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", calories=" + calories + "]";
	}
	
	
	
	

}
