package com.cl.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cl.pages.BaseClass;
import com.cl.pages.HomePage;
import com.cl.pages.SignInPage;

public class HP_TC_04 extends BaseClass{
	@Test(priority=1, description="Step 1: Delete All Coockies")
	public void deleteAllCoockies()
	{
		logger=report.createTest("Clear coockies");
		System.out.println("Step1 Starts");
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		loginpage.clearchach();
		logger.pass("Successfully Cleared All Coockies ");
		System.out.println("Step1 ends");
	}
	
	@Test(priority=2, description="Step 2: Verify the Home Page")
	public void verifyTheHomePage()
	{
		logger=report.createTest("Verify the Home Page");
		System.out.println("Step2 Starts");
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		loginpage.cmousehoveronpicto();
		loginpage.clickonSignInCTA();
		loginpage.clickonemailid();
		
		homepage.verifyHomeInPage();
		logger=report.createTest("User is on Home Page");
		System.out.println("User is on Home Page");
		System.out.println("Step2 ends");
	}

}
