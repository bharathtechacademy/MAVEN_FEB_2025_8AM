package selenium.basics;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertionsConcepts {

	public static void main(String[] args) {
		
		//Hard Assertions (for validation) ==> When expected result not matching with actual result it will fail the program immediately 
		//Hard Assertions are static methods
		
		Assert.assertEquals("Bharath", "Bharath");
		Assert.assertNotEquals("Bharath", "Sharath");
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		Assert.assertNull(null);
		Assert.assertNotNull(123);
//		Assert.fail("Intentionally Failed");
		
		
		//Soft Assertions (for verification) ==> When expected result not matching with actual result it will fail the program at the end  
		//Soft Assertions are non-static methods
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("Bharath", "Sharath");
		softAssert.assertNotEquals("Bharath", "Bharath");
		softAssert.assertTrue(false);
		softAssert.assertFalse(true);
		softAssert.assertNull(123);
		softAssert.assertNotNull(null);
		softAssert.fail("Intentionally Failed");
		softAssert.assertAll();
		System.out.println("Execution Completed");
	}

}
