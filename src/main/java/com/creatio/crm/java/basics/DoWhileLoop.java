package com.creatio.crm.java.basics;

public class DoWhileLoop {

	public static void main(String[] args) {

		int i = 0;

		do {
			i++;
			if (i > 100) {
				break; // break the loop
			}
			System.out.println("Refresh The Page");

		} while (i > 0);

	}

}
