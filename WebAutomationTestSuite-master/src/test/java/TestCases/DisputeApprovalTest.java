package TestCases;

//import java.util.List;
import java.util.concurrent.TimeUnit;
//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Reusable.BaseTest;
//import Reusable.BaseTest;
//import Reusable.BaseTestA;

public class DisputeApprovalTest  {
BaseTest dr = new BaseTest();

@Test 
public void DisputeApproveCheck () throws InterruptedException {
dr.SetUp();	
dr.AcquirerLogin();
ApproveDispute();
dr.closePage();
}
//frame[@name='body']

public void ApproveDispute () {

System.out.println("*************Validating Dispute Approval*************");	
//1. Wait and switch to frame
dr.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

dr.driver.switchTo().frame(dr.driver.findElement(By.xpath("//frame[@name='menu']")));

//2. Click Arbiter
WebElement ClickArbi = dr.driver.findElement(By.xpath("//div[@id='menu']/div[5]/table/tbody/tr/td[2]"));
ClickArbi.click();
		
//3. Wait	
dr.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//4. Click Dispute Management
WebElement ClickDispMan = dr.driver.findElement(By.xpath("//div[@id='smenu3']//li[1]//a[1]"));
ClickDispMan.click();

//5. Wait, exit frame to another frame	
dr.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

dr.driver.switchTo().defaultContent();


dr.driver.switchTo().frame(dr.driver.findElement(By.xpath("/html[1]/frameset[1]/frameset[1]/frame[2]")));


WebElement Checkbox = dr.driver.findElement(By.xpath("//tr[@class='odd']//input[@name='id']"));
Checkbox.click();


//7. Click Accept Claim
WebElement AcceptClaim = dr.driver.findElement(By.xpath("//a[contains(text(),'Accept')]"));
AcceptClaim.click();


//8. Enter Comment for accepting

WebElement AcceptComment = dr.driver.findElement(By.xpath("//textarea[@name='acceptComments']"));
AcceptComment.sendKeys(dr.AcceptanceComment);

//9. Click Save

WebElement Save = dr.driver.findElement(By.xpath("//input[@id='save']"));
Save.click();

System.out.println("************* Dispute Approval Test Completed*************");

}

	
}



