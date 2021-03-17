package com.revature.models;

public class Planet {
	
	
	
	public Planet(String name, String colour, double mass, boolean rings) {
		super();
		this.name = name;
		this.colour = colour;
		this.mass = mass;
		this.rings = rings;
	}
	
	private String name;
	private String colour;
	private double mass;
	private boolean rings;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getMass() {
		return mass;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	public boolean isRings() {
		return rings;
	}
	public void setRings(boolean rings) {
		this.rings = rings;
	}
	@Override
	public String toString() {
		return "Planet [name=" + name + ", colour=" + colour + ", mass=" + mass + ", rings=" + rings + "]";
	}
	
	
	

}
