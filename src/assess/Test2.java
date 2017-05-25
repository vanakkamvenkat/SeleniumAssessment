package assess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Test2 {

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
		
		
//		Navigate to Google.com (Google Home page)
		driver.get("https://www.google.com");
		
//		Verification Point : Check the existence of Gmail link.
		try
		{
			driver.findElement(By.xpath(".//*[@data-ved='0EMIuCBQoAA']"));
			System.out.println("The Gmail link is present in the home page");
		}
		catch (Exception e)
		{
			System.out.println("The Gmail link is NOT present in the home page");
		}
		
//		Close Browser
		driver.quit();
	}
}
