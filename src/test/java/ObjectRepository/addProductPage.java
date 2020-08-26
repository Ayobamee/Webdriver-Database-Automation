package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addProductPage {
	
 WebDriver driver;
	
	
public  addProductPage(WebDriver driver) {
		
this.driver=driver;
	}
	

By newProduct = By.xpath("//span[contains(text(),'New Product')]");

By productName = By.xpath("//input[@placeholder='Product name']");

By prodCategory = By.xpath("//div[@id='root']/main/div/form[2]/div/div[2]/div/div[2]/div");

By specProd = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select a product category'])[1]/following::div[8]");

By unit = By.xpath("//div[@id='root']/main/div/form[2]/div/div[3]/div/div");

By specUnit = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='What unit is the product sold in?'])[1]/following::div[8]");

By costPrice = By.xpath("//input[@placeholder='Cost price']");

By qty = By.xpath("//input[@placeholder='Quantity in stock']");

By retailPrice = By.xpath("//input[@placeholder='Retail unit price']");

By save = By.xpath("//button[@class='sc-AxjAm sc-AxhUy dSeJVd']");

By prodSuccessMessage = By.xpath("//div[@class='Toastify__toast-body']");



public WebElement newProduct () {
	
	return driver.findElement(newProduct);	
		
	}


public WebElement productName () {
	
	return driver.findElement(productName);	
		
	}




public WebElement prodCategory () {
	
	return driver.findElement(prodCategory);	
		
	}
	


public WebElement specProd () {
	
	return driver.findElement(specProd);	
		
	}


public WebElement unit () {
	
	return driver.findElement(unit);	
		
	}

public WebElement specUnit () {
	
	return driver.findElement(specUnit);	
		
	}


public WebElement costPrice () {
	
	return driver.findElement(costPrice);	
		
	}


public WebElement qty () {
	
	return driver.findElement(qty);	
		
	}

public WebElement retailPrice () {
	
	return driver.findElement(retailPrice);	
		
	}

public WebElement save () {
	
	return driver.findElement(save);	
		
	}

public WebElement prodSuccessMessage () {
	
	return driver.findElement(prodSuccessMessage);	
		
	}



}
