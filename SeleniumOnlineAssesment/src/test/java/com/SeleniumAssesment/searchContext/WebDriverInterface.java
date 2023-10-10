package com.SeleniumAssesment.searchContext;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverInterface implements WebDriver{


	/**
	 * how many method WebDriver interface has?
	 * total 13 methods including 2 method from 
	 * parent interface called Search context
	 */
	WebDriver driver;

	@BeforeClass
	public void init() {

	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	
	@AfterClass
	public void destroy() {
		if(driver!=null) {
			driver.quit();
		}
	}


	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}

}
