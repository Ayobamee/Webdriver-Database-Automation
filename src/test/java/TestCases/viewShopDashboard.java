package TestCases;

//import java.io.FileInputStream;
import java.io.IOException;
//import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.SpacesLoginPage;
//import ObjectRepository.MerchListLoginPage;
//import ObjectRepository.SpacesLoginPage;
//import ObjectRepository.ViewReferalCodePage;
import ObjectRepository.createSimpleSalesPage;
import ObjectRepository.shopDashboard;
import Utilities.TestBase;
//import Utilities.TestBase;

public class viewShopDashboard extends TestBase {


	
@Test	
	
public void viewShopDashboardcheck() throws IOException {
	

//Open Base Url
driver = initializeDriver();
		
//Call Object repository
SpacesLoginPage logincheck = new SpacesLoginPage(driver);
		
//Wait for 20 s.
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
logincheck.Refresh().click();

//Click Continue with PhoneNumber 
logincheck.CPhoneNumber().click();

//Wait	
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//Enter PhoneNumber
logincheck.PhoneNumber().sendKeys(prop.getProperty("merchantPhoneNumber"));

//Click continue
logincheck.Continue().click();

//Wait 
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//Enter First Pin

logincheck.FirstPin().sendKeys(prop.getProperty("merchantPin1"));

//Enter Second Pin
logincheck.SecondPin().sendKeys(prop.getProperty("merchantPin2"));

//Enter Third Pin
logincheck.ThirdPin().sendKeys(prop.getProperty("merchantPin3"));	

//Enter Fourth Pin
logincheck.FourthPin().sendKeys(prop.getProperty("merchantPin4"));

//Enter Fifth Pin
logincheck.FifthPin().sendKeys(prop.getProperty("merchantPin5"));

//Enter Sixth Pin
logincheck.SixthPin().sendKeys(prop.getProperty("merchantPin6"));

//Click Login
logincheck.Login().click();

//Validate login is successful
if(logincheck.LoginConfirmation()!= null){
			
System.out.println("Login as  merchant is Successful");

		}
	else{
		System.out.println("Login as merchant is Unsuccessful");
		}
		
//Import Simple sales repo	
createSimpleSalesPage simpleSales = new createSimpleSalesPage(driver);

//Wait	
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

// Select shop
simpleSales.shop().click();

//Wait	
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


// Import shop dashboard repo
shopDashboard viewDash = new shopDashboard(driver);

//Validate dashboard elements are displayed
if(viewDash.totalSales()!= null && viewDash.totalOwed()!=null && viewDash.inventory()!=null){
			
System.out.println("Total Sales,Total Owed and Inventory shop items are populating");

		}
	else{
		System.out.println("My shop Dashboard elements are not populating");
		}



//Tear down
}
@AfterTest	
public void closePage () {
driver.quit();
		
}
	
	
	
}
