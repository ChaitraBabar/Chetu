package com.cl.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cl.pages.BaseClass;
import com.cl.pages.SearchResultPage;
import com.cl.pages.SignInPage;

public class SR_TC_03 extends BaseClass{
	
	@Test(priority=1, description="Step 1: Delete All Coockies")
	public void deleteAllCoockies()
	{
		logger=report.createTest("Clear coockies");
		System.out.println("Step1 Starts");
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		logger.info("Clear All Cookies");
		loginpage.clearchach();
		logger.pass("Successfully Cleared All Coockies ");
		System.out.println("Successfully Cleared All Coockies");
		System.out.println("Step1 ends");
	}
	
	@Test(priority=2, description="Step 2: Scrool to the Footer section")
	public void scrollToFooterSection()
	{
		logger=report.createTest("Scroll to the Footer section");
		System.out.println("Step2 Starts");
		SearchResultPage searchresultpage = PageFactory.initElements(driver, SearchResultPage.class);
		logger.info("Scroll to the Footer Section");
		searchresultpage.footer();
		logger.pass("Scrolled to the Footer section ");
		System.out.println("Scrolled to the Footer section");
		System.out.println("Step2 ends");
	}
	
	@Test(priority=3, description="Step 3: Click on Back To Top")
	public void clickOnBackToTop()
	{
		logger=report.createTest("Click on Back To Top");
		System.out.println("Step3 Starts");
		SearchResultPage searchresultpage = PageFactory.initElements(driver, SearchResultPage.class);
		logger.info("Click on Back To Top ");
		searchresultpage.backtotop();
		logger.pass("Successfully clicked on the Back To Top ");
		System.out.println("Successfully clicked on the Back To Top");
		System.out.println("Step3 ends");
	}
	
	@Test(priority=4, description="Step 4: Mouse Hover On Country Selector")
	public void verifyTheContryFlag() throws InterruptedException
	{
		logger=report.createTest("Mouse Hover On Country Selector");
		System.out.println("Step4 Starts");
		SearchResultPage searchresultpage = PageFactory.initElements(driver, SearchResultPage.class);
		logger.info("Mouse Hover On Country Selector ");
		searchresultpage.mouseHoverOnContrySelector();
		logger.pass("Mouse Hovered On Country Selector");
		System.out.println("Mouse Hovered On Country Selector");
		System.out.println("Step4 ends");
	}
	
	@Test(priority=5, description="Step 5: Click on Change Country Link")
	public void clickOnChangeCountryLink()
	{
		logger=report.createTest("Click on Change Country Link");
		System.out.println("Step5 Starts");
		SearchResultPage searchresultpage = PageFactory.initElements(driver, SearchResultPage.class);
		logger.info("Click on Change Country Link ");
		searchresultpage.changecountrylink();
		logger.pass("Successfully Clicked on Change Country Link");
		System.out.println("Successfully Clicked on Change Country Link");
		System.out.println("Step5 ends");
	}
	
	@Test(priority=6, description="Step 6: Click on Country Dropdown")
	public void clickOnCountryDropDown()
	{
		logger=report.createTest("Click on Country Dropdown");
		System.out.println("Step6 Starts");
		SearchResultPage searchresultpage = PageFactory.initElements(driver, SearchResultPage.class);
		logger.info("Click on Country Dropdown ");
		searchresultpage.clickOnCountryDropdown();
		logger.pass("Successfully Clicked on Country Drop Down");
		System.out.println("Successfully Clicked on Country Drop Down");
		System.out.println("Step6 ends");
	}

	@Test(priority=7, description="Step 7: Select US country")
	public void selectedUSCountry()
	{
		logger=report.createTest("Select US country");
		System.out.println("Step7 Starts");
		SearchResultPage searchresultpage = PageFactory.initElements(driver, SearchResultPage.class);
		logger.info("Click on Country Dropdown ");
		searchresultpage.usCountry();
		logger.pass("Successfully Selected US country");
		System.out.println("Successfully Selected US country");
		System.out.println("Step7 ends");
	}
	
	@Test(priority=8, description="Step 8: Click on US country option")
	public void selectedUSCountryOption()
	{
		logger=report.createTest("Click on US country option");
		System.out.println("Step8 Starts");
		SearchResultPage searchresultpage = PageFactory.initElements(driver, SearchResultPage.class);
		logger.info("Click on US country option ");
		searchresultpage.clickOnUSCountryOption();
		logger.pass("Successfully Clicked on US country option ");
		System.out.println("Successfully Clicked on US country option ");
		System.out.println("Step8 ends");
	}
	
	@Test(priority=9, description="Step 9: Click on Go Website CTA")
	public void clickOnGoWebsiteCTA()
	{
		logger=report.createTest("Click on Go Website CTA");
		System.out.println("Step9 Starts");
		SearchResultPage searchresultpage = PageFactory.initElements(driver, SearchResultPage.class);
		logger.info("Click on Go Website CTA ");
		searchresultpage.clickOnGoWebSiteCTA();
		logger.pass("Successfully Clicked on Go Website CTA");
		System.out.println("Successfully Clicked on Go Website CTA");
		System.out.println("Step9 ends");
	}
	
	@Test(priority=10, description="Step 10: Switch To New Tab")
	public void SwichToNewTabe()
	{
		logger=report.createTest("Switch To New Tab");
		System.out.println("Step10 Starts");
		SearchResultPage searchresultpage = PageFactory.initElements(driver, SearchResultPage.class);
		logger.info("Click on Go Website CTA ");
		searchresultpage.switchToNewWindow();
		logger.pass("Successfully Switched To New Tab");
		System.out.println("Successfully Switched To New Tab");
		System.out.println("Step10 ends");
	}
	
	@Test(priority=11, description="Step 11: Click on Search Text field")
	public void clickOnSearchTextField()
	{
		logger=report.createTest("Click on Search Text field");
		System.out.println("Step11 Starts");
		SearchResultPage searchresultpage = PageFactory.initElements(driver, SearchResultPage.class);
		logger.info("Click on Search Text field ");
		searchresultpage.clickSearchTextButton();
		logger.pass("Successfully Clicked on Search Text field");
		System.out.println("Successfully Clicked on Search Text field");
		System.out.println("Step11 ends");
	}
	
	@Test(priority=12, description="Step 12: Enter Text on Search Text field")
	public void enterTextOnSearchTextField()
	{
		logger=report.createTest("Enter Text on Search Text field");
		System.out.println("Step12 Starts");
		SearchResultPage searchresultpage = PageFactory.initElements(driver, SearchResultPage.class);
		logger.info("Enter Text on Search Text field ");
		searchresultpage.enterTextInSearchTextButton();
		logger.pass("Successfully Entered Text on Search Text field");
		System.out.println("Successfully Entered Text on Search Text field");
		System.out.println("Step12 ends");
	}
	
	@Test(priority=13, description="Step 13: Click on Search Text field after entering text in search field")
	public void clickOnSearchTextFieldAfterEnteringText()
	{
		logger=report.createTest("Click on Search Text field after entering text in search field");
		System.out.println("Step13 Starts");
		SearchResultPage searchresultpage = PageFactory.initElements(driver, SearchResultPage.class);
		logger.info("Click on Search Text field after entering text in search field ");
		searchresultpage.clickSearchTextButtonAfterEnteringText();
		logger.pass("Successfully Clicked on Search Text field after entering text in search field");
		System.out.println("Successfully Clicked on Search Text field after entering text in search field");
		System.out.println("Step13 ends");
	}
	
	@Test(priority=14, description="Step 14: Select Kindle Unlimited Tag")
	public void kindleUnlimitedTag()
	{
		logger=report.createTest("Select Kindle Unlimited Tag");
		System.out.println("Step14 Starts");
		SearchResultPage searchresultpage = PageFactory.initElements(driver, SearchResultPage.class);
		logger.info("Select Kindle Unlimited Tag ");
		searchresultpage.kindleUnlimitedTag();
		logger.pass("Successfully Selected Kindle Unlimited Tag");
		System.out.println("Successfully Selected Kindle Unlimited Tag");
		System.out.println("Step14 ends");
	}
	
	@Test(priority=15, description="Step 15: Mouse Hover on Best Seller")
	public void mouseHoverOnBestSellerTag()
	{
		logger=report.createTest("Mouse Hover on Best Seller");
		System.out.println("Step15 Starts");
		SearchResultPage searchresultpage = PageFactory.initElements(driver, SearchResultPage.class);
		logger.info("Mouse Hover on Best Seller ");
		searchresultpage.mouseHoverOnBestSeller();
		logger.pass("Successfully Mouse Hovered on Best Seller");
		System.out.println("Successfully Mouse Hovered on Best Seller");
		System.out.println("Step15 ends");
	}
	
	@Test(priority=16, description="Step 16: Verify the Flash Message")
	public void verifyTheFlashMSG()
	{
		logger=report.createTest("Verify the Flash Message");
		System.out.println("6 Starts");
		SearchResultPage searchresultpage = PageFactory.initElements(driver, SearchResultPage.class);
		logger.info("Verify the Flash Message ");
		searchresultpage.verifyFlashMessage();
		logger.pass("Flash Message is displayed as expected");
		System.out.println("Flash Message is displayed as expected");
		System.out.println("Step16 ends");
	}

}
