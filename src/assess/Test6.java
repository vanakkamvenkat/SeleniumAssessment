package assess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver; 
		
		System.setProperty("webdriver.chrome.driver", ".//Selenium Webdrivers//chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver" , ".//Selenium Webdrivers//geckodriver.exe");
		
//		Launch the browser
		driver = new ChromeDriver();
//		driver = new FirefoxDriver();	
		
//		To run the window in maximised mode
		driver.manage().window().maximize();
		
//		Navigate to http://jqueryui.com/droppable/
		driver.get("http://jqueryui.com/droppable/");
		
//		Declaring an actions variable
		Actions movements = new Actions(driver);
		
//		The drag elements are present within a frame and it loads after the page load is complete. 
//		Hence a wait is required for the frame to load and shift the focus to it.
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
		
//		Dragger contains properties of the webelement to be moved
//		Location contains the name of the webelement the dragger has to be moved to
		WebElement dragger = driver.findElement(By.xpath("html/body/div[1]"));
		WebElement location = driver.findElement(By.xpath("html/body/div[2]"));
		
//		Click on the object (left mouse press)
		movements.clickAndHold(dragger).build().perform();
	
//		Move mouse to the destination
		movements.moveToElement(location).build().perform();
		
//		Release the mouse left button
		movements.release(dragger).build().perform();
		
//		Close the browser 
		driver.quit();
	}

}
