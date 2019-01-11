package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class Contactspage extends TestBase{
	
	

	@FindBy(xpath="/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]")
	
	WebElement contactslabel;
	
	@FindBy(id="first_name")
	WebElement firstname; 
	
	@FindBy(id="surname")
	WebElement lastname;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(id="//input[@type='submit' and @value='Save']")
	WebElement saveBtn;
	
	
	//Initializing the page objects;
	public  void ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyContactslabel() {
		return contactslabel.isDisplayed();
     }
	
	public void selectContacts(String name) throws InterruptedException  {
		Thread.sleep(3000);
	driver.findElement(By.xpath("/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/form[1]/table[1]/tbody[1]/tr[4]/td[1]")).click();
		
	}
	
	public void createnewcontact(String title,String ftName,String ltName,String comp) {
		Select select=new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
		firstname.sendKeys(ftName);
	    lastname.sendKeys(ltName);
	    company.sendKeys(comp);
	    saveBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
}
