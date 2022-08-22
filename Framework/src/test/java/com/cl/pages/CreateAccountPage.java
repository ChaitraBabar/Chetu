package com.cl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cl.GUIFunctions.GUIFunctions;
import com.cl.utility.ObjRepository;

public class CreateAccountPage {
	WebDriver driver;
	public ObjRepository config;
	
	public CreateAccountPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	//Verify the Create Account Page
	By createAccountPage=By.xpath(ObjRepository.getValue("CreateAccountPageVerify_XPATH"));
	
	
	//Verifying Create Account Page
	public CreateAccountPage verifySignInPage()
	{
		if(GUIFunctions.isElementPresent(createAccountPage, driver))
		{
			System.out.println("You are in Create Account page");
		}
	  else {
		  try
		  {

	   throw new IllegalStateException("This is not the Create Account page");
		  }catch (IllegalStateException e)
		  {
		  }
	  }
		return new CreateAccountPage(driver);
		
	}
	//Create Your Amazon Account CTA
	By createAccountCTA_xpath=By.xpath(ObjRepository.getValue("CraeteAccount_XPATH"));
	
	//Name XPATH
	By name_xpath=By.xpath(ObjRepository.getValue("Name_XPATH"));
	
	//Mobile Number
	By mobile_Number_xpath=By.xpath(ObjRepository.getValue("MobileNumber_XPATH"));
	
	//Email ID
	By emailID_xpath=By.xpath(ObjRepository.getValue("EmailId_XPATH"));
		
	//Password
	By pwd_xpath=By.xpath(ObjRepository.getValue("Password_XPATH"));
	
	//Continue CTA
	By contimueCTA_xpath=By.xpath(ObjRepository.getValue("Continue_XPATH"));
	
	//Click on Create Your Amazon Account CTA
	public CreateAccountPage clickOnCreateAccountCTA()
	{
		GUIFunctions.clickButton(driver, createAccountCTA_xpath);
		return new CreateAccountPage(driver);
	}

	//Enter Name
	public CreateAccountPage name(String name)
	{
		GUIFunctions.enterTextinToTextBox(driver, name_xpath, name);
		return new CreateAccountPage(driver);
	}
	
	//Enter Phone Number
	public CreateAccountPage enterNumber(double d)
	{
		//String num=Integer.toString(string);
		GUIFunctions.enternumberinToTextBox(driver, mobile_Number_xpath, d);
		return new CreateAccountPage(driver);
	}
	
	//Enter Email ID
	public CreateAccountPage enterEmailID(String email)
	{
		GUIFunctions.enterTextinToTextBox(driver, emailID_xpath, email);
		return new CreateAccountPage(driver);
	}
	
	//Enter Password
		public CreateAccountPage enterPassword(String pass)
		{
			GUIFunctions.enterTextinToTextBox(driver, pwd_xpath, pass);
			return new CreateAccountPage(driver);
		}
		
	//Click on Continue CTA
		public CreateAccountPage clickOnContinueCTA()
		{
			GUIFunctions.clickButton(driver, contimueCTA_xpath);
			return new CreateAccountPage(driver);
		}

}

