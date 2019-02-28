package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lati.base.TestBase;

public class AddCategoryPage extends TestBase{

	
	//Language
	  @FindBy(xpath="//select[@id='ctlTemplate_regMainBody_ctlCategoryInfo_ctlTemplate_regMainBody_ctlCategoryInfo_ctlPageLanguage_LanguageDropDown']")
	  WebElement language;

	
	//Name
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlCategoryInfo_txtCategory']")
	  WebElement name;
	  
		//description
	  @FindBy(xpath="//textarea[@id='ctlTemplate_regMainBody_ctlCategoryInfo_txtDescription']")
	  WebElement description;
	  
		//start date
	  @FindBy(xpath="//dd[@id='ctlTemplate_regMainBody_ctlCategoryInfo_Dd5']//img[@class='calButton']")
	  WebElement clickoncalender;
	  
		//click on next button
	  @FindBy(xpath="//div[@class='next']")
	  WebElement next;
	  
		//click on date
	  @FindBy(xpath="//div[@class='body']//div//div[1]//div[1]//div[4]//div[4]")
	  WebElement date;
	  
		//End date
	  @FindBy(xpath="//dd[@id='ctlTemplate_regMainBody_ctlCategoryInfo_Dd7']//img[@class='calButton']")
	  WebElement clickcalender;
	
	
	
	  //click on next
	  @FindBy(xpath="//div[@class='next']")
	  WebElement Next ;
	  
	  //click on date
	  @FindBy(xpath="//div[@class='next']")
	  WebElement next1 ;
	  
	  //select date
	  @FindBy(xpath="//div[@class='day day2'][contains(text(),'23')]")
	  WebElement Date;
	  
	  //searchable
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlCategoryInfo_rdbSearchable_0']")
	  WebElement search;
	
	
	  //submit
	  @FindBy(xpath="//input[@value='Submit']")
	  WebElement submit ;
	
	
	
	public AddCategoryPage() {
		PageFactory.initElements(driver, this);
		 
  }
	
 public AddCategoryPage clickOnCategory(String nam,String desc) throws InterruptedException {
	 
	//Resource
		driver.findElement(By.xpath("//a[@id='ctlTemplate_regLeftNav_ctlMenuUser_mnuUser_MenuSection15_SectionHeader']")).click();
		  Thread.sleep(3000); 

	 		 JavascriptExecutor js=(JavascriptExecutor)driver;
		       js.executeScript("window.scrollBy(0,2000)");
		       System.out.println("scrolled Down");
		       Thread.sleep(2000);
	     
		     //add category
				  
				  driver.findElement(By.xpath("//a[@id='ctlTemplate_regLeftNav_ctlMenuUser_mnuUser_MenuSection15_SectionItemsRepeater_ctl03_SectionItem']")).click();
				  Thread.sleep(3000);
		  
	 
	 
				  language.click();
	              Thread.sleep(2000);
				  name.sendKeys(nam);
				  Thread.sleep(2000);
				  description.sendKeys(desc);
				  Thread.sleep(2000);
				  clickoncalender.click();
				  Thread.sleep(2000);
				  next.click();
				  Thread.sleep(2000);
				  date.click();
				  Thread.sleep(2000);
				  clickcalender.click();
				  Thread.sleep(2000);
				  Next.click();
				  Thread.sleep(2000);
				  next1.click();
				  Thread.sleep(2000);
				  Date.click();
				  Thread.sleep(2000);
				  search.click();
				  Thread.sleep(2000);
				  submit.click();
				  
				  
				  
				  
				  
	return new AddCategoryPage();
	
 		
	
	
	
	
	
	
}
}