package com.revature.models;

public class Planet {
	
	private int id;
	private String name;
	private String description;
	private boolean hasRings;
	private int numberOfMoons;
	
	public Planet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Planet(int id, String name, String description, boolean hasRings, int numberOfMoons) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.hasRings = hasRings;
		this.numberOfMoons = numberOfMoons;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isHasRings() {
		return hasRings;
	}
	public void setHasRings(boolean hasRings) {
		this.hasRings = hasRings;
	}
	public int getNumberOfMoons() {
		return numberOfMoons;
	}
	public void setNumberOfMoons(int numberOfMoons) {
		this.numberOfMoons = numberOfMoons;
	}
	
	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", description=" + description + ", hasRings=" + hasRings
				+ ", numberOfMoons=" + numberOfMoons + "]";
	}
	
	
	
	

}
