package nonAccessModifiers;

public class AbsClass2 extends AbsClass1{

	public static void main(String[] args) {
//		AbsClass1 obj = new AbsClass1();
//		obj.enterCredentialsAndLogin();
	}

	@Override
	void launchTheBrowserAndLaunchTheApplication() {
		System.out.println("Launch Chrome Browser");
		
	}
	
	void enterCredentialsAndLogin(){
		System.out.println("Enter username as Gogu");
		System.out.println("Enter password as gogu123");
		System.out.println("Click on Login button");  //no data returned
	}


}
