package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransactionPage {
	
WebDriver driver;
	
	
public  TransactionPage(WebDriver driver) {
		
this.driver=driver;
	}
	

By Transactions = By.xpath("//a[contains(text(),'Transactions')]");

By ViewTrans = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='June 2020'])[1]/following::*[name()='svg'][1]");




public WebElement Transactions () {
	
	return driver.findElement(Transactions);	
		
	}



public WebElement ViewTrans () {
	
	return driver.findElement(ViewTrans);	
		
	}




}
