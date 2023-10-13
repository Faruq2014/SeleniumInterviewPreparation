package com.SeleniumAssesment.inheritance;

public class LoginTest extends BaseTest{

	/*
	 * what is is-a-relationship in java
	 *    one class extends another class 
	 *    class LoginTest extends BaseTest
	 *    BaseTest is the parent class
	 *    LoginTest is the child class
	 *    Child class can not exists without parent call
	 *    Child class by default inherit all the properties 
	 *    from parent class unless something private
		what is inheritance in java
		  it is parent child relationship 
		  Please learn more
		what is extends key word in java
		  by extends key word one class build is-a-relationship
		   with another class 
		is multiple inheritance allow in java
		  no, one class can not have multiple parents at the same time
		how do you implement inheritance in selenium
		  I have BaseTest where I build all the common method
		  and all other test call extend my BaseTest
		how do you implement is-a-relationship in selenium
		  I have BaseTest where I build all the common method
		  and all other test call extend my BaseTest
		what is base test
		  where i have common code and I use it as a Parent class
		  and build is-a-relationship with all the child
		what are the common method in your base test
		such as open browser, app, implicitly wait
		  take screen shoot, 
		what is dynamic polymorphism
		method over riding--please learn more 
		what is method over-ridding
		updating a parent method in child class
		
		what is method over loading
		same name methods with different parameter--learn more
		such as 
		public void login();
		public void login(String enterUserName);
		
		how do you run your test cases in different browser
		  I build open browser method with if eslse statement
		  where i can put different browser name as input value
		
		how do your base test interact with other child classes.
		with is-a-relationship
		or with extends as a child class
	 */
}
