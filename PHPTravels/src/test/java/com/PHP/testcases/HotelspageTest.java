package com.PHP.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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
	
	String sheetName="Hotels";
	
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
	    hotelpage=Homepage.clickonHotelsLink();
	   // Homepage=hotelpage.clickonAddbutton();
	 }
	
	 @Test(priority=1)
	 public void verifyHotellabel() throws InterruptedException{
		 Homepage.clickonHotellabel();
	 }
	 
	 @Test(priority=2)
	 public void verifyAddbutton() throws InterruptedException{
		 Homepage.clickonHotellabel();
	 }
	 
	
	 @DataProvider
	 public Object[][] getPHPTestData() {
		Object data[][]=TestUtil.getTestData(sheetName) ;
		return data;
	 }
	 
	 @Test(priority=3,dataProvider="getPHPTestData")
	 public void validatecreateAddHotel(String Status,String HotelName,String HotelDescription,String Stars,String HotelType, String Featured,String LocationValue,String Deposit,String Value,String vattax,String ValueTax,String AddressonMap,String Latitude,String Longitude) throws InterruptedException {
	Homepage.clickonHotellabel();
	 hotelpage.createAddHotel(Status, HotelName, HotelDescription,Stars, HotelType,Featured,LocationValue,Deposit,Value,vattax,ValueTax,AddressonMap,Latitude,Longitude);
		 
	 }
	 
	 
	  //@AfterMethod
		//public void tearDown() {
			//driver.quit();
		//}
	 
}
