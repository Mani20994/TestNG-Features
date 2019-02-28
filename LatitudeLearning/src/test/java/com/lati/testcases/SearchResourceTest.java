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
import com.qa.pages.SearchResourcePage;
import com.qa.util.TestUtil;

public class SearchResourceTest extends TestBase {

		Loginpage loginpage;
		Homepage homepage;
		TestUtil testutil;
		CoursePage coursepage;
		
		AdminstratorPage adminstratorpage;
		AddResourcePage addresourcepage;
	    SearchResourcePage searchresourcepage;
		String sheetName="SearchResource";
		
		
		public SearchResourceTest() {
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
		   searchresourcepage=new SearchResourcePage();
		    homepage=loginpage.login(prop.getProperty("UserName"),prop.getProperty("password"));
		 }
		 
		 @DataProvider
		 public Object[][] getLATITestData() {
			Object data[][]=TestUtil.getTestData(sheetName) ;
			return data;
		 }
	
		 @Test(priority=1,dataProvider="getLATITestData")
		 public void clickOnSearchResource(String Keyword,String Type,String Description) throws InterruptedException {
			 homepage.clickOnAdministratorLink();
			 searchresourcepage.clickOnSearchResource(Keyword,Type,Description);
	
		 }
	
}
