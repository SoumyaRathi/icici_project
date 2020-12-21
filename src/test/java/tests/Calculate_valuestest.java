package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Calculate_values;
import pages.FDcalculatorpage;

public class Calculate_valuestest {
	private WebDriver driver;
	FDcalculatorpage fdcalculatorpage;
	Calculate_values calculate_values;
	
	@BeforeClass
	public void setup() {
	driver = getDriver();
		//fdcalculatorpage = new FDcalculatorpage(driver);
		calculate_values = new Calculate_values(driver);
	}
	
  private WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}

@Test
  public void print() {
	  System.out.println(driver.getCurrentUrl());
	  
  }
  @Test
  public void f() {
  }
}
