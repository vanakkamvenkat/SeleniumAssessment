package assess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeywordDrivenMethods {

	static WebDriver driver;
	
	public void browserLaunch (String browser) {
		
		switch (browser.toLowerCase()) {
		
			case "chrome":
				System.setProperty("webdriver.chrome.driver", ".//Selenium Webdrivers//chromedriver.exe");
				driver = new ChromeDriver();
				break;
			
			case "firefox":
				System.setProperty("webdriver.gecko.driver", ".//Selenium Webdrivers//geckodriver.exe");
				driver = new FirefoxDriver();
				break;
				
			case "edge":
				System.setProperty("webdriver.edge.driver", ".//Selenium Webdrivers//MicrosoftWebDriver.exe");
				driver = new EdgeDriver();
				break;
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
	}
	
	public void flightBooking () throws InterruptedException {
		driver.findElement(By.id("FromTag")).sendKeys("Chennai, IN - Chennai Airport (MAA)");
		driver.findElement(By.id("ToTag")).sendKeys("Madurai, IN - Madurai (IXM)");
		driver.findElement(By.id("DepartDate")).sendKeys("Fri, 30 Jun, 2017");
		driver.findElement(By.id("SearchBtn")).click();
		Thread.sleep(10000);
		driver.quit();
	}
	
	public void trainBooking () {
//		driver.findElement(By.xpath(".//*[@href='/trains']")).click();
		driver.get("https://www.cleartrip.com/trains");
		driver.findElement(By.id("from_station")).sendKeys("Chennai Central (MAS)");
		driver.findElement(By.id("to_station")).sendKeys("Madurai Junction (MDU)");
		driver.findElement(By.id("dpt_date")).sendKeys("30/6/2017");
		Select trainclass = new Select(driver.findElement(By.id("trainClass")));
//		trainclass.deselectAll();
		trainclass.selectByValue("1A");
		driver.findElement(By.id("trainFormButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Train name"))));
		driver.quit();
	}
	
	
}
