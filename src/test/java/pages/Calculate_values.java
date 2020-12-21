package pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Calculate_values {
	private WebDriver driver;
	
  public Calculate_values(WebDriver driver) {
	  this.driver =driver;
	  
		// TODO Auto-generated constructor stub
	}
  public boolean verifyFDcalculatorpageTitle() {
		String expectedTitle = "FD Calculator | Fixed Deposit Interest Calculator - ICICI Bank";
		return driver.getTitle().equals(expectedTitle);
  }
}
