package selenium.webactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWebActions2 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//1. Launch browser window(Chrome)
		driver = new ChromeDriver();
		
		//2. Maximize the browser window
		driver.manage().window().maximize();

		//3. Delete all the cookies
		driver.manage().deleteAllCookies();
		
		//4. Enter URL and Launch the application (https://demoqa.com/automation-practice-form)
		driver.get("https://demoqa.com/automation-practice-form");
				
		//5. Wait for Page-load
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[text()='Practice Form']"), 0));

		//6. Enter First name and Last name
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		
		firstName.sendKeys("Bharath");
		lastName.sendKeys("Reddy");
					
		//7. Enter Email
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("BharathTechAcademy@gmail.com");
						
		//8. Select Gender 
		selectGender("Male");
						
		//9. Enter mobile number
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobileNumber.sendKeys("9553220022");
						
		//10.Select DOB (1-Feb-1991)
		selectDOB("1","February","1991");
						
		//11.Search and Select "Computer Science"
		selectSubject("Computer Science");
						
		//12.Select Hobbies as Sports and Reading
		String [] hobbies = {"Sports","Reading"};
		selectHobbies(hobbies);
						
		//13.Upload photo
		uploadPhoto("C:\\Users\\india\\Downloads\\IMG.png");					
						
		//17.Submit Details
		WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", submitButton);
						
		//18. Close browser window
		driver.quit();


	}

	public static void selectGender(String option) {
		WebElement gender = driver.findElement(By.xpath("//label[text()='"+option+"']"));
		gender.click();
	}
	
	public static void selectDOB(String date, String month, String year) {
		
		//open the calendar
		WebElement calendar = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		calendar.click();
		
		//wait for the calendar
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//select[@class='react-datepicker__month-select']"), 0));
		
		//Select month
		WebElement monthDrp = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select selectMonth = new Select(monthDrp);
		selectMonth.selectByVisibleText(month);
		
		//Select year
		WebElement yearDrp = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select selectYear = new Select(yearDrp);
		selectYear.selectByVisibleText(year);

		//Select date
		WebElement dateField = driver.findElement(By.xpath("//div[contains(@aria-label,'"+month+"') and text()='"+date+"']"));
		dateField.click();		
	}
	
	public static void selectSubject(String subjectName) {
		WebElement subjects = driver.findElement(By.xpath("//div[contains(@class,'subjects-auto-complete__value-container')]"));
		
		//scroll down till subjects element
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", subjects);
		
		//Enter Subject name
		Actions actions = new Actions(driver);
		actions.sendKeys(subjects, subjectName).perform();
		
		//wait until suggestions are getting displayed
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[contains(@class,'option') and text()='"+subjectName+"']"), 0));
		
		//Select the subject from suggestion
		WebElement subject = driver.findElement(By.xpath("//div[contains(@class,'option') and text()='"+subjectName+"']"));
		subject.click();		
	}
	
	public static void selectHobbies(String [] options) {
		for(String option : options) {
			WebElement hobby = driver.findElement(By.xpath("//label[text()='"+option+"']"));
			if(!hobby.isSelected()) {
				hobby.click();
			}
		}		
	}
	
	public static void uploadPhoto(String filePath) {
		WebElement uploadPhoto = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		uploadPhoto.sendKeys(filePath);
	}
	
}
