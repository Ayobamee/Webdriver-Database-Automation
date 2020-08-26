package TestCases;


//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
import org.testng.annotations.Test;
import Reusable.BaseTest;

public class AdminLoginTest  {
BaseTest dr = new BaseTest();

@Test 
public void LoginValidate () throws InterruptedException {
System.out.println("**************Validating Login Test for Admin User*************");		
	
dr.SetUp();	
dr.AdminLogin();
dr.closePage();


System.out.println("************** Login Test for Admin User Complete*************");	

}	
}

