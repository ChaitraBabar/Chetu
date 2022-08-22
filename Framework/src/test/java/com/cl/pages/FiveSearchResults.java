package com.cl.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import com.cl.GUIFunctions.GUIFunctions;
import com.cl.utility.ObjRepository;

public class FiveSearchResults {

	WebDriver driver;
	public ObjRepository config;
	
	public FiveSearchResults(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	

	
	//Search Field XPATH
	By searchField_xpath=By.xpath(ObjRepository.getValue("SearchTextField_XPATH"));
	
	//Search Icon XPATH
	By SarchIcon_XPATH=By.xpath(ObjRepository.getValue("SarchIcon_XPATH"));
		
	By Watches_XPATH=By.xpath(ObjRepository.getValue("Watches_XPATH"));
	

	
	public void clickOnSearchTextField()
    {
		GUIFunctions.clickButton(driver, searchField_xpath);
       
        Reporter.log("Successfully clicked on Search TextField");

    }

    public void searchforDifferntCategory(String Searchtext) throws Exception
    {
        GUIFunctions.enterTextinToTextBox(driver, searchField_xpath, Searchtext);
        GUIFunctions.clickButton(driver, SarchIcon_XPATH);
        String Expectedurl = driver.getCurrentUrl();
        System.out.println(" The Expected page  " +Expectedurl + "  is displayed");
        //String content= driver.getPageSource();

    }
    

    
}
