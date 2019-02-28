package com.lati.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.lati.base.TestBase;
import com.qa.pages.AdminstratorPage;
import com.qa.pages.CoursePage;
import com.qa.pages.Homepage;
import com.qa.pages.Loginpage;
import com.qa.util.TestUtil;


public class AdminstratorTest  extends TestBase{

	Loginpage loginpage;
	Homepage homepage;
	TestUtil testutil;
	CoursePage coursepage;
	
	AdminstratorPage Adminstratorpage;
	String sheetName="AddCourse";
	//constuctor of homepage
	public AdminstratorTest() {
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
	    coursepage=new CoursePage();
	   homepage=new Homepage();
	   Adminstratorpage=new AdminstratorPage();
	    homepage=loginpage.login(prop.getProperty("UserName"), prop.getProperty("password"));
	 }
	
	 
	 @DataProvider
	 public Object[][] getLATITestData() {
		Object data[][]=TestUtil.getTestData(sheetName) ;
		return data;
	 }
	 
	 @Test(priority=1,dataProvider="getLATITestData")
	 public void clickOnAddCourse(String Code,String Name,String Tuition,String Description,String TargetedLearners, String Duration ,String DeliveryMethod) throws InterruptedException {
		 homepage.clickOnAdministratorLink();
		 Adminstratorpage = AdminstratorPage.clickOnAddCourse(Code, Name,Tuition, Description,TargetedLearners,Duration,DeliveryMethod); 
		// AdminstratorPage.clickOnAddCourse(Code, Name,Tuition, Description,TargetedLearners,Duration,DeliveryMethod);
		 
	 }
	 

	
	 
	// @AfterMethod
	//public void tearDown() {
		//driver.quit();
	//}
	}
	
	
	
	
	
	
	
	
	
	
	
	

