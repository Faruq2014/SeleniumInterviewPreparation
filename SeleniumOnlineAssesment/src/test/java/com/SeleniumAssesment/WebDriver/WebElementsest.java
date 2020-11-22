package com.SeleniumAssesment.WebDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class is about WebElements methods.such as 
 *sendKeys();
 * clear();
 * click();
 * 
 * @author Faruq
 *
 */
public class WebElementsest {
	WebDriver driver;

	@BeforeClass
	public void init() {
    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(enabled=false)

	public void  ListOfWebElement() {
	
		
		/*
		 * . Select the option which is not a WebElement Method.
		 * 
		 * a. getText() 
		 * b. getTagName()
		 * c. size() 
		 * d. sendKeys()
		 * 
		 * the answer is size();
		 * size() method is java lang package method.
		 * 
		 */
		/**Selenium WebDriver interface has many abstract methods like 
		 * get(String url),
		 *  quit(), close(), 
		 *  getWindowHandle(), 
		 *  getWindowHandles(), 
		 *  getTitle() etc.
		 * 
		 */
		
		/**
		 * Selenium WebElement represents an HTML element. We can get an instance of WebElement 
		 * using 
		 * sendKeys()
		 * clear()
		 * click()
		
		 */
	ArrayList<String> name= new ArrayList<String>();
	name.add("Faruq");
	name.add("Libi");
	name.add("Fima");
	name.add("Nisa");
	//size() method is java lang package method.
	System.out.println("The size of the array list is "+name.size());
        for (int i = 0; i < name.size();) {
		System.out.println(name);
		break;
	}
	
	
	// web elements method
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	@Test(enabled=false)

	public void  webDriver() {
		/*
		 * Identify the option which is not a JAVA class in Selenium.
		 * 
		 * WebDriverWait 
		 * FirefoxDriver 
		 * WebDriver 
		 * ExpectedConditions
		 */

		// the answer is WebDriver is pure selenium class 
	}
	
	/**
	 *  What is the abstract class available in Selenium.
	 * 
	 * WebDriver
	 *  WebElement 
	 *  By 
	 *  Selenium
	 *  
	 *  Answer is >>By
	 */
	@Test(enabled=false)

	public void by() {
		driver.findElement(By.id("email")).sendKeys("aaaa");
	   // By.id, By.name 
		// By is a abstract class thats means implements must be written by child class.
	}
	
	/**
	 * What is return type of driver.get(String url) method in Selenium.
	 * 
	 * String 
	 * void 
	 * null 
	 * empty space
	 * 
	 * answer is >>> void
	 */
	@Test(enabled=false)

	public void get() {
		driver.get("https://www.facebook.com/");
	}
	
	
	/**
	 * What is the return Type of driver.getTitle() method in Selenium WebDriver.
	 * 
	 * String 
	 * Character 
	 * void 
	 * null
	 *  answer is >>>> String
	 * @return
	 */
	public String  title() {
		String title=driver.getTitle();
		System.out.println(title);
		return title;
		
	}
	
	
	/**
	 * What is the method used to check the WebElement is present.
	 * 
	 * .isDisplayed() 
	 * .isVisible() 
	 * .isClear() 
	 * .isPresent()
	 * 
	 */
	@Test(enabled=true)
	public void  isDisplay() {
		System.out.println(driver.findElement(By.id("u_0_2")).isDisplayed());
		// it is a boolean return.
		
	}
		
	@AfterClass
	public void destroy() {
		if(driver!=null) {
			driver.quit();
		}
	}


}
