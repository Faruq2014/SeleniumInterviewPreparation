package com.SeleniumAssesment.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Web Elements Locator
 * @author Faruq
 *
 */
public class WebElementLocatorTest {
	WebDriver driver;

	@BeforeClass
	public void init() {

		//System.setProperty("webdriver.chrome.driver", 
	//			"C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void WhatAreTheLocatorsInSelenium() {
		/*
		ID
		ClassName
		Name
		TagName
		LinkText
		PartialLinkText
		Xpath
		CSS Selector
		DOM
		*/
	}
	@Test
	public void WhatIsAnXPath() {
		/*XPath is used to locate a web element based on its XML path. 
		 * XML stands for Extensible Markup Language
		 * XPath can be used to locate HTML elements.
		 */
		//What is the difference between “/” and “//” in Xpath?
		/*
		 * Single Slash “/” – Single slash is used to create Xpath with absolute path i.e.
		 *  the xpath would be created to start selection from the document node/start node.

          *Double Slash “//” – Double slash is used to create Xpath with relative path i.e. 
          *the xpath would be created to start selection from anywhere within the document
		 */
	}
	/**
	 * Select the Locator which is not available in Selenium WebDriver
	 * 
	 * ID 
	 * TAGNAME 
	 * NAME 
	 * TYPE
	 * 
	 * answer is >> TYPE
	 * 
	 */
	@Test

	public void getLocator() {
		driver.findElement(By.id(""));
		driver.findElement(By.name(""));
		driver.findElement(By.className(""));
		driver.findElement(By.tagName(""));
		
	}
	
	@AfterClass
	public void destroy() {
		if(driver!=null) {
			driver.quit();
		}
	}


}
