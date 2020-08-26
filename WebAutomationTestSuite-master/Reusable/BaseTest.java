package Reusable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class BaseTest {
	
	WebDriver driver;
	
	
	public String baseURL = "https://fbnmobile-admin.azurewebsites.net/Account/Login?ReturnUrl=%2F";
	public String browserType = "Chrome";
	public String CorrectUsername = "SN027710";
	public String NonprofiledUsername = "sn029034";
	public String CorrectPassword = "password";
	public String InCorrectPassword = "skyNet@1.com";
	public String BlankUsername = "";
	public String BlankPassword = "";
	public String Token = "123456";
	
	
@Test

public void SuccessfulLoginTest () {
	
	System.out.println("Start execution");
	
	        //1. Enter Username.
			WebElement email= driver.findElement(By.name("StaffId"));
			email.sendKeys(CorrectUsername);
					
			//2. Enter Password.
			WebElement password = driver.findElement(By.name("Password"));
			password.sendKeys(CorrectPassword);
			
			//4. Click Login.	
			WebElement login = driver.findElement(By.xpath("//button[@id='login-btn']"));
			login.click();
			
			//5. Wait before clicking.
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			//6. Enter token.
			WebElement token = driver.findElement(By.xpath("//input[@id='Token']"));
			token.sendKeys(Token);
			
			
           //7. Wait before clicking submit.
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//8. Click submit
			WebElement submit = driver.findElement(By.xpath("//button[@id='token-btn']"));
			submit.click();
									
			
}





@Test

public void CreateDepartment () {
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	WebElement Clickdept = driver.findElement(By.xpath("//a[contains(text(),'Departments')]"));
	Clickdept.click();
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	WebElement Inputdept = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]"));
	Inputdept.sendKeys("Test4Dept");
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	WebElement SaveDept = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/button[1]"));
	SaveDept.click();

}


 @BeforeTest
public void setUp () {
	System.out.println("Opening browser");
	driver = Utilities.DriverFactory.open(browserType);//Choose Chrome
	driver.get(baseURL);                                //Open Browser
}
 
// @AfterTest	
//	public void closePage () {
//    	System.out.println("Close Browser");
//    	driver.quit();
//		
//	}

}
