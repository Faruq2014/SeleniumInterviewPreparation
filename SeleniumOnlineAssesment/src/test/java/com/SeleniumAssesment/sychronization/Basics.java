package com.SeleniumAssesment.sychronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Basics {
// what is synchronization in Selenium
	// what is wait command in selenium
	// how do you manage Timing issues in selenium
	/*
	 * the mechanism of selenium to handle timing for execution of code
	 * there are two types of Wait command in selenium
	 *    Implicit wait
	 *    explicit wait
	 *    
	 *    what is implicit wait
	 *   implicit wait is a Selenium wait command to manage
	 *   find element timing issues for Web elements.
	 *    
	 *    what is explicit wait
	 *   explicit wait is a Selenium wait command to manage
	 *   exceptional timing issues for particular Web elements.
	 *   there are two types of explicit wait
	 *       Wait
	 *       fluent wait.
	 */
	
	
	WebDriver driver;
	@BeforeMethod
	public void init() {
		driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//how to set 10 seconds implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void m1() {
		
	}
		
	@AfterMethod
	public void destroy() {
		if(driver!=null) {
			//	what is close command?
			//driver.close();
			//what is quit command
			//driver.quit();
			//what is the difference between close and quit command?
			/*driver.close()==close current window
			 * driver.quit();== close whole browser
			 */
		}
	}



}
