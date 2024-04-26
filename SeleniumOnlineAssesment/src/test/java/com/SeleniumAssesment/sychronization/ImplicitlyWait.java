package com.SeleniumAssesment.sychronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWait {
	WebDriver driver;

	@BeforeMethod
	public void init() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		/*
		 *    what is implicit wait
		 *   implicit wait is a Selenium wait command to manage
		 *   find element timing issues for Web elements. 
		 */
		
		//how to set 10 seconds implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// what method implicitlyWait implements
		  // it is implements on findEmement and findElements method
		
		// how many time do you have to write implicitlyWait method
		// in a class only one
		// in the frame work only on the base test
		
		//what is the waiting mechanism in implicitlyWait
		// it will wait maximum wait and then it will throw time out exception
		// but if it finds before wait time, then it will go for next line
		
		//what is Duration.ofSeconds(10)
		// this is the way we define how many seconds should wait
		// it is Java time package
	}
		@Test
		public void implementsMethod() {
			driver.findElement(By.id("email")).sendKeys("kjk");
			driver.findElement(By.id("pass")).sendKeys("mm");
		}
	@AfterMethod
	public void destroy() {
		if(driver!=null) {
			//	what is close command?
			//driver.close();
			//what is quit command
			//driver.quit();
			//what is the difference between close and quit command?
			/*driver.close()==close current window
			 * driver.quit();== close whole browser
			 */
		}
	}

}
