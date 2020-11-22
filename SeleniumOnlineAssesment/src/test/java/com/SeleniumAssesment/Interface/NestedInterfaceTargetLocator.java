package com.SeleniumAssesment.Interface;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class NestedInterfaceTargetLocator implements TargetLocator{

	@Override
	public WebDriver frame(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebDriver frame(String nameOrId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebDriver frame(WebElement frameElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebDriver parentFrame() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebDriver window(String nameOrHandle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebDriver newWindow(WindowType typeHint) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebDriver defaultContent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement activeElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alert alert() {
		// TODO Auto-generated method stub
		return null;
	}

}
