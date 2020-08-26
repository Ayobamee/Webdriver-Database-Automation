package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.SpacesLoginPage;

//import ObjectRepository.MerchListLoginPage;

public class LoginTest { 
	public WebDriver driver;
	public Properties prop;
	
	@BeforeTest
	public WebDriver openBaseURL () throws IOException {
	prop = new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\SpacesData\\datadriven.properties");
	prop.load(fis);	
	
	if (prop.getProperty("browser").equals("chrome")){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver83.exe");
		 driver = new ChromeDriver();
	
	
	}
	
	else if(prop.getProperty("browser").equals("firefox")) {
		 driver = new FirefoxDriver();
		
	}
	
	else {
		
		 driver = new InternetExplorerDriver();
		
	}
	return driver;
	}
	
	@Test
	
	public WebDriver login () {
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(prop.getProperty("URL"));
	
	//Call Object repo	
	//MerchListLoginPage ml = new MerchListLoginPage(driver);

	//Wait for 20 s.
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


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
	
	
	return driver;

	}
	
	

	@AfterTest	
	public void closePage () {
	driver.quit();
			

	
	}
	
	}
