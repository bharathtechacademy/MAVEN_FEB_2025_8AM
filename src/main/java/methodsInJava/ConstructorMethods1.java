package methodsInJava;

public class ConstructorMethods1 {
	
	
	public void printEmpPersonalDetails(int empId, String empName) {
		System.out.println("Employee id is "+empId);
		System.out.println("Employee name is "+empName);
	}
	
	public void printEmpAddressDetails(int empId, String empAddress) {
		System.out.println("Employee id is "+empId);
		System.out.println("Employee Address is "+empAddress);
	}
	
	public void printEmpVisaDetails(int empId, String visaNum) {
		System.out.println("Employee id is "+empId);
		System.out.println("Employee visa number is "+visaNum);
	}
	
	
	
	//default constructor
	ConstructorMethods1(){
		
	}
	
	//parameterized constructor
	ConstructorMethods1(String name){
		
	}

}
