package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createIncompleteSalesPage {
	
 WebDriver driver;
	
	
public  createIncompleteSalesPage(WebDriver driver) {
		
this.driver=driver;
	}
	

By no = By.xpath("//label[contains(text(),'No')]");

By paymentAmount = By.xpath("//input[@placeholder='Payment amount']");

By phoneNumber = By.xpath("//input[@placeholder='Phone Number']");

By customerName = By.xpath("//input[@placeholder='Customer’s name']");

By successMessage = By.xpath("//div[@class='Toastify__toast-container Toastify__toast-container--bottom-center']");




public WebElement no () {
	
	return driver.findElement(no);	
		
	}


public WebElement paymentAmount () {
	
	return driver.findElement(paymentAmount);	
		
	}


public WebElement phoneNumber () {
	
	return driver.findElement(phoneNumber);	
		
	}

public WebElement customerName () {
	
	return driver.findElement(customerName);	
		
	}



public WebElement successMessage () {
	
	return driver.findElement(successMessage);	
		
	}


}
