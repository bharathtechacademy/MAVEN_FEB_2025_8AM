package selenium.webactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumWaitMethods {
	
	//1. Implicit Wait ==> 5 sec ==> throughout the program maximum 5 sec it can wait 
	//2. Explicit Wait ==> 5 sec ==> exclusively wait for specific condition maximum 5 sec
	//3. Fluent Wait  ==> 5 sec ==> exclusively wait for specific condition maximum 5 sec along with regular interval specified (polling)

	public static void main(String[] args) {
		//1. Launch browser window(Chrome)
		WebDriver driver = new ChromeDriver();
	       
		//2. Maximize the browser window
		driver.manage().window().maximize();
		       
		//3. Delete all the cookies
		driver.manage().deleteAllCookies();
		
		//4. Enter URL and Launch the application (https://parabank.parasoft.com/parabank/index.htm)
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		       
		//5. Verify application title (ParaBank | Welcome | Online Banking)
		String actualTitle = driver.getTitle();
		String expectedTitle = "ParaBank | Welcome | Online Banking";
		Assert.assertEquals(actualTitle, expectedTitle);
		       
		//6. Verify application logo
		WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
		Assert.assertTrue(logo.isDisplayed());
		       
		//7. Verify application caption (Experience the difference)
		WebElement caption = driver.findElement(By.xpath("//p[@class='caption']"));
		String actualCaption = caption.getText();
		String expCaption = "Experience the difference";
		Assert.assertEquals(actualCaption, expCaption);
		               
		//8. Enter Invalid credentials in Username and Password textboxes
		WebElement usernameTxtb = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passwordTxtb = driver.findElement(By.xpath("//input[@name='password']"));
		
		usernameTxtb.clear();
		passwordTxtb.clear();
		
		usernameTxtb.sendKeys("Invalid User");
		passwordTxtb.sendKeys("Invalid Pass");

		               
		//9. Verify button label (LOG IN) and Click on Login Button
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		String actualLabel = loginBtn.getAttribute("value").toUpperCase();
		String expLabel = "LOG IN";
		Assert.assertEquals(actualLabel, expLabel);
		
		loginBtn.click();
		               
		//10. Verify error message is coming
		
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//explicit wait 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//p[@class='error']"), 0));
		
		//fluent wait
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2));
		fluentWait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//p[@class='error']"), 0));
		

	}

}
