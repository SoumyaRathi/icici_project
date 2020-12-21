package base;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

//import org.apache.poi.ss.formula.functions.Function;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTestSetup {
	private WebDriver driver;
	
	@Parameters({"browserType", "appUrl"})
	@BeforeClass
	public void initializeBaseTestSetup(String browserType, String appUrl) {
		switch(browserType) {
		case "chrome":
		
			initChromeDriver(appUrl);
			break;
		case "firefox":
			initFirefoxDriver(appUrl);
			break;
			
		default:
			Reporter.log("Going ahead with the default browser as chrome");
			initChromeDriver(appUrl);
		}
	
	}

	
	
	private void initFirefoxDriver(String appUrl) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\Downloads\\forselenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	private void initChromeDriver(String appUrl) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\forselenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	
	
	@AfterClass
	public void teardown() {
		//driver.quit();
	}

}
