package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lati.base.TestBase;
public class Loginpage extends TestBase {

	//Page Factory-Object repository:
	@FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlLogin_sID']")
	WebElement UserName;

	@FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlLogin_sPassword']")
	WebElement password;

	@FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlLogin_cmdLogin']")
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

	public Homepage login(String usernm, String pwd) throws InterruptedException   {
	 UserName.sendKeys(usernm);
	Thread.sleep(3000);
	 password.sendKeys(pwd);
	 Thread.sleep(3000);
	 loginBtn.click();
	 
	 return  new Homepage();
	 
	}

	}


		
		
		
		
		
		
		
		
		


	
	
	
	
	
	
	
	

