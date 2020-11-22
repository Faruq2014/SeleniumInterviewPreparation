package com.SeleniumRegularInterviewQuestion;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q10_allert {
	// what is an allert or pop-up?
	/*Alert is a small message box which displays on-screen notification to give the user
	 *  some kind of information or ask for permission to perform certain kind of operation.
	 *  It may be also used for warning purpose. 
	 * 
	 */

	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {
		// how to accept an allert:
		
		
		  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 
		/*// how to accept an allert:
		driver.switchTo().alert().accept();
		
		//how to dismiss an alert
		driver.switchTo().alert().dismiss();
        
       // how to get text from allert
       System.out.println( driver.switchTo().alert().getText());
       
       // how to send data to the allert
       driver.switchTo().alert().sendKeys("faruq");
        */
        // Alert Message handling
                    		
        driver.get("http://demo.guru99.com/test/delete_customer.php");			
                            		
     	      	
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();			
        		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();	
        driver.close();
    }	


}
