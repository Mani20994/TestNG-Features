package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lati.base.TestBase;

public class SearchOrganisationPage extends TestBase {

	
	 /*//Name
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_pnlSearch_txtName']")
	  WebElement name;
	
	  //code
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_pnlSearch_txtCode']")
	  WebElement code;
	  
	  //Type
	  @FindBy(xpath="//select[@id='ctlTemplate_regMainBody_pnlSearch_lstBusinessOrgTypeSelect']")
	  WebElement type;
	  */
	  //Search
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_pnlSearch_btnSearch']")
	  WebElement search;
	  
	  //View/edit
	  @FindBy(xpath="//a[@id='ctlTemplate_regMainBody_ctlOrgList_grdOrgList_ctl08_lnkOrgAction']")
	  WebElement edit;
	  
	  //general information
	  @FindBy(xpath="//a[contains(text(),'General Information')]")
	  WebElement geninfo;
	  
	  //code
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlOrgGeneralInfo_txtOrgCode']")
	  WebElement Code;
	
	
	  
	  //Name
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlOrgGeneralInfo_txtName']")
	  WebElement Name;
	
	 /* //End Date
	  @FindBy(xpath="/html[1]/body[1]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[3]/fieldset[1]/dl[6]/dd[1]/img[1]")
	  WebElement calenderclick;
	
	  //click on next month
	  @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]")
	  WebElement next;
	
	  //click on date
	  @FindBy(xpath="//div[@class='day day0'][contains(text(),'31')]")
	  WebElement clickdate;*/

	  
	  //submit button
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_btnSubmit']")
	  WebElement submit;
	
	
	public SearchOrganisationPage() {
		PageFactory.initElements(driver, this);
		 
  }
	
	public SearchOrganisationPage clickOnSearchOrganisation(String cde,String nme) throws InterruptedException {
		
		
		//Organisation
				driver.findElement(By.xpath("//a[@id='ctlTemplate_regLeftNav_ctlMenuUser_mnuUser_MenuSection13_SectionHeader']")).click();
				  Thread.sleep(3000);
				  
		//Search organisation
				  driver.findElement(By.xpath("//a[@id='ctlTemplate_regLeftNav_ctlMenuUser_mnuUser_MenuSection13_SectionItemsRepeater_ctl00_SectionItem']")).click();
				  Thread.sleep(3000);
		
				  
				  
				  
				  JavascriptExecutor js=(JavascriptExecutor)driver;
			       js.executeScript("window.scrollBy(0,2000)");
			       System.out.println("scrolled Down");
			       Thread.sleep(2000);
		/*name.sendKeys(nm);
		Thread.sleep(2000);
	
		 code.sendKeys(cd);
		 Thread.sleep(2000);
		
		 type.sendKeys(tp);
		 Thread.sleep(2000);*/
		 search.click();
		 Thread.sleep(2000);
		 edit.click();
		 Thread.sleep(2000);
		 geninfo.click();
		 Thread.sleep(2000);
		 Code.clear();
		 Code.sendKeys(cde);
		 Thread.sleep(2000);
		 Name.clear();
		 Name.sendKeys(nme);
		 Thread.sleep(2000);
		 JavascriptExecutor js1=(JavascriptExecutor)driver;
	       js1.executeScript("window.scrollBy(0,2000)");
	       System.out.println("scrolled Down");
	       Thread.sleep(2000);
		 /*calenderclick.click();
		 Thread.sleep(2000);
		 next.click();
		 Thread.sleep(2000);
		 clickdate.click();
		 Thread.sleep(2000);*/
		 submit.click();
		 
		 
		 
		return new SearchOrganisationPage();
	}
	
}
