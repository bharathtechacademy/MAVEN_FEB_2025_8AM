package methodsInJava;

import java.io.PrintStream;

public class MethodsClass1 {
	
	//Methods ==> Collection of statements / Block of code having common purpose
	
	// Step 1: Identify the duplicate code written in sequence
	// Step 2: Create the block out side of the main method and add all duplicate lines inside the block { }
	// Step 3: Add name to the block
	// Step 4: call with same name whenever it's required
	
	//* Method inside the method is not allowed,
	
	//pre-defined method
	//user defined methods
	
	//method without return type
	//method with return type
	//method with parameters
	//method without parameters
	//constructor methods ==> default constructor, parameterized constructor


	public static void main(String[] args) {
		
		System.out.println("***************Test Case 1*****************");
		System.out.println("Launch the edge browser");
		System.out.println("Enter url as www.icici.com and launch application");
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
		System.out.println("Execute Test Case 1 Steps Related to Login Page....");
		System.out.println("Logout from application");
		System.out.println("Close the browser");
	
		System.out.println("***************Test Case 2*****************");
		System.out.println("Launch the edge browser");
		System.out.println("Enter url as www.icici.com and launch application");
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
		System.out.println("Execute Test Case 2 Steps Related to HomePage....");
		System.out.println("Logout from application");
		System.out.println("Close the browser");
		
		System.out.println("***************Test Case 3*****************");
		System.out.println("Launch the chrome browser");
		System.out.println("Enter url as www.icici.com and launch application");
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
		System.out.println("Execute Test Case 3 Steps Related to Fund Transfer Page....");
		System.out.println("Logout from application");
		System.out.println("Close the browser");
		
		System.out.println("***************Test Case 4*****************");
		System.out.println("Launch the chrome browser");
		System.out.println("Enter url as www.icici.com and launch application");
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
		System.out.println("Execute Test Case 4 Steps Related to Check the balance Page....");
		System.out.println("Navigate to account section");
		System.out.println("Capture the Account balance");
		double balance = 1000.50;
		System.out.println("Logout from application");
		System.out.println("Close the browser");

	}

}
