package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createSimpleSalesPage {
	
 WebDriver driver;
	
	
public  createSimpleSalesPage(WebDriver driver) {
		
this.driver=driver;
	}
	

By shop = By.xpath("//a[1]//div[1]");

By openSale = By.xpath("//*[name()='path' and contains(@fill,'#FAFAFA')]");

By newSale = By.xpath("//span[contains(text(),'New Sale')]");

By cont = By.xpath("//button[@class='sc-AxjAm sc-AxhUy sc-fzpkJw sc-fzoant dluSIc']");

By saleAmount = By.xpath("//input[@placeholder='Sale amount']");

By addSale = By.xpath("//button[@class='sc-AxjAm sc-AxhUy dSeJVd']");

By successSaleMessage = By.xpath("//div[@class='Toastify__toast-body']");




public WebElement shop () {
	
	return driver.findElement(shop);	
		
	}


public WebElement openSale () {
	
	return driver.findElement(openSale);	
		
	}

	
public WebElement newSale () {
	
	return driver.findElement(newSale);	
		
	}
	


public WebElement cont () {

return driver.findElement(cont);	
	
}


public WebElement saleAmount () {

return driver.findElement(saleAmount);	
	
}



public WebElement addSale () {

return driver.findElement(addSale);	
	
}



public WebElement successSaleMessage () {

return driver.findElement(successSaleMessage);	
	
}



}
