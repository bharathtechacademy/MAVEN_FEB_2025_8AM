package selenium.webactions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentXReporter;

public class SeleniumWebActions7 {
	static WebDriver driver ;
	
	public static ExtentHtmlReporter html = null; //empty html report ==> white paper
	public static ExtentReports extent = null; //to set configurations & start printing process ==> printer
	public static ExtentTest logger = null; // to print with different colors
	
	// method to create empty html report
	public static void setupReport() {
		html = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\Reports\\AutomationReport.html");
		extent = new ExtentReports();
		extent.attachReporter(html);
	}
	
	//method to start printing process for specific test
	public static void startReporting(String testName) {
		logger = extent.createTest(testName);
		logger.info("Test Execution started for Test Case :"+testName);
	}
	
	//method to attach screenshots in report
	public static void attachScreenshot(String screenshotName) {
		try {
			logger.addScreenCaptureFromPath(takeScreenShot(driver, screenshotName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//method to stop printing process
	public static void stopReporting() {
		extent.flush();
	}
	
	public static void log(String status, String message) {
		if(status.equalsIgnoreCase("pass"))
			logger.pass(message);
		else if(status.equalsIgnoreCase("fail"))
			logger.fail(message);
		else if(status.equalsIgnoreCase("warning"))
			logger.warning(message);
		else if(status.equalsIgnoreCase("info"))
			logger.info(message);
	}
	

	public static void main(String[] args) {
		
		setupReport();
		
		//Test Case 1
		startReporting("Verify Login Feature");
		
		//1. Launch browser window(Chrome)
		driver = new ChromeDriver();
		
		log("pass", "Browser Launched Successfully");
	       
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
		log("pass", "Application Launched Successfully");
       
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
		log("pass", "Update User credentials");


		               
		//9. Verify button label (LOG IN) and Click on Login Button
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		String actualLabel = loginBtn.getAttribute("value").toUpperCase();
		String expLabel = "LOG IN";
		Assert.assertEquals(actualLabel, expLabel);
		
		loginBtn.click();
		log("pass", "Clicked on Login button");

		               
		//10. Verify error message is coming
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//p[@class='error']"), 0));
		log("fail", "Getting Error While Login");
		attachScreenshot("LoginError");
		
		stopReporting();
		
		
		//Test Case 2

		startReporting("Verify Admin Page");
		//11. Click on Admin page link
		WebElement adminPageLink = driver.findElement(By.xpath("//a[text()='Admin Page']"));
		adminPageLink.click();
		log("pass", "Clicked  on Admin Page Link");

		       
		//12. Wait for admin page
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[contains(text(),'Administration')]"), 0));
		log("pass", "Admin Page is Launched Successfully");

		   
		//13. Select Data access mode as ' SOAP'
		selectDataAccessMode("soap");
		log("pass", "Selected DBA mode as 'soap'");

		       
		//14. Scroll-down till Loan provider
		WebElement loanProviderDropdown = driver.findElement(By.xpath("//select[@id='loanProvider']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", loanProviderDropdown);
		
		Select s = new Select(loanProviderDropdown);
		           
		//15. Select Loanprovider as 'Web Service'
		s.selectByVisibleText("Web Service");
		log("pass", "Selected Loan Provider as 'Web Service'");

		           
		//16. Click on Submit button
		WebElement submitBtn = driver.findElement(By.xpath("//input[@value='Submit']"));
		submitBtn.click();
		
		//17.wait for Successful submission message
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//b[text()='Settings saved successfully.']"), 0));
		log("pass", "Admin Page settings saved Successfully");
		stopReporting();
		
		
		//Test Case 3
     
		//18.Click on Services Link
		WebElement servicesLink = driver.findElement(By.xpath("//ul[@class='leftmenu']//a[text()='Services']"));
		servicesLink.click();
		               
		//19.Wait for Services page
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//span[text()='Bookstore services:']"), 0));
		       
		//20.Scrolldown till Bookstore services
		WebElement bookStoreServices = driver.findElement(By.xpath("//span[text()='Bookstore services:']"));
		
		js.executeScript("arguments[0].scrollIntoView()", bookStoreServices);
		   
		//21.Get total rows, columns in the bookstore service table
		List<WebElement> rows = driver.findElements(By.xpath("//span[text()='Bookstore services:']//following-sibling::table[1]//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//span[text()='Bookstore services:']//following-sibling::table[1]//tr[1]//td"));
		
		int totalRows = rows.size();
		int totalColumns = columns.size();
		
		System.out.println("Total Rows :"+totalRows);
		System.out.println("Total Columns :"+totalColumns);

		//22.Get Column headers of book store services table
		System.out.println("Column Headers are :");
		for(WebElement col : columns) {
			System.out.println(col.getText());
		}
		               
		//23.Get all the data from book store service table
		for(int r=1; r<=totalRows ; r++) {
			for(int c=1; c<=totalColumns ; c++) {
				WebElement cell = driver.findElement(By.xpath("//span[text()='Bookstore services:']//following-sibling::table[1]//tr["+r+"]//td["+c+"]"));
				System.out.println("Row "+r+" Column "+c+ " Value is : "+cell.getText());
			}
		}
		   
		//24.Close browser window
		driver.quit();

	}
	
	public static void selectDataAccessMode(String option){
		WebElement dataMode = driver.findElement(By.xpath("//input[@value='"+option+"']"));
		dataMode.click();
	}
	
	public static String takeScreenShot(WebElement element, String screenshotName) throws IOException {
		String filePath = System.getProperty("user.dir")+"\\Screenshots\\"+screenshotName;
		File file =element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(filePath));		
		return filePath;		
	}
	
	public static String takeScreenShot(WebDriver driver, String screenshotName) throws IOException {
		String filePath = System.getProperty("user.dir")+"\\Screenshots\\"+screenshotName;
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(filePath));		
		return filePath;		
	}

}
