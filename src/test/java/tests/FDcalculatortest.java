package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import base.BaseTestSetup;
import pages.FDcalculatorpage;

public class FDcalculatortest extends BaseTestSetup{
	private WebDriver driver;
	FDcalculatorpage fdcalculatorpage;
	
	@BeforeClass
	public void setup() {
		driver = getDriver();
		fdcalculatorpage = new FDcalculatorpage(driver);
	}
	
  @Test
  public void print() {
	  System.out.println(driver.getCurrentUrl());
	  
  }
 
  
}

/*	public void verifyTitle() {
		AssertJUnit.assertTrue(fdcalculatorpage.verifyFDcalculatorpageTitle());
	}*/
