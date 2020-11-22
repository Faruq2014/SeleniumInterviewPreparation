package com.SeleniumAssesment.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * How to use Select class.
 * @author Faruq
 *
 */
public class SelectTest {
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
	 * What is the method used to select a value from Listbox.
	 * 
	 * selectByVisibleText(String) 
	 * selectByValue(String) 
	 * selectByIndex(int) 
	 * All of the above
	 * 
	 * answer is >>> all if the above
	 */
	@Test
	public void selectAvalueFromListbox() {
		driver.findElement(By.id("u_0_2")).click();
		WebElement day=driver.findElement(By.id("day"));
		Select select = new Select(day);
	         select.selectByIndex(5);
	        // select.deselectByVisibleText("2");
	        // select.selectByValue("4");
	}

	/**
	 * What is the method used in the Select Java Class to get all the Options
	 * getAllValues() 
	 * getVisibleValues() 
	 * getAllOptions() 
	 * getOptions()
	 * 
	 *answer is>>> getOptions() 
	 */
	@Test
	public void getOption() {
		driver.findElement(By.id("u_0_2")).click();
		WebElement month=driver.findElement(By.id("month"));
		Select select = new Select(month);
		List <WebElement> elementCount =select.getOptions();
		int size=elementCount.size();
		System.out.println(size);
		for (int i = 0; i <size; i++) {
			 String options = elementCount.get(i).getText();
	         System.out.println(options);
		}
		 
	}
	
	@Test
	public void selectByValue() {
		driver.findElement(By.id("u_0_2")).click();
		WebElement day=driver.findElement(By.id("day"));
		Select select = new Select(day);
	        // select.selectByIndex(5);
	        // select.deselectByVisibleText("2");
	         select.selectByValue("4");
		}
		@AfterClass
	public void destroy() {
		if(driver!=null) {
			//driver.quit();
		}
	}


}
