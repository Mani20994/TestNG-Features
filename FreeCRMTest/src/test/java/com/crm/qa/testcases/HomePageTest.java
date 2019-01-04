package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Contactspage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.qa.crm.util.TestUtil;

public class HomePageTest extends TestBase {

	//intilitalize property
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	
	//constuctor of homepage
	public HomePageTest() {
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
	    loginpage = new LoginPage();
	    Contactspage contactspage = new Contactspage();
	  homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	 }
	
	 @Test(priority=1)
	 public void verifyHomepageTitleTest() {
		String homepagetitle =homepage.verifyHomePageTitle(); 
		 Assert.assertEquals(homepagetitle,"CRMPRO","Home page title not matched");
		}
	 
	 @Test(priority=2)
	 public void verifyUserNameTest() {
		 testutil.switchToframe();
		Assert.assertTrue( homepage.verifycorrectUsername());
	 }
	 
	 @Test(priority=3)
	 public void verifyContactsLinktest() {
		 testutil.switchToframe();
		 Contactspage Contactspage = homepage.clickOnContactslink();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	 
	 
	 
	 
	 
	 
	
}
