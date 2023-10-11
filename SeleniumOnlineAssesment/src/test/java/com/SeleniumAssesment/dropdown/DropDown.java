package com.SeleniumAssesment.dropdown;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	WebDriver driver;

	@BeforeMethod
	public void init() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
	}

	 @Test
	public void whatIsDropDown() {
		 //what is a drop down == list of elements normally in the drop down locator
		 
		 driver.findElement(By.xpath("//a[starts-with(@id,'u_0_0_')]")).click(); 
	     WebElement selectMonth=driver.findElement(By.id("month"));
	     //how selenium handle drop down
	     Select select = new Select(selectMonth);
	     
	     //how do you find out selected options
	     WebElement selectedOptions=select.getFirstSelectedOption();
	     System.out.println("Selected option is : "+selectedOptions.getText());
	    
	     
	     //how many ways can you select or de select 
	    //an element from a drop down==three ways
            
	     // selectByVisibleText
			//select.selectByVisibleText("Feb");
			//select.deselectByVisibleText("Feb");
	     
	     //selectByIndex
	     //select.selectByIndex(3);
	     //select.deselectByIndex(3);
	     
	     select.selectByValue("3");
	    // select.deselectByValue("3");
	     WebElement selectedOptions1=select.getFirstSelectedOption();
	     System.out.println("Selected option is : "+selectedOptions1.getText());
	     
	     
	     //what is nested WebElement  
 //Select select = new Select(selectMonth);== (selectMonth) is the nested WebElement
	 }

	@AfterMethod
	public void destroy() {
		if (driver != null) {
        //  driver.quit();
		}
	}

}
