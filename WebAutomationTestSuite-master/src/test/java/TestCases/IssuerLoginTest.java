package TestCases;


//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
import org.testng.annotations.Test;
import Reusable.BaseTest;

public class IssuerLoginTest  {
BaseTest dr = new BaseTest();

@Test 
public void IssuerLoginValidate () throws InterruptedException {
	
System.out.println("**************Validating Login Test*************");	
dr.SetUp();	
dr.IssuerLogin();
dr.closePage();

System.out.println("**************Login Test Complete *************");	

}
	


}

