package assess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver; 
		
//		System.setProperty("webdriver.ie.driver", ".//Selenium Webdrivers//IEDriverServer.exe");
		System.setProperty("webdriver.opera.driver", ".//Selenium Webdrivers//operadriver.exe");
//		System.setProperty("webdriver.edge.driver", ".//Selenium Webdrivers//MicrosoftWebDriver.exe");
//		System.setProperty("webdriver.chrome.driver", ".//Selenium Webdrivers//chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver" , ".//Selenium Webdrivers//geckodriver.exe");
		
//		Launch the browser
//		driver = new InternetExplorerDriver();
		driver = new OperaDriver();
//		driver = new EdgeDriver();
//		driver = new ChromeDriver();
//		driver = new FirefoxDriver();	
		
//		To run the window in maximised mode
		driver.manage().window().maximize();

//		Navigate to http://www.gcrit.com/build3/
		driver.get("http://www.gcrit.com/build3/");
		
//		Click "login" Link
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[1]/a[1]/u")).click();
		
//		Enter Email Address
		driver.findElement(By.name("email_address")).sendKeys("20170525150500abcd@xyz.com");
		
//		Enter Password
		driver.findElement(By.name("password")).sendKeys("abcd1234");
		
//		Click "Sign In" Button
		driver.findElement(By.id("tdb5")).click();
		
//		Verification Point: Capture current url and compare with http://www.gcrit.com/build3/index.php
		if (driver.getCurrentUrl().equals("http://www.gcrit.com/build3/index.php")) {
			System.out.println("The URL matches the expected result");
		} else {
			System.out.println("The URL DOES NOT match the expected result");
		}
		
//		Close the browser
		driver.quit();
		
	}

}
