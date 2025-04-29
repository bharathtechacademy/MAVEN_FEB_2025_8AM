package framework.tesng.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppCommons extends WebCommons{
	
	@Test
	public void TestCase1() {
//		Assert.fail("Test Case 1 Failed");
		System.out.println("Test Case 1 - Home Page Validations Executed Successfully...");
	}
	
	@Test
	public void TestCase2() {
		System.out.println("Test Case 2 - Add Product to Cart Feature Validations Executed Successfully...");
	}	
	

	@Test(dataProvider="test3")
	public void TestCase3(String username, String password) {
		System.out.println("Test Case 3 - Login Validations Executed Successfully with..."+username+" ,"+password);
	}

}
