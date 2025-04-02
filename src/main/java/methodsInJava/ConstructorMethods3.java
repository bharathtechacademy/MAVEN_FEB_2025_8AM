package methodsInJava;

import java.util.List;

public class ConstructorMethods3 {
	
	int empId = 0;

	// parameterized constructor
	ConstructorMethods3(int EmpId) {
		empId=EmpId;//1234
	}
	
	public void printEmpPersonalDetails(String empName) {
		System.out.println("Employee id is " + empId);
		System.out.println("Employee name is " + empName);
	}

	public void printEmpAddressDetails(String empAddress) {
		System.out.println("Employee id is " + empId);
		System.out.println("Employee Address is " + empAddress);
	}

	public void printEmpVisaDetails( String visaNum) {
		System.out.println("Employee id is " + empId);
		System.out.println("Employee visa number is " + visaNum);
	}

	// default constructor
	ConstructorMethods3() {

	}

}
