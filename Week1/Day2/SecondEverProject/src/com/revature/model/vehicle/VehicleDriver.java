package com.revature.model.vehicle;

public class VehicleDriver {

	
	public static void main(String[] apples) {
		
		System.out.println("Hello!");
		
		//type NameOfVariable = new Constructor();
		Car myCar = new Car();
		Car myOtherCar = new Car("Tesla model y", 0 ,4,0, "white");
		
		myCar.addNumbers(10);
		myCar.addNumbers(10,20);
		myCar.addNumbers(10,20,30);
		
		myCar.addNumbers();
		myCar.addNumbers(10,1,2,3,4,5,6);

		
//		System.out.println(myCar.makeAndModel);
//		System.out.println(myOtherCar.makeAndModel);
		
	}
}
