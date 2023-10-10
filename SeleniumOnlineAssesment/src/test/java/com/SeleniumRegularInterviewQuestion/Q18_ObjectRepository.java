package com.SeleniumRegularInterviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q18_ObjectRepository {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*what is object repository in selenium?
 * Object repository is used to store elements locator values in a cenrallized location
 * instead of hard coding them within the scripts. we do create a property files(.properties)
 * to store all the element locators. property files act as an object repository in selenium. 
 * we can create .property file
 * we can create on the class with @findBy with the help of page factory. page factory 
 * it self work as a object repository. 
 */
		
		/*
		 * how can we use the recovery scenario in selenium WebDriver?
		 * By using "Try Catch Block, within selenium webdriver
		 * 
		 */
		//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

		try {driver.get("https://wwww.facebook.com");}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		/*how to upload a file in selenium WebDriver.
		 * there are two ways, SendKeys method or using AutoIT
		 * SendKeys, driver.findElement(By.id("email")).sendKeys("c:\\test\\faruq.jpg");
		 * 	you have to make sure browser type is file.	(if browser button is present)
		 *  */
		//driver.findElement(By.id("email")).sendKeys("c:\\test\\faruq.jpg");
		
		/*How do i download file in selenium
		 *Using AutoIT script we could download a file in Selenium webdriver.  
		 */
		
		/*how do you run selenium web driver test from command line?
		 * lets say my class name is  Class A{ System.in.Println("command test");
		 *                                             }
		 *       now go to command prompt and go to cd java, when you are in java file run this two commands. 
		 *      c:javac A.java  (to compile you must use Javac which is a compiler, and give your class name to compile)
		 *      c:java A.java   (to run you must use Java which is a interpreter or virtual machine and give your class name to run)                                     
		 */
		
		/*how to use TestNG using command prompt.
		 * java.org.testng.TestNG C:\Users\Desktop\Workspace\testing\testng.xml
		 */
		
		/*how to switch between frames in Selenium
		 * by using following code, we can switch between frames
		 */ //driver.switchTo().frame(3);  //frame #3 we can pass frame name, index, and frame ID 
		 
		 /*how to resize browser window using selenium WebDriver?
		  * to resize the browser window we use dimension class. 
		  */
		 Dimension d = new Dimension(600,400);
		 driver.manage().window().setSize(d);
		// driver.close();
		  /*how to scroll down a page.
		   * using java script executer.
		   
		 JavascriptExecutor js =  ((JavascriptExecutor)driver;
		 js.executeScript(arg0, arg1)
		 */
	}

}
