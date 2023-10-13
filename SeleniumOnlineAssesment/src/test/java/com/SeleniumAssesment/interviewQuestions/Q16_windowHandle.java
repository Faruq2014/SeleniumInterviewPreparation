package com.SeleniumAssesment.interviewQuestions;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Q16_windowHandle {
	//how to handle web based pop up?
	/*to handle alerts pop-ups we need to do switch to the alert window and call selenium
	 * WebDriver Alert API method.   Alert alert = driver.switchTo().alert();
	 * driver.switchTo().alert().accept(); driver.switchTo().alert().dismiss();
	 */
  //how to handle window based pop-up?
	/*selenium does not support window based application. we could handle window based
	 * pop-ups in selenium using some third party tools such as AutoIt, Robot class etc.
	 */
	// how to handle different window in selenium?
	/*with window handle method.   driver.swithcTo.window();  then you have to pass the window ID.
	 * to get to window ID, you have to use one of the two method.
	 *if it one single window, then use driver.getWindowHandle();
	 *if it is multiple window, then use driver.getWindowHandles();
	 */
	static WebDriver driver;

	@Test
	public void test_CloseAllWindowsExceptMainWindow() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
 
		// It will open Naukri website with multiple windows
		driver.get("http://www.naukri.com/");
		
		// To get the main window handle
		String windowTitle= getCurrentWindowTitle();
		String mainWindow = getMainWindowHandle(driver);
		Assert.assertTrue(closeAllOtherWindows(mainWindow));
		Assert.assertTrue(windowTitle.contains("Jobs - Recruitment"), "Main window title is not matching");
	}
		
	public String getMainWindowHandle(WebDriver driver) {
		return driver.getWindowHandle();
	}

	public String getCurrentWindowTitle() {
		String windowTitle = driver.getTitle();
		return windowTitle;
	}
	
	//To close all the other windows except the main window.
	public static boolean closeAllOtherWindows(String openWindowHandle) {
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String currentWindowHandle : allWindowHandles) {
			if (!currentWindowHandle.equals(openWindowHandle)) {
				driver.switchTo().window(currentWindowHandle);
				driver.close();
			}
		}
		
		driver.switchTo().window(openWindowHandle);
		if (driver.getWindowHandles().size() == 1)
			return true;
		else
			return false;
	}

}
