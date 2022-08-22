package com.cl.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cl.pages.BaseClass;
import com.cl.pages.CreateAccountPage;
import com.cl.pages.HomePage;
import com.cl.pages.SignInPage;

public class CA_TC_02 extends BaseClass{

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
	
	@Test(priority=2, description="Step 2: Mouse Hover On the Hello, Sign In")
	public void mouseHover()
	{
		logger=report.createTest("MouseHover functionality");
		System.out.println("Step2 Starts");
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		loginpage.cmousehoveronpicto();
		logger=report.createTest("Succefully MouseHovered on the component");
		System.out.println("Successfully Mouse Hover On the Hello, Sign In");
		System.out.println("Step2 ends");
	}
	
	@Test(priority=3, description="Step 3: Click on Sign In CTA")
	public void clickOnSignInCTA()
	{
		logger=report.createTest("Click on Sign In CTA");
		System.out.println("Step3 Starts");
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		loginpage.clickonSignInCTA();
		System.out.println("Successfully clicked on Sign In CTA");
		logger=report.createTest("Successfully clicked on Sign In CTA");
		System.out.println("Step3 ends");
	}
	
	@Test(priority=4, description="Step 4: Click on Create Your Amazon Account CTA")
	public void clickOnCreateAmazonAccountCTA()
	{
		logger=report.createTest("Click on Create Your Amazon Account CTA");
		System.out.println("Step4 Starts");
		CreateAccountPage createaccountpage = PageFactory.initElements(driver, CreateAccountPage.class);
		createaccountpage.clickOnCreateAccountCTA();
		logger=report.createTest("Successfully clicked Create Your Amazon Account CTA");
		System.out.println("Successfully clicked on Create Your Amazon Account CTA");
		System.out.println("Step4 ends");
	}
	
	@Test(priority=5, description="Step 5: Enter First name or Last Name")
	public void enterName()
	{
		logger=report.createTest("Enter First name or Last Name");
		System.out.println("Step5 Starts");
		CreateAccountPage createaccountpage = PageFactory.initElements(driver, CreateAccountPage.class);
		createaccountpage.name(excel.getSringData("Login", 1, 0));
		logger=report.createTest("Successfully entered data in to Name Field");
		System.out.println("Successfully entered data in to Name Field");
		System.out.println("Step5 ends");
	}
	
	@Test(priority=6, description="Step 6: Enter Phone Number")
	public void enterMobileNumber()
	{
		logger=report.createTest("SEnter Phone Number");
		System.out.println("Step6 Starts");
		CreateAccountPage createaccountpage = PageFactory.initElements(driver, CreateAccountPage.class);
		createaccountpage.enterNumber(excel.getNumericData("Login", 1, 1));
		logger=report.createTest("Successfully entered data in to Mobile Number Field");
		System.out.println("Successfully entered data in to Mobile Number Field");
		System.out.println("Step6 ends");
	}
	

	@Test(priority=7, description="Step 7: Enter Email ID")
	public void enterEmailID()
	{
		logger=report.createTest("Enter Email ID");
		System.out.println("Step7 Starts");
		CreateAccountPage createaccountpage = PageFactory.initElements(driver, CreateAccountPage.class);
		createaccountpage.enterEmailID(excel.getSringData("Login", 1, 2));
		logger=report.createTest("Successfully entered data in to Email ID Field");
		System.out.println("Successfully entered data in to Email ID Field");
		System.out.println("Step7 ends");
	}
	
	@Test(priority=8, description="Step 8: Enter Password")
	public void enterPWD()
	{
		logger=report.createTest("Enter Password");
		System.out.println("Step8 Starts");
		CreateAccountPage createaccountpage = PageFactory.initElements(driver, CreateAccountPage.class);
		createaccountpage.enterPassword(excel.getSringData("Login", 1, 3));
		logger=report.createTest("Successfully entered data in to Password Field");
		System.out.println("Successfully entered data in to Password Field");
		System.out.println("Step8 ends");
	}
	
	@Test(priority=9, description="Step 9: Click on Continue CTA")
	public void clickOnTheContnueCTA()
	{
		logger=report.createTest("Click on Continue CTA");
		System.out.println("Step9 Starts");
		CreateAccountPage createaccountpage = PageFactory.initElements(driver, CreateAccountPage.class);
		createaccountpage.clickOnContinueCTA();
		logger=report.createTest("Successfully clicked on Continue CTA");
		System.out.println("Successfully clicked on Continue CTA");
		System.out.println("Step9 ends");
		
		
	}
}
