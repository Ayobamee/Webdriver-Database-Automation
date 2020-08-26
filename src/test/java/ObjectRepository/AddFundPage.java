package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddFundPage {
	
WebDriver driver;
	
	
public  AddFundPage(WebDriver driver) {
		
this.driver=driver;
	}
	

By AddMoney = By.xpath("//div[@class='sc-pRTZB cgrjKw']//a//*[local-name()='svg']//*[name()='g' and contains(@fill,'none')]//*[name()='path' and contains(@fill,'#FFF')]");


By FundBox = By.xpath("//div[@id='root']/main/div/input");

By Fund = By.xpath("//button[@class='sc-AxjAm sc-AxhUy sc-pJVnX kHViHe']");

By CardSel = By.xpath("//li[1]//a[1]//*[local-name()='svg']");

By CardSel2 = By.xpath("//li[@class='sc-pciXn kKVZfa']//*[local-name()='svg']");

By SuccessNotification = By.xpath("//p[@class='sc-fzqNJr sc-fznxsB sc-pIjat etXpRu']");



public WebElement AddMoney () {
	
	return driver.findElement(AddMoney);	
		
	}


public WebElement FundBox () {
	
	return driver.findElement(FundBox);	
		
	}
	


public WebElement Fund () {
	
	return driver.findElement(Fund);	
		
	}


public WebElement CardSel () {
	
	return driver.findElement(CardSel);	
		
	}
	


public WebElement CardSel2 () {
	
	return driver.findElement(CardSel2);	
		
	}


public WebElement SuccessNotification () {
	
	return driver.findElement(SuccessNotification);	
		
	}


}
