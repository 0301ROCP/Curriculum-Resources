package com.revature.models.space;

public class Planet {
	
	String name;
	double mass;
	Moon[] moons;
	boolean rings;
	
	//no-args
	Planet(){
		this.name = "Not decided";
		this.mass = -1;
		this.moons = null; //This is empty!
		// null is different to an empty array!
		//an empty array still has properties and moethds. 
		//null has nothing, it's a lack of anything. 
		this.rings = false;
	}
	
	//all-args
	Planet(String name, double mass, Moon[] moons, boolean rings){
		
		this.name = name;
		this.mass = mass;
		this.moons = moons;
		this.rings = rings;
		
	}
	
	boolean listAllMoons() {
		
		boolean hasMoons;
		
		if(this.moons.length == 0) {
			System.out.println("This planet has no moons!");
			hasMoons = false;
		}else {
			hasMoons = true;
			for(Moon m: this.moons) {
				System.out.println(m.name);
			}
		}
		
		return hasMoons;
	}
	
	
	void orbit() {
		System.out.println("I'm orbiting the sun!");
	}
	
	
	void crash() {
		System.out.println("I've crashed into something, but I don't know what!");
		this.mass = this.mass/2; //Whenever it crashes, it loses half its mass. 
	}
	
	void crash(Planet p) {
		System.out.println("I've crashed into "+  p.name );
		this.mass = this.mass/2;
		p.mass = p.mass/2;
	}
	
	void bigCrash(Planet p) {
		System.out.println("I've crashed into "+  p.name );
		
		if(this.mass > p.mass) {
			this.mass = this.mass * .90;
			p.mass = p.mass * .10;
		} else {
			this.mass = this.mass/2;
			p.mass = p.mass/2;
			}
	}
	
	
	
	
	

}
