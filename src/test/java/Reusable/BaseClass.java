package Reusable;


//import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriverService;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeMethod;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
//import org.testng.Assert;



public class BaseClass {	
	//private static final ChromeDriverService capabilities = null;
	public WebDriver driver;
	public String baseURL = "https://spaces-app-dev.vigventures.com/";
	public String browserType = "Chrome";
	public String UserId = "+2347060406267";
	public String Pass = "234567";
	public String IncorrectUsername = "qwerty@wer.com";
	public String IncorrectPassword = "werty123";
	public String BlankUsername = "";
	public String BlankPassword = "";
	
	
@BeforeTest
public void SetUp () {
System.out.println("Open browser"); //Open Browser
driver = Utilities.DriverFactory.open(browserType);//Choose Chrome

//driver.manage().window().fullscreen();

//driver.manage().window().setSize(new Dimension(1280,1024));

driver.manage().window().maximize();
//Dimension d = new Dimension (1382,744);

//driver.manage().window().setSize(d);

driver.get(baseURL);  

}


@Test
public void Login () throws InterruptedException {
	
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	
//1. Continue With Phone Number
driver.findElement(By.xpath("//a[contains(text(),'Continue with phone number')]")).click();
		
//2. Wait
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//3. Enter Username
WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Phone number']"));
Username.sendKeys(UserId);

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//4 Click Continue
WebElement Continue = driver.findElement(By.xpath("//button[@class='sc-AxjAm sc-AxhCb MZpqc']"));
Continue.click();


//3. Enter Username
WebElement Username2 = driver.findElement(By.xpath("//input[@placeholder='Phone number']"));
Username2.sendKeys(UserId);

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//4 Click Continue
WebElement Continue2 = driver.findElement(By.xpath("//button[@class='sc-AxjAm sc-AxhCb MZpqc']"));
Continue2.click();


//5.Wait 
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


//6. Enter Pin 1		

WebElement FirstPin = driver.findElement(By.xpath("//input[@id='1']"));
FirstPin.sendKeys("2");


//7.Wait 
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


//8.  Enter Pin 2	

WebElement SecondPin = driver.findElement(By.xpath("//input[@id='2']"));
SecondPin.sendKeys("3");

//9.Wait 
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


//10.  Enter Pin 3		

WebElement ThirdPin = driver.findElement(By.xpath("//input[@id='3']"));
ThirdPin.sendKeys("4");


//11. Click Login		

WebElement FourthPin = driver.findElement(By.xpath("//input[@id='4']"));
FourthPin.sendKeys("5");


//12.  Enter Pin 4		

WebElement FifthPin = driver.findElement(By.xpath("//input[@id='5']"));
FifthPin.sendKeys("6");


//13.  Enter Pin 5	

WebElement SixthPin = driver.findElement(By.xpath("//input[@id='6']"));
SixthPin.sendKeys("7");


//14. Click Login
WebElement Login = driver.findElement(By.xpath("//button[@class='sc-AxjAm sc-AxhCb MZpqc']"));
Login.click();


//15 . In this code block, checks are done to be sure that the customer is logged in successfully.

if(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/header[1]/img[1]"))!= null){
	
System.out.println("Login is Successful");


}else{
System.out.println("Login is Unsuccessful");
}

}




	
@AfterTest	
public void closePage () {
  driver.quit();
		
}



}

