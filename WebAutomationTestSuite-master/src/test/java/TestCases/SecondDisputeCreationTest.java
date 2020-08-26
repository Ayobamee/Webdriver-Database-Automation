package TestCases;

//import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Reusable.BaseTest;
//import Reusable.BaseTest;
//import Reusable.BaseTestA;

public class SecondDisputeCreationTest  {
BaseTest dr = new BaseTest();

@Test 
public void SecondCreateValidateCheck () throws InterruptedException {
dr.SetUp();	
dr.SecondIssuerLogin();
CreateSecondDispute();
dr.closePage();
}
//frame[@name='body']

public void CreateSecondDispute () {

System.out.println("*************Validating Dispute creation*************");	
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



//6. Click New Claim
WebElement NewClaim = dr.driver.findElement(By.xpath("//a[contains(text(),'New Claim')]"));
NewClaim.click();

//7. Wait	
dr.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//8. Select Default dropdown
WebElement TransaType = dr.driver.findElement(By.xpath("//select[@id='txnType']"));

Select dropdown = new Select (TransaType);

dropdown.selectByVisibleText("Default");


//9. Wait	
dr.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//10. Enter card pan

WebElement CardPan = dr.driver.findElement(By.xpath("//input[@id='pan']"));
CardPan.sendKeys(dr.SecondMaskedPan);

//11. Wait	
dr.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


//12. Click Calendar

WebElement SelectCalendar = dr.driver.findElement(By.xpath("//button[@id='triggerStart']"));
SelectCalendar.click();

//13. Wait	
dr.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


//14. Choose Month and Year
String currentYearAndMonth = dr.driver.findElement(By.xpath("//td[@class='title']")).getText();

if (!currentYearAndMonth.equalsIgnoreCase("October, 2019")) {
	
	do {
		dr.driver.findElement(By.xpath("/html/body/div/table/thead/tr[2]/td[2]/div")).click();
		
	} while (!dr.driver.findElement(By.xpath("//td[@class='title']")).getText().trim().equalsIgnoreCase("October, 2019"));
}


//16. Wait	
dr.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


//17. Choose day of the month

List<WebElement> dates = dr.driver.findElements(By.className("day"));
int count = dr.driver.findElements(By.className("day")).size();

for (int i=0; i<count; i++) {
String text= dr.driver.findElements(By.className("day")).get(i).getText();
			
if (text.equalsIgnoreCase("7")) {
				
dr.driver.findElements(By.className("day")).get(i).click();
				
break;
		
}
		

}

//18. Wait	
dr.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//19. Click Search

WebElement Search = dr.driver.findElement(By.xpath("//input[@id='search']"));
Search.click();

//20. Wait	
dr.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//18. Click Transaction ID
WebElement TranId = dr.driver.findElement(By.linkText("33324255"));
TranId.click();

//19. Wait	
dr.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


//21. Select Default dropdown
WebElement LogCom = dr.driver.findElement(By.xpath("//select[@id='logComments']"));

Select Seconddropdown = new Select (LogCom);

Seconddropdown.selectByVisibleText("Test");


//22. Wait	
dr.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);



//23. Click Log Dispute

WebElement LogDispute = dr.driver.findElement(By.xpath("//table[@class='formbutton']//input[13]"));
LogDispute.click();





}

	
}



