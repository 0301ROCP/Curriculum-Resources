package com.revature.superheroes;

public class MainDriver {
	
	static void reallyGoodMethod(Human[] h) {
		/*
		 * He takes advantage of the superheros ability to fly!
		 * 
		 * Instead he's aiming for it to work with any Human!
		 * 
		 * Office worker, superheores, etc. 
		 * 
		 * All of my objects are office workers!
		 */
	}

	public static void main(String[] args) {
	
//		Object o = new Object(); // Every object we create is a descendant of Object
//		Human h = new Human();
//		Athlete a = new Athlete();
//		SuperHero sh = new SuperHero();
		
//		System.out.println("Human:");
//		h.move();
//		System.out.println("Athlete:");
//		a.move();
//		System.out.println("Superhero:");
//		sh.move();
		
		//A human is : a instance of Human and a Object 
		//A athlete is: a instance of Human, Athlete and Object
		//A Superhero is: a instance of Human, Athlete, Superhero and Object!
		
//		Human bruce = new SuperHero("Bruce","Karate","Rich");
		
//		System.out.println(bruce.power); //only superheroes have power
//		System.out.println(bruce.talent); //only athlete have talent
//		System.out.println(bruce.name);
		
//		System.out.println("Bruce's abilities to move: ");
//		bruce.move(); //move exists in Human, so bruce can stil reference the move metohd. 
//					//however, because we used the child constructor, we're using the child's implementation of it 
//		
//		Human steve = new Athlete();
//		System.out.println("Seteve' abilities to move: ");
//		steve.move();
//		
//		SuperHero batman;
//		
//		batman = (SuperHero) bruce;
//		
//		System.out.println(batman.name);
//		System.out.println(batman.power);
//		System.out.println(batman.talent);
//		batman.fly();
//		
//		
//		
//		Human[] apartment = new Human[2];
//		apartment[0] = bruce;
//		apartment[1] = steve;
		
		
		
//		Object o = new SuperHero();
//		Human h = new SuperHero(); 
//		Athlete a = new SuperHero();
//		SuperHero h = new SuperHero();
		
//		Human average = new Human();
//		SuperHero apples = (SuperHero) average;
//		apples.fly();
		
	
		
		Human bruce = new SuperHero();
		SuperHero batman = (SuperHero) bruce;
		batman.fly();
		
		
		

	}

}
