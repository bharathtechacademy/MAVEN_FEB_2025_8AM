package com.creatio.crm.java.basics;

public class JumpingStatements {

	// Jumping Statements ==> Skip the execution

	// break; --> Break the complete loop
	// continue; --> Skip the current iteration only
	// return; --> return from the method and stop execution

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {

			if (i > 4 && i < 7) {
				//break;//break the loop
				continue;//skip current iteration
			}

			System.out.println(i);
		}

	}

}
