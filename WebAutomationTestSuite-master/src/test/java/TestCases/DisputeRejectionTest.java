package TestCases;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Reusable.BaseTest;
//import Reusable.BaseTest;
//import Reusable.BaseTestA;

public class DisputeRejectionTest  {
BaseTest dr = new BaseTest();

@Test 
public void DisputeRejectCheck () throws InterruptedException {
dr.SetUp();	
dr.AcquirerLogin();
RejectDispute();
dr.closePage();
}
//frame[@name='body']

public void RejectDispute () {

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

dr.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//7. Click Reject Claim
WebElement RejectClaim = dr.driver.findElement(By.xpath("//a[contains(text(),'Decline')]"));
RejectClaim.click();


dr.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//8. Enter Comment for rejecting

WebElement RejectComment = dr.driver.findElement(By.xpath("//textarea[@id='declineComments']"));
RejectComment.sendKeys(dr.RejectComment);

dr.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//9. Choose Journal file

WebElement UploadElement = dr.driver.findElement(By.xpath("//input[@name='journalImage[0]']"));


dr.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

String filePath = System.getProperty("user.dir") + "\\drivers\\Capture.PNG";

UploadElement.sendKeys(filePath);


dr.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//10. Click Decline Claim

WebElement DeclineClaim = dr.driver.findElement(By.xpath("//table[@class='formbutton']//input[3]"));
DeclineClaim.click();

dr.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//11. Accept alert

Alert alert = dr.driver.switchTo().alert();

alert.accept();

dr.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//12. Confirm that the dispute has been rejected
if (dr.driver.findElement(By.xpath("//span[@class='formfielderror']")).isDisplayed()) {
	
	System.out.println("Test failed, contact the software engineer asap");
		
}

else {
	
	System.out.println("Test passed");
}


System.out.println("************* Dispute Approval Test Completed*************");

}

	
}



