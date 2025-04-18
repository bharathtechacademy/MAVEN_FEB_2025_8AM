package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorConcepts {
	
	//Syntax : RelativeLocator.with(targetElement).DIRECTION(referenceElement)
	
	//above, below, toLeftOf, toRightOf, near

	public static void main(String[] args) {
		
//		1. Launch the Browser window (Browser = Chrome)  		
		WebDriver driver = new ChromeDriver();		

//		2. Maximize the browser window   
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies  
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://parabank.parasoft.com/parabank/index.htm)
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5. Locate Services Link using 'relative' locator
		driver.findElement(RelativeLocator.with(By.linkText("Services")).above(By.xpath("//a[text()='Products']")));
		driver.findElement(RelativeLocator.with(By.linkText("Services")).below(By.xpath("//a[text()='About Us']")));
		driver.findElement(RelativeLocator.with(By.linkText("Services")).near(By.xpath("//a[text()='Solutions']")));

	}

}
