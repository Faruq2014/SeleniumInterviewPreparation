package com.SeleniumAssesment.interviewQuestions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q6_JsExecuter {

	public static void main(String[] args) {
		// how to input text box without calling the sendKeys() ?
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.facebook.com/");
		
JavascriptExecutor JS =(JavascriptExecutor)driver;
//to type text in Selenium WebDriver without using sendKeys() method
JS.executeScript("document.getElementById('email').value='mjmolla@gmail.com';");
JS.executeScript("document.getElementById('pass').value='faruq8205';");
//JS.executeScript("document.getElementById('next').click();");
JS.executeScript("document.getElementById('loginbutton').click();");
	}

}
