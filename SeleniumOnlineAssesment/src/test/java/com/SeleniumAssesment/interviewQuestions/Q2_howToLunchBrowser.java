package com.SeleniumAssesment.interviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q2_howToLunchBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// How to lunch browser in selenium?
		/*
		 * WebDriver is an interface. we create an object of a WebDriver interface.
		 * Firefox: before 2.53 there was no gecko driver concept
		 * but after3.00 version FF come up with gecko driver concept. so we have to set our
		 * system property and then gecko driver value means user path.
		 * System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Chrome: 
		System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		internet explorer:
		 System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		how to lunch safari web driver. 
		in selenium 3.00 you have to download safari extension and then-->
		WebDriver driver = new SafariDriver();
        */
/*is firefox is a class or interface?
 * FireFox is a java class and it is a implements of the WebDriver interface.
 * 
 * what is the super interface of WebDriver?
 * SearchContext. web driver is an interface and it is part of super interface called SearchContext. 
 */
		/*explain the line of code WebDriver driver= new FirefoxDriver();
		 * WebDriver driver= new FirefoxDriver();
		 * WebDriver is an interface. we are creating an object of type WebDriver
		 * and instantiating an object of FirefoxDriver class. 
		 * driver is an object reference name. remember it is not an object it is a reference name of the object. remember
		 * we can not create an object of an interface class. 
		 */
		/*one point to note.
		 * WebDriver is the interface and firefox, chrome, ie, those are class. so firefox,chrome are implementing
		 * web driver interface. it is called dynamic polymophysim. 
		 * WebDriver driver= new FirefoxDriver();
		 
		 * we are creating FirefoxDriver() class object out WebDriver driver
		 * interface. and giving a referential name driver. 
		 */ 
		/*why do you not write FirefoxDriver driver =new FirefoxDriver();
		 * why do you write WebDriver driver= new FirefoxDriver(); instead?
		 *  because in feature if i change to chrome driver then all i need to change chrome on the line. and i can use 
		 *  same driver for every one else.
		 *  Because if i use if else conditions for different driver then i have to use this way.
		 * 
		 */
		inteface();
	}
	
	public static void inteface() {
		//WebDriver driver = new ChromeDriver(); // parent child relation, dynamic polymorphism,
		//WebDriver driver1 = new WebDriver(); // interface can not create an object
		//ChromeDriver driver2 = new ChromeDriver();// only implementing chrome class, and not having dynamic polymorphism,
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver3= new ChromeDriver();
		driver3.get("https://login.salesforce.com/");
	}
	

}
