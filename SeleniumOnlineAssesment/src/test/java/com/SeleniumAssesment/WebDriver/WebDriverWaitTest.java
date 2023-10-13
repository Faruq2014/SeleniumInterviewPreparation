package com.SeleniumAssesment.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * WebDriverWait>>>>>>
 * implictlyWait, 
 * WebDriverWait, 
 * FluentWait,
 * 
 * @author Faruq
 *
 */
public class WebDriverWaitTest {
	WebDriver driver;

	@BeforeClass
	public void init() {

	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	/**
	 * What are the Wait applicable in Selenium webdriver.
	 * 
	 * implictlyWait 
	 * WebDriverWait 
	 * FluentWait 
	 * All of the above
	 * 
	 *answer is>>>  all of the above.
	 */
	@Test(enabled=false)
        public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	/**
	 * What is the method used to verify the Text present in a WebPage
	 * 
	 * textToBePresent(By, String) 
	 * textToBePresentInElementLocated(By, String)
	 * textToBePresentElementLocated(By, String) 
	 * textToBeElementLocated(By, String)
	 * 
	 * answer is >>>textToBePresentInElementLocated(By, String)
	 * 
	 */
	@Test(enabled=true)
	public void  textToBePresentInElementLocated() {
		//System.out.println(driver.findElement(By.id("u_0_2")));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10, 0));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id='u_0_2']"), "Time left: 1 seconds"));
		
	}
	
	@AfterClass
	public void destroy() {
		if(driver!=null) {
			driver.quit();
		}
	}


}
