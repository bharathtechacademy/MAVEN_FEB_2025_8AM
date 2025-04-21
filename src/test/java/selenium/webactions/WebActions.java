package selenium.webactions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebActions {

	public static void main(String[] args) throws IOException {
		
//		1. Launch the Browser window (Browser = Chrome)  		
		WebDriver driver = new ChromeDriver();		

//		2. Maximize the browser window   
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies  
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://www.google.co.in/)
		driver.get("https://www.google.co.in/");
		
//		5. Locate the web element
		WebElement element = driver.findElement(By.xpath("//element"));
		
		/********** Common Web Actions**********/
		
		// Check if the element is displayed on the page
		element.isDisplayed(); //boolean
		
		// Check if the element is enabled on the page
		element.isEnabled(); //boolean
		
		// Check if the element is selected (if it is a checkbox)
		element.isSelected(); //boolean

        /************* Regular Element Specific Actions *************/

        /********** Button Element **********/		
		WebElement button = driver.findElement(By.xpath("//button"));
		
		// Get the label of the button
		String label1 = button.getText(); //if label is added as text value
		String label2 = button.getAttribute("value");//if label is added as attribute value
		
		// Click on the button
		button.click();
		
		// double click
		Actions actions = new Actions(driver);
		actions.doubleClick(button).perform();
		
		// right click
		actions.contextClick(button).perform();
		
		// move the mouse pointer towards button
		actions.moveToElement(button).perform();
		
		// drag and drop 
		actions.dragAndDrop(button,button).perform();
		
		// Click on the hidden element
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", button);
		
		// Scroll and Click on the hidden element when element is at the bottom of the page
		js.executeScript("arguments[0].scrollIntoView()", button);
		button.click();
		
		/********** Textbox Element **********/
		WebElement textbox = driver.findElement(By.xpath("//input"));
		
		// Clear the textbox
		textbox.clear();
		
		// Enter text into the textbox
		textbox.sendKeys("Text Value");
		
		// Enter text using Actions class to type chars & function keys
		actions.sendKeys(textbox,"Text Value").perform();
		actions.sendKeys(textbox,"Text Value"+Keys.ENTER).perform();
		
		// Type text in disabled text box /hidden text box
		js.executeScript("arguments[0].value='Text-Value'", textbox);
		
		/********** Dropdown Element **********/
		WebElement dropdown = driver.findElement(By.xpath("//select"));
		
		Select s = new Select(dropdown);
		
		// Get all options available in the dropdown
		List<WebElement> options = s.getOptions();
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
		
		// Select options from a dropdown
		s.selectByVisibleText("Text-Value");
		s.selectByValue("Value");
		s.selectByIndex(0);
		
		// Verify the selected option
		WebElement selectedOption = s.getFirstSelectedOption();
		System.out.println(selectedOption.getText());
		
		// Verify whether dropdown is multi-select dropdown
		s.isMultiple(); //boolean
		
		// Select and de-select options
		s.selectByVisibleText("Text-Value");
		s.selectByValue("Value");
		s.selectByIndex(0);

		s.deselectByVisibleText("Text-Value");
		s.deselectByValue("Value");
		s.deselectByIndex(0);
		
		/********** Checkbox Element **********/
		WebElement checkbox = driver.findElement(By.xpath("//input"));


		// select the checkbox if it is not selected already
		if(!checkbox.isSelected()) {
			checkbox.click();
		}
		
		/********** Radio Button Element **********/
		WebElement radioButton = driver.findElement(By.xpath("//input"));
		
		//Click on the radio button
		radioButton.click();
		
		/********** Text Element / Label  **********/
		WebElement text = driver.findElement(By.xpath("//input"));

		String text1 = text.getText(); //if text is added as text value
		String text2 = text.getAttribute("value");//if text is added as attribute value
		String text3 = text.getDomAttribute("value");//if text is added as attribute value
		
		/********** Hyperlink Element **********/
		WebElement hyperlink = driver.findElement(By.xpath("//input"));

		 // Verify the URL in the hyperlink using href value
		String link1 = hyperlink.getAttribute("href");

		// Verify the URL in the hyperlink by clicking on the link and check the updated url 
		hyperlink.click();
		String link2 = driver.getCurrentUrl();
		
		/********** Image Element **********/
		WebElement image = driver.findElement(By.xpath("//img"));

		// Verify if the image element is displayed
		image.isDisplayed();
		
		// Verify image is valid
		String sourceOfImage = image.getAttribute("src");
		
		// Verify the image dimensions
		int width = image.getSize().getWidth();
		int height = image.getSize().getHeight();
		
		// Get the position of the image
		Point imagePosition = image.getLocation();
		int x = imagePosition.getX();
		int y = imagePosition.getY();
		
		// verify a specific pixel color
		int colorCode = ImageIO.read(new File(sourceOfImage)).getRGB(x,y);



		
	}

}
