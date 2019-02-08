package com.PHP.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.PHP.Base.TestBase;

public class Hotelpage  extends TestBase{
	
	//Status
	@FindBy(xpath="//select[@name='hotelstatus']")
	WebElement  Status;
	
	//Hotelname
	@FindBy(xpath="//div[@id='GENERAL']//input[@placeholder='Hotel Name']")
	WebElement  hotelname;
	
	//Hotel Description
	@FindBy(xpath="/html/body/div[2]/div/div/form/div/div[1]/div/div[1]/div[6]/div/select")
	WebElement  hoteldescription;

	//Stars
	@FindBy(xpath="//select[@name='hotelstars']")
	WebElement  Stars;
	
	//Hoteltype
	@FindBy(xpath="//select[@name='hoteltype']")
	WebElement  hoteltype;
	
	//Featured
	@FindBy(xpath="//select[@name='isfeatured']")
	WebElement Featured ;
	
	//from date
	//@FindBy(xpath="//input[contains(@placeholder,'From')]")
	//WebElement Fromdate ;
	
	//To date
	//@FindBy(xpath="//input[contains(@placeholder,'To')]")
	//WebElement Todate ;
	
	//Location
	@FindBy(xpath="//span[@class='select2-chosen']")
	WebElement Location ;
	
	//To Enter Location value
	@FindBy(xpath="//div[@class='select2-search']//input[@type='text']")
	WebElement LocationValue ;

	//To Enter Location 
	@FindBy(xpath="//div[@class='select2-search']//input[@type='text']")
	WebElement LocationEnter ;
	
    //Deposit/commision
	@FindBy(xpath="//select[contains(@name,'deposittype')]")
	WebElement  deposit;
	
	//Enter value of Deposit
	@FindBy(xpath="//div[@id='GENERAL']//div[9]//div[2]//input[1]")
	WebElement  depositvalue;
	
	//Vat Tax
	@FindBy(xpath="//select[contains(@name,'taxtype')]")
	WebElement  vattax;
	
	//Value of Vat Tax
	@FindBy(xpath="//div[@id='GENERAL']//div[10]//div[2]//input[1]")
	WebElement  vattaxvalue;
	
	//Releated Hotels
	//@FindBy(xpath="//div[@id='s2id_autogen2']//ul[contains(@class,'select2-choices')]")
	//WebElement  relatedhotels;
	
	// click Releated Hotels
		//@FindBy(xpath="//div[@id='s2id_autogen2']//ul[contains(@class,'select2-choices')]")
		//WebElement  enterrelatedhotels;
		
    //Address on map
		@FindBy(xpath="//input[@id='mapaddress']")
		WebElement  addressonmap;
		
		//Lattitude
		@FindBy(xpath="//input[@id='latitude']")
		WebElement latitude ;
		
		//Longittude
		@FindBy(xpath="//input[@id='longitude']")
		WebElement longitude  ;
	
	//Cliclk on save button	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/button[1]")
	WebElement  savebtn;
	
	//Click on Delete button
	@FindBy(xpath="//tbody//tr[1]//td[12]//span[1]//a[3]")
	WebElement  deletebtn;
	
	
	//constructor of Hotelpage
		public Hotelpage() {
	    PageFactory.initElements(driver, this);
 }
	
	
		public void createAddHotel(String Stas,String htname, String hotdesc,String Strs,String HtType,String Featrd,String LocVal,String depsit,String depostval,String vattx,String vattxval,String addonmap,String lati,String longi) throws InterruptedException {
	
			Status.sendKeys(Stas);
			Thread.sleep(2000);
			hotelname.sendKeys(htname);
			Thread.sleep(5000);
			hoteldescription.sendKeys(hotdesc);
			Thread.sleep(2000);
			
			Stars.sendKeys(Strs);
			
			hoteltype.sendKeys(HtType);
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,2500)");
			System.out.println("scrolled Down");
			Thread.sleep(5000);
			
			Featured.sendKeys(Featrd);
			Thread.sleep(3000);
			
			//Fromdate.sendKeys(Frmdate);
			//Fromdate.sendKeys(Keys.ENTER);
			//Todate.sendKeys(Todat);
			//Todate.sendKeys(Keys.ENTER);
			//Thread.sleep(5000);
			
			Location.click();
			LocationValue.sendKeys(LocVal);
			Thread.sleep(3000);
			LocationEnter.sendKeys(Keys.ENTER);
		    Thread.sleep(3000);
			
			deposit.sendKeys(depsit);
			depositvalue.sendKeys(depostval);
			Thread.sleep(5000);
			vattax.sendKeys(vattx);
			vattaxvalue.sendKeys(vattxval);
			Thread.sleep(5000);
			
			//relatedhotels.click();
			//Thread.sleep(3000);
			//relatedhotels.sendKeys(relathot);
			//Thread.sleep(3000);
			 //enterrelatedhotels.sendKeys(Keys.ENTER);
			
			 //Address on map
			 addressonmap.sendKeys(addonmap);
			 latitude.sendKeys(lati);
			 longitude.sendKeys(longi);
			 
			savebtn.click();
			 deletebtn.click();
			 //To handle delete pop up
	         Alert alert =driver.switchTo().alert();
	         Thread.sleep(3000);
	         alert.accept();
		}
}