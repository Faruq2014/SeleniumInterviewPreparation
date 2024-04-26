package com.SeleniumAssesment.sychronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWait {
	WebDriver driver;

	@BeforeMethod
	public void init() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
			}
	/*
	 * 	 *    what is explicit wait
	 *   explicit wait is a Selenium wait command to manage
	 *   exceptional timing issues for particular Web elements.
	 *   there are two types of explicit wait
	 *       Wait
	 *       fluent wait.
	 *    List of wait command
	 *   alertIsPresent()
		elementSelectionStateToBe()
		elementToBeClickable()
		elementToBeSelected()
		frameToBeAvaliableAndSwitchToIt()
		invisibilityOfTheElementLocated()
		invisibilityOfElementWithText()
		presenceOfAllElementsLocatedBy()
		presenceOfElementLocated()
		textToBePresentInElement()
		textToBePresentInElementLocated()
		textToBePresentInElementValue()
		titleIs()
		titleContains()
		visibilityOf()
		visibilityOfAllElements()
		visibilityOfAllElementsLocatedBy()
		visibilityOfElementLocated()
			 */

		@Test
		public void implementsMethod() {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			WebElement userName=driver.findElement(By.id("email"));
			wait.until(ExpectedConditions.visibilityOf(userName)).sendKeys("lll");
			
			driver.findElement(By.id("pass")).sendKeys("mm");
			WebElement login=driver.findElement(By.name("login"));
			wait.until(ExpectedConditions.elementToBeClickable(login)).click();
			//what execption does explicit wait throw
			// Time out exception
		}
	@AfterMethod
	public void destroy() {
		if(driver!=null) {
			//	what is close command?
			//driver.close();
			//what is quit command
			//driver.quit();
			//what is the difference between close and quit command?
			/*driver.close()==close current window
			 * driver.quit();== close whole browser
			 */
		}
	}

}
