package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicLocators {
	
//	1. id  ==> id attribute's value  ==> inspect the element and verify is there any id value available (id = "abc") , then id locator is "abc"
//	2. name ==> name attribute's value  ==> inspect the element and verify is there any name value available (name = "xyz") , then name locator is "xyz"
//	3. className ==> class attribute's value  ==> inspect the element and verify is there any class value available (class = "cdf") , then class locator is "cdf"
//	4. tagName  ==> HtmlTag value of web element
//	5. linkText ==> Text value of Hyperlink
//	6. partialLinkText  ==> Partial Text value of Hyperlink
	
	
	// Locator ==> By.id("APjFqb")  ==> Datatype is  "By"
	// WebElement ==> driver.findElement(By.id("APjFqb"));  ==> Datatype is   "WebElement"
	

	public static void main(String[] args) {
		
//		1. Launch the Browser window (Browser = Chrome)  		
		WebDriver driver = new ChromeDriver();		

//		2. Maximize the browser window   
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies  
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://www.google.co.in/)
		driver.get("https://www.google.co.in/");
		
//		5. Locate Google search box using 'id' locator
		driver.findElement(By.id("APjFqb"));
		
//		6. Locate Google search box using 'name' locator
		driver.findElement(By.name("q"));
		
//		7. Locate Google search box using 'className' locator
		driver.findElement(By.className("gLFyf"));
				
//		8. Locate Google search box using 'tagName' locator
		driver.findElement(By.tagName("textarea"));	
		
//		9. Locate How Search Works link using 'linkText' locator	
		driver.findElement(By.linkText(" How Search works "));
		
//		10. Locate How Search Works link using 'partialLinkText' locator	
		driver.findElement(By.partialLinkText("Search works"));
		
	}

}
