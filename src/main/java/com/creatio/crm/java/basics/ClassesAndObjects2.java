package com.creatio.crm.java.basics;

public class ClassesAndObjects2 {
	
	// Object ==> new instance of class .

	public static void main(String[] args) {
		
		ClassesAndObjects1 obj = new ClassesAndObjects1();
		
		System.out.println(obj.name);
		System.out.println(obj.empId);
		obj.hobbies[0] ="Dance";		
		System.out.println(obj.hobbies[0]);
	}

}
