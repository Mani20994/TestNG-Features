package com.PHP.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PHP.Base.TestBase;
import com.PHP.pages.Flightspage;
import com.PHP.pages.Homepage;
import com.PHP.pages.Hotelpage;
import com.PHP.pages.Loginpage;
import com.PHP.util.TestUtil;

public class FlightspageTest extends TestBase {

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
	 //@Test(priority=3)
	// public void verifyeditlabel() throws InterruptedException{
		// Homepage.editflights();
	 //}
	 
	 @Test(priority=4)
	 public void validatecreateAddFlight() throws InterruptedException {
	Homepage.clickonRoutelabel();
	 flightpage.createAddFlight("Enabled","30","Refundable","20000","Delhi","Adria","03 AM","04 AM");
	 
	 }
	 
	 
	 //@AfterMethod
		//public void tearDown() {
			//driver.quit();
		//}
	 
	
	
	
	
	
}
