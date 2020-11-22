package com.SeleniumAssesment.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClick {

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
	public void RightClick() {
		//How would you simulate the right click operation in WebDriver?
		
		Actions test = new Actions(driver); // Here, driver is the object of WebDriver class.
		WebElement element = driver.findElement(By.xpath(""));
		test.moveToElement(element).perform();
		test.contextClick().perform();
	}
	
	@AfterClass
	public void destroy() {
		if(driver!=null) {
			driver.quit();
		}
	}


}
