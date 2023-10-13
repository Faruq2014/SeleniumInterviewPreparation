package com.SeleniumAssesment.interviewQuestions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q11_WindowHandle {

	static WebDriver driver;
		 
		public static void main(String[] args) throws InterruptedException {
 
			// Create a new instance of the Firefox driver
			//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			WebDriverManager.chromedriver().setup();
		    driver= new ChromeDriver();
 
	        // Put an Implicit wait, this means that any search for elements on the page could take 
			//the time the implicit wait is set for before throwing exception
 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
	        // Launch the URL
 
	        driver.get("https://www.facebook.com/");
 
	        // Store and Print the name of the First window on the console
 
	        String 
	        parrent= driver.getWindowHandle();
 
	        System.out.println("single window... "+parrent);
 
	        // Click on the Button "New Message Window"
 
	        driver.findElement(By.linkText("Portal")).click();
 
	        // Store and Print the name of all the windows open	              
 
	        Set handles = driver.getWindowHandles();
 
	        System.out.println("multiple windows...."+handles);
 
	        // Pass a window handle to the other window
	       // driver.close();
 
	        for (String handle1 : driver.getWindowHandles()) {
 
	        	System.out.println(handle1);	        	
	        	driver.switchTo().window(handle1);
	        	System.out.println(driver.getCurrentUrl());
	        
 
	        	}
	        
	        Set<String> AllWindow = driver.getWindowHandles();
			int count = AllWindow.size();
			System.out.println("how many window we have " + count);
			// for (int i=0; i>count;i++) { } since it is Set iterator we must use enhance
			// loop.
			Thread.sleep(2000);
			for (String child : AllWindow) {
				if (!parrent.equalsIgnoreCase(child)) {
					driver.switchTo().window(child);

					String childTitle = driver.switchTo().window(child).getTitle();
					System.out.println("the child window title is " + childTitle);
					//driver.findElement(By.id("email")).sendKeys("abccd");
					Thread.sleep(2000);
					driver.close();
				}
	        driver.switchTo().window(parrent);
	        System.out.println(driver.getCurrentUrl());
 
	        // Closing Pop Up window
 
	    driver.close();
 
	        // Close Original window
 
	       // driver.quit();
 
	}
	}
}


