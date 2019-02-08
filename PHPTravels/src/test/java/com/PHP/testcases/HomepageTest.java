package com.PHP.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PHP.Base.TestBase;
import com.PHP.pages.Flightspage;
import com.PHP.pages.Homepage;
import com.PHP.pages.Hotelpage;
import com.PHP.pages.Loginpage;
import com.PHP.util.TestUtil;



public class HomepageTest  extends TestBase{

	Loginpage loginpage;
	Homepage Homepage;
	TestUtil testutil;
	Hotelpage hotelpage;
	Flightspage flightpage;
	//constuctor of homepage
	public HomepageTest() {
		 super();
		}
	
	//testcases should be independent with each other
	//before each test case- launch the browser & login
	//@test-execute test case
	//after each test case-close the browser
	
	 @BeforeMethod
	 public void setUp() throws InterruptedException {
	    initialization();
	    testutil=new TestUtil();
	    loginpage = new Loginpage();
	    hotelpage=new Hotelpage();
	   flightpage = new Flightspage();
	    Homepage=loginpage.login(prop.getProperty("Email"), prop.getProperty("password"));
	 }
	
	 @Test(priority=1)
	 public void verifyHomepageTitleTest() {
		String homepagetitle =Homepage.verifyHomePageTitle(); 
		 Assert.assertEquals(homepagetitle,"Administator Login","Home page title not matched");
		}
	 
	 
	 @Test(priority=2)
	 
	 public void verifyhotelstest() throws InterruptedException {
		Hotelpage Hotelpage = Homepage.clickonHotelsLink();
	 }
	 
     @Test(priority=3)
	 public void verifyflightstest() throws InterruptedException {
			Flightspage Flightpage = Homepage.clickonFlightsLink();
		 }
	 
	 
     
	 //@AfterMethod
	//public void tearDown() {
		//driver.quit();
	//}
	}
	
	
	
	
	
	
	
	
	
	
	
	

