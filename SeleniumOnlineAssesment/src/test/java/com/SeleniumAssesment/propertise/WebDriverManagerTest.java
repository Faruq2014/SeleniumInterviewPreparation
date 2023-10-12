package com.SeleniumAssesment.propertise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Testing the frame work to make sure testng is working. WevDriver manager is working.
 * @author Faruq
 *
 */
public class WebDriverManagerTest {
	WebDriver driver;

	@BeforeClass
	public void init() {

		//System.setProperty("webdriver.chrome.driver", 
	//			"C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test

	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	@AfterClass
	public void destroy() {
		if(driver!=null) {
			driver.quit();
		}
	}


}
