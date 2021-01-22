package TestCases;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import ObjectRepository.SpacesSignUpPage;
public class merchantSignUpTest {
	
	//generate four random digits
	 public static String randomfourdigits()
	    {  //int randomPin declared to store the otp
	        //since we using Math.random() hence we have to type cast it int
	        //because Math.random() returns decimal value
	        int randomdig   =(int) (Math.random()*9000)+1000;
	        String digit  = String.valueOf(randomdig);
	        return digit; //returning value of otp
	    }
	
	 
	
	 public String randomAlphabet(int length) {
		    Random random = new Random();
		    final int alphabetLength = 'Z' - 'A' + 1;
		    StringBuilder result = new StringBuilder(length);
		    while (result.length() < length) {
		        final char charCaseBit = (char) (random.nextInt(2) << 5);
		        result.append((char) (charCaseBit | ('A' + random.nextInt(alphabetLength))));
		    }
		    return result.toString();
		}
	
	
	
	
	 @Test	
	 public void  signUpStart() throws SQLException, ClassNotFoundException, IOException, InterruptedException {
			
WebDriver driver; 	
	 
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver87.dms");
							    	
driver = new ChromeDriver();
							 
driver.get("https://staging.spaceso2o.com/launch");
							
//Call Object repository
SpacesSignUpPage signUpCheck = new SpacesSignUpPage(driver);
							 
//Click Continue with PhoneNumber
signUpCheck.CPhoneNumber().click();
							
//Wait	
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//String digits = "0017";
String fourdigits = randomfourdigits();
String alpha = randomAlphabet(6);
//Enter PhoneNumber
signUpCheck.PhoneNumber().sendKeys("0809090"+fourdigits);
//Click continue
signUpCheck.Continue().click();
Thread.sleep(1000);
		
String dbURl = "jdbc:postgresql://spaces-staging-instance-1.cr835kymrvut.eu-central-1.rds.amazonaws.com/spaces";
String username = "postgres";
String password = "EilwgMomHdXbJm8EwzVN";
//String query = "Select data -> 'pinCode' AS pinCode FROM public.users where data->>'msisdn'='+2347060406267';";
String query = "Select data ->> 'pinCode' AS pinCode FROM public.users where data->>'msisdn'='+234809090"+fourdigits+"'";
		
Class.forName("org.postgresql.Driver");
		
Connection connection =
DriverManager.getConnection(dbURl,username,password);
Statement st = connection.createStatement();
System.out.println("DB Connection successful");
// Executing the SQL Query and store the results in ResultSet
ResultSet rs = st.executeQuery(query);
				   
				   
String pin = null;
				 
		
// While loop to iterate through all data and print results
				     
while (rs.next()) {
				    	
//Extract pin from DB
pin = rs.getString("pincode");
				    	
System.out.println(pin);
				    					    	
//Split string
String []arr = pin.split("");
							
//Wait	
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//Enter First Pin
signUpCheck.FirstPin().sendKeys(arr[0]);
//Enter Second Pin
 signUpCheck.SecondPin().sendKeys(arr[1]);
//Enter Third Pin
 signUpCheck.ThirdPin().sendKeys(arr[2]);	
//Enter Fourth Pin
 signUpCheck.FourthPin().sendKeys(arr[3]);
//Enter Fifth Pin
 signUpCheck.FifthPin().sendKeys(arr[4]);
//Enter Sixth Pin
 signUpCheck.SixthPin().sendKeys(arr[5]);
 //Click Check
 signUpCheck.check().click();
 //signUpCheck.yes().click();
 //Click Merchant
signUpCheck.signUpAsMerchant().click();
 //Click sign up confirmation
 signUpCheck.conf().click();
 //Click continue
 signUpCheck.continueSignUp().click();
 //Enter user first name
 signUpCheck.merchantName().sendKeys("Automated"+alpha);
 //Enter user last name
 signUpCheck.merchantLastName().sendKeys("AutoLast"+alpha);
 //Enter user email address
 signUpCheck.merchantEmail().sendKeys("Merchantautomation@yahoo"+fourdigits+".com");
 //Click continue
 signUpCheck.continueUserInfo().click();
 
 //Enter Merchant Name
 signUpCheck.merchName().sendKeys("MerchantTest"+fourdigits+".com");
 
 
 
 //Enter Merchant Address
 signUpCheck.streetAddress().sendKeys("MerchantAddress"+fourdigits);
 
 
//Select State
signUpCheck.selectMerchState().click();

//Pick Abia

signUpCheck.selectAbiaMerch().click();

//Select LGA
signUpCheck.selectMerchLGA().click();

// Select specific LGA
signUpCheck.selectMerchLGAAbia().click();
 
 
 
//Select business name
signUpCheck.selectBusiness().click();

//Select Art
signUpCheck.selectArt().click();

//Select done
signUpCheck.done().click();


//Select continue
signUpCheck.continuE().click();


Thread.sleep(1000);
for (int n=1; n<13; n++) {
	
	signUpCheck.pin(n).sendKeys("1");
	
	Thread.sleep(500);
	
}
signUpCheck.createAccount().click();
signUpCheck.notifications().click();
Thread.sleep(500);


//Validate sign up as Merchant user is successful
if(signUpCheck.signUpMerchAssertion()!= null){
		
System.out.println("Sign up attempt as merchant user is successful");
	}
else{
System.out.println("Sign up attempt as merchant user is unsuccessful");
}

						   

						 							
						   
// Closing DB Connection
 connection.close();
				    	
				   
	}
			   
				
driver.quit();	  
				   
}
	}