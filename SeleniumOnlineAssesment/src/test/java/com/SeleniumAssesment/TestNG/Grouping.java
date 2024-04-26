package com.SeleniumAssesment.TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Grouping {
	WebDriver driver;

	@BeforeMethod
	public void init() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	//what is grouping in testNg
	 // grouping is a mechanism to run a group of test 
	// a suite of test 
	// such as smoke, regression 
	/*
	 * how do you design group
	 * there are two things to design group
	 *    you must have groups attributes in the class file
	 *    as well you must desing your testNg.xml file
	 *    <groups>  
			<run>  
			<include name="smoke"/>  
			</run>  
		</groups>
	 */
	/*
	 * what is include and exclude in testng.xml
	 * include means what test cases would like to run
	 * exclude means what test cases would not like to run
	 */
	@Test(groups= {"smoke","regression"})
	public void groupTest() {
		
	}
}
