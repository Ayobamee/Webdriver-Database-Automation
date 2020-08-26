package TestCases;


//import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Reusable.BaseTest;
//import Reusable.BaseTest;
//import Reusable.BaseTestA;

public class CreateDisputeRegionTest  {
BaseTest dr = new BaseTest();

@Test 
public void RegionValidate () throws InterruptedException {
dr.SetUp();	
dr.AdminLogin();
CreateDisputeRegion();
dr.closePage();
}



public void CreateDisputeRegion () {

System.out.println("*************Validating Dispute Region creation*************");	
//1. Wait
dr.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

dr.driver.switchTo().frame(dr.driver.findElement(By.xpath("//frame[@name='menu']")));

//2. Click Administration
WebElement ClickAdmin = dr.driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]"));
ClickAdmin.click();
		
//3. Wait	
dr.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//4. Click Dispute Region
WebElement ClickDispReg = dr.driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"));
ClickDispReg.click();

//5. Wait	
dr.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

dr.driver.switchTo().defaultContent();

dr.driver.switchTo().frame(dr.driver.findElement(By.xpath("/html[1]/frameset[1]/frameset[1]/frame[2]")));

//6. Click Add
WebElement Add = dr.driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[2]/td[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]"));
Add.click();


//7. Wait	
dr.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//8. Enter Dispute Type
WebElement DisputeType = dr.driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]"));
DisputeType.sendKeys(dr.DisputeType);

//9. Wait	
dr.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//10. Enter Processing Time
WebElement ProcessTime = dr.driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[4]/td[2]/input[1]"));
ProcessTime.sendKeys(dr.ProcessingTime);


//11. Wait	
dr.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


//12. Enter ISW Validation Time
WebElement ISWValTime = dr.driver.findElement(By.xpath("//input[@name='iswValidationPeriod']"));
ISWValTime.sendKeys(dr.ISWValTime);

//13. Click Save
WebElement Save = dr.driver.findElement(By.xpath("//table[@class='formbutton']//input[1]"));
Save.click();



System.out.println("*************Dispute Region creation Test is Completed*************");	

}
	
}



