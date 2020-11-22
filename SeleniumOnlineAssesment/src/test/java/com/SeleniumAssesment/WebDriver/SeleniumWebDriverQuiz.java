package com.SeleniumAssesment.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**This class will teach you about
 * 1. what is webdriver interface
 * 2. nested web driver interfaces
 * 3. web driver implemented classes
 * 4. web driver interface methods implemented by classes(abstracts methods)
 * 5. commands methods implements by classes such as chrome, firefox etc
 * @author Faruq
 *https://www.journaldev.com/26429/selenium-webdriver
 *https://www.guru99.com/tests.html
 */

public class SeleniumWebDriverQuiz {
	
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

		/**
		 * 1. What is the interface available in Selenium? 
		 * a. Select
		 * b. WebDriverWait
		 * c.WebDriver 
		 * d.Selenium
		 *  answer is WebDriver is an pure interface of selenium.
		 */
		@Test(priority=1, enabled=true)

		public void WhatIsWebDriver() {
			// answer is WebDriver is an pure interface of selenium.
			/*
			 * Selenium WebDriver is an interface that defines a set of methods. However,
			 * implementation is provided by the browser specific classes
			 */
			//WebDriver driver= new ChromeDriver();
			
			String title = driver.getTitle();
			System.out.println(title);
			
		}
		
		/**
		 * WebDriver has nested interfaces like 
		 * manage
			 * Window, 
			 * Navigation,
			 * Timeouts etc. 
			 * These nested interfaces are used to perform operations like back(), forward() etc. 
		 */
		@Test(priority=2, enabled=false)

		public void WebDriverNestedInterfaces() {
			driver.navigate().to("https://www.facebook.com/"); // nested navigate interface
			driver.manage().window().maximize();// nested window interface
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// time out interface
		
		}
		
		@Test(priority=3, enabled=false)

		public void webDriverClass() {
			/*
			Selenium WebDriver is an interface that defines a set of methods.
			However, implementation is provided by the browser specific classes. 
			Some of the implementation classes are
			 AndroidDriver, 
			 ChromeDriver, 
			FirefoxDriver, 
			InternetExplorerDriver, 
			IPhoneDriver, 
			SafariDriver etc.
            */
			 WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				
				WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();
				
				WebDriverManager.edgedriver().setup();
				driver= new EdgeDriver();
				
				WebDriverManager.iedriver().setup();
				driver= new InternetExplorerDriver();
		
			
		}
		
		/**Selenium WebDriver interface has many abstract methods like 
		 * get(String url),
		 *  quit(), close(), 
		 *  getWindowHandle(), 
		 *  getWindowHandles(), 
		 *  getTitle() etc.
		 * 
		 */
		
		@Test(priority=4, enabled=false)

		public void SeleniumWebDriverMethods() {
			/*
			 * get(String url) This method will launch a new browser and opens the given URL
			 * in the browser instance. 
			 * 
			 * getWindowHandle() It is used to handle single window
			 * i.e. main window. It return type is string. It will returns browser windlw
			 * handle from focused browser. 
			 * 
			 * getWindowHandles() It is used to handle multiple
			 * windows. It return type is Set. It will returns all handles from all opened
			 * browsers by Selenium WebDriver.
			 *  
			 * close() This command is used to close the
			 * current browser window which is currently in focus.
			 * 
			 *  quit() This method will
			 * closes all the browsers windows which are currently opened and terminates the
			 * WebDriver session. 
			 * 
			 * getTitle() This method is used to retrieve the title of
			 * the webpage the user currently working on.
			 */
			driver.get("https://www.facebook.com/"); // abstract methid implemented by chrome driver.
		}
		
		/**
		 * Selenium WebElement represents an HTML element. We can get an instance of WebElement 
		 * using findElement() method and then perform specific actions such as 
		 * click, submit etc.
		 */
	
		@Test(priority=3, enabled=false)

		public void ListOfCommandsOnWebElement() {
			/*
			 * findElement() This method finds the first element within the current web page
			 * by using given locator. WebElement element =
			 * driverObject.findElement(By.locator(“value”));
			 * 
			 * sendKeys() This method enters a value in to an Edit Box or Text box.
			 * driver.findElement(By.elementLocator(“value”)).sendkeys(“value”); 
			 * 
			 * clear() It
			 * clears the Value from an Edit box or Text Box.
			 * driverObject.findElement(By.locatorname(“value”)).clear(); 
			 * 
			 * click() It clicks
			 * an Element (Button, Link, Checkbox) etc.
			 * driverObject.findElement(By.ElementLocator(“LocatorValue”)).click();
			 * 
			 */
		}
		
			@AfterClass
		public void destroy() {
			if(driver!=null) {
				driver.quit();
			}
		}

	}


