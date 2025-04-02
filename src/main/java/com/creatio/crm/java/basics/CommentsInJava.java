package com.creatio.crm.java.basics;

public class CommentsInJava {
	
	// Comments in java are 3 categories
	
	// 1. Single line comments ==> Starts with // ==> Used for short and specific notes about logic or functionality (Control +/)
	// 2. Multi-line comments ==>Starts with /*... ends with...*/ ==> detailed explanation about some functionality or logic
	// 3. Documentation Comments ==> Starts with /**... ends with...*/  ==> To generate detailed documentation about specific functionality or module
	

	/*
	 * This is main method 
	 * Always JVM execution will begin from this main method
	 * Without main method we cannot run the program  (Control+Shift+/)
	 */
	
	/**
	 * This is the main method that serves as the entry point for any Java application.
	 * The Java Virtual Machine (JVM) starts program execution from the main method.
	 * Without the main method, the program cannot be executed (the JVM needs the main method to begin execution).
	 * 
	 * @author Bharath
	 * 
	 * @version 0.1
	 * 
	 * @param args The main method accepts a single parameter, an array of strings (String[] args).
	 *             This is used to pass command-line arguments to the Java program. Although this 
	 *             method doesn’t use the parameter in this specific example, it can be used for 
	 *             passing dynamic data into the program at runtime.
	 * 
	 * @return This method does not return anything. The main method is void and serves as the starting 
	 *         point for program execution.
	 * 
	 * @throws Exception This method does not throw any exceptions by default. However, in cases 
	 *                   where the program uses file operations, networking, or other I/O tasks, 
	 *                   exceptions might be thrown.
	 * 
	 * @deprecated This method is not deprecated; however, there are alternative ways of starting
	 *             a program (such as using other frameworks or tools). But in standard Java console
	 *             applications, the main method remains the entry point.
	 * 
	 * Example:
	 * To run a simple Java program, you can execute it from the command line or an IDE, and the program
	 * will begin executing from the main method.
	 * 
	 * In this example:
	 * The statement inside the main method prints "Hello, World!" to the console and then moves 
	 * the cursor to the next line.
	 */
	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}

}
