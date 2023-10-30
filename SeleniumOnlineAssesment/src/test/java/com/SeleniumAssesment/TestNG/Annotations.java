package com.SeleniumAssesment.TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations {
	WebDriver driver;

	@BeforeMethod
	public void init() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
   @Test
   public void beforeAfter() {
	   /*
	    * what is annotation in testNG
	    * @Before
	    * @After
	    * @Test
	    * 
	    */
	   /*
	    *   BeforeSuite
			BeforeTest
			BeforeClass
			BeforeMethod
			Test
			AfterMethod
			AfterClass
			AfterTest
			AfterSuite
	    */
	   
	  
	   //what is difference between method and Test
	   /*
	    * @Test 
	    * if you put @Test annotation before method it become test
	    * if you do not put @Test then it is a method
	    */
	   
	   //can you run a test without @Test annotation
	   /*
	    * no, at least one @Test must be there to run
	    */
	  
	  
	   // what is the difference between BeforeTest and BeforeMethod
	   
	   /*BeforeTest design will open and close test once for the whole testNG class
	    * BeforeMethod design will open and close test for each @Test in testNG class
	    */
   }
}
