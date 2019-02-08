package com.PHP.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PHP.Base.TestBase;
import com.PHP.pages.EditFlights;
import com.PHP.pages.Flightspage;
import com.PHP.pages.Homepage;
import com.PHP.pages.Hotelpage;
import com.PHP.pages.Loginpage;
import com.PHP.util.TestUtil;

public class Editflightstest extends TestBase {

	
	Loginpage loginpage;
	Homepage Homepage;
	TestUtil testutil;
	Hotelpage hotelpage;
	Flightspage flightpage;
	EditFlights editflight;
	//String sheetName="Hotels";
	
	//constuctor of homepage
	public void EditflightspageTest() {
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
	 public void verifyeditlabel() throws InterruptedException{
		Homepage.editflights();
	
	
	
	
}
}