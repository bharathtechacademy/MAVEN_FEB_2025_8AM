package variables;

public class TypesOfVariables1 {

	public static void main(String[] args) {
		
		//Local Variable
		TypesOfVariables obj = new TypesOfVariables();
		// System.out.println(obj.name);
		
		// Instance Variables
		TypesOfVariables obj1 = new TypesOfVariables();
		System.out.println(obj1.empName);
		
		// Global Variable
		System.out.println(TypesOfVariables.phone);

	}

}
