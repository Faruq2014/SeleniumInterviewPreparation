package com.SeleniumAssesment.Interface;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver.ImeHandler;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.logging.Logs;

public class NestedInterfaceOptions implements Options{

	@Override
	public void addCookie(Cookie cookie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCookieNamed(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCookie(Cookie cookie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllCookies() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Cookie> getCookies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cookie getCookieNamed(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Timeouts timeouts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImeHandler ime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Window window() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Logs logs() {
		// TODO Auto-generated method stub
		return null;
	}

}
