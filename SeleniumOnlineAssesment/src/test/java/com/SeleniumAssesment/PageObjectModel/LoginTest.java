package com.SeleniumAssesment.PageObjectModel;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * How to use Select class.
 * @author Faruq
 *
 */
public class LoginTest {
	//what is page object model?
	/*there are two classes
	 *   LoginPage -->has all variables, locators, methods 
	 *   it is basically working as a repository, provider,warehouse
	 *   
	 *   LoginTest--has all the TestNG style of coding
	 *    it is a consumer, presenter 
	 *    
	 *    LoginTest will build has-a-relationship with LoginPage
	 * LoginPage lp= new LoginPage(driver);
	 */
	// 
	/*
	 * 
2.	what is repository class==LoginPage-->The class has all the methods and source code
3.	what is client class==LoginTest--> who has tests
4.	what is has a relationship concept in Java
      one class build relationship by calling another class
      each class is independent. 
      they can exists without each other
      such as Login Page and LoginTest
      LoginTest is calling LoginPage by
      LoginPage lp= new LoginPage(driver);
      
      
5.	have you ever use it in selenium
 yes--we use has-a-relationship in Page object model
6.	how did you use it/can you explain it
    we use by coding Page object model style 
7.	what is null pointer exceptions
  when String or Web Driver variable values are default
  specially driver was not initialized;
8.	what is constructor==initialized instance properties of a class.
    please learn about it
9.	how page object model constructor work together.
    in the page side and Test side driver hand shake 
    happen and page side constructor take responsiblities
    to initialized instance properties.

	 */
	WebDriver driver;
	
	@BeforeClass
	public void init() {
        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	@Test
	public void validLoginTest() {
		LoginPage lp = new LoginPage(driver);
		lp.userName("Asma");
	}
	
		@AfterClass
	public void destroy() {
		if(driver!=null) {
			//driver.quit();
		}
	}


}
