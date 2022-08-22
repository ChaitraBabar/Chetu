package com.cl.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.cl.pages.BaseClass;
import com.cl.pages.FiveSearchResults;
import com.cl.pages.SignInPage;

public class DSR_TC_06 extends BaseClass{
	
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
	
	@Test(priority=2, description="Step 2: Click on Search Text field")
	public void clickOnSearchTextField()
	{
		logger=report.createTest("Click on Search Text field");
		System.out.println("Step2 Starts");
		FiveSearchResults searchresultpage = PageFactory.initElements(driver, FiveSearchResults.class);
		logger.info("Click on Search Text field ");
		searchresultpage.clickOnSearchTextField();
		logger.pass("Successfully Clicked on Search Text field");
		System.out.println("Successfully Clicked on Search Text field");
		System.out.println("Step2 ends");
	}
	
	@Test(priority=3, description="Step 3: Click on Search Text field")
	public void enterTextIntoSearchTextField() throws Exception
	{
		logger=report.createTest("Click on Search Text field");
		System.out.println("Step3 Starts");
		FiveSearchResults searchresultpage = PageFactory.initElements(driver, FiveSearchResults.class);
		
		logger.info("Click on Search Text field ");
		for (int i=0;i<=4;i++)
		{
			
		searchresultpage.searchforDifferntCategory(excel.getSringData("SearchText", i, 0));
		String tit = driver.getTitle();
		
		  System.out.println("Search Result Page Title :" +tit);
		  
		  if(tit.equals("Amazon.in : TVs"))
		  {
			  System.out.println("This is TVs Search Result Page");
		  }
		  else if(tit.equals("Amazon.in : Laptops"))
		  {
			  System.out.println("This is Laptops Search Result Page");
		  }
		  else if(tit.equals("Amazon.in : Watches"))
		  {
			  System.out.println("This is Watches Search Result Page");
		  }
		  else if(tit.equals("Amazon.in : Books"))
		  {
			  System.out.println("This is Books Search Result Page");
		  }
		  else if(tit.equals("Amazon.in : Mobiles"))
		  {
			  System.out.println("This is Mobiles Search Result Page");
		  }
		  else
		  {
			  System.out.println("Search Result Page not found");
		  }
		
		}
		logger.pass("Successfully Clicked on Search Text field");
		System.out.println("Successfully Clicked on Search Text field");
		System.out.println("Step3 ends");
	}
}


	
	


