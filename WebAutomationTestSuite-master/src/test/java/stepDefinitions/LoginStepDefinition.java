package stepDefinitions;
import cucumber.api.java.en.And;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
//import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import java.util.concurrent.TimeUnit;
//import java.util.concurrent.TimeUnit;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
import org.testng.Assert;

import Reusable.BaseTest;


//import Utilities.DriverFactory;

@RunWith(Cucumber.class)
public class LoginStepDefinition  {
	

//Invoke the Webdriver
BaseTest dr = new BaseTest();	

@Given("^User opens the application URL on chrome browser$")
public void user_opens_the_application_url_on_chrome_browser() throws Throwable {
    dr.SetUp();
}


	 
@When("^User enters appropriate username and password is entered and user clicks login$")
public void user_enters_appropriate_username_and_password_is_entered_and_user_clicks_login() throws Throwable {
	
	WebElement LoginButton = dr.driver.findElement(By.xpath("//a[contains(@class,'btn passport-button inline-block')]"));
	LoginButton.click();
	
	WebElement Username= dr.driver.findElement(By.xpath("//input[@id='login_username']"));
	Username.sendKeys(dr.IssuerUsername);

	//2. Enter Password
	WebElement Password= dr.driver.findElement(By.xpath("//input[@id='login_password']"));
	Password.sendKeys(dr.IssuerPassword);

	//3. Enter 		
	WebElement Login= dr.driver.findElement(By.xpath("//button[@class='btn btn-dark-blue btn-block btn-high btn-spin']"));
	Login.click();

	//4.Wait 
	dr.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
}

  
	    
@Then("^User should be logged into the application$")
public void user_should_be_logged_into_the_application() throws Throwable {
	Assert.assertEquals(dr.expectedWelcomeMessage, dr.actualWelcomeMessage);}


@And("^Close the browser$")
public void close_the_browser() throws Throwable {
  dr.closePage();
} 
    	 
}