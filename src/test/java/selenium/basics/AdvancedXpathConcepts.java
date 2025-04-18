package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpathConcepts {
	
	//Syntax : referenceElement/relationship::targetElement
	
	//child,parent, ancestor, following-sibling, preceding-sibling, following, preceding, /(child), // (with in the family)
	
	//target > sibling > parent > ancestor > ancestor's parent
	
	
	// ancestor : //ul[@class='leftmenu']
	// parent : //li
	// sibling : N/A
	// target : //a[text()='Services']
	
	//ul[@class='leftmenu']/child::li/child::a[text()='Services']
	//ul[@class='leftmenu']/li/a[text()='Services']
	//ul[@class='leftmenu']//a[text()='Services']
	//li[text()='Solutions']/following-sibling::li[2]/child::a
	

	public static void main(String[] args) {
		
//		1. Launch the Browser window (Browser = Chrome)  		
		WebDriver driver = new ChromeDriver();		

//		2. Maximize the browser window   
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies  
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://parabank.parasoft.com/parabank/index.htm)
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5. Locate Services Link using 'xpath' locator
		driver.findElement(By.xpath("//ul[@class='leftmenu']//a[text()='Services']"));
	

	}

}
