package nonAccessModifiers;

public abstract class AbsClass1 {

	//abstract (method and class) ==> can allow method without body 
	
	//method ==> collection of statements / Block of code 
	
	abstract void launchTheBrowserAndLaunchTheApplication();

	void enterCredentialsAndLogin(){
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");  //no data returned
	}

	void logoutAndCloseBrowser(){
		System.out.println("Logout from application");
		System.out.println("Close the browser"); //no data returned
	}

}
