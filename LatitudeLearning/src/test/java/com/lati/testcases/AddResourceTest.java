package com.lati.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.lati.base.TestBase;
import com.qa.pages.AddResourcePage;
import com.qa.pages.AdminstratorPage;
import com.qa.pages.CoursePage;
import com.qa.pages.Homepage;
import com.qa.pages.Loginpage;
import com.qa.util.TestUtil;

public class AddResourceTest  extends TestBase{
	
	Loginpage loginpage;
	Homepage homepage;
	TestUtil testutil;
	CoursePage coursepage;
	
	AdminstratorPage adminstratorpage;
	AddResourcePage addresourcepage;
	
	String sheetName="AddResource";
	
	
	public AddResourceTest() {
		 super();
		}
	
	 @BeforeMethod
	 public void setUp() throws InterruptedException {
	    initialization();
	    testutil=new TestUtil();
	    loginpage = new Loginpage();
	    coursepage=new CoursePage();
	   homepage=new Homepage();
	   adminstratorpage=new AdminstratorPage();
	   addresourcepage=new AddResourcePage();
	    homepage=loginpage.login(prop.getProperty("UserName"), prop.getProperty("password"));
	 }
	 @DataProvider
	 public Object[][] getLATITestData() {
		Object data[][]=TestUtil.getTestData(sheetName) ;
		return data;
	 }
	 
	 @Test(priority=1,dataProvider="getLATITestData")
	 public void clickOnAddResource(String Name,String Type,String Description,String ContactName, String ContactNumber) throws InterruptedException {
		 homepage.clickOnAdministratorLink();
		 addresourcepage.clickOnAddResource(Name,Type, Description,ContactName,ContactNumber); 
		// AdminstratorPage.clickOnAddCourse(Code, Name,Tuition, Description,TargetedLearners,Duration,DeliveryMethod);
		 
	 }
	 

	
	 
	// @AfterMethod
	//public void tearDown() {
		//driver.quit();
	//}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


