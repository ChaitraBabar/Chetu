package com.cl.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cl.pages.BaseClass;
import com.cl.pages.SelectAddressPopup;
import com.cl.pages.SignInPage;

public class SAP_TC_05 extends BaseClass {

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
	
	@Test(priority=2, description="Step 2: Click on the Location Picto")
	public void clickOnLocationPicto()
	{
		logger=report.createTest("Click on the Location Picto");
		System.out.println("Step2 Starts");
		SelectAddressPopup addresspage = PageFactory.initElements(driver, SelectAddressPopup.class);
		addresspage.clickOnLocationPicto();
		logger.pass("Successfully Clicked on the Location Picto ");
		System.out.println("Step2 ends");
	}
	
	@Test(priority=3, description="Step 3: Verify The Header Text")
	public void getHeaderText()
	{
		logger=report.createTest("Verifying Header Text");
		System.out.println("Step3 Starts");
		SelectAddressPopup addresspage = PageFactory.initElements(driver, SelectAddressPopup.class);
		addresspage.verifyHeaderText();
		logger.pass("Header Text is displayed as expected");
		System.out.println("Step3 ends");
	}
	
	@Test(priority=4, description="Step 4: Verify The Description Text")
	public void gedescriptionText()
	{
		logger=report.createTest("Verifying Description Text");
		System.out.println("Step4 Starts");
		SelectAddressPopup addresspage = PageFactory.initElements(driver, SelectAddressPopup.class);
		addresspage.verifyDescriptionText();
		logger.pass("Description Text is displayed as expected");
		System.out.println("Step4 ends");
	}
	
	@Test(priority=5, description="Step 5: Verify CTA Text")
	public void verifyctatext()
	{
		logger=report.createTest("Verifying CTA Text");
		System.out.println("Step5 Starts");
		SelectAddressPopup addresspage = PageFactory.initElements(driver, SelectAddressPopup.class);
		addresspage.verifyCTAText();
		logger.pass("CTA Text is displayed as expected");
		System.out.println("Step5 ends");
	}
	
	@Test(priority=6, description="Step 6: Verify Pin Code Text Box")
	public void verifypincodeCTA()
	{
		logger=report.createTest("Verify Pin Code Text Box");
		System.out.println("Step6 Starts");
		SelectAddressPopup addresspage = PageFactory.initElements(driver, SelectAddressPopup.class);
		addresspage.verifyPinCodeTextBox();
		logger.pass("Pin Code Text Box displayed as expected");
		System.out.println("Step6 ends");
	}
	
	@Test(priority=7, description="Step 7: Verify Apply CTA")
	public void verifyApplayCTA()
	{
		logger=report.createTest("Verify Apply CTA");
		System.out.println("Step7 Starts");
		SelectAddressPopup addresspage = PageFactory.initElements(driver, SelectAddressPopup.class);
		addresspage.verifyApplyCTA();
		logger.pass("Verify Apply CTA displayed ");
		System.out.println("Step7 ends");
	}
	
	@Test(priority=8, description="Step 8: Verify Deliver Drop Down ")
	public void verifyDeliverDropDown()
	{
		logger=report.createTest("Verify Deliver Drop Down");
		System.out.println("Step8 Starts");
		SelectAddressPopup addresspage = PageFactory.initElements(driver, SelectAddressPopup.class);
		addresspage.deliverDropDown();
		logger.pass("Deliver Drop Down displayed as expected");
		System.out.println("Step8 ends");
	}
	

	
	@Test(priority=11, description="Step 10: Enter Invalid Code in Pincode Text Box ")
	public void enterInvalidCode()
	{
		logger=report.createTest("Enter Invalid Code in Pincode Text Box");
		System.out.println("Step11 Starts");
		SelectAddressPopup addresspage = PageFactory.initElements(driver, SelectAddressPopup.class);
		addresspage.enterCodeInPinCodeTextBox();
		logger.pass("Entered Invalid Code in Pincode Text Box");
		System.out.println("Step11 ends");
	}
	

	@Test(priority=12, description="Step 12: Click on the Apply CTA ")
	public void clickOnTheApplyCTA()
	{
		logger=report.createTest("Click on the Apply CTA ");
		System.out.println("Step12 Starts");
		SelectAddressPopup addresspage = PageFactory.initElements(driver, SelectAddressPopup.class);
		addresspage.clickOnApplyCTA();
		logger.pass("Clicked on the Apply CTA ");
		System.out.println("Step12 ends");
	}
	
	@Test(priority=13, description="Step 13: Verify the Error Message ")
	public void verifyerrorMessage()
	{
		logger=report.createTest("Verify the Error Message ");
		System.out.println("Step13 Starts");
		SelectAddressPopup addresspage = PageFactory.initElements(driver, SelectAddressPopup.class);
		addresspage.verifyerrormessage();
		logger.pass("Verify the Error Message ");
		System.out.println("Step13 ends");
	}
	
	
	
	@Test(priority=14, description="Step 14: Click on the Drop Down  ")
	public void verifyErrorMessage()
	{
		logger=report.createTest("Click on the Drop Down");
		System.out.println("Step14 Starts");
		SelectAddressPopup addresspage = PageFactory.initElements(driver, SelectAddressPopup.class);
		addresspage.clickOnTheDropDown();
		logger.pass("Click on the Drop Down");
		System.out.println("Step14 ends");
	}
	
	@Test(priority=15, description="Step 15: Verify All Options from the Dropdown ")
	public void verifyAllOptions()
	{
		logger=report.createTest("Verify All Options from the Dropdown");
		System.out.println("Step15 Starts");
		SelectAddressPopup addresspage = PageFactory.initElements(driver, SelectAddressPopup.class);
		//addresspage.verifyAllDropdownOptions();
		addresspage.getText();
		logger.pass("Verify All Options from the Dropdown");
		System.out.println("Step15 ends");
	}
	
	
	
	
}
