package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewReferalCodePage {
	
WebDriver driver;
	
	
public  ViewReferalCodePage(WebDriver driver) {
		
this.driver=driver;
	}
	

By ReferalCode = By.xpath("//a[contains(text(),'Referral')]");

By ViewRefCode = By.xpath("//nav[@class='sc-pjumZ gUhPC']");



public WebElement ReferalCode () {
	
	return driver.findElement(ReferalCode);	
		
	}


public WebElement ViewRefCode () {
	
	return driver.findElement(ViewRefCode);	
		
	}


}
