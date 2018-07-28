package com.PageObjectModel.PageObjectModel.AllPageScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.PageObjectModel.PageObjectModel.Actionengine;
import com.PageObjectModel.PageObjectModel.DriverUtility;
import com.PageObjectModel.PageObjectModel.logReportsUtility;

public class HomePage extends DriverUtility {
	
	protected String PageUrl="https://www.freecrm.com/index.html";
	String signup="//a[text()='Sign Up']";
	String firstname="input[name='first_name']";
	String lastname="input[name='surname']";
	String Email="input[name='email']";
	String conEmail="input[name='email_confirm']";
	String uname="input[name='username']";
	String pass="input[name='password']";
	String conpass="input[name='passwordconfirm']";
	String check="input[name='agreeTerms']";
	String sub="div.myButton";
	public void testSignup() throws InterruptedException
	{
		getdriver().get(PageUrl);
		logReportsUtility.logMsg("freecrm is opened successfully");
		Thread.sleep(2000);
		Actionengine.clickbyXpath(signup);
		logReportsUtility.logMsg("signup button is clicked");
		Actionengine.sendkeysbyCss(firstname, "mahesh");
		Actionengine.sendkeysbyCss(lastname, "karumanchi");
		Actionengine.sendkeysbyCss(Email, "mahi080290@gmail.com");
		Actionengine.sendkeysbyCss(conEmail, "mahi080290@gmail.com");
		
		
	}

}