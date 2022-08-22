package com.cl.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cl.pages.BaseClass;
import com.cl.pages.SignInPage;
import com.cl.utility.ExcelDataProvider;

public class SP_TC_01 extends BaseClass{
	
	
	@Test(priority=1, description="Step 1: Delete All Coockies")
	public void deleteAllCoockies()
	{
		logger=report.createTest("Clear coockies");
		System.out.println("Step1 Starts");
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		logger.info("Clear All Cookies");
		loginpage.clearchach();
		logger.pass("Successfully Cleared All Coockies ");
		System.out.println("Cleared All Coockies");
		System.out.println("Step1 ends");
	}
	
	@Test(priority=2, description="Step 2: Mouse Hover On the Hello, Sign In")
	public void mouseHover() throws InterruptedException
	{
		logger=report.createTest("MouseHover functionality");	
		System.out.println("Step2 Starts");
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		loginpage.cmousehoveronpicto();
		//Thread.sleep(2000);
		logger=report.createTest("Succefully MouseHovered on the component");	
		System.out.println("Step2 ends");
	}
	
	@Test(priority=3, description="Step 3: Click on Sign In CTA")
	public void clickOnSignInCTA() throws InterruptedException 
	{
		logger=report.createTest("Click on the Sign In CTA");	
		System.out.println("Step3 Starts");
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		loginpage.clickonSignInCTA();
		System.out.println("User is clicked on the Sign CTA");
		logger=report.createTest("Successfully clicked on the Sign CTA");	
		System.out.println("Step3 ends");
	}
	
	@Test(priority=4, description="Step 4: Click on Email ID Text Field")
	public void clickOnEmailIdTextField()
	{
		logger=report.createTest("Click on Email ID Text Field");	
		System.out.println("Step4 Starts");
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		loginpage.clickonemailid();
		System.out.println("User successufully clicked on the Email ID field");
		logger=report.createTest("Successufully clicked on the Email ID field");	
		System.out.println("Step4 ends");
	}
	
	@Test(priority=5, description="Step 5: Enter Email Id")
	public void enterEmailIdOnTextField()
	{
		logger=report.createTest("Enter Email Id");	
		ExcelDataProvider excel=new ExcelDataProvider();
		System.out.println("Step5 Starts");
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		loginpage.enteremailid(excel.getSringData("Login", 0, 0));
		System.out.println("Email id is fetched from the excel sheet successfully");
		logger=report.createTest("Email id is fetched from the excel sheet successfully");	
		System.out.println("Step5 ends");
	}
	
	@Test(priority=6, description="Step 6: Click On Continue CTA")
	public void clickOnContinueCTA()
	{
		logger=report.createTest(" Click On Continue CTA");	
		System.out.println("Step6 Starts");
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		System.out.println("User successufully clicked on the Continue CTA");
		loginpage.clickOnContinueCTA();
		logger=report.createTest("Successufully clicked on the Continue CTA");	
		System.out.println("Step6 ends");
	}
	
	@Test(priority=7, description="Step 7: Click on Password Text Field")
	public void clickOnPasswordTextField() throws InterruptedException
	{
		logger=report.createTest("Click on Password Text Field");
		System.out.println("Step7 Starts");
		Thread.sleep(4000);
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		System.out.println("User successufully clicked on the Password field");
		loginpage.clickonpassword();
		logger=report.createTest("Successufully clicked on the Password CTA");
		System.out.println("Step7 ends");
	}
	
	@Test(priority=8, description="Step 8: Enter Password")
	public void enterpasswordOnTextField()
	{
		logger=report.createTest("Enter Password");
		ExcelDataProvider excel=new ExcelDataProvider();
		System.out.println("Step8 Starts");
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		loginpage.enterpsw(excel.getSringData("Login", 0, 1));
		System.out.println("Password Data fetched from the excel sheet successuly");
		logger=report.createTest("Successufully Password Data fetched from the excel sheet ");
		System.out.println("Step8 ends");
	}
	
	@Test(priority=9, description="Step 9: Click On The Sign IN CTA")
	public void clickOnTheSignInCTA() 
	{
		logger=report.createTest("Click On The Sign IN CTA ");
		System.out.println("Step9 Starts");
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		loginpage.clickOnTheSignInCTA();
		System.out.println("User successufully clicked on the Sign in CTA Succcessfully");
		logger=report.createTest("Successufully clicked on the Sign in CTA Succcessfully ");
		System.out.println("Step9 ends");
		
	}
	
	
	
}