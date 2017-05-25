package assess;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver; 
		
//		System.setProperty("webdriver.ie.driver", ".//Selenium Webdrivers//IEDriverServer.exe");
//		System.setProperty("webdriver.opera.driver", ".//Selenium Webdrivers//operadriver.exe");
//		System.setProperty("webdriver.edge.driver", ".//Selenium Webdrivers//MicrosoftWebDriver.exe");
		System.setProperty("webdriver.chrome.driver", ".//Selenium Webdrivers//chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver" , ".//Selenium Webdrivers//geckodriver.exe");
		
//		Launch the browser
//		driver = new InternetExplorerDriver();
//		driver = new OperaDriver();
//		driver = new EdgeDriver();
		driver = new ChromeDriver();
//		driver = new FirefoxDriver();	
		
//		To run the window in maximised mode
		driver.manage().window().maximize();
		
//		Navigate to http://gcrit.com/build3/
		driver.get("http://gcrit.com/build3/");
		
//		Click the “create an account”
		driver.findElement(By.linkText("create an account")).click();;
		
//		Enter all Mandatory fields
		//Gender Radio button 
		driver.findElement(By.xpath(".//*[@value='f']")).click();
		
		//First Name text box
		String firstName = "Maria";
		driver.findElement(By.name("firstname")).sendKeys(firstName);
		
		//Last Name text box
		driver.findElement(By.name("lastname")).sendKeys("Sharapova");
		
		//Date of birth text box
		driver.findElement(By.id("dob")).sendKeys("01/01/1980");
		
		//Email text box
		driver.findElement(By.name("email_address")).sendKeys("20170525150500abcd@xyz.com");
				
		//Street Address text box
		driver.findElement(By.name("street_address")).sendKeys("Main road");
		
		//Post code text box
		driver.findElement(By.name("postcode")).sendKeys("400001");
		
		//City text box
		driver.findElement(By.name("city")).sendKeys("Chennai");
		
		//State text box
		driver.findElement(By.name("state")).sendKeys("TN");
		
		//Country drop down box
		Select countryDropdown = new Select (driver.findElement(By.name("country")));
		countryDropdown.selectByIndex(99); //India
		
		//Telephone number text box
		driver.findElement(By.name("telephone")).sendKeys("044-400001");
		
		//Password text box
		driver.findElement(By.name("password")).sendKeys("abcd1234");
		
		//Confirm password text box
		driver.findElement(By.name("confirmation")).sendKeys("abcd1234");
		
		//Confirm button
		driver.findElement(By.id("tdb4")).click();
		
		//Verification Point: Capture conformation message and compare with expected.
		String expectedConfirmation = "Your Account Has Been Created!"; 
		String actualConfirmation = driver.findElement(By.xpath("html/body/div[1]/div[3]/h1")).getText();
		
		if (actualConfirmation.equals(expectedConfirmation)) {
			System.out.println("Confirmation message is as per expected result");
		} else {
			System.out.println("Confirmation message is NOT as expected");
		}
		
//		Click "Continue" Button
		driver.findElement(By.className("ui-button-text")).click();
		
//		Close Browser
		driver.quit();
	}

}
