package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddDebitCardPage {
	
WebDriver driver;
	
	
public  AddDebitCardPage(WebDriver driver) {
		
this.driver=driver;
	}
	
	

By More = By.xpath("//a[contains(text(),'More')]");

By DebitCard = By.xpath("//a[contains(text(),'Debit Cards')]");


By AddDebitCard = By.xpath("//a[contains(text(),'Add a debit card')]");

By CardNumber  = By.xpath("//input[@placeholder='Card number']");

By CardEx = By.xpath("//input[@placeholder='MM/YY']");

By CVV = By.xpath("//input[@placeholder='CVV']");

By FirstCardPin = By.xpath("//input[@id='1']");

By SecondCardPin = By.xpath("//input[@id='2']");

By ThirdCardPin = By.xpath("//input[@id='3']");

By FourthCardPin = By.xpath("//input[@id='4']");

By ContinueDebit = By.xpath("//button[@class='sc-AxjAm sc-AxhUy dSeJVd']");

By Send = By.xpath("//button[@class='sc-AxjAm sc-AxhUy dSeJVd']");

By Otp = By.xpath("//input[@placeholder='OTP']");

By AddCard = By.xpath("/html[1]/body[1]/div[1]/main[1]/form[1]/button[1]");

By SuccessfulCardAddMsg = By.xpath("//div[@class='Toastify__toast-body']");

By DeleteCard = By.xpath("//*[name()='path' and contains(@fill,'#56636D')]");

By ConfirmDelete = By.xpath("//button[contains(text(),'Yes')]");



	
public WebElement More () {
		
		return driver.findElement(More);	
			
		}


public WebElement DebitCard () {
	
	return driver.findElement(DebitCard);	
		
	}







public WebElement AddDebitCard () {
	
	return driver.findElement(AddDebitCard);	
		
	}


public WebElement CardNumber () {
	
	return driver.findElement(CardNumber);	
		
	}

public WebElement CardEx () {
	
	return driver.findElement(CardEx);	
		
	}



public WebElement CVV () {
	
	return driver.findElement(CVV);	
		
	}



public WebElement ContinueDebit () {
	
	return driver.findElement(ContinueDebit);	
		
	}


public WebElement FirstCardPin () {
	
	return driver.findElement(FirstCardPin);	
		
	}



public WebElement SecondCardPin () {
	
	return driver.findElement(SecondCardPin);	
		
	}


public WebElement ThirdCardPin () {
	
	return driver.findElement(ThirdCardPin);	
		
	}


public WebElement FourthCardPin () {
	
	return driver.findElement(FourthCardPin);	
		
	}




public WebElement Send () {
	
	return driver.findElement(Send);	
		
	}

public WebElement Otp () {
	
	return driver.findElement(Otp);	
		
	}




public WebElement AddCard () {
	
	return driver.findElement(AddCard);	
		
	}



public WebElement SuccessfulCardAddMsg () {
	
	return driver.findElement(SuccessfulCardAddMsg);	
		
	}

public WebElement DeleteCard () {
	
	return driver.findElement(DeleteCard);	
		
	}


public WebElement ConfirmDelete () {
	
	return driver.findElement(ConfirmDelete);	
		
	}


}
