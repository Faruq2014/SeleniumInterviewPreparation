package com.SeleniumRegularInterviewQuestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
/*for mouse hover, drag and drop, double click and so on we use Action act= New Action(driver);
 */
public class Q13_ActionClass {

	public static void main(String[] args) {
		// how to use mouse hover in selenium?
		Q13_ActionClass tc = new Q13_ActionClass();
		//tc.mouseHover();
		tc.clickandHold();

	}
 public void mouseHover() {
	 
	 System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     driver.get("http://www.onlinestore.toolsqa.wpengine.com");

     WebElement element = driver.findElement(By.linkText("Product Category"));

     Actions action = new Actions(driver);

     action.moveToElement(element).build().perform();

     driver.findElement(By.linkText("iPads")).click();
     // to right click on the element
    // action.contextClick(driver.findElement(By.linkText("iPads"))).build().perform();
     
     //how to do double click
    // action.doubleClick(driver.findElement(By.linkText("Product Category"))).build().perform();
     
     // how to drag and drop
    // action.clickAndHold(driver.findElement(By.linkText("Product Category")))
    // .moveToElement((WebElement) By.linkText("iPads")).build().perform();
                
     }
 public void clickandHold() {
	 

     String baseUrl = "http://demo.guru99.com/test/newtours/";
     System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

             driver.get(baseUrl);           
             WebElement link_Home = driver.findElement(By.linkText("Home"));
             WebElement td_Home = driver
                     .findElement(By
                     .xpath("//html/body/div"
                     + "/table/tbody/tr/td"
                     + "/table/tbody/tr/td"
                     + "/table/tbody/tr/td"
                     + "/table/tbody/tr"));    
              
             Actions builder = new Actions(driver);
             Action mouseOverHome = builder
                     .moveToElement(link_Home)
                     .build();
              
             String bgColor = td_Home.getCssValue("background-color");
             System.out.println("Before hover: " + bgColor);        
             mouseOverHome.perform();        
             bgColor = td_Home.getCssValue("background-color");
             System.out.println("After hover: " + bgColor);
             
           //  driver.close();

 }
 
 /*how to perform right click on selenium
  *  action.contextClick().build().perform();
  * using action class.
  * action.contextClick(driver.findElement(By.linkText("iPads"))).build().perform(); 
  */
 
 /*how to perform double click on selenium
  * by using action class
  * //how to do right click
    // action.doubleClick(driver.findElement(By.linkText("Product Category"))).build().perform();

  */
 
 /* // how to drag and drop
    // action.clickAndHold(driver.findElement(By.linkText("Product Category")))
    // .moveToElement((WebElement) By.linkText("iPads")).build().perform();
                
  * 
  */
 }

