package com.SeleniumAssesment.interviewQuestions;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q_20_CSS {
	/*
	 * whic locators between xpath and css is better
	 * ans:
	 * css is faster and eaiser to create but has limited scope
	 * xptah tend to be broken more often but has more varity. and now a days with
	 * all different types of front end frame work such as React, boot strap is very complex 
	 * and tough to find locators. 
	 * as a result xpath provide more scope to build a locators.
	 * based on availability i will choose my locators strategy. in general xpath is better option for me.
	 */
	WebDriver driver=null;
	
	@BeforeTest
	public void opeApp() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://login.salesforce.com/");
	
	}
	
	@Test
	public void regularCss() {
		//driver.findElement(By.cssSelector("#username")).sendKeys("Simin");
		driver.findElement(By.cssSelector(".username")).sendKeys("Simin");
		// CSS formula (tag name is optional) = [attribute='value']
		//id=#
		//name=.
				// driver.findElement(By.cssSelector("[id='username']")).sendKeys("aaaa");
				// driver.findElement(By.cssSelector("#username")).sendKeys("aaaa");
		
				// driver.findElement(By.cssSelector("[name='username']")).sendKeys("aaaa");
				// driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8
				// username']")).sendKeys("aaaa");
				// driver.findElement(By.cssSelector(".input r4 wide mb16 mt8
				// username")).sendKeys("aaaa");
		
				//driver.findElement(By.cssSelector("[type='email']")).sendKeys("aaaa");
	}
	
	@Test(priority = 1)
	public void twoAttributeTest() {
		// CSS formula = [attribute='value'][attribute='value']
		driver.findElement(By.cssSelector("[name='pw'][type='password']")).sendKeys("bbbbbb");
		
	}
	
	@Test(priority = 2)
	public void startWithAttributeTest() {
		// CSS formula = [attribute^='value'] ^ (^ carat,circumflex, in coding its
		// called hat) means start with
		//driver.findElement(By.cssSelector("[id^='forgot_password']")).click();
	}
	@Test(priority = 3)
	public void SubstringTest() throws InterruptedException {
		Thread.sleep(3000);
		// CSS formula = [attribute*=’value’] * means substring, if you have a attribute
		// change dynamically at the begaining
		// and at the end but at the middle it does unchange,or some part of it remain
		// unchange then * is a good choice.
		//driver.findElement(By.cssSelector("[class*=' button fiftyfifty ']")).click();
		driver.findElement(By.cssSelector("[id*='_password_']")).click();
	}
}
