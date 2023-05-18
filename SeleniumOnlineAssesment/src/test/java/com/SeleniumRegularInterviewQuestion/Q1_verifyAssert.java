package com.SeleniumRegularInterviewQuestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q1_verifyAssert {

	public static void main(String[] args) {
		// how many way you can verify a web page. 
		//what are the verification or validation point available in selenium?
		/* we use verify and assert command for verification and validation. it is 
		 * important to use verification commands to check either test case pass or fail.
		 * VERIFY:
		 * in selenium there is no in built feature for verification point. it totally depends on 
		 * coding style. some of the verification points are:
		 * a. to check page title
		 * b. to check for certain text 
		 * c. to check for certain element such as text box, drop down,etc.
		 * for example: verify the title of the page, or verify the current url, check text.
		 * Basically it is if and else condition. 
		 * verify method will give you the check point but it will not the test execution even verification is falil
		 * such as 
		 * // how to find whether an element is displayed on the web page or not?
		 List<WebElement> dynamicElement = driver.findElements(By.id("email"));
		 if(dynamicElement.size() != 0){
		 	//If list size is non-zero, element is present
		 	System.out.println("Element present");
		 }
		 else{
		 	//Else if size is 0, then element is not present
		 	System.out.println("Element not present");
		 * either way application will run the whole test case.
		 * 
		 * ASSERT:
		 * it testNG we use assert command. there are two types of assert
		 * a. soft assert
		 * b. strong or hard assert. 
		 * Soft assert: soft assert will fail your method but still continue with executaion.
		 * but strong assert, if assert fail execution will stop. 
		 * 
		 */
		Q1_verifyAssert q1= new Q1_verifyAssert();
		q1.verfyMethod();
		q1.validationMethod();

	}
	
	public void verfyMethod() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		String actualUrl="https://login.salesforce.com11/";
		String ExptUrl=driver.getCurrentUrl();
		
		if (ExptUrl.equalsIgnoreCase(actualUrl)) {
			System.out.println("we are on the right page");
		}else {
			System.out.println("you are on wrong page");
		}
		driver.quit();
	}
	
	
	public void validationMethod() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		String actualUrl="https://login.salesforce.com11/";
		String ExptUrl=driver.getCurrentUrl();
		
		Assert.assertEquals("you are on Wrong page ,,,,",actualUrl, ExptUrl);
		driver.quit();
		
	}

}
