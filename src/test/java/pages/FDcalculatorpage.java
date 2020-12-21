package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FDcalculatorpage {
	private WebDriver driver;
	//private  By iframe = By.className("pmiframe");
	public By typeofFD = By.id("ddlTypeOfFixedDeposit");
	public By quarterly = By.id("quarterly_payout");
	private By amount = By.id("private By quarterly = By.id");
	private By maturity_value = By.xpath("//*[@id=\"spnMaturityValue\"]");
	private By agg_interest = By.xpath("//*[@id=\"spnAIAmount\"]");
	private By tenure = By.id("idDays");
	private By no_of_days = By.xpath("//*[@id=\"tenureDay\"]");
	private By aggregateint = By.id("spnAIAmount");
	private By maturity_value2 = By.id("spnMaturityValue");
	private By logo = By.xpath("//*[@id=\"main\"]/div[1]/div[2]/a");

	
public FDcalculatorpage(WebDriver driver) {
	this.driver=driver;
		// TODO Auto-generated constructor stub
	}
/*public boolean verifyTitle() {
	String expectedTitle = "Fixed Deposit Calculator - Calculate FD Interest Rates & Fixed Deposit Maturity - ICICI Bank";
	return driver.getTitle().equals(expectedTitle);
}*/


private void goTocalculate() {
	   WebElement frameElement = driver.findElement(By.className("pmiframe"));
	   driver.switchTo().frame(frameElement);
	 //  System.out.println(driver.getCurrentUrl());
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   //driver.switchTo().frame(iframe);
	//driver.findElement(frame).switchTo().;
	driver.findElement(typeofFD).click();
	driver.findElement(quarterly).click();
	
	
}

public Calculate_values gotoCalculate_values() {
	  WebElement frameElement = driver.findElement(By.className("pmiframe"));
	   driver.switchTo().frame(frameElement);

	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 driver.findElement(typeofFD).click();
		driver.findElement(quarterly).click();
	
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	 
	return new Calculate_values(driver);
}

public boolean verifyFDcalculatorpageTitle() {
	String expectedTitle = "FD Calculator | Fixed Deposit Interest Calculator - ICICI Bank";
	return driver.getTitle().equals(expectedTitle);
	// TODO Auto-generated method stub
	//return false;
}

}
 
