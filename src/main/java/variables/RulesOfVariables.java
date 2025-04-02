package variables;

public class RulesOfVariables {

	public static void main(String[] args) {
		
		// 1. The variable/Identifier should not be same as java reserved keywords
		 String name = "Bharath Reddy";
		// String long = "Bharath Reddy";
		
		// 2. The variable/Identifier should not be same as java literals (true, false, null)
		// String true = "Bharath Reddy";
		
		// 3. The variable/Identifier should not contain white space
		// String my name is = "Bharath Reddy";
		
		// 4. The variable/Identifier should not starts with number
		// String empName1 = "Bharath Reddy";
		// String emp1Name = "Bharath Reddy";
		// String 1empName= "Bharath Reddy";
		
		// 5. The variable/Identifier should not contain special chars
		// String emp#Name = "Bharath Reddy"; (except $, _)
		
		// 6. The variable/Identifier should be unique always
		// String name = "Amit";
		 
		// 7.  The variable/Identifier should starts with lower case when we are creating package, variable, method 
		//  it should starts with upper case when we are creating Class
		 String myNameIs ="Bharath Reddy";
		 
		// 8. The variable/Identifier should be meaningful and should have at least 3 chars and should not cross 15 chars length
		 int carNumber = 3344;
		 
		 System.out.println(name);

	}

}
 