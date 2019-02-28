package com.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lati.base.TestBase;

public class AddResourcePage extends TestBase{

	
	//Language
	 @FindBy(xpath="//select[@id='ctlTemplate_regMainBody_ctlResourceGeneralInfo_ctlTemplate_regMainBody_ctlResourceGeneralInfo_ctlPageLanguage_LanguageDropDown']")

		  WebElement Language;
	
	//Name
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlResourceGeneralInfo_txtName']")
	
	  WebElement Name;

	  //Type
	  @FindBy(xpath="//select[@id='ctlTemplate_regMainBody_ctlResourceGeneralInfo_lstResourceTypeSelect']")
	
	  WebElement type ;

	  //Description
	  @FindBy(xpath="//textarea[@id='ctlTemplate_regMainBody_ctlResourceGeneralInfo_txtDescription']")
	
	  WebElement description;

	
	  //Stsrt date
	  @FindBy(xpath="//dd[@id='ctlTemplate_regMainBody_ctlResourceGeneralInfo_Dd5']//img[@class='calButton']")
	
	  WebElement startdate;

	  
	  //click on next month
	  @FindBy(xpath="//div[@class='next']")
	
	  WebElement clicknextmonth;

	  
	  //provide date
	  @FindBy(xpath="//div[@class='body']//div//div[1]//div[1]//div[5]//div[5]")
	
	  WebElement providedate;

	  //End date
	  @FindBy(xpath="//dd[@id='ctlTemplate_regMainBody_ctlResourceGeneralInfo_Dd7']//img[@class='calButton']")
	
	  WebElement enddate;

	  //click next month
	  @FindBy(xpath="//div[@class='next']")
	
	  WebElement nextmonth;

	  //provide date
	  @FindBy(xpath="//div[@class='day day5'][contains(text(),'29')]")
	
	  WebElement clickdate;

	  //Contact Name
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlResourceDocument_txtContactName']")
	
	  WebElement contactname ;

	  //Contact Number
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlResourceDocument_txtContactNumber']")
	
	  WebElement contactnumber;

	  //submit
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_btnSubmit']")
		
		  WebElement submit;
	
	  
	  //Seach Keyword
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlResourceList_ctlSearchList_ctlSearchPanel_ctlFilter_txtKeyword']")
	  WebElement keyword;

	  //status
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlResourceList_ctlSearchList_ctlSearchPanel_ctlFilter_rblActive_2']")
	  WebElement status;
	  
	  //Type
	  @FindBy(xpath="//select[@id='ctlTemplate_regMainBody_ctlResourceList_ctlSearchList_ctlSearchPanel_ctlFilter_lstResourceType']")
	  WebElement Type;
	  
	  //Category
	  @FindBy(xpath="//select[@id='ctlTemplate_regMainBody_ctlResourceList_ctlSearchList_ctlSearchPanel_ctlFilter_lstResourceCategory']")
	  WebElement category;
	  
	  
	  //click on search
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlResourceList_ctlSearchList_ctlSearchPanel_btnSearch']")
	  WebElement search;
	  
	  
	  //click on cloud computing
	  @FindBy(xpath="//a[contains(text(),'Cloud Computing')]")
	  WebElement cloudcomputing;
	  
	  //click on general information
	  
	  @FindBy(xpath="//a[contains(text(),'General Information')]")
	  WebElement geninformation;
	  
	  
	  //DEscription
	  @FindBy(xpath="//textarea[@name='ctlTemplate$regMainBody$ctlResourceGeneralInfo$txtDescription']")
	  WebElement Description;
	  
	//Stsrt date
	  @FindBy(xpath="//dd[@id='ctlTemplate_regMainBody_ctlResourceGeneralInfo_Dd5']//img[@class='calButton']")
	  WebElement Startdate;
	  
	  @FindBy(xpath="//div[@class='next']")
	  WebElement next;
	  
	  @FindBy(xpath="//div[@class='day day5'][contains(text(),'29')]")
	  WebElement month;
	  
	  //End date
	  @FindBy(xpath="//dd[@id='ctlTemplate_regMainBody_ctlResourceGeneralInfo_Dd7']//img[@class='calButton']")
	  WebElement Enddate ;
	  
	  @FindBy(xpath="//div[@class='next']")
	  WebElement Next ;
	  
	  @FindBy(xpath="//div[@class='day day0'][contains(text(),'31')]")
	  WebElement Month;
	  
	  //click on submit
	  
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_btnSubmit']")
	  WebElement Submit;
	  
	
	public AddResourcePage() {
		PageFactory.initElements(driver, this);
		 
		}
	public AddResourcePage clickOnAddResource(String nam,String typ,String desc,String contname,String contnum) throws InterruptedException {
		
		//Resource
		driver.findElement(By.xpath("//a[@id='ctlTemplate_regLeftNav_ctlMenuUser_mnuUser_MenuSection15_SectionHeader']")).click();
		  Thread.sleep(3000);
		
		  JavascriptExecutor js=(JavascriptExecutor)driver;
	       js.executeScript("window.scrollBy(0,2000)");
	       System.out.println("scrolled Down");
	       Thread.sleep(2000);
		  
		//Add resource
		  driver.findElement(By.xpath("//a[@id='ctlTemplate_regLeftNav_ctlMenuUser_mnuUser_MenuSection15_SectionItemsRepeater_ctl01_SectionItem']")).click();
		  Thread.sleep(3000);
		 
		
	     Language.click();
	     Thread.sleep(3000);
	     Name.sendKeys(nam);
	     Thread.sleep(3000);
	     type.sendKeys(typ);
	     Thread.sleep(3000);
	     description.sendKeys(desc);
	     Thread.sleep(3000);
		
	     startdate.click();
	     
	     Thread.sleep(3000);
	     clicknextmonth.click();
	     Thread.sleep(3000);
	     providedate.click();
	     Thread.sleep(3000);
	     enddate.click();
	     Thread.sleep(3000);
	     nextmonth.click();
	     Thread.sleep(3000);
	     clickdate.click();
	     Thread.sleep(3000);
		
	     //upload file
	     WebElement upload=driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_ctlResourceDocument_ImageFile']"));
	     upload.sendKeys("E:\\Agile.docx");
	     Thread.sleep(3000);
	     
	     JavascriptExecutor js1=(JavascriptExecutor)driver;
	       js1.executeScript("window.scrollBy(0,2000)");
	       System.out.println("scrolled Down");
	       Thread.sleep(2000);
	     
	     contactname .sendKeys(contname);
	     Thread.sleep(3000);
	     contactnumber.sendKeys(contnum);
	     Thread.sleep(3000);
	     submit.click();
	     return  new AddResourcePage();
	}
	     
	     
		

	
}
