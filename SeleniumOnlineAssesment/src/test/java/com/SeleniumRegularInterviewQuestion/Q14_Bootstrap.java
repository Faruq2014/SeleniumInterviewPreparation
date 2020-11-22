package com.SeleniumRegularInterviewQuestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q14_Bootstrap {
	/*what is bootstrap?
	 * Bootstrap is another framework to develop specially for mobile environment.
	 * it is open source, anyone can use it. very responsive functionality.
	 * in bootstrap UI will change based on device resolution.if you 
	 * open the application in mobile or laptop, UI will adjust automatically.
	 *  now a days almost every application is coming with bootstrap frame
	 *  work.it is next level of HTML. 
	 */
	public static void main(String[] args) throws InterruptedException {
		 
		 // how to handle dropdown on bootstrap.
		/*in bootstrap we do not need Select select = New Select();
		 * we need to find the List<WebElement> list= FindElements method and create 
		 * for loop to go inside the loop and click the right element or print.
		 * we do not need to go by index,or visible text, or value. 
		 */
	       // Start firefox browser
	 
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
	 
	 
	       // start the application
	 
	      driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
	 
	 
	       // First we have to click on menu item then only dropdown items will display
	 
	      driver.findElement(By.xpath(".//*[@id='menu1']")).click();
	 
	 
	 
	       // adding 2 seconds wait to avoid Sync issue
	 
	       Thread.sleep(2000);
	 
	 
	 
	       // Dropdown items are coming in <a> tag so below xpath will get all
	 
	       // elements and findElements will return list of WebElements
	 
	       List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
	 
	 
	 
	       // We are using enhanced for loop to get the elements
	 
	       for (WebElement ele : list)
	 
	       {
	 
	          // for every elements it will print the name using innerHTML
	 
	          System.out.println("Values " + ele.getAttribute("innerHTML"));
	 
	 
	 
	          // Here we will verify if link (item) is equal to Java Script
	 
	          if (ele.getAttribute("innerHTML").contains("JavaScript")) {
	 
	             // if yes then click on link (iteam)
	 
	             ele.click();
	 
	 
	 
	             // break the loop or come out of loop
	 
	             break;
	 
	          }
	 
	       }
	         driver.close();
	       // here you can write rest piece of code
	 
	   }

}
