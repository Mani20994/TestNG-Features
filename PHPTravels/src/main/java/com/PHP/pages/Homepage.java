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
	
	//click on Routes
	@FindBy(xpath="//a[contains(text(),'Routes')]")
	WebElement Routes;
	
	//click on Hotels
    @FindBy(xpath="/html[1]/body[1]/div[2]/aside[1]/div[1]/div[6]/div[1]/ul[1]/li[7]/ul[1]/li[1]/a[1]")
	static
	WebElement Hotellabel;
    
  //click on  Hotels Add button
  	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/form[1]/button[1]")
  		WebElement Addbutton;
  	
  	//click on Routes Add Button
	@FindBy(xpath="//button[@type='submit']")
		WebElement Addroutebutton;
	

	//constructor of homepage
	public Homepage() {
		 PageFactory.initElements(driver, this);
		 
		}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	 //click on hotel
	public Hotelpage clickonHotelsLink() throws InterruptedException   {
		Thread.sleep(3000);
		Hotels.click();
		return new Hotelpage(); 
	}
	//click on flights
	public Flightspage clickonFlightsLink() throws InterruptedException {
		Thread.sleep(3000);
		Flights.click();
		  return new Flightspage();
	}
	//to click on hotel label
	public void clickonHotellabel() throws InterruptedException {
		Thread.sleep(3000);
		Hotellabel.click();
		Addbutton.click();
	}

	//to click on rouute label 
	public void clickonRoutelabel() throws InterruptedException {
		Thread.sleep(3000);
		Hotellabel.click();
		Addroutebutton.click();
	}

	
	
	
	
}
