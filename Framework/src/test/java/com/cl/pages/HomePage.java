package com.cl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cl.GUIFunctions.GUIFunctions;
import com.cl.utility.ObjRepository;

public class HomePage {

	WebDriver driver;
	public ObjRepository config;
	
	public HomePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	//Verify the Create Account Page
	By homepage_Title=By.xpath(ObjRepository.getValue("HomePageTitle"));
	
	By homepage_verification=By.xpath(ObjRepository.getValue("VerifyHomePage_XPATH"));
		
	//Verifying Create Home Page
	public HomePage verifyHomeInPage()
	{
		
		if(GUIFunctions.isElementPresent(homepage_verification, driver))
		{
			System.out.println("You are in Home page");
		}
	  else {
		  try
		  {

	   throw new IllegalStateException("This is not the Create Account page");
		  }catch (IllegalStateException e)
		  {
		  }
	  }
		return new HomePage(driver);
		
	}
}
