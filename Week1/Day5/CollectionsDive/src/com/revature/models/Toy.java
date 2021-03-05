package com.revature.models;

public class Toy {
	
	private String name;
	private double price;
	
	
	public void makeNoise() {
		System.out.println("making toy noises!");
	}
	
	public Toy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Toy(String name, double price) {
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
	
	
	@Override
	public String toString() {
		return "Toy [name=" + name + ", price=" + price + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Toy otherToy = (Toy) obj;
		boolean sameToy = false;
		
		if(otherToy.name.equals(this.name)) {
			sameToy = true;
		}
		
		return sameToy;
	}
	
	
	
	

}
