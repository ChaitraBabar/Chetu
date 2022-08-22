package com.cl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cl.GUIFunctions.GUIFunctions;
import com.cl.utility.ObjRepository;

public class SelectAddressPopup {

	private final WebDriver driver;
	public ObjRepository config;
	
	public SelectAddressPopup(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	//Location Picto XPATH
	By location_xpath=By.xpath(ObjRepository.getValue("LocationPicto_XPATH"));
	
	//Header XPATH
	By header_xpath=By.xpath(ObjRepository.getValue("Header_XPATH"));
	
	//Description XPATH
	By description_xpath=By.xpath(ObjRepository.getValue("Description_XPATH"));
	
	//CTA Xpath
	By cta_xpath=By.xpath(ObjRepository.getValue("CTAText_XPATH"));
	
	//PinCode Xpath
	By pincode_xpath=By.xpath(ObjRepository.getValue("PinCodeTextBox_XPATH"));
	
	//Apply Xpath
	By apply_xpath=By.xpath(ObjRepository.getValue("PinCodeTextBox_XPATH"));
	
	//Deliver Drop Down Xpath
	By deliverDropDown_xpath=By.xpath(ObjRepository.getValue("PinCodeTextBox_XPATH"));
	
	//PinCode Error Message XPATH
	By pinCodeErrorMessage_xpath=By.xpath(ObjRepository.getValue("PinCodeTextBox_XPATH"));
		
	//Dropdown XPATH
	By dropDown_xpath=By.xpath(ObjRepository.getValue("DropDown_XPATH"));
	
	//Dropdown XPATH
	By ApplyCTA_XPATH=By.xpath(ObjRepository.getValue("ApplyCTA_XPATH"));
	
	//Get Options XPATH
	By getOptions_XPATH=By.xpath(ObjRepository.getValue("GetOptions_XPATH"));		
		
	
	//Click on the Location picto
	public void clickOnLocationPicto()
	{
		GUIFunctions.clickButton(driver, location_xpath);
	}
	
	

	//Verify the Header Text
	public void verifyHeaderText()
	{
		String exp=ObjRepository.getValue("HeaderText");
		String act = GUIFunctions.getText(driver, header_xpath);
		System.out.println("Actual Header: "+act);
		GUIFunctions.compareStrings(driver, act, exp);
	}
	
	
	//Verify the Header Text
	public void verifyDescriptionText()
	{
			String desc_exp=ObjRepository.getValue("DescriptionText");
			String desc_act = GUIFunctions.getText(driver, description_xpath);
			System.out.println("Actual Description: "+desc_act);
			GUIFunctions.compareStrings(driver, desc_act, desc_exp);
		}
	

	
	//Verify CTA Text
	public void verifyCTAText()
		{
				String cta_exp=ObjRepository.getValue("CTAText");
				String cta_act = GUIFunctions.getText(driver, cta_xpath);
				System.out.println("Actual Description: "+cta_act);
				GUIFunctions.compareStrings(driver, cta_act, cta_exp);
			}
	
	//Verify Pin Code CTA is displayed
	public void verifyPinCodeTextBox()
	{
		GUIFunctions.isElementPresent(pincode_xpath, driver);
	}
	
	//Verify Apply CTA
		public void verifyApplyCTA()
			{
			GUIFunctions.isElementPresent(apply_xpath, driver);
				}
	
	public void deliverDropDown()
	{
		GUIFunctions.isElementPresent(deliverDropDown_xpath, driver);
	}
	
	//Get All dropdown Options
	public void verifyAllDropdownOptions()
	{
		GUIFunctions.getAllOptions(getOptions_XPATH);
	}
	
	//Click and enter invalid text in Pincode Text Field
	public void enterCodeInPinCodeTextBox()
		{
			GUIFunctions.clickButton(driver, pincode_xpath);
			GUIFunctions.enterTextinToTextBox(driver, pincode_xpath, ObjRepository.getValue("InvalidCode") );
		}
	
	//Verify PinCode Error Message
	public void verifyErrorMessage()
	{
		GUIFunctions.getText(driver, pinCodeErrorMessage_xpath);
	}
	
	//click on Appky CTA
	public void clickOnApplyCTA()
	{
		GUIFunctions.clickButton(driver, ApplyCTA_XPATH);
	}
	
	public void verifyerrormessage()
	{
		GUIFunctions.isElementPresent(pinCodeErrorMessage_xpath, driver);
//			String cta_exp=ObjRepository.getValue("ErrorMessageText");
//			String cta_act = GUIFunctions.getText(driver, pinCodeErrorMessage_xpath);
//			System.out.println("Actual Description: "+cta_act);
//			GUIFunctions.compareStrings(driver, cta_act, cta_exp);
		}
	
	//Click On The DropDown 
	public void clickOnTheDropDown()
	{
		GUIFunctions.clickButton(driver, dropDown_xpath);
	}
	
	public void getText()
	{
		GUIFunctions.getText(driver, getOptions_XPATH);
	}
	
}

