package com.creatio.crm.java.basics;

public class ForLoops {

//	for(condition1;condition2;condition3) {  condition1 ==> where to start , condition2 ==> where to end, condition3 ==> interval
//	statements
//}

	public static void main(String[] args) {
		String name = "Prateek";

//		for (int i = 1; i <= 50000; i++) {
//			System.out.println(name);
//
//		}
//
//		for (int i = 50000; i > 0; i--) {
//			System.out.println(i + name);
//		}

		for (int i = 0; i <= 10; i++) {
			
			for (int j = 0; j <= 10; j++) {
				System.out.println(i+" "+j);
			}
			
		}

	}

}
