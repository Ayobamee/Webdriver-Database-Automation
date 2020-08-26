package TestCases;

//import java.io.FileInputStream;
import java.io.IOException;
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.SpacesLoginPage;
//import ObjectRepository.MerchListLoginPage;
//import ObjectRepository.SpacesLoginPage;
//import Utilities.LoginTest;
import Utilities.TestBase;

public class merchantLoginTest extends TestBase {


	
	
@Test	
	
public void merchantLoginCheck () throws IOException {

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
WebElement FirstPin = logincheck.FirstPin();
FirstPin.sendKeys(prop.getProperty("merchantPin1"));

//Enter Second Pin
WebElement SecondPin = logincheck.SecondPin();
SecondPin.sendKeys(prop.getProperty("merchantPin2"));	

//Enter Third Pin
WebElement ThirdPin = logincheck.ThirdPin();
ThirdPin.sendKeys(prop.getProperty("merchantPin3"));	

//Enter Fourth Pin
WebElement FourthPin = logincheck.FourthPin();
FourthPin.sendKeys(prop.getProperty("merchantPin4"));

//Enter Fifth Pin
WebElement FifthPin = logincheck.FifthPin();
FifthPin.sendKeys(prop.getProperty("merchantPin5"));

//Enter Sixth Pin
WebElement SixthPin = logincheck.SixthPin();
SixthPin.sendKeys(prop.getProperty("merchantPin6"));

//Click Login
WebElement Login = logincheck.Login();
Login.click();

//Validate login is successful
if(logincheck.LoginConfirmation()!= null){
		
System.out.println("Login attempt as a merchant user is Successful");

	}

else{
	System.out.println("Login attempt as a merchant is unsuccessful");
	}
	
	}

@AfterTest	
public void closePage () {
driver.quit();
		
}
	
	
}
