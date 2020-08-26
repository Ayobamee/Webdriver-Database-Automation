package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewMerchantPage {
	
WebDriver driver;
	
	
public  ViewMerchantPage(WebDriver driver) {
		
this.driver=driver;
	}
	

By Merchants = By.xpath("//section[2]//div[2]//a[1]//div[1]");


By DisplayMerchant = By.xpath("//div[@class='Toastify']");



	
	
public WebElement Merchants () {
		
		return driver.findElement(Merchants);	
			
		}
	




public WebElement DisplayMerchant () {
	
	return driver.findElement(DisplayMerchant);	
		
	}


}
