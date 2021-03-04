package com.revature.vehicles;

public class MainDriver {

	public static void main(String[] args) {

		
		Truck t = new Truck("Green");
		Car c = new Car("Green");
		Motorbike mb = new Motorbike();
		Tricycle tr = new Tricycle();
		
		System.out.println(c.name);
		System.out.println(c.price);
		
		System.out.println(t.name);
		System.out.println(t.price);
		
		c.drive();
		t.drive();
		mb.drive();
		tr.drive();
		
		c.drift();
		t.drift();
		mb.drift();
		tr.drift();
		
//		System.out.println(tr.name);
//		System.out.println(mb.name);
		
//		tr.popAWheelie();
//		c.pop
//		mb.pop
//		t.pop
		
//		tr.off
//		c.off
//		t.offRoading();
//		mb.offRoading();

	}

}
