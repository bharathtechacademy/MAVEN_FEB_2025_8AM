package variables;

public class TypesOfVariables {
	
	// 1. Local Variable  ==> The variable initialized inside the method locally , We can access this variable only inside the same method
	// 2. Instance Variable / Class Variable ==> The variable initialized inside the class and out side of any method. Whenever we want to access this variable, we can access by creating an object 
	// 3. Global Variable / Static Variable ==> The variable initialized inside the class and out side of any method along with static keyword at the beginning.
	// Whenever we want to access this variable, we don't need to create any object by simply taking reference of class name
	
	
	// Instance Variable
	String empName = "Bharath Reddy";
	
	// Global Variable / Static Variable
	static long phone = 9553220022L;

	public static void main(String[] args) {
		
		//Local Variables
		String name = "Bharath Tech Academy";
		long phone = 9553220022L;
		System.out.println(name);	
		System.out.println(phone);
		
		// Instance Variable
		TypesOfVariables obj = new TypesOfVariables();
		System.out.println(obj.empName);
		
		// Global Variable
		System.out.println(TypesOfVariables.phone);
	}


}
