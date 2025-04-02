package com.creatio.crm.java.basics;


//Inheritance ==> extending parent class properties into child class without creating an object


// child extends parent

public class ClassesAndObjects3 extends ClassesAndObjects1{

	public void main(String[] args) {
		
		ClassesAndObjects1 obj = new ClassesAndObjects3();
		
		
		System.out.println(obj.name);
	}

}
