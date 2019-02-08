package com.PHP.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PHP.Base.TestBase;

public class EditFlights extends TestBase {
	@FindBy(xpath="//form[@class='form-signin form-horizontal wow fadeIn animated animated']//input[@placeholder='Email']")
	WebElement Email;

	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;

	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//tbody//tr[1]//td[13]//span[1]//a[1]")
	WebElement edit ;
	
	public void EditFlight() {
	 PageFactory.initElements(driver, this); 
	 
	}

	public String validateLoginPageTitle() {
	 return driver.getTitle();
	 }
	public Homepage login(String em, String pwd) throws InterruptedException   {
		 Email.sendKeys(em);
		Thread.sleep(3000);
		 password.sendKeys(pwd);
		 Thread.sleep(3000);
		 loginBtn.click();
		 
		 return  new Homepage();
		 
		}

	
	public void edit() {
		edit.click();
	}
	
	

}
