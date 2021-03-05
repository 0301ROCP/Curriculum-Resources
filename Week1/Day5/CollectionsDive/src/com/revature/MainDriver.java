package com.revature;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

import com.revature.models.Toy;

public class MainDriver {
	
	public static void main(String[] args) {
		
		/*
		 * Collection API provides us data structures that makes our lives easier 
		 * 	by giving more features and types of data structures beyond the Java array 
		 * 
		 * 
		 * List: 
		 * 		Each position on a list is indexed 
		 * 		List keep track of insertion order
		 * 		Duplicate elements 
		 * 
		 * 		(vs Array : we get flexible length as well more methods 
		 * 
		 */
		
		
		//limitations: 
		/*
		 * arrays are not resizable 
		 * numbers of utility methods are limited (only object methods)
		 * only extra property we have is "length"
		 * 
		 * 
		 * We can instantiate both arrays of objects and primitives!
		 * and we use enhanced for loop!
		 */
		
		Toy[] toyArray = new Toy[4];
		boolean[] boolArray = new boolean[1];
		
		
		toyArray[0] = new Toy("Teddy Bear", 10);
		toyArray[1] = new Toy("Teddy Bear", 10);
		toyArray[2] = new Toy("Doll", 3 );
		
//		System.out.println(toyArray[0].equals(toyArray[1]));
//		
//		for(Toy t: toyArray) {
//			System.out.println(t);
//		}
		
		
		//GENERICS <>
		//"<>" are generics, taht enforce type safety. 
		//I can have a list of any objects, but I can narrow it down to my objects, by adding in generics to limit
		
		//LIST
		//flexible in size, it will automatically resize depending on how many elements there are
		/*
		 * 
		 * An ordered collection 
		 * May contain duplicate leements
		 * Access via index 
		 * 
		 * Lists have to contain the same elements in teh same position to be equal!
		 * 
		 * ArrayList: 
		 * 		A resizable array (mutable) compared to the buld in array inside Java. Allows you to add and remove elements. 
		 * 		(Almost always the better performance)
		 * 
		 * LinkedLists: 
		 * 		Consists of nodes, each node will store a value a 'pointer' to the next node.
		 * 		(Adding or removing a lot of stuff at a time, then linked list has a little bit more performance!)
		 * 
		 * Vector
		 * 		Depcreated (contains legacy methods), but is threadsafe. 
		 */
		
		
		
//		List<Toy> listOfToy = new List<Toy>(); //We cannot instantiate an interface.
		
		List<Toy> listOfToys = new ArrayList<Toy>();	
		List<Toy> listOfToys2 = new LinkedList<Toy>();
		
		// Object listOfToys[i] = new Toy("Teddy Bear", 10) 
		// Toy listOfToys[i] = new Toy("Teddy Bear", 10) 
		
		//Insertion order is maintained
		listOfToys.add(new Toy("Teddy Bear", 10));
		listOfToys.add(new Toy("Teddy Bear", 12));
		listOfToys.add(new Toy("Teddy Tiger", 10));
		listOfToys.add(new Toy("Doll", 10));
		
		//Insertion order is maintained
		listOfToys2.add(new Toy("Teddy Tiger", 10));
		listOfToys2.add(new Toy("Doll", 10));
		listOfToys2.add(new Toy("Teddy Bear", 10));
		listOfToys2.add(new Toy("Teddy Bear", 12));
		
		//listOfTyos =! listOfToys2
		
//		listOfToys.add(new Object());
		
//		System.out.println(listOfToys.isEmpty());
//		System.out.println(listOfToys.contains(new Toy("Teddy Bear",10)));
//		listOfToys.get(0).makeNoise();
		
//		System.out.println(listOfToys);
//		System.out.println(listOfToys.get(1));
//		System.out.println(listOfToys2);
		
		
		//Queue 
		// Ordered list of objects, by default is related to insertion order.
		// Follows the FIFO (First in First out) and also LILO (Last in last out) principles
		// methods: pool, remove, peek and element!
		
		/*
		 * 
		 * LinkedList: 
		 * 		Same as from list, but cast into queue
		 * 
		 * PriorityQueue:
		 * 		Doesn't permit null
		 * 		Doesn't permit hetreogenous object (object's that it can't compare)
		 */
		
		
		Queue<Toy> queueOfToys = new LinkedList<>(); //you don't need to add the type on the righthand side!
		Queue<Toy> queueOfToys2 = new PriorityQueue<>();
		Queue<Toy> queueOfToys3 = new LinkedList<>();
		
		//NOTE: collections don't accept primitives, because it levarage Object methods.
		
		Queue<Integer> numberQueue = new LinkedList<>();
		Queue<Integer> numberQueue2 = new PriorityQueue<>();
		
		numberQueue.add(10);
		numberQueue.add(20);
		numberQueue.add(500);
		numberQueue.add(12);
		numberQueue.add(-10);
		
		System.out.println(numberQueue);
		
		numberQueue2.add(10);
		numberQueue2.add(20);
		numberQueue2.add(500);
		numberQueue2.add(12);
		numberQueue2.add(-10);
		
		numberQueue2.poll();
		numberQueue2.poll();
		numberQueue2.poll();
		numberQueue2.poll();
		numberQueue2.poll();
		
		System.out.println(numberQueue2); //It doesn't look it, but it's now stored depending on it's value!
		
//		queueOfToys2.add(new Toy("Teddy Tiger", 10));
//		queueOfToys2.add(new Toy("Teddy Tiger", 11));
//		queueOfToys2.add(new Toy("Teddy Tiger", 12));
//		queueOfToys2.add(new Toy("Teddy Tiger", 13));
//		queueOfToys2.add(new Toy("Teddy Tiger", 14));
		
//		System.out.println(queueOfToys2);
		
//		queueOfToys.addAll(listOfToys); // This adds the List to my queue 
		
		
		
//		System.out.println(queueOfToys);
//		System.out.println(queueOfToys.poll()); //removes the first element from the queue, and retursn taht!
//		System.out.println(queueOfToys.poll());
//		System.out.println(queueOfToys);
		
		
		
		//Set
		/*
		 * Does not allow duplicates 
		 * Does not guarantee insertion order
		 * Set is equal if they contains the same elements.
		 */
		
		Set<Toy> setOfToys = new HashSet<>();
		
//		setOfToys.addAll(listOfToys);
		
		Toy bear = new Toy("Teddy Bear",0);
		Toy bear2 = new Toy("Teddy Bear",0);
		
		Set<String> setOfStrings = new HashSet<>();
		Set<String> setOfStrings2 = new HashSet<>();
		
		setOfStrings.add("Teddy");
		setOfStrings.add("Apples");
		setOfStrings.add("Kiwi");
		setOfStrings.add("Teddy");
		
		setOfStrings2.add("Kiwi");
		setOfStrings2.add("Teddy");
		setOfStrings2.add("Teddy");
		setOfStrings2.add("Apples");
		
		for(String i: setOfStrings) {
			System.out.println(i);
		}
		
		if(!(setOfStrings.add("Kiwi"))) { //unsuccessfully adding the object to the set. 
			
			
			System.out.println("Username already exists!");
		}
		
		System.out.println(setOfStrings.equals(setOfStrings2));
		
		
		
		setOfToys.add(bear);
		setOfToys.add(bear);
		setOfToys.add(bear2);
		
//		System.out.println(setOfToys);
	}

}
