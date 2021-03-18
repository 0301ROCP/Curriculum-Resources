package com.revature;

public class MainDriver {
	
	/*
	 * STACK VS HEAP??
	 * 
	 * 	Stack is used for primitive variables and reference variables to objects in the heap.
	 * 	(Stack follows a First In Last Out (FILO or LIFO)). It also is where method invocations are stored. 
	 * 
	 *  Multiple stacks are possible, for example, when a thread is created it is given its own stack. 
	 * 
	 * 
	 * 	Heap stores Objects in memory! Objects can be accessed anywhere (all threads can access it).
	 * 	Heap, in contrast, is a central location in memory where all objects are stored. New objects are created 
	 * 	via the "new" keyword and (optionally) assigned to a reference variable.
	 * 
	 * 	String pool is in the heap. String objects are stored in the String pool (be default) and thus also stored 
	 * 		in the heap. 
	 * 
	 * 
	 * 
	 */
	
	public static void useUpMemory() {
		
		Object a = new Object(); //within the method it is not eligible for garbage collection
		Object a1 = new Object();
		Object a2 = new Object();
		Object a3 = new Object();
		
		//Outside of this method, we don't have a reference to our object in memory!!!!
	}
	
	public static Object useUpMemory2() {
		
		Object a = new Object(); //within the method it is not eligible for garbage collection
		
		Object a1 = new Object(); //these objects have no outside reference, so will be eligible for GC after method is done!
		Object a2 = new Object();
		Object a3 = new Object();
		
		//Outside of this method, we don't have a reference to our object in memory!!!!
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * What is the garbage collector??
		 * 
		 * Garbage Collector is a daemon thread! (Always running in the background)
		 * 
		 * Garbage collectors acts when an object in the heap loses all reference (eligible for garbage collection)
		 * 
		 * Garbage collector does not always act instantly! 
		 */
		
		Rubbish o1 = new Rubbish(); //1
		Rubbish o2 = new Rubbish(); //2
		Rubbish o3 = o1; //3
		
		System.gc();// NOT FORCING THE GARBAGE COLLECTOR - I am merely recommending the garbage collector to start here!
		
		o2 = o3; //4 -- Here, the original object that o2 was pointing to is eligible for garbage collection.  
		
//		while(true) {
//			o1 = new Rubbish(); 
//			System.out.println(Rubbish.numberOfRubbishDestroyed + " the number of rubbish destroyed!");
//		}
		
		o2 = null; 
		
		useUpMemory(); // the objects we created in memory, are removed if no references exist!
		Object o4 = useUpMemory2();
		
		
		do {
			
			Object a = new Object();
			
		} while(false);
		
//		System.out.println(a);
		
		// ------------------------------------WHAT MAKES OBJECT ELIGIBLE FOR GC-----------------------------------
		
		/*
		 * 1) Reassigning the reference variable 
		 * 2) Nullifying the reference variable
		 * 3) Object created inside method 
		 * 4) Island of Isolation
		 */
		
		
		
		
		//-----------------REASSINGING---------------------------------------------------
		
		Object obj1 = new Object();
		obj1 = new Object();
		
		//-----------------NULLIFING-----------------------------------------------------
		
		Object obj2 = new Object();
		obj2 = null;
				
		//------------------METHOD INVOKATION-----------------------------------------------
		
		useUpMemory(); //Objects created when invoking this method is inaccessible for me, inside the main method
					
		do {Object a = new Object();	//Same here, object "a" cannot be referenced!
		} while(false);					// Refer to scopes from week 1 if this is causing confusion. 
		
//		System.out.println(a); //Code will not compile! 
		
		//-------------------ISLAND OF ISOLATION------------------------------------------------
		
		Rubbish r1 = new Rubbish();
		Rubbish r2 = new Rubbish(); //we have reference variable pointing to rubbish, "r2"
		
		r1.friendRubbish = r2; //we have another reference variable pointing to rubbish, "r1.friendRubbish"
		/*
		 * i.e. 
		 * 		r1.friendRubbish == r2
		 */
		
		r2.friendRubbish = r1; //vice versa 
		
		r1 = null; // we lose a reference, but r2 holds a reference to the original object!
		
		//How do I access the object that r1 was pointing to? 
		System.out.println(r2.friendRubbish);
		
		//But what happens now? 
		r2 = null; //we lose all references to both objects in memory!
		
		//now both are eligible for gc, both objects hold a reference to each other, but I don't have access to either 
		
		System.out.println(r1.friendRubbish); //This will throw an exception, because r1 == null;
	}

}
