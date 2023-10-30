package com.SeleniumAssesment.TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ITestListener {
	WebDriver driver;

	@BeforeMethod
	public void init() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
   @Test
   public void whatIsListener() {
	   //what is ITest listener
	   
	   /*
	    * specially design listener for 
	    * testNG @Test. it listen to the
	    * @TEst annotation and react based
	    * on your arguments
	    * it is an interface
	    * 
	    */
	   
	   
	   // what is testNg listener
	   
	   /*
	    * ITestListener.
			IAnnotationTransformer.
			IInvokedMethodListener.
			ISuiteListener.
			IReporter.
			IConfigurable.
			IExecutionListener.
			IHookable.
	    */
	   
	   // what is onTestSuccess
	  
	   /*
	    * @Test pass
	    */
	   
	   //what is onTestFailure
	   /*
	    * @Test failure
	    */
	   
	   //what is onStart
	   /*
	    * it is at Suite level
	    * that mean Suite starts
	    */
	   //how to design a ITestListener
	   
	   /*
	    * Step-1 develop a listener class
	    * Step-2 implements ITestLiatener
	    * Step-3 design a listener tag in the testng.xml file
	    */
   }
}
