package com.cl.pages;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.cl.utility.BrowserFactory;
import com.cl.utility.ExcelDataProvider;
import com.cl.utility.Helper;
import com.cl.utility.ObjRepository;

public class BaseClass {
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ObjRepository config;
	public ExtentReports report;
	public ExtentTest logger;

	
	  public static final String USERNAME = "chaitrapbabar1";
		public static final String AUTOMATE_KEY = "V5Tdw34zttfE4WGhtWie";
		public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";

	@BeforeSuite
	public void setUpSuite()
	{
		Reporter.log("Setting up the reports and Test is getting ready", true);
		excel=new ExcelDataProvider();
		config=new ObjRepository();
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/learn_automation_"+Helper.getcurrentDateTime()+".html"));
		report=new ExtentReports();
		report.attachReporter(extent);
		Reporter.log("Setting Done - Test can be started", true);
		
	}
	
	
	@BeforeClass
	public void setup() throws MalformedURLException
	{
		Reporter.log("Tring to start browser and Getting application ready", true);
		//driver=BrowserFactory.startApplication(driver, config.getBrowser(), config.getGmailURL());
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//	    capabilities.setCapability("browserName", "Chrome");
//	    capabilities.setCapability("browserVersion", "latest");
//	    HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
//	    browserstackOptions.put("os", "Windows");
//	    browserstackOptions.put("osVersion", "10");
//	    browserstackOptions.put("local", "false");
//	    browserstackOptions.put("seleniumVersion", "3.14.0");
//	    capabilities.setCapability("bstack:options", browserstackOptions);
//	   driver = new RemoteWebDriver(new URL(URL), capabilities);
//	   driver.get(ObjRepository.getValue("AmazonURL"));
	driver=BrowserFactory.startApplication(driver, ObjRepository.getValue("Browser"), ObjRepository.getValue("AmazonURL"));
		System.out.println(driver.getTitle());
		Reporter.log("Browser and Application is up and running", true);
		
	}
	
	@AfterClass
	public void teardown()
	{
	BrowserFactory.quitrBrowser(driver);
	}
	
	@AfterMethod
	public void takescreenshot(ITestResult result) throws IOException
	{
		Reporter.log("Test is about to end", true);
		if(result.getStatus()==ITestResult.FAILURE)
		{
			
			logger.fail("Test Failed ", MediaEntityBuilder.createScreenCaptureFromPath(Helper.capturScreenShot(driver)).build());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			logger.pass("Test Passed ", MediaEntityBuilder.createScreenCaptureFromPath(Helper.capturScreenShot(driver)).build());
		}
	
		report.flush();
		Reporter.log("Test Completed >>>> Reports Generated", true);
	}
}
