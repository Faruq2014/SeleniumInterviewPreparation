package com.SeleniumAssesment.locators;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLocators {
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
	public void whatIsXpath() {
		/*
		 * what is xpath== it is a refferencial locator
		 * 
		 */
	
          driver.findElement(By.xpath("//input[@id='email']"));
          //what is xpath formula== //tagname [@attribute='value']
          // what is tag= tag are different types of web element 
          //such as input, select(drop down), button, radio button
          // div, a, section
          // what is attributes== those are different types of locators
          // such as id, name,class name, link text
          
          // what is node == A good starting point to build an xpath 
          // such as @id='email'
          
         //	What is absolute xpath?== start from the begaining of dom
          driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
          // such =/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input
          // absolute xpath starts with single slash
          
          //	What is relative xpath? == start with node
          // such as //input[@id='email']
          // relative xpath starts with double slash

          
          // how to handle dynamic xpath== using starts-with formula
          //
          // xpath changes in every sessions caled dynamic xpath
          driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5_')]")).click();	
        
	// what is xpath operator== and, or condition
      	
      	driver.findElement(By.xpath("//input[@name='pass'or @id='pass1']")).sendKeys("ddd");
    	// Either one must should be good.
    		// @id='pass1'] is wrong but still working
      	
    	driver.findElement(By.xpath("//button[@name='login'and @class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
    	// both has to be right
    	
    	// what is xpath function== building xpath with different locators with contain function
    	
		driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]")).click();

	 }

	@AfterMethod
	public void destroy() {
		if (driver != null) {

		}
	}

}
