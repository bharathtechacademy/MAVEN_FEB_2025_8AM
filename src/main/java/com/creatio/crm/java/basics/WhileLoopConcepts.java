package com.creatio.crm.java.basics;

public class WhileLoopConcepts {
	
//	while(conditionToEneter) {
//		//Statements
		// condition to break loop
//	}

	public static void main(String[] args) {
		
		int i = 0;

		while (i>0) {
			i++;
			if(i>100) {
				break; //break the loop
			}
			System.out.println("Refresh The Page");
			
		}
	}

}
