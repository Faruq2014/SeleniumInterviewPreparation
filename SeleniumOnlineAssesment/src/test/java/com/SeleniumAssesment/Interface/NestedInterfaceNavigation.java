package com.SeleniumAssesment.Interface;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**WebDriver interface has multiple inner interfaces which contains methods related o specific events.

		ImeHandler – An interface for managing input methods.
		Navigation – An interface for provide mechanism to access browser history.
		Options – An interface for managing stuff you would do in a browser menu
		TargetLocator – Used to locate a given frame or window.
		Timeouts – An interface for managing timeout behavior for WebDriver instances.
		Window – An interface to manage browser window actions like maximize, minimize etc.
 * @author Faruq
 *
 */
public class NestedInterfaceNavigation implements Navigation{

	WebDriver driver;

	@BeforeClass
	public void init() {

	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@Test
	public void navigationInterface() {
	driver.navigate().to("https://www.salesforce.com/");
	driver.get("https://www.salesforce.com/");
	    //Go back to Home Page  
      driver.navigate().back(); 
      //Go forward to Registration page  
      driver.navigate().forward(); 
      //Refresh browser  
      driver.navigate().refresh();  
	}
	
	@AfterClass
	public void destroy() {
		if(driver!=null) {
			driver.quit();
		}
	}
	@Override
	public void back() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void forward() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void to(String url) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void to(URL url) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}

}
