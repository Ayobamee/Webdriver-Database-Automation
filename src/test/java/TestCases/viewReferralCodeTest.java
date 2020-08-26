package TestCases;

//import java.io.FileInputStream;
import java.io.IOException;
//import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.SpacesLoginPage;
//import ObjectRepository.MerchListLoginPage;
//import ObjectRepository.SpacesLoginPage;
import ObjectRepository.ViewReferalCodePage;
import Utilities.TestBase;
//import Utilities.TestBase;

public class viewReferralCodeTest extends TestBase {

	
@Test	
	
public void viewReferralCode() throws IOException {
	
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
logincheck.PhoneNumber().sendKeys(prop.getProperty("agentPhoneNumber"));


//Click continue
logincheck.Continue().click();


//Wait 
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//Enter First Pin

logincheck.FirstPin().sendKeys(prop.getProperty("agentPin1"));

//Enter Second Pin
logincheck.SecondPin().sendKeys(prop.getProperty("agentPin2"));

//Enter Third Pin
logincheck.ThirdPin().sendKeys(prop.getProperty("agentPin3"));	

//Enter Fourth Pin
logincheck.FourthPin().sendKeys(prop.getProperty("agentPin4"));

//Enter Fifth Pin
logincheck.FifthPin().sendKeys(prop.getProperty("agentPin5"));

//Enter Sixth Pin
logincheck.SixthPin().sendKeys(prop.getProperty("agentPin6"));

//Click Login
logincheck.Login().click();

//Validate login is successful
if(logincheck.LoginConfirmation()!= null){
			
System.out.println("Login is Successful");

		}
	else{
	System.out.println("Login is Unsuccessful");
	}	

ViewReferalCodePage vr = new ViewReferalCodePage(driver);

//Wait	
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

vr.ReferalCode().click();

//To validate if the referal code populates


if(vr.ViewRefCode()!= null){
	
System.out.println("Referal code is displayed to agent user");



}else{
System.out.println("Referal code is not visible to agent user");
}



//Tear down
}
@AfterTest	
public void closePage () {
driver.quit();
		
}
	
	
	
}
