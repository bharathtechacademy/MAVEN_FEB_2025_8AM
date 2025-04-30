package framework.tesng.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppCommons extends WebCommons{
	
	@Test (priority =3,groups= {"Regression"},retryAnalyzer=RetryTest.class)
	public void TestCase1() throws InterruptedException {
		Assert.fail("Error in Test Case 1");
		System.out.println("Test Case 1 Execution Started");
		Thread.sleep(3000);
		System.out.println("Test Case 1 - Home Page Validations Executed Successfully...");
	}
	
	@Test(priority =2, dependsOnMethods= {"TestCase1"},groups= {"Regression","Sanity"},enabled=false)
	public void TestCase2() throws InterruptedException {
		System.out.println("Test Case 2 Execution Started");
		Thread.sleep(3000);
		System.out.println("Test Case 2 - Add Product to Cart Feature Validations Executed Successfully...");
	}	
	

	@Test(dataProvider="test3",priority =1,groups= {"Regression","Sanity","Smoke"})
	public void TestCase3(String username, String password) throws InterruptedException {
		System.out.println("Test Case 3 Execution Started");
		Thread.sleep(3000);
		System.out.println("Test Case 3 - Login Validations Executed Successfully with..."+username+" ,"+password);
	}
	
	@Test(priority =4,groups= {"Smoke"})
	public void TestCase4() throws InterruptedException {
		System.out.println("Test Case 4 Execution Started");
		Thread.sleep(3000);
		System.out.println("Test Case 4 - Payment Feature Validations Executed Successfully...");
	}	

}
