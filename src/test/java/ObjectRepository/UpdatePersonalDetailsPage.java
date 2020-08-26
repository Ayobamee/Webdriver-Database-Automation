package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdatePersonalDetailsPage {
	
WebDriver driver;
	
	
public  UpdatePersonalDetailsPage(WebDriver driver) {
		
this.driver=driver;
	}
	
	

By More = By.xpath("//a[contains(text(),'More')]");

By Settings = By.xpath("//a[contains(text(),'Settings')]");

By PersonalDetails = By.xpath("//h4[contains(text(),'Personal Details')]");

By FName = By.xpath("//input[@placeholder='First name']");

By LName = By.xpath("//input[@placeholder='Last name']");

By PhnName = By.xpath("//input[@placeholder='+234 808 1234 567']");

By Email = By.xpath("//input[@placeholder='Email address']");

By HAddress = By.xpath("//input[@placeholder='House address']");

By ContinueUpd = By.xpath("//button[@class='sc-AxjAm sc-AxhUy dSeJVd']");

By SuccessfulUpdate = By.xpath("//div[@class='Toastify__toast-body']");



	
public WebElement More () {
		
		return driver.findElement(More);	
			
		}


public WebElement Settings () {
	
	return driver.findElement(Settings);	
		
	}


public WebElement PersonalDetails () {
	
	return driver.findElement(PersonalDetails);	
		
	}


public WebElement FName () {
	
	return driver.findElement(FName);	
		
	}


public WebElement LName () {
	
	return driver.findElement(LName);	
		
	}


public WebElement PhnName () {
	
	return driver.findElement(PhnName);	
		
	}



public WebElement Email () {
	
	return driver.findElement(Email);	
		
	}


public WebElement HAddress () {
	
	return driver.findElement(HAddress);	
		
	}


public WebElement ContinueUpd () {
	
	return driver.findElement(ContinueUpd);	
		
	}


public WebElement SuccessfulUpdate () {
	
	return driver.findElement(SuccessfulUpdate);	
		
	}


}
