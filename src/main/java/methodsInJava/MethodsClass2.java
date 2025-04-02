package methodsInJava;

public class MethodsClass2 {

	public static void main(String[] args) {
		
		MethodsClass2 obj = new MethodsClass2();

		System.out.println("***************Test Case 1*****************");
//		System.out.println("Launch the chrome browser");
//		System.out.println("Enter url as www.icici.com and launch application");
//		System.out.println("Enter username as Bharath");
//		System.out.println("Enter password as bharath123");
//		System.out.println("Click on Login button");

		obj.launchTheBrowserAndLaunchTheApplication();
		obj.enterCredentialsAndLogin();
		System.out.println("Execute Test Case 1 Steps Related to Login Page....");
		obj.logoutAndCloseBrowser();
		
//		System.out.println("Logout from application");
//		System.out.println("Close the browser");

		System.out.println("***************Test Case 2*****************");
//		System.out.println("Launch the chrome browser");
//		System.out.println("Enter url as www.icici.com and launch application");
//		System.out.println("Enter username as Bharath");
//		System.out.println("Enter password as bharath123");
//		System.out.println("Click on Login button");
		
		obj.launchTheBrowserAndLaunchTheApplication();
		obj.enterCredentialsAndLogin();
		System.out.println("Execute Test Case 2 Steps Related to HomePage....");
		obj.logoutAndCloseBrowser();
		
//		System.out.println("Logout from application");
//		System.out.println("Close the browser");

		System.out.println("***************Test Case 3*****************");
//		System.out.println("Launch the chrome browser");
//		System.out.println("Enter url as www.icici.com and launch application");
//		System.out.println("Enter username as Bharath");
//		System.out.println("Enter password as bharath123");
//		System.out.println("Click on Login button");
		
		obj.launchTheBrowserAndLaunchTheApplication();
		obj.enterCredentialsAndLogin();
		System.out.println("Execute Test Case 3 Steps Related to Fund Transfer Page....");
		obj.logoutAndCloseBrowser();
		
//		System.out.println("Logout from application");
//		System.out.println("Close the browser");

		System.out.println("***************Test Case 4*****************");
//		System.out.println("Launch the chrome browser");
//		System.out.println("Enter url as www.icici.com and launch application");
//		System.out.println("Enter username as Bharath");
//		System.out.println("Enter password as bharath123");
//		System.out.println("Click on Login button");
		
		obj.launchTheBrowserAndLaunchTheApplication();
		obj.enterCredentialsAndLogin();
		System.out.println("Execute Test Case 4 Steps Related to Check the balance Page....");
		obj.getAccountBalance();
		obj.logoutAndCloseBrowser();
		
//		System.out.println("Navigate to account section");
//		System.out.println("Capture the Account balance");
//		double balance = 1000.50;

//		System.out.println("Logout from application");
//		System.out.println("Close the browser");
	}		
	

	void launchTheBrowserAndLaunchTheApplication(){
		System.out.println("Launch the edge browser");
		System.out.println("Enter url as www.icici.com and launch application"); //no data returned
	}

	void enterCredentialsAndLogin(){
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");  //no data returned
	}

	void logoutAndCloseBrowser(){
		System.out.println("Logout from application");
		System.out.println("Close the browser"); //no data returned
	}
	
	double getAccountBalance(){
		System.out.println("Navigate to account section");
		System.out.println("Capture the Account balance");
		double balance = 1000.50;
		return balance;  //returning data
	}

}
