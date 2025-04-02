package com.creatio.crm.java.basics;

public class ClassesAndObjects1 {
	
	String name = "Balu";
	
	static int empId = 1234;
	
	String [] hobbies = new String [3];
	
	public void main(String[] args) {
		ClassesAndObjects1 obj = new ClassesAndObjects1();
		System.out.println(obj.name);
		System.out.println(obj.hobbies);
	}

}
