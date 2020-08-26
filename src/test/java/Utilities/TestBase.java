package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;

public class TestBase {
public  WebDriver driver;
public Properties prop;
	
	
	public WebDriver  initializeDriver () throws IOException {
	prop = new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//SpacesData//datadriven.properties");
	prop.load(fis);	
	
	if (prop.getProperty("browser").equals("chrome")){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.dms");
		 driver = new ChromeDriver();
	
	
	}
	
	else if(prop.getProperty("browser").equals("firefox")) {
		 driver = new FirefoxDriver();
		
	}
	
	else {
		
		 driver = new InternetExplorerDriver();
		
	}
	Dimension d = new Dimension(360,640);
 	//Resize current window to the set dimension
 	driver.manage().window().setSize(d);
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(prop.getProperty("URL"));
	
	return driver;
	}
	
	}
