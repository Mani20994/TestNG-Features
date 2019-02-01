package com.PHP.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PHP.pages.Flightspage;
import com.PHP.pages.Homepage;
import com.PHP.pages.Hotelpage;
import com.PHP.pages.Loginpage;
import com.PHP.util.TestUtil;

public class FlightspageTest {

	Loginpage loginpage;
	Homepage Homepage;
	TestUtil testutil;
	Hotelpage hotelpage;
	Flightspage flightpage;
	//String sheetName="Hotels";
	
	//constuctor of homepage
	public FlightspageTest() {
		 super();
		}
	
	
	
	@BeforeMethod
	 public void setUp() throws InterruptedException {
	    initialization();
	    testutil=new TestUtil();
	    loginpage = new Loginpage();
	    hotelpage=new Hotelpage();
	   
	    Homepage=loginpage.login(prop.getProperty("Email"), prop.getProperty("password"));
	    flightpage=Homepage.clickonFlightsLink();
	   
	 }


	 @Test(priority=1)
	 public void verifyRoutes() throws InterruptedException{
		 Homepage.clickonHotellabel();
	 }
	 
	 @Test(priority=2)
	 public void verifyAddroutebutton() throws InterruptedException{
		 Homepage.clickonRoutelabel();
	 }
	 
	 //@AfterMethod
		//public void tearDown() {
			//driver.quit();
		//}
	 
	
	
	
	
	
}
