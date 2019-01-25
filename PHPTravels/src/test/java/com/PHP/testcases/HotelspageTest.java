package com.PHP.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PHP.Base.TestBase;
import com.PHP.pages.Homepage;
import com.PHP.pages.Hotelpage;
import com.PHP.pages.Loginpage;
import com.PHP.util.TestUtil;

public class HotelspageTest extends TestBase{

	
	Loginpage loginpage;
	Homepage Homepage;
	TestUtil testutil;
	Hotelpage hotelpage;
	
	//constuctor of homepage
	public HotelspageTest() {
		 super();
		}
	
	
	
	@BeforeMethod
	 public void setUp() throws InterruptedException {
	    initialization();
	    testutil=new TestUtil();
	    loginpage = new Loginpage();
	    hotelpage=new Hotelpage();
	   
	    Homepage=loginpage.login(prop.getProperty("Email"), prop.getProperty("password"));
	 }
	
	 @Test(priority=1)
	 public void verifyHotellabel(){
		 
		 Assert.assertTrue(hotelpage.verifyHotellabel());
		}
	
	 @Test(priority=2)
	 public void verifySearchlabel() throws InterruptedException{
		  Assert.assertTrue(hotelpage.verifySearchlabel());
		}
	 
	 @Test(priority=3)
	 public void verifyCheckinlabel() throws InterruptedException{
		  Assert.assertTrue(hotelpage.verifyCheckinlabel());
		}
	 
	 @Test(priority=1)
	 public void verifyCheckoutlabel() throws InterruptedException{
		  Assert.assertTrue(hotelpage.verifyCheckoutlabel());
		}
	 
	 
	  @AfterMethod
		public void tearDown() {
			driver.quit();
		}
}
