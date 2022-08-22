package com.cl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cl.GUIFunctions.GUIFunctions;
import com.cl.utility.ObjRepository;

public class SearchResultPage {

	private final WebDriver driver;
	public ObjRepository config;
	
	public SearchResultPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	//Footer Section
	String b="Footer_XPATH";
	
	//Back To Top CTA
	By backtotop_xpath=By.xpath(ObjRepository.getValue("BackToTop_XPATH"));
	
	//Mouse Hover on Language selector
	@FindBy(xpath="//span[@class='icp-nav-flag icp-nav-flag-in']") WebElement pictomousehover_XPATH;
	
	//Change Country Link
	By changecountry_xpath=By.xpath(ObjRepository.getValue("ChangeCounty_XPATH"));
	
	//Country Dropdown
	By countryDropdown_xpath=By.xpath(ObjRepository.getValue("CountryDropDown_XPATH"));
	
	//US Country Option click
	By uscountryoption_xpath=By.xpath(ObjRepository.getValue("USCountryClick_XPATH"));
	
	//Click On Go WebSite
	By goWebSite_xpath=By.xpath(ObjRepository.getValue("GoWebsite_XPATH"));
	
	//Search Text Field
	By searchField_xpath=By.xpath(ObjRepository.getValue("SearchField_XPATH"));
	
	//Search Text Field after entering Text
	By searchField2_xpath=By.xpath(ObjRepository.getValue("SearchField2_XPATH"));
	
	//Kindle Unlimited Tag
	By kindleUnlimitedTag_xpath=By.xpath(ObjRepository.getValue("KindleUnlimitedTag_XPATH"));
	
	//Best Seller 
	@FindBy(xpath="(//span[@class='a-badge-label-inner a-text-ellipsis'])[1]") WebElement bestSeller_xpath;
	
	
	//Scroll to the Footer section
	public void footer()
	{
		GUIFunctions.scrollByEnteringNumbers(driver, ObjRepository.getValue("Scroll_X"), ObjRepository.getValue("Scroll_Y"));
	}
	
	//Click on the Back To Top CTA
	public void backtotop()
	{
		GUIFunctions.clickButton(driver, backtotop_xpath);
	}
	
	//Mouse Hover on The Country Selector
	public void mouseHoverOnContrySelector()
	{
		GUIFunctions.mouseHoveronElement(driver, pictomousehover_XPATH);
		
	}
	
	//Click on the Change Country link
	public void changecountrylink()
		{
			GUIFunctions.clickButton(driver, changecountry_xpath);
			
		}
		
		//Click on the Country dropdwon
		public void clickOnCountryDropdown()
		{
			GUIFunctions.clickButton(driver, countryDropdown_xpath);
					
		}
		
		//Scroll To The US Country Option
		public void usCountry()
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("document.querySelector('.a-popover-inner.a-lgtbox-vertical-scroll').scrollTo(0,300)");
		}
		
		//Click on the US Country Option
		public void clickOnUSCountryOption()
		{
		GUIFunctions.clickButton(driver, uscountryoption_xpath);
							
		}
		
		//Click on the Go WebSite
		public void clickOnGoWebSiteCTA()
		{
			GUIFunctions.clickButton(driver, goWebSite_xpath);
									
		}
		
		//Open In New Window
		public void switchToNewWindow()
		{
				GUIFunctions.switchToNextTab(driver);
											
		}
		//Click on Search text field 
		public void clickSearchTextButton()
		{
				GUIFunctions.clickButton(driver, searchField_xpath);
											
		}
		
		//Enter text in Search text field 
		public void enterTextInSearchTextButton()
		{
			GUIFunctions.enterTextinToTextBox(driver, searchField_xpath, ObjRepository.getValue("Text"));
													
		}
		
		///Click on Search text field after entering text
		public void clickSearchTextButtonAfterEnteringText()
		{
			GUIFunctions.clickButton(driver, searchField2_xpath);
															
		}
		
		//Select Kindle Unlimited Tag
		public void kindleUnlimitedTag()
		{
			GUIFunctions.clickButton(driver, kindleUnlimitedTag_xpath);
																	
		}
		
		//Mouse Hover on Best Seller
		public void mouseHoverOnBestSeller()
		{
			GUIFunctions.mouseHoveronElement(driver, bestSeller_xpath);
																			
		}
		
		//Verify the Flash Message
		public void verifyFlashMessage()
		{
			String exp=ObjRepository.getValue("FlashMessage");
			String act = driver.findElement(By.xpath(ObjRepository.getValue("FlasMessage_XPATH"))).getText();
			GUIFunctions.compareStrings(driver, act, exp);
		}
}
