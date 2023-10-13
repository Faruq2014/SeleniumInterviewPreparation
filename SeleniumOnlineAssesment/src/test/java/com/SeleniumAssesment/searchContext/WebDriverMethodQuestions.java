package com.SeleniumAssesment.searchContext;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethodQuestions {
	WebDriver driver;

	@BeforeMethod
	public void init() {
// how to open a browser?
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// how to open a application?
		driver.get("https://www.facebook.com/");
		//// how to maximize window?
		driver.manage().window().maximize();
		// what is implicitlyWait
		//how to set 10 seconds implicitlyWait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	//@Test
	public void getFacebookTitle() {
		// how do you get title
		driver.getTitle();
	}
	
	//@Test
	public void getFacebookURL() {
		// how do you get URL
		driver.getCurrentUrl();
	}
	
	//@Test
	public void getFacebookWindowHandle() {
		// how do you go to different window
		driver.getWindowHandle();
		driver.getWindowHandles();
	}
	@Test
	public void getFacebookNavigate() {
		// how do you navigate 
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.linkText("Español")).click();
		//how do you navigate backward
		driver.navigate().back();
		//how do you navigate forward
		driver.navigate().forward();
		//how do you refresh a browser
		driver.navigate().refresh();
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
