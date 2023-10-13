package com.SeleniumAssesment.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	/*
	 * 10.	what is PageFactory
	 *    driver.findElement(By.id("email"));
	 *     it is a combination of this code bellow
	 *    @FindBy(how = How.ID, using = "email")
           public WebElement uName;
	 *
	11.	what is InItElements
	it a kind of constructor design for Page Object model
	to build PageFactory code.
	
	
	12.	What is find by
	it is a type of locators strategy for page objec model
	to locate Web Elements
	13.	what is find by how
    it is a type of locators strategy for page objec model
	to locate Web Elements
	 */
 WebDriver driver;

public LoginPage(WebDriver driver) {
	super();
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(how = How.ID, using = "email")
public WebElement uName;

public WebElement userName(String enterUserName) {
	
	uName.sendKeys(enterUserName);
	return uName;
}

}
