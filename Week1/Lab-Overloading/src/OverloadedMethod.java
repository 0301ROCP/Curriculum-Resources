
public class OverloadedMethod {

	public static void main(String[] args) {
		//create instance here
		OverloadedMethod om = new OverloadedMethod();
		om.print();
		
		om.print("second print method");
		
		om.print("second", "third");
	}
	
	//overload methods here
	public void print() { //this satisfies the first print
		System.out.println("Original print method.");
	}
	
	public void print(String str) { //this satisfies the second print
		System.out.println(str);
	}
	
	public void print(String str, String str2) { //this satisfies the third print
		System.out.println(str + " " + str2);
	}
	
}  //if we make another method with two strings it will cause an error with
	// the third method 
