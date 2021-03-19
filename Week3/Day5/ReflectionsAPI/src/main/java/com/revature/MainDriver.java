package com.revature;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.revature.vehicles.Car;

public class MainDriver {
	
	/*
	 * Reflections is an API that allows us to examine or modify the behaviour of methods, classes 
	 * and interfaces at runtime. 
	 * 
	 * 
	 *USES OF REFLECTION
	 *
	 *		Extensibility features: 
	 *			An application may make use of external user defined classes by creating 
	 *			instances of extensibility objects. 
	 *
	 *		Class Browsers and Visual Development Environments: 
	 *			By having a way to look at the code (visualise it), aid the developer in writing correct code. 
	 *
	 *		Debuggers and Test Tools:
	 *			Debuggers need to be able to examine private members on classes. 
	 *
	 *DRAWBACKS OF REFLECTIONS
	 *
	 *		Exposure of Internals :
	 *			REflectiosn allows us to perform otherwise illegal operations 
	 *
	 *		Security Restrictions: 
	 *			Reflections require runtime permission. 
	 *
	 *		Performance Overhead: 
	 *			Reflection object are dynamically changed during runtime. JVM has some optimization 
	 *			features that it will not be able to levarage. 
	 */
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		Car car = new Car("Jaguar",100);
		
		Object o = car;
		
		Object s = "String";
		
		
		// 3 ways to get a Class object 
		Class c1 = car.getClass();
		Class c2 = Class.forName("com.revature.vehicles.Car");
		Class c3 = Car.class;
		
		Class co1 = o.getClass();
		
		Class cs1 = s.getClass();
		
		
//		System.out.println(c1.getCanonicalName());
//		
//		System.out.println(c1.getSimpleName());
//		
//		System.out.println(Modifier.toString(c1.getModifiers())); //returns values based on bitwise operatorions
//		
//	
//		System.out.println(c1.getTypeName());
		
		
//		---------------------------GETTING CONSTRUCTOR INFORMATION--------------------------
		
		Constructor noArgsConstruct = c1.getConstructor();
		
//		System.out.println(noArgsConstruct);
		
		
		Constructor parametrizedConstruct = c1.getConstructor(String.class, double.class);
		
//		System.out.println(parametrizedConstruct);
		
		
//		Constructor privateConstruct = c1.getConstructor(String.class);
		Constructor privateConstruct = c1.getDeclaredConstructor(String.class);
		
		for(Constructor c: c1.getDeclaredConstructors()) {
//			System.out.println(c);
		}
		
		for(Constructor c: c1.getConstructors()) {
//			System.out.println(c);
		}
		
		
//		System.out.println(privateConstruct);
		
//	-------------------------------GETTING METHODS
		
//		Method[] methods = c1.getMethods(); //Will return methods up the hierarchy, but only accessible ones!
//		
//		for(Method m: methods) {
//			System.out.println(m);
//		}
//		
//		
//		Method[] carMethods = c1.getDeclaredMethods(); //Will return all the methods, regardless of access modifer
//														// but only at the current class level!
//		for(Method m: carMethods) {
//			System.out.println(m);
//		}
		
		// Getting methods from an OBject now (pointing to a Car in memory)
		
//		Method[] methods = co1.getMethods(); //Will return methods up the hierarchy, but only accessible ones!
//		
//		for(Method m: methods) {
//			System.out.println(m);
//		}
//		
//		
//		Method[] carMethods = co1.getDeclaredMethods(); //Will return all the methods, regardless of access modifer
//														// but only at the current class level!
//		for(Method m: carMethods) {
//			System.out.println(m);
//		}
		
//		For String class 
//		
//		Method[] stringMethods = cs1.getDeclaredMethods(); //Will return all the methods, regardless of access modifer
//		// but only at the current class level!
//		for(Method m: stringMethods) {
//			System.out.println(m);
//		}
//		
//		------------------------------INVOKING METHODS----------------------------------
		
//		car.drive();
//		
//		Method myMethod = c1.getMethod("drive", null);
//		
//		myMethod.invoke(car, null);
//		myMethod.invoke(o, null);
		
//		Method myMethod2 = c1.getMethod("drift", String.class, double.class);
//		
//		myMethod2.invoke(car, "Drifting in Object",2);
//		myMethod2.invoke(o, "Drifting in Object",2);
		
		Method myMethod3 = c1.getDeclaredMethod("superSecret", null);
		
//		car.superSecret();
		
//		myMethod3.setAccessible(true);
//		
//		myMethod3.invoke(car, null);
		
		
//		----------------------------GETTING FIELDS!!------------------------------
		
		Field f1 = c1.getDeclaredField("fuel");
		
		f1.setAccessible(true);
		
		f1.set(f1, 200.0);
		
		System.out.println(f1);
		
		
		
		
		
	}

}
