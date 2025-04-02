package nonAccessModifiers;

public interface WebDriver {
	
	public void click();
	
	public void sendKeys(String text);
	
	public boolean isDisplayed();
	
	public default void getDarkTheme() {
		System.out.println("This is not applicable");
		getPagetitle();
	}	
	
	public static void getBrowserSessionId() {
		System.out.println("Open Browser");
		System.out.println("Copy Session Id");
	}
	
	private String getPagetitle() {
		System.out.println("Copy Page Title");
		return "title";
	}

}
