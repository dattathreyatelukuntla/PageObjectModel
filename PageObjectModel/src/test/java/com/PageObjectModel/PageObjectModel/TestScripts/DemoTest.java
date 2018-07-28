package com.PageObjectModel.PageObjectModel.TestScripts;

import org.testng.annotations.Test;

import com.PageObjectModel.PageObjectModel.DriverUtility;
import com.PageObjectModel.PageObjectModel.AllPageScripts.HomePage;

public class DemoTest extends DriverUtility {

	@Test
	public void test() throws InterruptedException
	{
	HomePage h=new HomePage();
	h.testSignup();
	}

}
