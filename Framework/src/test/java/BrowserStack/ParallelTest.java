package BrowserStack;


import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelTest 
{
	public WebDriver driver=null;
	
	  public static final String USERNAME = "chaitrapbabar1";
		public static final String AUTOMATE_KEY = "V5Tdw34zttfE4WGhtWie";
		public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";

@BeforeClass()

	  public void run() throws MalformedURLException 
{
	
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability("browserName", "Chrome");
	    capabilities.setCapability("browserVersion", "latest");
	    HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
	    browserstackOptions.put("os", "Windows");
	    browserstackOptions.put("osVersion", "10");
	    browserstackOptions.put("local", "false");
	    browserstackOptions.put("seleniumVersion", "3.14.0");
	    capabilities.setCapability("bstack:options", browserstackOptions);
	    driver = new RemoteWebDriver(new URL(URL), capabilities);
}

@Test()
public void login()
{
	driver.get("https://www.gmail.com");
	driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("clchaitra12@gmail.com");
	driver.findElement(By.xpath("(//div[@class='VfPpkd-Jh9lGc'])[2]")).click();
	
	System.out.println(driver.getTitle());
}
//				@AfterClass()
//				public void logoff()
//				{
//					driver.quit();
//				}
			
	  
	}


	


