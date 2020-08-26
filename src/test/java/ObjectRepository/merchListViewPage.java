package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class merchListViewPage {
	
WebDriver driver;
	
	
public  merchListViewPage(WebDriver driver) {
		
this.driver=driver;
	}
	
	
By merchList = By.xpath("//div[@class='sc-psRme iSgaxe']");

By successfulMerchlistNavigation = By.xpath("//h1[@class='sc-fzoLsD fYZyZu']");




	
	
public WebElement merchList () {
		
		return driver.findElement(merchList);	
			
		}
	


public WebElement successfulMerchlistNavigation () {
	
	return driver.findElement(successfulMerchlistNavigation);	
		
	}





}
