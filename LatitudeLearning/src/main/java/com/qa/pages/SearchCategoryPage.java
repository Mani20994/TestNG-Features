package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lati.base.TestBase;

public class SearchCategoryPage extends TestBase{

	//click on search
	  @FindBy(xpath="//input[@value='Search']")
	  WebElement search;
	
	//click on science
	  @FindBy(xpath="//a[contains(text(),'Cloud computing')]")
	  WebElement science;
	
	  
	//click on general info
	  @FindBy(xpath="//a[contains(text(),'General Information')]")
	  WebElement generalinfo;
	
	
	//click on description
	  @FindBy(xpath="//textarea[@name='ctlTemplate$regMainBody$ctlCategoryInfo$txtDescription']")
	  WebElement description;
	
	//click on description
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_btnSubmit']")
	  WebElement submit;
	
	
	
	public SearchCategoryPage() {
		PageFactory.initElements(driver, this);
		 
  }
	
	 public SearchCategoryPage searchCategory(String desc) throws InterruptedException {
	
	
	
		//Resource
			driver.findElement(By.xpath("//a[@id='ctlTemplate_regLeftNav_ctlMenuUser_mnuUser_MenuSection15_SectionHeader']")).click();
			  Thread.sleep(3000); 
			  
			  JavascriptExecutor js=(JavascriptExecutor)driver;
		       js.executeScript("window.scrollBy(0,2000)");
		       System.out.println("scrolled Down");
		       Thread.sleep(2000);
	     
	          //search category
		       driver.findElement(By.xpath("//a[@id='ctlTemplate_regLeftNav_ctlMenuUser_mnuUser_MenuSection15_SectionItemsRepeater_ctl02_SectionItem']")).click();
				  Thread.sleep(3000); 
	
				  
				  search.click();
				  Thread.sleep(2000);
				  science.click();
				  Thread.sleep(2000);
				  generalinfo.click();
				  Thread.sleep(2000);
				  description.clear();
				  description.sendKeys(desc);
				  Thread.sleep(2000);
				  
				  submit.click();
				  
				  
				  
				  
				  
				  
				  
	
return new SearchCategoryPage();	
}
}