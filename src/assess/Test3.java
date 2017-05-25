package assess;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Test3 {

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
		
		
//		Navigate to https://www.irctc.co.in (Indian Railways Online web portal)
		driver.get("https://www.irctc.co.in");
		
//		Enter User Id
		driver.findElement(By.id("usernameId")).sendKeys("irctcsrive");
		
//		Enter Password
		driver.findElement(By.className("loginPassword")).sendKeys("barca");
		
//		Enter Captcha (Verification Code)  ===> FEASABILITY YET TO BE CHECKED
//		System.out.println(driver.findElement(By.id("cimage")).getText());
		
//		Click Login Button
		driver.findElement(By.id("loginbutton")).click();
		
//		Switch to alert box
		Alert captchaAlert = driver.switchTo().alert();
		
//		Click on OK button
		captchaAlert.accept();
		
//		Verification Point: Capture the URL and Compare with https://www.irctc.co.in/eticketing/home
		if (driver.getCurrentUrl().equals("https://www.irctc.co.in/eticketing/home"))
		{
			System.out.println("The URL matches https://www.irctc.co.in/eticketing/home");
		}
		else {
			System.out.println("The URL DOES NOT match https://www.irctc.co.in/eticketing/home");
		}
		
//		Close Browser
		driver.quit();
	}
}


