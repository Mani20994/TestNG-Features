package com.PHP.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PHP.Base.TestBase;

public class Flightspage  extends TestBase{


	//Status
	@FindBy(xpath="//select[@name='flightstatus']")
	WebElement  Status;
	
	//Total Hours
	@FindBy(xpath="//input[@name='total_hours']")
	WebElement Totalhours ;
	
	//Flight Type
	//@FindBy(xpath="//div[@id='s2id_autogen5']//a[@class='select2-choice']")
	//WebElement Flighttype ;
	
	//Refundable
	@FindBy(xpath="//span[contains(text(),'Non Refundable')]")
	WebElement Refundable ;
	
	@FindBy(xpath="//div[@id='select2-drop']//input[contains(@type,'text')]")
	WebElement Refundablevalue ;
	
	@FindBy(xpath="//div[@id='select2-drop']//input[contains(@type,'text')]")
	WebElement Refundableenter ;
	
	//Direction
	//@FindBy(xpath="//span[contains(text(),'One Way')]")
	//WebElement Direction ;
	//price click 
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")
	WebElement price;
	
	//Price
	//@FindBy(xpath="//input[contains(@name,'adultprice[]')]")
	//WebElement Priceenter ;
	
	//Departure
	@FindBy(xpath="//div[@id='s2id_locationlist_0']//span[@class='select2-chosen'][contains(text(),'Enter City Or Airport')]")
	WebElement Departure ;
	
	//Passing departure value
	@FindBy(xpath="//div[@id='select2-drop']//input[@type='text']")
	WebElement Departurevalue ;
	
	//Enter departure value
	@FindBy(xpath="//div[@id='select2-drop']//input[@type='text']")
	WebElement Departureenter ;
	
	//Airline
	@FindBy(xpath="//div[@class='select2-container aeroplane_class0']//span[@class='select2-chosen'][contains(text(),'Enter Arline Name')]")
	WebElement Airline;
	
	//passing values
	@FindBy(xpath="//div[@id='select2-drop']//input[@type='text']")
	WebElement Airlinevalue ;
	
	@FindBy(xpath="//div[@id='select2-drop']//input[@type='text']")
	WebElement Airlineenter ;
	
	
	
	//check in
	@FindBy(xpath="//tbody//tr[1]//th[6]//input[1]")
	WebElement Checkin ;
	
	 //checkin
	@FindBy(xpath="//tbody//tr[2]//th[6]//input[1]")
	WebElement checkin ;
		
	//Airline
	//@FindBy(xpath="//div[@id='s2id_aeroplanes_1']//span[contains(@class,'select2-chosen')][contains(text(),'Enter Arline Name')]")
	//WebElement AirLine ;
	
	
	//@FindBy(xpath="//div[@id='select2-drop']//input[contains(@type,'text')]")
	//WebElement AirrLineValue ;
	
	//@FindBy(xpath="//div[@id='select2-drop']//input[contains(@type,'text')]")
	//WebElement AirrLineEnter ;
	
	
	
	//Arrival value
	//@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/table[1]/tbody[1]/tr[1]/th[3]/div[1]/a[1]/span[1]")
	//WebElement Arrival;

	//Passing Arrival values
	//@FindBy(xpath="//div[@id='select2-drop']//input[@type='text']")
	//WebElement Arrivalvalue ;
	
	//Click on enter for Arrival value
	//@FindBy(xpath="//div[@id='select2-drop']//input[@type='text']")
	//WebElement Arrivalenter ;
	
	
	
	//Flight no 
	//@FindBy(xpath="//tbody//tr[2]//th[4]//input[1]")
   //WebElement flightno ;
	
	
	//click on submit
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]")
	WebElement submit ;
	
	//click on Edit
	@FindBy(xpath="//tbody//tr[1]//td[13]//span[1]//a[1]")
	WebElement edit ;
	
	//Click on vat tax
	//@FindBy(xpath="//input[@name='tax']")
	//WebElement vattax ;
	
	//@FindBy(xpath="//input[@name='deposite']")
	//WebElement deposite ;
	
	//click on submit
		//@FindBy(xpath="//button[@id='add']")
		//WebElement submit1 ;
		
	//constructor of Flightspage
			public Flightspage() {
		    PageFactory.initElements(driver, this);
	 }
		public void editflights() {
		edit.click();
		}
			public void createAddFlight(String stas,String totalhr,String refundle,String pric,String depart,String airln,String chkin,String ChkIn) throws InterruptedException {
			
			Status.sendKeys(stas);
			Totalhours.sendKeys(totalhr);
			Thread.sleep(3000);
			Refundable.click();
			Refundablevalue.sendKeys(refundle);
			Thread.sleep(3000);
			 Refundableenter.sendKeys(Keys.ENTER);
			 Thread.sleep(3000);
			
			//priceclick.click();
			price.sendKeys(pric);
			//Priceenter .sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			
			Departure.click();
			Departurevalue.sendKeys(depart);
			Thread.sleep(3000);
			Departureenter.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			
			 Airline.click();
			 Airlinevalue.sendKeys(airln);
			 Thread.sleep(3000);
			 Airlineenter.sendKeys(Keys.ENTER);
			
			Checkin.sendKeys(chkin);
			Checkin.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			
			checkin.sendKeys(ChkIn);
			 checkin.sendKeys(Keys.ENTER);
			
			 //flightno.sendKeys(flgtno);
			 //Thread.sleep(3000);
			 
			 //AirLine.click();
			//AirrLineValue.sendKeys(airrl);
			//Thread.sleep(3000);
			//Thread.sleep(3000);
			 
			//Arrival.click();
			//Arrivalvalue.sendKeys(arriv);
			//Thread.sleep(3000);
			//Arrivalenter.sendKeys(Keys.ENTER);
			//Thread.sleep(3000);
		
			
			//JavascriptExecutor js=(JavascriptExecutor)driver;
			//js.executeScript("window.scrollBy(0,2500)");
			//System.out.println("scrolled Down");
			Thread.sleep(5000);
			 submit.click();

				//js.executeScript("window.scrollBy(2500,-2500)");
				//System.out.println("scrolled up");

			//edit.click();
			
			//vattax.sendKeys(vattx);
			//Thread.sleep(3000);
			////deposite.sendKeys(depost);
			//Thread.sleep(3000);
			//submit1.click();
			}

			
}
