package com.lati.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lati.base.TestBase;

import com.qa.pages.Homepage;
import com.qa.pages.Loginpage;



public class LoginpageTest extends  TestBase {
	Loginpage loginpage;
  Homepage homepage;
	public LoginpageTest() {
	 super();
	}

	 @BeforeMethod
	public void setUp() {
	   initialization();
	 loginpage = new Loginpage();
	 
	}
	 
	 @Test(priority=1)
	 public void loginPageTitleTest() {
	  
	   String title = loginpage.validateLoginPageTitle();
	   Assert.assertEquals(title, "Login");
	 }
	 
	 @Test(priority=2)
	 public void loginTest() throws InterruptedException {
	 homepage= loginpage.login(prop.getProperty("UserName"), prop.getProperty("password"));
	 }

	//@AfterMethod
	//public void tearDown() {
	 //driver.quit();
	//}
	}


		
		
	
	
	
	
	
	
	
	
	
	

