package com.SeleniumAssesment.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


/**This class is about how to use navigation command.
 * @author Faruq
 *
 */
public class Navigation {
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
	 * What are the navigation methods listed below.
	 * 
	 * refresh()
	 * back() 
	 * forward() 
	 * to()
	 * @throws InterruptedException 
	 * the answer is all of the above.
	 */
	@Test(priority=1, enabled=false)
    public void navigation() throws InterruptedException {
	//driver.navigate().to("https://www.facebook.com/");// this method is running from before class.
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().forward();
		Thread.sleep(500);
		driver.navigate().refresh();
		driver.navigate().to("");
		System.out.println(driver.getTitle());
	}

	/**
	 * What is the WebElement method used to get the BackGroud Color of an Element
	 * displayed in the WebPage.
	 * 
	 * getCssValue(“bg-color”)
	 *  getCssText(“background-color”) 
	 *  getCss(“color)
	 * getCssValue(“background-color”)
	 */
	@Test(priority=2, enabled=false)
    public void backGrounColor() {
	WebElement color=driver.findElement(By.xpath("//button[@type='submit']"));
	System.out.println(color.getCssValue("background-color"));
	
	}
	
	@Test(priority=3, enabled=true)
    public void switchTabWindow() {
		System.out.println("First window title: "+driver.getTitle());
		// this is selenium 4. will not work with previous version.
	    driver = driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://www.google.com/");
	    System.out.println("Second window title: "+driver.getTitle());
	    
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    driver.get("https://www.salesforce.com/");
	    System.out.println(driver.getTitle());
  
	}
	
	@AfterClass
	public void destroy() {
		if(driver!=null) {
		driver.quit();
		}
	}


}
