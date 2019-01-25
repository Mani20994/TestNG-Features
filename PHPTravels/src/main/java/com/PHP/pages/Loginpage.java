package com.PHP.pages;

import com.PHP.Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Loginpage extends TestBase {

	//Page Factory-Object repository:
	@FindBy(xpath="//form[@class='form-signin form-horizontal wow fadeIn animated animated']//input[@placeholder='Email']")
	WebElement Email;

	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;

	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;

	
	public Loginpage() {
	 PageFactory.initElements(driver, this); 
	 
	}

	public String validateLoginPageTitle() {
	 return driver.getTitle();
	 }

	//public boolean validateCRMImage() {
	 //return crmLogo.isDisplayed();
	//}

	public Homepage login(String em, String pwd) throws InterruptedException   {
	 Email.sendKeys(em);
	Thread.sleep(3000);
	 password.sendKeys(pwd);
	 Thread.sleep(3000);
	 loginBtn.click();
	 
	 return  new Homepage();
	 
	}

	}


		
		
		
		
		
		
		
		
		


	
	
	
	
	
	
	
	

