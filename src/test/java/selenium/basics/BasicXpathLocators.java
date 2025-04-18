package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicXpathLocators {
	
	// Xpath ==> XML Path ==> Identifying the elements by using the html tags 
	
	// Absolute Xpath ==> It will be full Xpath starts with '/' . ==> It will begin from /html.....till target element ==> /html/body/div[1]/div[1]/a[2]/img
	// Relative Xpath ==> It will be short Xpath starts with '//' ==> It will focus mainly on target element (If required we can use relationship with near by elements)
	
	
	/******************* BASIC XPATH (LEVEL 1) **********************/
	// Syntax 1: //tagName[@Attribute='Attribute-Value']
	// Syntax 2: //tagName[text()='Text-Value']
	
	/******************* BASIC XPATH (LEVEL 2) **********************/
	/***When there are any lengthy attribute value/ text value cut-down by using contains/starts-with***/
	
	// Syntax 3: //tagName[contains(@Attribute,'Partial-Attribute-Value')]
	// Syntax 4: //tagName[contains(text(),'Partial-Text-Value')]
	
	// Syntax 5: //tagName[starts-with(@Attribute,'Partial-Attribute-Value-StartsWith')]
	// Syntax 6: //tagName[starts-with(text(),'Partial-Text-Value-StartsWith')]
	
	/******************* BASIC XPATH (LEVEL 3) **********************/
	/***When we are unable to locate the unique element using single attribute or text value, we can combine multiple by using 'and' ***/
	
	// Syntax 7: //tagName[@Attribute1='Attribute-Value' and @Attribute2='Attribute-Value' and text()='Text-Value']
	

	public static void main(String[] args) {
		
//		1. Launch the Browser window (Browser = Chrome)  		
		WebDriver driver = new ChromeDriver();		

//		2. Maximize the browser window   
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies  
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://parabank.parasoft.com/parabank/index.htm)
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5. Locate Logo using 'xpath' locator - Syntax 1
		driver.findElement(By.xpath("//img[@class='logo']"));
		
//		6. Locate Caption using 'xpath' locator - Syntax 2
		driver.findElement(By.xpath("//p[text()='Experience the difference']"));
		
//		7. Locate Logo using 'xpath' locator - Syntax 3
		driver.findElement(By.xpath("//img[contains(@src,'logo')]"));
		
//		8. Locate Caption using 'xpath' locator - Syntax 4
		driver.findElement(By.xpath("//p[contains(text(),'difference')]"));
		
//		9. Locate Logo using 'xpath' locator - Syntax 5
		driver.findElement(By.xpath("//img[starts-with(@src,'images/logo')]"));
		
//		10. Locate Caption using 'xpath' locator - Syntax 6
		driver.findElement(By.xpath("//p[starts-with(text(),'Experience')]"));
		
//		11. Locate Logo using 'xpath' locator - Syntax 7
		driver.findElement(By.xpath("//img[@class='logo' and @title='ParaBank' and @alt='ParaBank']"));
		
//		12. Locate Caption using 'xpath' locator - Syntax 7
		driver.findElement(By.xpath("//p[@class='caption' and text()='Experience the difference']"));

	}

}
