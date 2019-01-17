package com.PHP.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PHP.Base.TestBase;


public class Homepage extends TestBase{
	
     // Click on UserName
	@FindBy(xpath="//h3[@class='RTL']")
	WebElement userNameLabel;
	
	
	//Click on Home button
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement homeLink;
	
	//click on Hotels
	@FindBy(xpath="//a[@title='Hotels']")
	WebElement HotelsLink;
	
	
	//click on Flights
	@FindBy(xpath="//a[@title='Flights']")
	WebElement FlightsLink;
	
	//constructor of homepage
	public void HomePage() {
		 PageFactory.initElements(driver, this);
		 
		}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	  public boolean verifycorrectUsername() {
		return userNameLabel.isDisplayed();
	}
	public void clickonHomepage() {
		homeLink.click();
		return;
	}
	public Hotelpage clickonHotelsLink() {
		HotelsLink.click();
		return new Hotelpage();
	}
	
	
	public Flightspage clickonFlightsLink() {
		FlightsLink.click();
		return new Flightspage();
	}
}
