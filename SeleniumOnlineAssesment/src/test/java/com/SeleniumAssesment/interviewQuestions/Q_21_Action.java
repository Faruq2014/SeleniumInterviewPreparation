package com.SeleniumAssesment.interviewQuestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q_21_Action {


public static WebDriver driver;
@BeforeClass
public void openApp() {
  WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  //driver.navigate().to("https://www.salesforce.com/");
  driver.get("https://www.salesforce.com/");
  
  }
//@Test(priority=1)
public void nthOfTypeNumbering() throws Throwable {
	Thread.sleep(1000);
	//WebElement ele=driver.findElement(By.cssSelector("[class='wwww-main-nav searchEnabled']>li:nth-child(2)"));
	WebElement ele1=driver.findElement(By.className("nav-item-link child-menu"));	
	Actions action = new Actions(driver);
	action.moveToElement(ele1).build().perform();
	//driver.findElement(By.cssSelector("div[class='sub-nav'] ul>li:nth-child(1)")).click();
	driver.findElement(By.cssSelector("div[class='sub-nav'] ul li:nth-child(13)")).click();
	Thread.sleep(1000);
}

//@Test(priority=2)
public void ntnOfTypeFirstChild() throws Throwable {
	Thread.sleep(1000);
	WebElement ele=driver.findElement(By.cssSelector("ul[class$='-main-nav searchEnabled']>li:first-child"));
	Actions action = new Actions(driver);
	action.moveToElement(ele).build().perform();
	//driver.findElement(By.cssSelector("div[class='sub-nav'] ul>li:nth-child(1)")).click();
	driver.findElement(By.cssSelector("div[class='sub-nav'] ul>li:first-child")).click();
	Thread.sleep(1000);
}

//@Test(priority=3)
public void ntnOfTypeLastChild() throws Throwable {
	Thread.sleep(1000);
	WebElement ele=driver.findElement(By.cssSelector("[class='wwww-main-nav searchEnabled']>li:nth-child(1)"));
	Actions action = new Actions(driver);
	action.moveToElement(ele).build().perform();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("div[class='sub-nav'] ul>li:nth-child(1) a:last-child")).click();
	Thread.sleep(1000);
}
@Test(priority=4)
public void actionMethod() {
	Actions act= new Actions(driver);
	WebElement product=driver.findElement(By.linkText("Products"));
	WebElement product1=driver.findElement(By.linkText("Products1"));
	act.moveToElement(product).build().perform();
	act.dragAndDrop(product, product1).build().perform();
	act.moveToElement(product).doubleClick(product).build().perform();
}
}
