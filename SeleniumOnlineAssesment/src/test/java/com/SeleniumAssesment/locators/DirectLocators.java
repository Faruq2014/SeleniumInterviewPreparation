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

public class DirectLocators {
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
	public void howManyDirectLocators() {
		/*
		 * there are 8 locators==id, name, class,tag name, link text, partial link text, css,and xpath
		 */
		// what is best locator==id, second best ==Name
		//why id is the best== because it is unique. 
          driver.findElement(By.id("email")).sendKeys("Hello");
          driver.findElement(By.name("pass"));
          driver.findElement(By.className(""));
          driver.findElement(By.linkText("Español"));
          driver.findElement(By.partialLinkText("Espa"));
          driver.findElement(By.tagName("div"));
          driver.findElement(By.xpath(""));
          driver.findElement(By.cssSelector("#email"));
	}

	@AfterMethod
	public void destroy() {
		if (driver != null) {

		}
	}

}
