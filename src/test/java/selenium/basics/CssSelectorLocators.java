package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocators {
	
	// Syntax 1: tagName#id
	
	// Syntax 2: tagName.className
	
	// Syntax 3: tagName[Attribute='Attribute-Value']

	public static void main(String[] args) {
		
//		1. Launch the Browser window (Browser = Chrome)  		
		WebDriver driver = new ChromeDriver();		

//		2. Maximize the browser window   
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies  
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://www.google.co.in/)
		driver.get("https://www.google.co.in/");
		
//		5. Locate Google search text box using 'cssSelector' locator -syntax 1
		driver.findElement(By.cssSelector("textarea#APjFqb"));
		
//		6. Locate Google search text box using 'cssSelector' locator -syntax 2
		driver.findElement(By.cssSelector("textarea.gLFyf"));
		
//		7. Locate Google search text box using 'cssSelector' locator -syntax 3
		driver.findElement(By.cssSelector("textarea[title='Search']"));
		

	}

}
