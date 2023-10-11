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

public class CssLocators {
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
	public void whatIsCss() {
		// what is CSS= Cascade Styling Sheet
		 // way to find web element
			
		//Can you explain css formula?==[id='email'] OR "#email" ,
		// [name='pass'] OR ".pass"
		 // 
	
		 
		//CSS id
			//driver.findElement(By.cssSelector("[id='email']")).sendKeys("Faruq");
			driver.findElement(By.cssSelector("#email")).sendKeys("Faruq");
			//css name
			driver.findElement(By.cssSelector("[name='pass']")).sendKeys("far123");
			//driver.findElement(By.cssSelector(".pass")).sendKeys("far123");
			
    //	How to handle dynamic element with CSS?
			//start with==^
			driver.findElement(By.cssSelector("[id^='u_0_5_']")).click();
			//driver.findElement(By.cssSelector("#^u_0_5")).click();
			//driver.quit(); 
	 }

	@AfterMethod
	public void destroy() {
		if (driver != null) {

		}
	}

}
