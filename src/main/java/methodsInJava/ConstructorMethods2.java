package methodsInJava;

public class ConstructorMethods2 {

	public static void main(String[] args) {
		
		ConstructorMethods1 obj = new ConstructorMethods1(); //constructor method 
		
		obj.printEmpPersonalDetails(1234, "Nanthini Kumari");
		obj.printEmpAddressDetails(1234, "Chennai, TN");
		obj.printEmpVisaDetails(1234, "USNA2345Q");
		
		
		ConstructorMethods3 obj1 = new ConstructorMethods3(1234);
		obj1.printEmpPersonalDetails("Nantini Kumari");
		obj1.printEmpAddressDetails("Chennai, TN");
		obj1.printEmpVisaDetails("USNA2345Q");
		
		ConstructorMethods3 obj2 = new ConstructorMethods3(1235);
		obj2.printEmpPersonalDetails("Jamuna");
		obj2.printEmpAddressDetails("Hyd, TS");
		obj2.printEmpVisaDetails("ASGY6543F");
	}

}
