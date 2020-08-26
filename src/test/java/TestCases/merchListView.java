package TestCases;
//import java.io.FileInputStream;
import java.io.IOException;
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.SpacesLoginPage;
//import ObjectRepository.ViewAgentPage;
import ObjectRepository.merchListViewPage;
//import ObjectRepository.MerchListLoginPage;
//import ObjectRepository.SpacesLoginPage;
//import Utilities.LoginTest;
import Utilities.TestBase;

public class merchListView extends TestBase {

@Test	
	
public void merchListViewCheck() throws IOException {

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
		
System.out.println("Login attempt as agent user is Successful");

	}
else{
System.out.println("Login attempt as agent user is unsuccessful");
}


//Import Merch List repo
merchListViewPage mL = new merchListViewPage(driver);
mL.merchList().click();



//Validate Merchlist view is successful
if(mL.successfulMerchlistNavigation()!= null){
		
System.out.println("Merch list navigation is successful");

	}
else{
System.out.println("Merch list navigation is unsuccessful");
}


	}

@AfterTest	
public void closePage () {
driver.quit();
		
}
	
	
}
