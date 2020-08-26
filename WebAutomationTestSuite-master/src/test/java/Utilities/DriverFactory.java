package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	//This method returns a browser back
	
	public static WebDriver open (String browserType){
		if (browserType.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ayobami.Elutade\\Documents\\Artefacts\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ayobami\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ayobami\\Documents\\Selenium Software\\chromedriver.exe");
			 return new ChromeDriver();
		}
		
		else if (browserType.equalsIgnoreCase("firefox")) {		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ayobami.Elutade\\Documents\\Artefacts\\Chromedriver\\geckodriver.exe");
			 return new FirefoxDriver();
		}
		
		else {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ayobami.Elutade\\Documents\\Artefacts\\Chromedriver\\IEDriverServer.exe");
			//System.setProperty("webdriver.ie.driver", "C:\\Users\\Ayobami\\Documents\\Selenium Software\\IEDriverServer.exe");
			 return  new InternetExplorerDriver();
			
		}
		
		
	}

}
