package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedCssLocators {
	
	// Syntax : ancestor's parent > ancestor > parent > target   (ancestor's parent > ancestor > parentTag:nth-child(n) > targetTag:nth-child(n)
	
	// ul[class='leftmenu'] > li  > a[href='services.htm']

	public static void main(String[] args) {
		
//		1. Launch the Browser window (Browser = Chrome)  		
		WebDriver driver = new ChromeDriver();		

//		2. Maximize the browser window   
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies  
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://parabank.parasoft.com/parabank/index.htm)
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5. Locate Services Link using 'cssSelector' locator
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li  > a[href='services.htm']"));
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li:nth-child(3) > a[href='services.htm']"));


	}

}
