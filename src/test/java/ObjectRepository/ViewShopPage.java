package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewShopPage {
	
WebDriver driver;
	
	
public  ViewShopPage(WebDriver driver) {
		
this.driver=driver;
	}
	

By ViewShop = By.xpath("//div[@class='sc-pdKru dWhEkB']");
By ShopText = By.xpath("//h2[@class='sc-fzoXzr bvUUDK']");


public WebElement ViewShop () {
	
	return driver.findElement(ViewShop);	
		
	}


public WebElement ShopText () {
	
	return driver.findElement(ShopText);	
		
	}

	


}
