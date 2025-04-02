package com.creatio.crm.java.basics;

import java.util.logging.Logger;

public class HelloWorld {
	
//	1. Debug and Error Detection
//	2. Monitor the Execution
//	3. Logging
//	4. Testing and Validating the code
//	5. Education and Learning

	public static void main(String[] args) {
		
		//Print the content and go to next line
		System.out.println("Hello, World!");
		
		//Print the content and stay on the same line
		System.out.print("Hello,");
		System.out.print(" World!");
		
		//Print the formatted text and stay on the same line
		//%s : placeholder to replace text values
		//%d : placeholder to replace digit/number values
		//%b : placeholder to replace boolean values
		//%n : placeholder to go to new line		
		System.out.printf("Hello %s, Your empId is %d and Your Visa Status is %b.%n","Jayalakshmi",3456,false);
		
		//Format the text and print the same and then stay on same line
		System.out.format("Total Bill is %.0f%n", 200.237846218);
		
		//Print Error messages using print statements
		System.err.println("ERROR : Expected result is Not Matching with Actual Result");
		
		//Join multiple statements and print them
		System.out.append("My name is Bharath Reddy, ").append("My empId is 1234");
		
		
		//Logger to log message to monitor the execution
		Logger log = Logger.getLogger("MyLogger");
		log.info("Currently we are executing Line number 38");
		
	}

}
