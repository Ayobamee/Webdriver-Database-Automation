package TestCases;


//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
import org.testng.annotations.Test;
import Reusable.BaseTest;

public class SecondIssuerLoginTest  {
BaseTest dr = new BaseTest();

@Test 
public void SecondIssuerLoginValidate () throws InterruptedException {
	
System.out.println("**************Validating Login Test*************");	
dr.SetUp();	
dr.SecondIssuerLogin();
dr.closePage();

System.out.println("**************Login Test Complete *************");	

}
	


}

