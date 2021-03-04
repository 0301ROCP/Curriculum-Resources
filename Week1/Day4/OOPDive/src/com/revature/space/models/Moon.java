package com.revature.space.models;

public class Moon extends Planet{

	//default constructor
	//when you have no constructor, the JVM provides one (that looks a lot like no args)
	
	int lunarCycle;
	
	public Moon(String name, double mass,int lunarCycle) {
		//implicitly or explicilty will start with a super keyword!
		super(name,mass); // this is invoking the parent's constructor!
		this.lunarCycle = lunarCycle;
		System.out.println("Inside all args constructor of Moon");
	}
	
	public Moon(String name) {
		super(name,10); //invoking the parent class, not the moon class
	}
	
	public Moon() {
		
		this("Yellow",100,30); //invoking another constructor inside of the same class!
//		this("Yellow"); //line 17  -- WE"RE NOT USING THE SUPER KEYWORD 
						//THIS - means we're talking about the object itself!!!!
		System.out.println("Inside moon no args constructor!");
	}
}
