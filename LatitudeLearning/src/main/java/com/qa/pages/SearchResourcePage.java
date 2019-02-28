package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lati.base.TestBase;

public class SearchResourcePage extends TestBase {

	
		  //Seach Keyword
		  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlResourceList_ctlSearchList_ctlSearchPanel_ctlFilter_txtKeyword']")
		  WebElement keyword;

		  //status
		  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlResourceList_ctlSearchList_ctlSearchPanel_ctlFilter_rblActive_0']")
		  WebElement status;
		  
		  //Type
		  @FindBy(xpath="//select[@name='ctlTemplate$regMainBody$ctlResourceList$ctlSearchList$ctlSearchPanel$ctlFilter$lstResourceType']")
		  WebElement Type;
		  
		  //Category
		  @FindBy(xpath="//select[@id='ctlTemplate_regMainBody_ctlResourceList_ctlSearchList_ctlSearchPanel_ctlFilter_lstResourceCategory']")
		  WebElement category;
		  
		  
		  //click on search
		  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlResourceList_ctlSearchList_ctlSearchPanel_btnSearch']")
		  WebElement search;
		  
		  
		  //click on cloud computing
		  @FindBy(xpath="//a[contains(text(),'Web Design')]")
		  WebElement Webdesign;
		  
		  //click on general information
		  
		  @FindBy(xpath="//a[@id='ctlTemplate_regMainBody_ctlResourceTabs_lnkGeneralInfo']")
		  WebElement geninformation;
		  
		  
		  //DEscription
		  @FindBy(xpath="/html[1]/body[1]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[2]/fieldset[1]/dl[5]/dd[1]/textarea[1]")
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
		  
		  public SearchResourcePage() {
				PageFactory.initElements(driver, this);
				 
		  }
			
			public SearchResourcePage clickOnSearchResource(String keywd,String tp,String descp) throws InterruptedException {
		 		
		 		//Resource
		 		driver.findElement(By.xpath("//a[@id='ctlTemplate_regLeftNav_ctlMenuUser_mnuUser_MenuSection15_SectionHeader']")).click();
		 		  Thread.sleep(3000); 
		     
		 		 JavascriptExecutor js=(JavascriptExecutor)driver;
			       js.executeScript("window.scrollBy(0,2000)");
			       System.out.println("scrolled Down");
			       Thread.sleep(2000);
		     
		 		 //search Resource
				  
				  driver.findElement(By.xpath("//a[contains(text(),'Search Resources')]")).click();
				  Thread.sleep(2000);
		  
				 
     keyword.sendKeys(keywd);
     Thread.sleep(2000);
     status.click();
     Thread.sleep(2000);
     Type.sendKeys(tp);
     Thread.sleep(2000);
     category.click();
     Thread.sleep(2000);
     search.click();
     Thread.sleep(2000);
     Webdesign.click();
     Thread.sleep(2000);
     geninformation.click();
     Thread.sleep(2000);
     Description.sendKeys(descp);
     Thread.sleep(2000);
     Startdate.click();
     Thread.sleep(2000);
     next.click();
     Thread.sleep(2000);
     month.click();
     Thread.sleep(2000);
     Enddate .click();
     Thread.sleep(2000);
     Next.click();
     Thread.sleep(2000);
     Month.click();
     JavascriptExecutor js1=(JavascriptExecutor)driver;
     js1.executeScript("window.scrollBy(0,2000)");
     System.out.println("scrolled Down");
     Thread.sleep(2000);
    
     Submit.click();
	return new SearchResourcePage(); 
     
	
}
}