package nonAccessModifiers;

public interface InterfaceClass1 {
	
	final static String name ="bharath";
	
	//Interface ==> 100 % Abstract Class (only abstract methods are allowed)
	
	abstract void launchTheBrowserAndLaunchTheApplication();

	void enterCredentialsAndLogin(String arg1 , String arg2);

	void logoutAndCloseBrowser();	


}
