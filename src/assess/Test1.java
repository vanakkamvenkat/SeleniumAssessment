package assess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver; 
		
//		System.setProperty("webdriver.ie.driver", ".//Selenium Webdrivers//IEDriverServer.exe");
//		System.setProperty("webdriver.opera.driver", ".//Selenium Webdrivers//operadriver.exe");
		System.setProperty("webdriver.edge.driver", ".//Selenium Webdrivers//MicrosoftWebDriver.exe");
//		System.setProperty("webdriver.chrome.driver", ".//Selenium Webdrivers//chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver" , ".//Selenium Webdrivers//geckodriver.exe");
		
//		driver = new InternetExplorerDriver();
//		driver = new OperaDriver();
		driver = new EdgeDriver();
//		driver = new ChromeDriver();
//		driver = new FirefoxDriver();	
		
//		To run the window in maximised mode
		driver.manage().window().maximize();
		
//		Navigate to Selenium page in Wikipedia.org (https://en.wikipedia.org/wiki/Selenium_%28software%29)
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");

//		Click "Create Account" Link
		driver.findElement(By.linkText("Create account")).click();
		Thread.sleep(5000); //Thread required to allow next page to load, Else it fails in FF & Edge
		
//		Capture Current Url
		String [] urls = new String [2]; //Declaring array to store all URLs in one variable
		urls[0] = driver.getCurrentUrl();
		
//		Navigate back to Selenium Page
		driver.navigate().back();
		
//		Click "seleniumhq.org" Link
		driver.findElement(By.linkText("www.seleniumhq.org")).click();
		Thread.sleep(5000); //Thread required to allow next page to load, Else it fails in FF & Edge

//		Capture Current Url
		urls[1] = driver.getCurrentUrl();
		
//		Close Browser
		driver.quit();
		
//		Check if the First and Second URL are Internal Link or not?
		for (int i = 0; i < urls.length ; i++)
		{
			if (urls[i].contains("https://en.wikipedia.org"))
			{
				System.out.println("The " + (i+1) + " URL is an Internal Link");
			}
			else
			{
				System.out.println("The " + (i+1) + " URL is an External Link");
			}
		}
	}
}
