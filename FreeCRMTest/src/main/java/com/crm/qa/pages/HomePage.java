package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealslink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement taskslink;
	
	public HomePage() {
		 PageFactory.initElements(driver, this);
		 
		}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	  public boolean verifycorrectUsername() {
		return userNameLabel.isDisplayed();
	}
	public Contactspage clickOnContactslink() {
		contactsLink.click();
		return new Contactspage();
	}
	
	public DealsPage clickOnDealsPage() {
		contactsLink.click();
		return new DealsPage();
}
	
	public TaskPage clickOnTaskPage() {
		contactsLink.click();
		return new TaskPage();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
