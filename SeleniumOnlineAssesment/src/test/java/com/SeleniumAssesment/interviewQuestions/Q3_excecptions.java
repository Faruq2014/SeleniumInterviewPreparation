package com.SeleniumAssesment.interviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q3_excecptions {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
				driver.get("https://www.facebook.com/");
				
		// What are the different exceptions you have faced in Selenium WebDriver?
		/*WebDriverException
		 * null pointer exception
		 *TimeoutException 
		 * NoAlertPresentException
		 * NoSuchWindowException
		 * NoSuchElementException
		 * TimeOutExceptiont
		 * StaleElementReferenceExecption
		 * illegalState Exception
		 */
		
		/*what is time out exception?
		 * Element was not found on time limit. 
		 * there are two types: implecite wait and explcite wait. 
		 */
		/*what is web driver exception?
		 * driver is not workig properly, coding problem in driver path,
		 * mis match with versions. 
		 */
		
		/*what is illegalState Exception?
		 * if you write some code without legal path or legal reference, than you will have
		 * this kind of exception. such 
		 * System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		 *  
		 *  if you don't write 
		 *  System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
		 * you will get illegalState Exception. 
		 */

	}

}
