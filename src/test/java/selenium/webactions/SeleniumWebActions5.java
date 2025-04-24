package selenium.webactions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebActions5 {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		//1.Launch Chrome Browser
		driver = new ChromeDriver();
		
		//2.Maximize the browser window
		driver.manage().window().maximize();
				
		//3.Launch the application
		driver.get("https://demoqa.com/frames");
				
		//4.Locate elements
		WebElement mainWindowElement = driver.findElement(By.xpath("//h1[text()='Frames']"));
		WebElement logo = driver.findElement(By.xpath("//img[contains(@src,'Toolsqa')]"));
		
		takeScreenShot(logo,"logo.png");
	
		//switch to frame from main window
		driver.switchTo().frame("frame1");
		
		//Locate frame element
		WebElement frameElement = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));					
		
		//5.Print frame element text
		System.out.println(frameElement.getText());
		
		//switch back to the main window from frame
		driver.switchTo().defaultContent();
					
		//6.Print main window element text
		System.out.println(mainWindowElement.getText());
		
		takeScreenShot(driver, "window.png");
				
		//7.Close browser window
		driver.quit();

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
