package com.SeleniumAssesment.TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGxml {
	WebDriver driver;
	@BeforeMethod(groups="smoke")
	public void init() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	@Test(priority=0,groups="smoke",alwaysRun=true)
    public void testNgxmlFile() {
		
		//what is testng.xml file
		/*
		 * 
		 */
		
		// what is test in xml file
		/* a group of similar testNg class 
		 * test can contain multiple classes
		 * you can name them appropriately
		 */

		// what is classes
		/*same types of testNg classes in a group
		 * 
		 */
		// what is class
		/*individual TestNg class in xml file
		 * how do you design class in xml file
		 * package name.class name
		 * 
		 */
		// how do you design group in xml file
		// how do you design listener xml file
		//
		
	}
}
