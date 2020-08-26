package TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.AddDebitCardPage;
//import ObjectRepository.MerchListLoginPage;
import ObjectRepository.SpacesLoginPage;
import ObjectRepository.UpdatePersonalDetailsPage;

public class AddDebitCardTest {
public WebDriver driver;

	
//Open Browser and maximize screen.
@BeforeTest
public void SetUp () {
System.out.println("Browser opened");
driver=Utilities.DriverFactory.open("chrome");

driver.manage().window().maximize();
 

	}
	
	
@Test	
	
public void AddDebitCard() throws IOException {

Properties prop = new Properties();
FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\SpacesData\\datadriven.properties");
prop.load(fis);		
		
//Open Website
driver.get(prop.getProperty("URL"));  


//Call Object repo			
SpacesLoginPage sp = new SpacesLoginPage(driver);

UpdatePersonalDetailsPage up = new UpdatePersonalDetailsPage(driver);

AddDebitCardPage ad = new AddDebitCardPage(driver);

//Wait	
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

sp.Refresh().click();

//Click Continue with PhoneNumber 
sp.CPhoneNumber().click();

//Wait	
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//Enter PhoneNumber
sp.PhoneNumber().sendKeys(prop.getProperty("PhoneNumber"));


//Click continue
sp.Continue().click();



//Wait 
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//Enter First Pin
WebElement FirstPin = sp.FirstPin();
FirstPin.sendKeys(prop.getProperty("Pin1"));

//Enter Second Pin
WebElement SecondPin = sp.SecondPin();
SecondPin.sendKeys(prop.getProperty("Pin2"));	

//Enter Third Pin
WebElement ThirdPin = sp.ThirdPin();
ThirdPin.sendKeys(prop.getProperty("Pin3"));	

//Enter Fourth Pin
WebElement FourthPin = sp.FourthPin();
FourthPin.sendKeys(prop.getProperty("Pin4"));

//Enter Fifth Pin
WebElement FifthPin = sp.FifthPin();
FifthPin.sendKeys(prop.getProperty("Pin5"));

//Enter Sixth Pin
WebElement SixthPin = sp.SixthPin();
SixthPin.sendKeys(prop.getProperty("Pin6"));

//Click Login
WebElement Login = sp.Login();
Login.click();

//Validate login is successful
if(sp.LoginConfirmation()!= null){
	
System.out.println("Login is Successful");


}else{
System.out.println("Login is Unsuccessful");
}


// Wait	
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


//Click More
up.More().click();

//Click Debit card
ad.DebitCard().click();


ad.DeleteCard().click();


ad.ConfirmDelete().click();

//Wait	
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


//Click Add Debit card
ad.AddDebitCard().click();



//Enter Card Number
ad.CardNumber().sendKeys(prop.getProperty("CardNumber"));


//Enter Card expiry date.
ad.CardEx().sendKeys(prop.getProperty("CardExpiry"));



//Enter CVV
ad.CVV().sendKeys(prop.getProperty("CVV"));


//Click Continue
ad.ContinueDebit().click();

// Enter Card Pin

ad.FirstCardPin().sendKeys(prop.getProperty("DebitCardPin1"));

ad.SecondCardPin().sendKeys(prop.getProperty("DebitCardPin2"));

ad.ThirdCardPin().sendKeys(prop.getProperty("DebitCardPin3"));

ad.FourthCardPin().sendKeys(prop.getProperty("DebitCardPin4"));

// Click Send

ad.Send().click();

// Enter O.T.P

ad.Otp().sendKeys(prop.getProperty("Otp"));


// Click Add Card

ad.AddCard().click();
		
//Wait	
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

//Validate that Debit Card is successfully added
if(ad.SuccessfulCardAddMsg()!= null){
	
System.out.println("Debit card has been added Successful");


}else{
System.out.println("Oops! something went wrong");
}





//Tear down
}


@AfterTest	
public void closePage () {
driver.quit();
		
}

	
	
	
}
