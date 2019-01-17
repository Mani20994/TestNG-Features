package com.PHP.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PHP.Base.TestBase;
import com.PHP.pages.Homepage;
import com.PHP.pages.Loginpage;


public class LoginPageTest extends  TestBase {
	Loginpage loginpage;
  Homepage homepage;
	public LoginPageTest() {
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
	 homepage= loginpage.login(prop.getProperty("Email"), prop.getProperty("password"));
	 }

	@AfterMethod
	public void tearDown() {
	 driver.quit();
	}
	}


		
		
	
	
	
	
	
	
	
	
	
	

