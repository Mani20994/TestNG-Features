package com.PHP.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.PHP.Base.TestBase;

public class Hotelpage  extends TestBase{
//click on Hotels
	@FindBy(xpath="//ul[@class='nav navbar-nav go-right']//li[2]//a[1]")
	static
	WebElement Hotellabel;
	
	//click on search 
	//driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div[3]/div/div/h3/span/span")).click();
	@FindBy(xpath="//div[@id='select2-drop']//input[@type='text']")
	static
	WebElement Searchlabel;
	
	//click on check in
	@FindBy(xpath="//div[9]//div[1]//table[1]//tbody[1]//tr[4]//td[3]")
	static
	WebElement Checkinlabel;
	
	//click on Check out
	@FindBy(xpath="//div[10]//div[1]//table[1]//tbody[1]//tr[4]//td[4]")
	static
	
	WebElement Checkoutlabel;
	
	
	
	public Hotelpage() {
		PageFactory.initElements(driver, this);
	}
	//Method for Hotels
	public static boolean verifyHotellabel() {
		Hotellabel.click();
		return Hotellabel.isDisplayed();
	}
	
	//Method for Search
	public static boolean verifySearchlabel() throws InterruptedException {
		Thread.sleep(2000);
		//Searchlabel.click();
		return Searchlabel.isDisplayed();
		}
	
	public static boolean verifyCheckinlabel() {
	
	return Checkinlabel.isDisplayed();
	
	}
	
	public static boolean verifyCheckoutlabel() {
		
		return Checkoutlabel.isDisplayed();
		
		}
	
	public Homepage clickonHotels() {
		// TODO Auto-generated method stub
		return null;
	}
	}
