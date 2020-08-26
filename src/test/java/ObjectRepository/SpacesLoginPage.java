package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpacesLoginPage {
	
WebDriver driver;
	
	
public  SpacesLoginPage(WebDriver driver) {
		
this.driver=driver;
	}
	

By Refresh = By.xpath("//div[@id='root']/div/button");

By CPhoneNumber = By.linkText("Continue with phone number");

By PhoneNumber = By.name("phoneNumber");

By Continue = By.xpath("//button[@class='sc-AxjAm sc-AxhUy ldJsig']");

By FirstPin = By.xpath("//input[@id='1']");

By SecondPin = By.xpath("//input[@id='2']");

By ThirdPin = By.xpath("//input[@id='3']");

By FourthPin = By.xpath("//input[@id='4']");

By FifthPin = By.xpath("//input[@id='5']");

By SixthPin = By.xpath("//input[@id='6']");

By Login = By.xpath("//button[@class='sc-AxjAm sc-AxhUy dSeJVd']");

By LoginConfirmation = By.xpath("/html[1]/body[1]/div[1]/main[1]/header[1]/img[1]");

By LoginError = By.xpath("//div[@class='Toastify__toast Toastify__toast--error']");





public WebElement Refresh () {
	
	return driver.findElement(Refresh);	
		
	}


	
	
public WebElement CPhoneNumber () {
		
		return driver.findElement(CPhoneNumber);	
			
		}
	
	
public WebElement PhoneNumber () {
		
		return driver.findElement(PhoneNumber);	
			
		}
	

public WebElement Continue () {
	
	return driver.findElement(Continue);	
		
	}
	
	
public WebElement FirstPin () {
	
	return driver.findElement(FirstPin);	
		
	}


public WebElement SecondPin () {
	
	return driver.findElement(SecondPin);	
		
	}

public WebElement ThirdPin () {
	
	return driver.findElement(ThirdPin);	
		
	}
	

public WebElement FourthPin () {
	
	return driver.findElement(FourthPin);	
		
	}


public WebElement FifthPin () {
	
	return driver.findElement(FifthPin);	
		
	}


public WebElement SixthPin () {
	
	return driver.findElement(SixthPin);	
		
	}


public WebElement Login () {
	
	return driver.findElement(Login);	
		
	}


public WebElement LoginConfirmation () {
	
	return driver.findElement(LoginConfirmation);	
		
	}



public WebElement LoginError () {
	
	return driver.findElement(LoginError);	
		
	}


}
