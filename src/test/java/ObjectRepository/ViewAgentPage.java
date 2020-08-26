package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewAgentPage {
	
WebDriver driver;
	
	
public  ViewAgentPage(WebDriver driver) {
		
this.driver=driver;
	}
	
	
By Agents = By.xpath("//section[2]//div[2]//a[2]//div[1]");

By ListAgent = By.xpath("//p[@class='sc-qcrOD lgHeMB']");

By DisplayAgent = By.xpath("//header[@class='sc-fzozJi dteCCc']");



	
	
public WebElement Agents () {
		
		return driver.findElement(Agents);	
			
		}
	


public WebElement ListAgent () {
	
	return driver.findElement(ListAgent);	
		
	}


public WebElement DisplayAgent () {
	
	return driver.findElement(DisplayAgent);	
		
	}


}
