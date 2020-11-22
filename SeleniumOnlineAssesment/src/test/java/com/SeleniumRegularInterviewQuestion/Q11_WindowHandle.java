package com.SeleniumRegularInterviewQuestion;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q11_WindowHandle {

	
		 
		public static void main(String[] args) {
 
			// Create a new instance of the Firefox driver
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			 
 
	        // Put an Implicit wait, this means that any search for elements on the page could take 
			//the time the implicit wait is set for before throwing exception
 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
	        // Launch the URL
 
	        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
 
	        // Store and Print the name of the First window on the console
 
	        String handle= driver.getWindowHandle();
 
	        System.out.println(handle);
 
	        // Click on the Button "New Message Window"
 
	        driver.findElement(By.name("New Message Window")).click();
 
	        // Store and Print the name of all the windows open	              
 
	        Set handles = driver.getWindowHandles();
 
	        System.out.println(handles);
 
	        // Pass a window handle to the other window
 
	        for (String handle1 : driver.getWindowHandles()) {
 
	        	System.out.println(handle1);
 
	        	driver.switchTo().window(handle1);
 
	        	}
 
	        // Closing Pop Up window
 
	        driver.close();
 
	        // Close Original window
 
	        driver.quit();
 
	}
	}


