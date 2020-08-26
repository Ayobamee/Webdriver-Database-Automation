package TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import ObjectRepository.MerchListLoginPage;
import ObjectRepository.SpacesLoginPage;
import ObjectRepository.TransactionPage;

public class ViewTransactionTest {
public WebDriver driver;

	
	
//Open Browser and maximize screen.
@BeforeTest
public void SetUp () {
System.out.println("Browser opened");
driver=Utilities.DriverFactory.open("chrome");
driver.manage().window().maximize();

	}
	
	
@Test	
	
public void ViewTransactions() throws IOException {
Properties prop = new Properties();
FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//SpacesData//datadriven.properties");
prop.load(fis);		
		
//Open Website
driver.get(prop.getProperty("URL"));  


//Call Object repo			
SpacesLoginPage sp = new SpacesLoginPage(driver);

TransactionPage tp = new TransactionPage(driver);

///Wait	
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


// Click Transactions
tp.Transactions().click();

//Wait 
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

tp.ViewTrans().click();




//Validate that Transactions are populating
driver.get(prop.getProperty("TransactionBaseURL"));
String actualTitle2= driver.getTitle();


if(actualTitle2.equals(prop.getProperty("ExpectedTransactionBaseURL"))){
System.out.println("Transactions are populating");
}
else{
System.out.println("Transactions are not populating");
}



//Tear down
}
@AfterTest	
public void closePage () {
driver.quit();
		
}

	
	
	
}
