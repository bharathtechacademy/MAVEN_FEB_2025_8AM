package nonAccessModifiers;

public class IEDriver implements WebDriver{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void click() {
		WebDriver.getBrowserSessionId();		
	}

	@Override
	public void sendKeys(String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

}
