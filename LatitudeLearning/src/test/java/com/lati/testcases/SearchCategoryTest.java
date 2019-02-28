package com.lati.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.lati.base.TestBase;
import com.qa.pages.AddCategoryPage;
import com.qa.pages.AddResourcePage;
import com.qa.pages.AdminstratorPage;
import com.qa.pages.CoursePage;
import com.qa.pages.Homepage;
import com.qa.pages.Loginpage;
import com.qa.pages.SearchCategoryPage;
import com.qa.util.TestUtil;

public class SearchCategoryTest extends TestBase{

	Loginpage loginpage;
	Homepage homepage;
	TestUtil testutil;
	CoursePage coursepage;
	
	AdminstratorPage adminstratorpage;
	AddResourcePage addresourcepage;
    AddCategoryPage addcategorypage;
    SearchCategoryPage searchcategorypage;
	String sheetName="Edit category";
	
	
	public SearchCategoryTest() {
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
	   addcategorypage=new AddCategoryPage();
	   searchcategorypage=new SearchCategoryPage();
	   homepage=loginpage.login(prop.getProperty("UserName"),prop.getProperty("password"));
	 }
	 
	 @DataProvider
	 public Object[][] getLATITestData() {
		Object data[][]=TestUtil.getTestData(sheetName) ;
		return data;
	 }

	 @Test(priority=1,dataProvider="getLATITestData")
	 public void searchCategory(String Description) throws InterruptedException {
		 homepage.clickOnAdministratorLink();
		 searchcategorypage.searchCategory(Description);

	 }

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

