package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpacesSignUpPage {
	
WebDriver driver;
	
	
public  SpacesSignUpPage(WebDriver driver) {
		
this.driver=driver;

	}
	

By Refresh = By.xpath("//div[@id='root']/div/button");
By CPhoneNumber = By.linkText("Continue with phone number");
By PhoneNumber = By.name("phoneNumber");
By Continue = By.xpath("//button[@type='submit']");
By FirstPin = By.xpath("//input[@id='1']");
By SecondPin = By.xpath("//input[@id='2']");
By ThirdPin = By.xpath("//input[@id='3']");
By FourthPin = By.xpath("//input[@id='4']");
By FifthPin = By.xpath("//input[@id='5']");
By SixthPin = By.xpath("//input[@id='6']");
By check = By.xpath("//button[contains(text(),'Check')]");
By yes = By.xpath("/div[@id='root']/main/section[2]/label[2]");
By signUpAsAgent = By.xpath("//label[contains(text(),'Agent')]");
By signUpAsMerchant = By.xpath("//label[contains(text(),'Merchant')]");
By confirmSignUp = By.xpath("//body/div[@id='root']/div[3]/div[1]/div[1]/button[2]");
By continueSignUp = By.xpath("//button[contains(text(),'Continue')]");
By conf = By.xpath("//button[contains(text(),'Confirm')]");
By merchantName = By.name("firstName");
By merchantLastName = By.name("lastName");
By merchantEmail = By.name("email");
By firstName = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[1]/div[1]/input[1]");
By lastName = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[1]/div[2]/input[1]");
By email = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[1]/div[3]/input[1]");
By continueUserInfo = By.xpath("//button[contains(text(),'Continue')]");
By selectCountry = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]");
By nigeria = By.xpath("//div[@id='react-select-2-option-0']");
By selectState = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/*[1]");
By selectMerchState = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[1]/div[3]/div[1]/div[1]");
By selectAbiaMerch = By.xpath("//div[contains(text(),'Abia')]");
By selectMerchLGA = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[1]/div[4]/div[1]/div[1]");
By selectMerchLGAAbia = By.xpath("//div[contains(text(),'Aba North')]");
By selectBusiness = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[1]/div[5]/div[1]");
By selectArt = By.xpath("//div[contains(text(),'Arts')]");
By abia = By.xpath("//div[@id='react-select-3-option-0']");
By lga = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[1]/div[3]/div[1]/div[2]/div[1]/*[1]");
By actualLga = By.xpath("//div[@id='react-select-4-option-3']");
By continueRegionSelection = By.xpath("//button[contains(text(),'Continue')]");
By passportPhotograph = By.cssSelector("#identity");
By selectMeansofID = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[2]/div[1]/div[2]/div[1]/*[1]");
By chooseID = By.xpath("//div[@id='react-select-5-option-0']");
By driversLicenses = By.xpath("/html/body/div/main/form/div[3]/label/input");
By saveContinue = By.xpath("//button[@type='submit']");
By accountNumber = By.xpath("//input[@name='accountNumber']");
By bank = By.xpath("//div[contains(text(),'Bank')]");
By selectbank = By.xpath("//p[contains(text(),'Access Bank')]");
By saveContinueB = By.xpath("//button[@type='submit']");
By saveContinueC = By.xpath("//button[@type='submit']");
By saveContinueD = By.xpath("/html/body/div/div[4]/div/div[2]/button[2]");
By createAccount = By.xpath("//button[@type='submit']");
By Login = By.xpath("//button[@class='sc-AxjAm sc-AxhUy dSeJVd']");
By LoginConfirmation = By.xpath("//body/div[@id='root']/main[1]/div[2]/section[1]/div[2]/div[3]");
By LoginConfirmationMerchant = By.xpath("//body/div[@id='root']/main[1]/div[2]/section[1]/div[2]/div[2]");
By LoginError = By.xpath("//div[@class='Toastify__toast Toastify__toast--error']");
By notifications = By.xpath("//button[contains(text(),\"I'll do this later\")]");
By signUpAssertion = By.xpath("//div[contains(text(),'Your Space Force Agent activation is pending.')]");
By merchName = By.name("businessName");
By streetAddress = By.name("streetAddress");
By done = By.xpath("//button[contains(text(),'Done')]");
By continuE = By.xpath("//button[contains(text(),'Continue')]");
By signUpMerchAssertion = By.xpath("//header/img[1]");





public WebElement signUpMerchAssertion () {
	
	return driver.findElement(signUpMerchAssertion);	
		
	}



public WebElement continuE () {
	
	return driver.findElement(continuE);	
		
	}





public WebElement done () {
	
	return driver.findElement(done);	
		
	}




public WebElement selectArt () {
	
	return driver.findElement(selectArt);	
		
	}



public WebElement selectBusiness () {
	
	return driver.findElement(selectBusiness);	
		
	}


public WebElement selectMerchLGAAbia () {
	
	return driver.findElement(selectMerchLGAAbia);	
		
	}



public WebElement selectAbiaMerch () {
	
	return driver.findElement(selectAbiaMerch);	
		
	}


public WebElement selectMerchLGA () {
	
	return driver.findElement(selectMerchLGA);	
		
	}



public WebElement selectMerchState () {
	
	return driver.findElement(selectMerchState);	
		
	}




public WebElement streetAddress () {
	
	return driver.findElement(streetAddress);	
		
	}



public WebElement merchName () {
	
	return driver.findElement(merchName);	
		
	}



public WebElement merchantEmail () {
	
	return driver.findElement(merchantEmail);	
		
	}
public WebElement merchantLastName () {
	
	return driver.findElement(merchantLastName);	
		
	}
public WebElement merchantName () {
	
	return driver.findElement(merchantName);	
		
	}
public WebElement conf () {
	
	return driver.findElement(conf);	
		
	}
public WebElement signUpAsMerchant () {
	
	return driver.findElement(signUpAsMerchant);	
		
	}
public WebElement signUpAssertion () {
	
	return driver.findElement(signUpAssertion);	
		
	}
public WebElement Refresh () {
	
	return driver.findElement(Refresh);	
		
	}
public WebElement notifications () {
	
	return driver.findElement(notifications);	
		
	}
public WebElement yes () {
	
	return driver.findElement(yes);	
		
	}
	
	
public WebElement CPhoneNumber () {
		
		return driver.findElement(CPhoneNumber);	
			
		}
	
	
public WebElement PhoneNumber () {
		
		return driver.findElement(PhoneNumber);	
			
		}
	
public WebElement Continue () {
	
	return driver.findElement(Continue);	
		
	}
	
	
public WebElement FirstPin () {
	
	return driver.findElement(FirstPin);	
		
	}
public WebElement SecondPin () {
	
	return driver.findElement(SecondPin);	
		
	}
public WebElement ThirdPin () {
	
	return driver.findElement(ThirdPin);	
		
	}
	
public WebElement FourthPin () {
	
	return driver.findElement(FourthPin);	
		
	}
public WebElement FifthPin () {
	
	return driver.findElement(FifthPin);	
		
	}
public WebElement SixthPin () {
	
	return driver.findElement(SixthPin);	
		
	}
public WebElement check () {
	
	return driver.findElement(check);	
		
	}
public WebElement signUpAsAgent () {
	
	return driver.findElement(signUpAsAgent);	
		
	}
public WebElement confirmSignUp () {
	
	return driver.findElement(confirmSignUp);	
		
	}
public WebElement continueSignUp () {
	
	return driver.findElement(continueSignUp);	
		
	}
public WebElement firstName () {
	
	return driver.findElement(firstName);	
		
	}
public WebElement lastName () {
	
	return driver.findElement(lastName);	
		
	}
public WebElement email () {
	
	return driver.findElement(email);	
		
	}
public WebElement continueUserInfo () {
	
	return driver.findElement(continueUserInfo);	
		
	}
public WebElement selectCountry () {
	
	return driver.findElement(selectCountry);	
		
	}
public WebElement nigeria () {
	
	return driver.findElement(nigeria);	
		
	}
public WebElement selectState () {
	
	return driver.findElement(selectState);	
		
	}
public WebElement actualLga () {
	
	return driver.findElement(actualLga);	
		
	}
public WebElement lga () {
	
	return driver.findElement(lga);	
		
	}
public WebElement abia () {
	
	return driver.findElement(abia);	
		
	}
public WebElement continueRegionSelection () {
	
	return driver.findElement(continueRegionSelection);	
		
	}
public WebElement passportPhotograph () {
	
	return driver.findElement(passportPhotograph);	
		
	}
public WebElement selectMeansofID () {
	
	return driver.findElement(selectMeansofID);	
		
	}
public WebElement chooseID () {
	
	return driver.findElement(chooseID);	
		
	}
public WebElement driversLicense () {
	
	return driver.findElement(driversLicenses);	
		
	}
public WebElement saveContinue () {
	
	return driver.findElement(saveContinue);	
		
	}
public WebElement accountNumber () {
	
	return driver.findElement(accountNumber);	
		
	}
public WebElement bank () {
	
	return driver.findElement(bank);	
		
	}
public WebElement selectbank () {
	
	return driver.findElement(selectbank);	
		
	}
public WebElement saveContinueB () {
	
	return driver.findElement(saveContinueB);	
		
	}
public WebElement saveContinueC () {
	
	return driver.findElement(saveContinueC);	
		
	}
public WebElement saveContinueD () {
	
	return driver.findElement(saveContinueD);	
		
	}
public WebElement createAccount () {
	
	return driver.findElement(createAccount);	
		
	}
public WebElement pin (int n) {
	
    String pins = "//input[@id='"+n+"']";
	
	return driver.findElement(By.xpath(pins));	
		
	}
	
	
public WebElement Login () {
	
	return driver.findElement(Login);	
		
	}
public WebElement LoginConfirmation () {
	
	return driver.findElement(LoginConfirmation);	
		
	}
public WebElement LoginError () {
	
	return driver.findElement(LoginError);	
		
	}
public WebElement LoginConfirmationMerchant () {
	
	return driver.findElement(LoginConfirmationMerchant);	
		
	}

}