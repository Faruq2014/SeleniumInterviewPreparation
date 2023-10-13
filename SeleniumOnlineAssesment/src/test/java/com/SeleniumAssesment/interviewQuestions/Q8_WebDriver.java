package com.SeleniumAssesment.interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q8_WebDriver {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// how to clear a text from a input text.
		//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("123@mail.com");
		driver.findElement(By.id("email")).clear();
		
		//how do you pause or stop test execution for 5 seconds
		// i will use static wait method thread.sleep and then you have to put throws InterruptedException or try catch
		Thread.sleep(5000);
		// how do i maximize browser window
		driver.manage().window().maximize();
		
		// how to find value of a attribute
		String st=driver.findElement(By.id("email")).getAttribute("class");
		System.out.println("the attribute value is "+" "+st);
		
		// how to find or print current page url
		String url=driver.getCurrentUrl();
		System.out.println("the current url is "+" "+url);
		//System.out.println("the current url is"+" "+driver.getCurrentUrl());
		
		//how to print title of the page
		System.out.println("the title of the page is"+ driver.getTitle());
		
		//how to get text
		String st1=driver.findElement(By.xpath("//button[starts-with(@id,'u_0_d')]")).getText();
		System.out.println("the text value is "+" "+st1);
		//Three ways we can submit a form
		// how do submit a form using web driver?
		//using submit function instated of click.
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0')]")).submit();
		
		// how to press ENTER key on text box in selenium web driver.
		//what is the alternative way to submit a form?
		// what is the other ways you can use click button. 
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0')]")).sendKeys(Keys.ENTER);
		
		// how to click on hyper link by using selenium web driver.
		/*by using click method. and using link text or partial link text method. 
		 */
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		// do we need selenium server to execute selenium web driver.
		/*if we use our local machine, then we do not need selenium stand alone server to run web driver function.
		 * but if we run it selenium grid then to create grid and hub connection, we need selenium stand alone server.
		 */
	 //what is the alternative way of using driver.get("url"); and what is the difference?
		
		//driver.get("https://www.facebook.com");
		driver.navigate().to("https://facebook.com");
		//1.get command will wait until whole page is loaded and it is always recommended to use.
		//but navigate command will not wait until page load. if you use it, make sure put driver.wait.untilpageload();
		//#2 navigate command has all the options of forward, backward, refresh, and so on.   
		
		// how do we delete cockie in selenium
		
		//driver.manage().deleteAllCookies();
		
		// how many ways can you close the browser.
		/*two different ways you can kill the browser. driver.close and driver.quite.
		 * close command will close the current browser and quite command will close all the browser.
		 * 
		 */
		cookiesMethod();
		driver.close();
		
	}
	public static void cookiesMethod() {
		driver.manage().deleteAllCookies();
	}

}
