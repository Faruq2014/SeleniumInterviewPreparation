package com.SeleniumAssesment.Exceptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exceptions {
	WebDriver driver;

	@BeforeClass
	public void init() {

	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@Test
	public void WhatAreTheDifferentTypesExceptionsInSelenium() {
		/* WebDriverException,
			NoAlertPresentException,
			NoSuchWindowException,
			NoSuchElementException,
			TimeoutException.
		  
		 */
		
	}
	
	@AfterClass
	public void destroy() {
		if(driver!=null) {
			driver.quit();
		}
	}
}
