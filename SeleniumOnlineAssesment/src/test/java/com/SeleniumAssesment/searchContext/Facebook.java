package com.SeleniumAssesment.searchContext;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook implements SearchContext{


	WebDriver driver;

	@BeforeClass
	public void init() {

	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@Test
	public void InterfaceQuestions() {
		//Q: What is the name of the super interface of the Webdriver?
		//Ans. SearchContext.
		
		// How many methods does SearchContext has?
		
		/* It has two methods
		 * 
		 */
	}
	
	
	/**
	 *to find list of web elements
	 *6.	what is List==
       In Java, a list interface is an ordered collection of objects 
       in which duplicate values can be stored.
       7.	what is array
            Group of objects
                 redApples [0,1,2,3,4]
                 greenApples [0,1,2,3,4,5]

 
	 */
	@Override
	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 *to find one particular web element 
	 */
	@Override
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@AfterClass
	public void destroy() {
		if(driver!=null) {
			driver.quit();
		}
	}

}
