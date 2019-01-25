package com.PHP.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PHP.Base.TestBase;


public class Homepage extends TestBase{
	
     
	//click on Hotels
	@FindBy(xpath="//*[@id='social-sidebar-menu']/li[7]/a")
	WebElement Hotels;
	
	
	//click on Flights
	@FindBy(xpath="//a[@href='#Flights']")
	WebElement Flights;
	
	//constructor of homepage
	public Homepage() {
		 PageFactory.initElements(driver, this);
		 
		}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	 
	public Hotelpage clickonHotelsLink() throws InterruptedException   {
		Thread.sleep(3000);
		Hotels.click();
		return new Hotelpage(); 
	}
	
	public Flightspage clickonFlightsLink() throws InterruptedException {
		Thread.sleep(3000);
		Flights.click();
		  return new Flightspage();
	}
}
