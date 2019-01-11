package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Contactspage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.qa.crm.util.TestUtil;
public class ContactspageTest extends TestBase {
	
	
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	Contactspage contactspage;
	String sheetName="Contacts";
	//constuctor of homepage
	public ContactspageTest() {
		 super();
		}
	
	@BeforeMethod
	 public void setUp() throws InterruptedException {
	    initialization();
	    testutil=new TestUtil();
	    loginpage = new LoginPage();
	    contactspage  = new Contactspage();
	    homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	    TestUtil.switchToframe();
	    contactspage=homepage.clickOnContactslink();
	   
	 }
	@Test(priority=3)
	public void verifyContactsPageLabel() {
		Assert.assertTrue(contactspage.verifyContactslabel(),"contacts label is missing on the page");
	}
	
	//check box
	@Test(priority=2)
	public void selectContactsTest() throws InterruptedException {
		contactspage.selectContacts("Manikeshwari Sangolgi");
	}
	@DataProvider
	public Object[][] getCRMTestData() {
	Object data[][]=TestUtil.getTestData(sheetName);
	return data;
	}
	
	
	@Test(priority=1 ,dataProvider="getCRMTestData")
	public void validateCreateNewContact(String title,String firstname,String lastname,String company) throws InterruptedException{ 
	homepage.clickOnNewContactlink();

	contactspage.createnewcontact(title, firstname, lastname, company);	
	}	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	 
	 
	
	
	
}
