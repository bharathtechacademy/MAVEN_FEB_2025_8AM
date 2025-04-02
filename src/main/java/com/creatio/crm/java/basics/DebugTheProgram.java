package com.creatio.crm.java.basics;

public class DebugTheProgram {
	
	//Debug ==> Run the step by step manually to understand the reason behind the failures
	
	// Step 1: Add breakpoint in the line where you want to start debug process (double click on line number)
	
	// Step 2: Instead of using run as , we have to use debug option to execute the program
	
	
	// How to fix exceptions/errors
	
	// First line of the error will give you information about the reason for failure and location of documentation to fix the error
	// Last line of error will give you the details about in which package/class/method/line number program is failed

	public static void main(String[] args) {
		int i =1;
		System.out.println("Step 1");
//		Thread.sleep(3000);
		System.out.println("Step 2");
		System.out.println("Step 3");
		int j=i+1;		
		System.out.println(i/j);
		System.out.println("Step 5");
		System.out.println("Step 6");
		System.out.println("Execution Completed");
	}

}
