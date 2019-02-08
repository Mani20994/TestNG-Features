package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lati.base.TestBase;

public class Homepage extends TestBase {

@FindBy(xpath="//a[@title='Administration']")
static
WebElement administrator;

/*//click on courses
	@FindBy(xpath="//a[@id='ctlTemplate_regLeftNav_ctlMenuUser_mnuUser_MenuSection4_SectionHeader']")
	WebElement Courses;*/
	
@FindBy(xpath="//a[@class='btn row prettyButtons'][contains(text(),'Add Course')]")
WebElement addcourse;

@FindBy(xpath="//a[@id='ctlTemplate_regLeftNav_ctlMenuUser_mnuUser_MenuSection15_SectionItemsRepeater_ctl01_SectionItem']")
WebElement addresource;



//Initializing the Page Objects
 public Homepage() {
  PageFactory.initElements(driver, this);
 }

 public Homepage clickOnAdministratorLink() throws InterruptedException {
  Thread.sleep(3000);
  administrator.click();
 return new Homepage();
 }
/*//click on courses
		public AdminstratorPage clickonCoursesLink() throws InterruptedException {
			Thread.sleep(3000);
			Courses.click();
			  return new AdminstratorPage();*/
		//}	
public AddCoursePage clickOnAddCourse()throws InterruptedException {
 Thread.sleep(3000);
 addcourse.click();
return new AddCoursePage();
}

public AddResourcePage clickOnAddResource() throws InterruptedException {
	Thread.sleep(3000);
	addresource.click();
	return new AddResourcePage();
	
	
}


}
