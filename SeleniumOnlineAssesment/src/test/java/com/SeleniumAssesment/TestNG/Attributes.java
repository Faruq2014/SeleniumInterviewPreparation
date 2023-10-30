package com.SeleniumAssesment.TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Attributes {
	WebDriver driver;
	@BeforeMethod(groups="smoke")
	public void init() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	@Test(priority=0,groups="smoke",alwaysRun=true)
	public void whatIsAttributes() {
		//what is attributes 
		
		/*attributes are pre-build functionalities 
		 * it is inside parameter of the annotations
		 */
		// Different types of attributes
		
		/*
		 * 1. name: Provides a name for the test method or suite.
			2. description: Allows you to add a description to a test method or suite.
			3. dependsOnMethods: Specifies the methods that a test method depends on.
			4. dependsOnGroups: Specifies the groups that a test method depends on.
			5. groups: Assigns a test method or class to one or more groups.
			6. priority: Defines the execution priority of test methods.
			7. dataProvider: Specifies the data provider method for data-driven testing.
			8. dataProviderClass: Specifies the class where the data provider method is located.
			9. enabled: Determines whether a test method or suite is enabled or disabled.
			10. timeOut: Sets a timeout for the execution of a test method.
			11. invocationCount: Controls the number of times a test method is invoked.
			12. successPercentage: Defines the percentage of successful test method invocations.
			13. threadPoolSize: Specifies the thread pool size for parallel test execution.
			14. alwaysRun: Ensures that a test method is always executed, even if it depends on a failed method.
			15. suiteName: Names a suite in the XML suite file.
			16. testName: Names a test in the XML suite file.
			17. parameters: Passes parameters to test methods.
			18. parallel: Controls parallel execution of test methods or suites.
			19. preserveOrder: Specifies whether methods should be executed in a specific order
					 */
	}
}
