package com.lati.testcases;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lati.base.TestBase;
import com.qa.pages.AdminstratorPage;
import com.qa.pages.Homepage;
import com.qa.pages.Loginpage;
import com.qa.util.TestUtil;

public class HomepageTest<administrationPage> extends TestBase {
Loginpage loginPage;
Homepage homePage;
TestUtil testUtil;
Homepage administrator;
AdminstratorPage administratorPage;


public HomepageTest() {
 super();
}

//test cases should be separated -- independent with each other
//before each test case -- launch the browser and login
//@test -- execute test case
//after each test case -- close the browser

@BeforeMethod
public void setUp() throws InterruptedException {
   initialization();
   testUtil = new TestUtil();
 //restaurantPage = new RestaurantPage();
  loginPage = new Loginpage();
  homePage = loginPage.login(prop.getProperty("UserName"), prop.getProperty("password"));
}



@Test(priority=1)
public void clickOnAdministratorLink() throws InterruptedException{
 
 administrator = homePage.clickOnAdministratorLink();
 Thread.sleep(3000);

 //administratorPage = AdminstratorPage.clickOnAddCourse(); 
 
}
 
 
 
/*@AfterMethod
public void tearDown(){
 driver.quit();
 }
*/
}