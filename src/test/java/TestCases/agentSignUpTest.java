
package TestCases;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;


//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ObjectRepository.SpacesSignUpPage;



public class agentSignUpTest {
	
	//generate four random digits
	 public static String randomfourdigits()  
	    {  //int randomPin declared to store the otp 
	        //since we using Math.random() hence we have to type cast it int 
	        //because Math.random() returns decimal value 
	        int randomdig   =(int) (Math.random()*9000)+1000; 
	        String digit  = String.valueOf(randomdig); 
	        return digit; //returning value of otp 
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
 
 //Click Agent
signUpCheck.signUpAsAgent().click();
 
 //Click sign up confirmation
 signUpCheck.confirmSignUp().click();
 
 //Click continue
 signUpCheck.continueSignUp().click();
 
 //Enter user first name
 signUpCheck.firstName().sendKeys("AutomatedFirstname");
 
 //Enter user last name
 signUpCheck.lastName().sendKeys("AutomatedLastname");
 
 //Enter user email address
 signUpCheck.email().sendKeys("Agentautomation@yahoo"+fourdigits+".com");
 
 //Click continue
 signUpCheck.continueUserInfo().click();
 
 //Select Country
 signUpCheck.selectCountry().click();
 
 //Pick Nigeria
 signUpCheck.nigeria().click();
 
 //Select State
 signUpCheck.selectState().click();
 
 //Pick Abia
 
 signUpCheck.abia().click();
 
 //Select LGA
 signUpCheck.lga().click();
 
 //Select actual LGA
 signUpCheck.actualLga().click();
 
 //Click Continue
 signUpCheck.continueRegionSelection().click();
 
 //Upload Passport Photograph
WebElement uploadPassport =(signUpCheck.passportPhotograph());
String filePath = System.getProperty("user.dir") + "//SpacesData//sunflower.jpg";
uploadPassport.sendKeys(filePath);


//Select Means of ID 
signUpCheck.selectMeansofID().click();

signUpCheck.chooseID().click();


WebElement uploadLicense =(signUpCheck.driversLicense());
String filePath1 = System.getProperty("user.dir") + "//SpacesData//sunflower.jpg";
uploadLicense.sendKeys(filePath1);


Thread.sleep(3000);

signUpCheck.saveContinue().click();

signUpCheck.accountNumber().sendKeys("0000000000");

signUpCheck.bank().click();

signUpCheck.selectbank().click();

signUpCheck.saveContinueB().click();

signUpCheck.saveContinueC().click();

Thread.sleep(1000);

signUpCheck.saveContinueC().click();

Thread.sleep(1000);

//Alert alert = (Alert) driver.switchTo().frame(1);

//alert.accept();

//Thread.sleep(1000);

signUpCheck.saveContinueD().click();

Thread.sleep(1000);

for (int n=1; n<13; n++) {
	
	signUpCheck.pin(n).sendKeys("1");
	
	Thread.sleep(500);
	
} 

signUpCheck.createAccount().click();

signUpCheck.notifications().click();
 

Thread.sleep(500);

//Validate sign up as Agent user is successful
if(signUpCheck.signUpAssertion()!= null){
		
System.out.println("Sign up attempt as an agent user is successful");

	}
else{
System.out.println("Sign up attempt as an agent user is unsuccessful");
}


						    
//System.out.println(arr[0]);
								
//System.out.println(arr[2]);
					            //System.out.println(s); 
						    
							
						    
// Closing DB Connection
 connection.close();
				    	
				    
	}
			    
				
driver.quit();	   
				    

}


	}


