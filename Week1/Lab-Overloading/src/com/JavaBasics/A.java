package com.JavaBasics;

public class A {

	//static member
	public static int staticCount = 0;
	
	/*the easiest way to tell if a member is static or not is
	 * by the keyword STATIC is being applied to it. 
	*/
	
	
	//instance member
	public int instanceCount = 0;
	
	//members that can manipulate "staticCount" have the keyword static
	// we also do not use the keyword "this" for the "staticCount" variables.
	//We are using the class as a qualifier.
	
	public A() {
		staticCount++;
		this.instanceCount++;
	}

	public static int getStaticCount() {
		return A.staticCount;
	}

	public static void setStaticCount(int staticCount) {
		A.staticCount = staticCount;
	}

	public int getInstanceCount() {
		return this.instanceCount;
	}

	public void setInstanceCount(int instanceCount) {
		this.instanceCount = instanceCount;
	}
	
	
}
