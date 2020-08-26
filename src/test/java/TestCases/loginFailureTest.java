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

public class loginFailureTest {
public WebDriver driver;

	
//Open Browser and maximize screen.
@BeforeTest
public void SetUp () {
System.out.println("Browser opened");
driver=Utilities.DriverFactory.open("chrome");

driver.manage().window().maximize();
 

	}
	
	
@Test	
	
public void LoginFailure() throws IOException {
Properties prop = new Properties();
FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//SpacesData//datadriven.properties");
prop.load(fis);		
		
//Open Website
driver.get(prop.getProperty("URL"));  


//Call Object repo
	
SpacesLoginPage sp = new SpacesLoginPage(driver);


//Wait	
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

sp.Refresh().click();

//Click Continue with PhoneNumber 
sp.CPhoneNumber().click();

//Wait	
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//Enter PhoneNumber
sp.PhoneNumber().sendKeys(prop.getProperty("agentPhoneNumber"));


//Click continue
sp.Continue().click();



//Wait 
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//Enter First Pin
WebElement FirstPin = sp.FirstPin();
FirstPin.sendKeys(prop.getProperty("merchantPin1"));

//Enter Second Pin
WebElement SecondPin = sp.SecondPin();
SecondPin.sendKeys(prop.getProperty("merchantPin1"));	

//Enter Third Pin
WebElement ThirdPin = sp.ThirdPin();
ThirdPin.sendKeys(prop.getProperty("merchantPin1"));	

//Enter Fourth Pin
WebElement FourthPin = sp.FourthPin();
FourthPin.sendKeys(prop.getProperty("merchantPin1"));

//Enter Fifth Pin
WebElement FifthPin = sp.FifthPin();
FifthPin.sendKeys(prop.getProperty("merchantPin1"));

//Enter Sixth Pin
WebElement SixthPin = sp.SixthPin();
SixthPin.sendKeys(prop.getProperty("merchantPin1"));

//Click Login
WebElement Login = sp.Login();
Login.click();


//Validate login is unsuccessful
if(sp.LoginError()!= null){
	
System.out.println("Login is Unsuccessful");


}else{
System.out.println("Test failed");
}


//Tear down
}
@AfterTest	
public void closePage () {
driver.quit();
		
}
	
	
	
}
