package com.cl.GUIFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class GUIFunctions {
	static WebDriver driver;
	
	public static Properties p;
	
		//delete all cookies
		public static void deleteAllCookies(WebDriver driver){
			driver.manage().deleteAllCookies();
			System.out.println("cookies are deleted");
		}
		
		//Verifying the Element
		public static boolean isElementPresent(By by, WebDriver driver) 
		{
			try 
			{
				System.out.println("element is present inside isElementPresent()");
				driver.findElement(by);
				return true;
			} 
			catch (NoSuchElementException e) 
			{
				System.out.println("catch of isElementPresent()");
				System.out.println("element is not present");
				return false;
			}
		}
		
		//sleep
		public static void sleep() throws InterruptedException{	
					Thread.sleep(5000);
				}
		//Mouse Hover and click
		
		public static void mouseHoveronElementandClick(WebDriver driver, WebElement ele){
			try{
				Actions act = new Actions(driver);
				act.moveToElement(ele).click().build().perform();
				
			}catch(NoSuchElementException e){
				
				System.out.println("No such element found");
			}
		}
		
		//Mouse Hover
		public static void mouseHoveronElement(WebDriver driver, WebElement ele){
			try{
				Actions act = new Actions(driver);
				act.moveToElement(ele).build().perform();
				
			}catch(NoSuchElementException e){
				
				System.out.println("No such element found");
			}
		}
		
		
		//click button
		public static void clickButton(WebDriver driver, By by)
		{
			try
		 		{
						driver.findElement(by).click();
					System.out.println("Successfully clicked the button ");					}
					 catch (NoSuchElementException e) {
						 System.out.println("Button to click is not present because of" + e);
				}
				}
				
		//enter text into text field
		public static void enterTextinToTextBox(WebDriver driver, By by, String str)
		{
		driver.findElement(by).clear();
		driver.findElement(by).sendKeys(str);
					
		}
				
		//enter Number in to text field
		public static void enternumberinToTextBox(WebDriver driver, By by, double d){
			driver.findElement(by).clear();
			String number = Double.toString(d);
			driver.findElement(by).sendKeys(number);	
			}
				
				//compare strings
				public static void compareStrings(WebDriver driver, String str1, String str2){
					
					boolean bval = str1.equalsIgnoreCase(str2);
							if(bval==true){
						System.out.println("Strings are same");
							}
						else{
							System.out.println("Strings are not same");
							Reporter.log("<p>Strings are not same");
						}			
				}
				
				//Scroll element 
				public static void scrollElement(WebDriver driver, int x, int y)
				{
					try
					{
					JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("window.scrollBy("+x+","+y+")");
					}
					catch(JavascriptException je)
					{
						System.out.println("Java Script Executor found");
					}
				}
				
				public static void scrollElementOnPage(WebDriver driver,String b)
				{
					try
					{
						WebElement ele = driver.findElement(By.xpath(b));
						int x = ele.getLocation().getX();
						int y = ele.getLocation().getY();
					JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("window.scrollBy("+x+","+y+")");
					}
					catch(JavascriptException je)
					{
						System.out.println("Java Script Executor found");
					}
				}
				
				// To switch to nextTab
				public static void switchToNextTab(WebDriver driver)
				{
				    ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
				    driver.switchTo().window(newTb.get(1));
				}
				public static void scrollByEnteringNumbers(WebDriver driver,String a, String b)
				{
					try
					{
						
						int x = Integer.parseInt(a);
						int y = Integer.parseInt(b);
					JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("window.scrollBy("+x+","+y+")");
					}
					catch(JavascriptException je)
					{
						System.out.println("Java Script Executor found");
					}
				}
				
				//Get Text
				public static String getText(WebDriver driver, By by){
					try
					{
					String str = driver.findElement(by).getText();
					System.out.println("Value/message is = "+ str);
					System.out.println("Value/message is = "+ str);
					return str;
					}
					catch(NoSuchElementException e)
					{
						System.out.println("No Such Element Exception");
					}
					return null;
				}
				
				//Get All options
				public static void getAllOptions(By by)
				{
//					 List<WebElement> allSuggestions = driver.findElements(by);      
//			        for (WebElement suggestion : allSuggestions)
//			     {
//			        System.out.println(suggestion.getText());
//
//			        }
					Select s = new Select(driver.findElement(by));
		            Iterable<WebElement> country_options = s.getOptions();
		            int i = 1;
		            for (WebElement e : country_options) {
		                System.out.println(i + ".  " + e.getText());
		                i++;
				}
				
				}
				}


