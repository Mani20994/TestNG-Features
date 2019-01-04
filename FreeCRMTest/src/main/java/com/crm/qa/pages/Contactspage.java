package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Contactspage extends TestBase{

	@FindBy(xpath="/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]")
	WebElement contactslabel;
	
	//Initializing the page objects;
	public void ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyContactslabel() {
		return contactslabel.isDisplayed();
     }
	
	public void selectContacts(String name) {
		
		
		
	}
	
	
	
	
}
