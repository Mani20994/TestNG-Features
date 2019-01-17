package com.PHP.pages;

import com.PHP.Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Loginpage extends TestBase {

	//Page Factory-Object repository:
	@FindBy(xpath="/html[1]/body[1]/div[5]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/input[1]")
	WebElement Email;

	@FindBy(xpath="/html[1]/body[1]/div[5]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/div[2]/input[1]")
	WebElement password;

	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement loginBtn;

	//@FindBy(xpath="//button[contains(text(),'Sign Up;)]")
	//WebElement signUpBtn;

	//@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	//WebElement crmLogo;

	public Loginpage() {
	 PageFactory.initElements(driver, this); 
	 
	}

	public String validateLoginPageTitle() {
	 return driver.getTitle();
	 }

	//public boolean validateCRMImage() {
	 //return crmLogo.isDisplayed();
	//}

	public Homepage login(String em, String pwd) throws InterruptedException  {
	 Email.sendKeys(em);
	 Thread.sleep(3000);
	 password.sendKeys(pwd);
	 Thread.sleep(3000);
	 loginBtn.click();
	 
	 return  new Homepage();
	 
	}

	}


		
		
		
		
		
		
		
		
		


	
	
	
	
	
	
	
	

