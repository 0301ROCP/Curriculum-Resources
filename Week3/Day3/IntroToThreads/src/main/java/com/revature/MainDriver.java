package com.revature;

import com.revature.threads.AnotherCustomThread;
import com.revature.threads.CustomThread;

public class MainDriver {
	
	/*
	 * 
	 * Multi threading!
	 * 
	 * Thread? 
	 * 		For Java, a thread is a singular unit of processing. It allows a processor to execute 
	 * 		multiple threads of execution. All threads on the same core can share the resources of the 
	 * 		core (e.g. cache memory).
	 * 
	 * Daemon Thread
	 * 	Always running in the background. Only stops when the app stops. (Garbage Collection)
	 * 
	 * Advantages: 
	 * 	Users are not blocked when performing actions. Background processes won't affect user threads. 
	 * 	If the thread meets an exception, other threads won't be affected. 
	 * 
	 * Disadvantages:
	 * 	More overhead, due to communication between threads. 
	 * 	Syncrhonisation issues! 
	 * 
	 */
	
	public static void main(String[] args) throws InterruptedException { //main thread starts executing!
		
		/*
		 * States of a thread: 
		 * 
		 * New -> Runnable -> Running  <-> Waiting -> Dead
		 * 
		 * New: 
		 * 	The thread is instantiated (using Thread class or Runnable interface)
		 * 
		 * Runnable: 
		 * 	The start() method has been invoked but the scheduler has not selected it to start running the thread!!
		 * 
		 * Running: 
		 * 	The thread is in running state (scheduler has selected it)
		 * 
		 * Waiting, Sleeping, Timed Waiting, Blocked: 
		 * 	The thread is alive, but not currently running. 
		 * 		(Waiting: thread is waiting for an event to occur)
		 * 		(Timed Waiting: wait for a specified amount of time)
		 * 		(Blocked: Thread is unable to access a resource because another thread is currently using it)
		 * 
		 * Dead:
		 * 	Thread has been terminated.
		 * 
		 */
		
//		-------------------------OVERRIDING THREAD CLASS!---------------------------------------------
		
		Thread t = new CustomThread(); // t is in state "New 
		
//		t.start(); // 1 thread starts executing - t is in "Runnable" state 
		
		
		
		Thread t2 = new AnotherCustomThread();
		
//		t2.start(); // 2nd thread starts executing 
		
		
//		-------------------------USING RUNNABLE INTERFACE---------------------------------------------
		
		Runnable r1 = () -> { //levarage lambda experssions on a functional interface, to follow a functional style of programming!
			while(true) {
				System.out.println("I'm running inside of a runnable interface!!!!!");
				try {
					Thread.sleep(1000); //sleeps for a second. 
					// It has to be executed in a static fashion, I need to invoke Thread.sleep(), inside the method!!!!
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		};
		
//		r1.run(); //run() will invoke the logic, but not in a multithreading fashion!!!!
		
		Thread t3 = new Thread(r1); //Rather than creating a custom thread, we pass it a custom runnable (much more lightweight)
		
//		t3.start(); //will create a new thread, and the new thread will invoke the t3.run() method!!
		
//		System.out.println(t.isAlive()); //Returns us the state of the thread, if it's alive or not!
//		System.out.println(t.getName()); //returns us the name of the thread 
//		
//		System.out.println(t2.getName());
//		
//		Thread mainThread = Thread.currentThread();
//		
//		System.out.println(mainThread.getName());
//		System.out.println(mainThread.isDaemon());
		
//		while(true) {
//			System.out.println("Inside main thread!");
//		}
		
		
//		----------------------------------------MANIPULATING THE MAIN THREAD-----------------------------------
		
		Thread mainThread = Thread.currentThread();
		
		System.out.println("Hello There!");
		
//		mainThread.sleep(5000);
		
		t3.start();
		
		t3.wait();
		
//		t3.sleep(1000); Will not work! Has to be inside of run() logic!!!
		
		
//		mainThread.wait(); //Won't work, because if the main thread stops, nothing else executes!!!!
//		
//		mainThread.notify(); //Will never get invoked 
		
		System.out.println("Bye There!");
		
		
//		----------------------------DEFINING THE THREAD CLASS-----------------------------------------
		
		/*
		 * Few important things
		 * 
		 * Thread class includes: 
		 * 
		 * 		getters and setters for id, name and priority
		 * 		(Priority signifies which order threads to be run! MIN_PRIORITY = 1, NORM_PRIORITY = 5, MAX_PRIORITY = 10
		 * 		interrupt() to explicitly interupt the thread
		 * 		start() to actually begin the thread execution after instantiaon 
		 * 		isAlive(), isDeameon(), 
		 * 
		 * 		Static methods: 
		 * 
		 * 		Thread.currentThread() // returns us the thread that is executing!
		 * 		Thread.sleep(long millis) // tells the thread to remporarily stop
		 */
		
		
//		----------------------------REASON WHY WE DONT USE THREADS------------------------------------------------
		/*
		 * We may get better perforamnce, but it will make the code a lot more compilicated!!! 
		 * 
		 * In an enterprise setting, having efficient performance is nice. But having a code base 
		 * 	that can be easily debugged and understood also has a big emphasis!!!
		 * 
		 *  	Deadlock?? 
		 *  		When multiple threads are trying to access a single resource!!!
		 *  		
		 *  	Livelock??
		 *  		When multiple threads are also stuck trying to acess a single resource, but also utilising 
		 *  		CPU power to overcome this situation (i.e. using a faulty algorithm)
		 *  
		 *  	Producer/consumer problem?? 
		 *  		A thread produces resources onto a shared buffer!!!!
		 *  		A thread consumes resources from a shared buffer!!!
		 *  
		 *  		What's to stop a producer from generating too many resources in one go??? (MAx out the memory buffer)
		 *  		What's to stop a consumer from removing too many resource in one go??? (taking it out of a empty buffer)
		 *  	
		 *  
		 *  	Syncrhonization issues??
		 *  		When threads are uitilising the same resrouce, e.g. modifing a data structure. 
		 *  		Errors will occur because changes will happen to the resource in seperate threads!!
		 *  
		 *  Extra self review: 
		 *  	Find out how to resolve these problems theoretically? Hint: There's a key word, synchronization, that helps with one!
		 * 
		 * 
		 */
	}

}
