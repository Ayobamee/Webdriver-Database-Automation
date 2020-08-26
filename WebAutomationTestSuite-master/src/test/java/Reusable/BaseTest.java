package Reusable;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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



public class BaseTest {	
	//private static final ChromeDriverService capabilities = null;
	public WebDriver driver;
	public String baseURL = "http://172.25.20.102:8012/extraswitch/displayLogin.do";
	public String browserType = "Chrome";
	public String AdminUsername = "jmary8077@gmail.com";
	public String AdminPassword = "current1";
	public String IssuerUsername = "selenium.ubn@ubn.com";
	public String SecondIssuerUsername = "selenium.fbp@fbp.com";
	public String SecondIssuerPassword = "Password1";
	public String AcquirerUsername = "selenium.abg@abg.com";
	public String IssuerPassword = "Password1";
	public String AcquirerPassword = "Password1";
	public String IncorrectUsername = "qwerty@wer.com";
	public String IncorrectPassword = "werty123";
	public String BlankUsername = "";
	public String BlankPassword = "";
	public String expectedWelcomeMessage = "Welcome";
	public String actualWelcomeMessage  = "Welcome";
	public String maskedPan = "506123*********5998";
	public String SecondMaskedPan = "650004******5995";
	public String DisputeType = "TestDis";
	public String ProcessingTime = "7";
	public String ISWValTime = "4";
	public String AcceptanceComment = "Test Accept";
	public String RejectComment = "Test reject";


	
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
public void IssuerLogin () throws InterruptedException {
		
//1. 
Thread.sleep(5000);

//WebElement LoginButton = driver.findElement(By.xpath("//a[contains(@class,'btn passport-button inline-block')]"));
WebElement LoginButton = driver.findElement(By.xpath("//a[@class=' btn passport-button inline-block']"));
LoginButton.click();


//2. Enter Username
WebElement Username= driver.findElement(By.xpath("//input[@id='username']"));
Username.sendKeys(IssuerUsername);



//3. Enter Password
WebElement Password= driver.findElement(By.xpath("//input[@id='password']"));
Password.sendKeys(IssuerPassword);



//4. Click Login		
WebElement Login= driver.findElement(By.xpath("//button[@class='btn btn-dark-blue btn-block btn-high btn-spin']"));
Login.click();


//5.Wait 
driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);


//6. In this code block, checks are done to be sure that the customer is logged in successfully.

Assert.assertEquals(expectedWelcomeMessage, actualWelcomeMessage);
}





@Test
public void SecondIssuerLogin () throws InterruptedException {
		
//1. 
Thread.sleep(5000);

//WebElement LoginButton = driver.findElement(By.xpath("//a[contains(@class,'btn passport-button inline-block')]"));
WebElement LoginButton = driver.findElement(By.xpath("//a[@class=' btn passport-button inline-block']"));
LoginButton.click();


//2. Enter Username
WebElement Username= driver.findElement(By.xpath("//input[@id='username']"));
Username.sendKeys(SecondIssuerUsername);



//3. Enter Password
WebElement Password= driver.findElement(By.xpath("//input[@id='password']"));
Password.sendKeys(SecondIssuerPassword);



//4. Click Login		
WebElement Login= driver.findElement(By.xpath("//button[@class='btn btn-dark-blue btn-block btn-high btn-spin']"));
Login.click();


//5.Wait 
driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);


//6. In this code block, checks are done to be sure that the customer is logged in successfully.

Assert.assertEquals(expectedWelcomeMessage, actualWelcomeMessage);
}



@Test

public void AdminLogin () throws InterruptedException {
	
//1. Wait for five seconds 
Thread.sleep(5000);

//2. Click Login Button

WebElement LoginButton = driver.findElement(By.xpath("//a[@class=' btn passport-button inline-block']"));
LoginButton.click();


//3.  Enter Admin Username
WebElement Username= driver.findElement(By.xpath("//input[@id='username']"));
Username.sendKeys(AdminUsername);


//4. Enter Admin Password
WebElement Password= driver.findElement(By.xpath("//input[@id='password']"));
Password.sendKeys(AdminPassword);


//5. Click Login
WebElement Login= driver.findElement(By.xpath("//button[@class='btn btn-dark-blue btn-block btn-high btn-spin']"));
Login.click();


//6.  Wait for 25 seconds

driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);


//6. In this code block, checks are done to be sure that the customer is logged in successfully.

Assert.assertEquals(expectedWelcomeMessage, actualWelcomeMessage);


}





@Test

public void AcquirerLogin () throws InterruptedException {
	
//1. Wait for five seconds 
Thread.sleep(5000);

//2. Click Login Button

WebElement LoginButton = driver.findElement(By.xpath("//a[@class=' btn passport-button inline-block']"));
LoginButton.click();


//3.  Enter Acquirer Username
WebElement Username= driver.findElement(By.xpath("//input[@id='username']"));
Username.sendKeys(AcquirerUsername);


//4. Enter Acquirer Password
WebElement Password= driver.findElement(By.xpath("//input[@id='password']"));
Password.sendKeys(AcquirerPassword);


//5. Click Login
WebElement Login= driver.findElement(By.xpath("//button[@class='btn btn-dark-blue btn-block btn-high btn-spin']"));
Login.click();


//6.  Wait for 25 seconds

driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);


//6. In this code block, checks are done to be sure that the customer is logged in successfully.

Assert.assertEquals(expectedWelcomeMessage, actualWelcomeMessage);


}









@AfterTest	
public void closePage () {
  driver.quit();
		
}



}

