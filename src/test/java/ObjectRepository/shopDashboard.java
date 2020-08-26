package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class shopDashboard {
	
 WebDriver driver;
	
	
public  shopDashboard(WebDriver driver) {
		
this.driver=driver;
	}
	

By totalSales = By.xpath("//p[@class='sc-fzoiQi sc-fzoXWK sc-ptcDc obhpD']");

By totalOwed = By.xpath("//p[@class='sc-fzoiQi sc-fzoXWK sc-ptcDc fbzqDT']");

By inventory = By.xpath("//p[@class='sc-fzoiQi sc-fzoXWK sc-ptcDc bteMVL']");




public WebElement totalSales () {
	
	return driver.findElement(totalSales);	
		
	}



public WebElement totalOwed () {
	
	return driver.findElement(totalOwed);	
		
	}


public WebElement inventory () {
	
	return driver.findElement(inventory);	
		
	}



}
