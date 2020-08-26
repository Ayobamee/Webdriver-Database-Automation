package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createAdvancedSalesPage {
	
 WebDriver driver;
	
	
public  createAdvancedSalesPage(WebDriver driver) {
		
this.driver=driver;
	}
	

By advancedSale = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]");

By addproducts = By.xpath("//button[contains(text(),'Add product(s)')]");

By pickProduct = By.xpath("//p[contains(text(),'Automated Test Cabin')]");

By productToSale = By.xpath("//button[@class='sc-AxjAm sc-AxhUy sc-pJvzD eNLvRe']");

By paymentAmount = By.xpath("//input[@placeholder='Payment amount']");

By addSale = By.xpath("//button[@class='sc-AxjAm sc-AxhUy dSeJVd']");

By successfulAdvancedSale = By.xpath("//div[@class='Toastify__toast-body']");





public WebElement advancedSale () {
	
	return driver.findElement(advancedSale);	
		
	}


public WebElement addproducts () {
	
	return driver.findElement(addproducts);	
		
	}


public WebElement pickProduct () {
	
	return driver.findElement(pickProduct);	
		
	}

public WebElement productToSale () {
	
	return driver.findElement(productToSale);	
		
	}


public WebElement paymentAmount () {
	
	return driver.findElement(paymentAmount);	
		
	}


public WebElement addSale () {
	
	return driver.findElement(addSale);	
		
	}


public WebElement successfulAdvancedSale () {
	
	return driver.findElement(successfulAdvancedSale);	
		
	}

}
