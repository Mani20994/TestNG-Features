package com.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lati.base.TestBase;

public class AddOrganisationPage extends TestBase {

	
	//Language
	@FindBy(xpath="//select[@name='ctlTemplate$regMainBody$ctlOrgGeneralInfo$ctlTemplate_regMainBody_ctlOrgGeneralInfo_ctlPageLanguage_LanguageDropDown']")
	  WebElement language;
	
	//organisation code
	@FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlOrgGeneralInfo_txtOrgCode']")
	  WebElement organisationcode;
	
	//Organisation name
	@FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlOrgGeneralInfo_txtName']")
	  WebElement organisationname;
	
	//effective date
	@FindBy(xpath="//dd[@id='ctlTemplate_regMainBody_ctlOrgGeneralInfo_Dd5']//img[@class='calButton']")
	  WebElement calenderclick ;
	
	//click on next month
	@FindBy(xpath="//div[@class='next']")
	  WebElement Next ;

	
	//select date
	@FindBy(xpath="//div[@class='day day4'][contains(text(),'14')]")
	  WebElement selectdate;
	
	//End date
	@FindBy(xpath="//dd[@id='ctlTemplate_regMainBody_ctlOrgGeneralInfo_Dd7']//img[@class='calButton']")
	  WebElement clickoncalender ;
	
	//click on next month
	@FindBy(xpath="//div[@class='next']")
	  WebElement next;
	
	//select date
	@FindBy(xpath="//div[@class='day day0'][contains(text(),'31')]")
	  WebElement clickdate;
	
	//Type
	@FindBy(xpath="//select[@id='ctlTemplate_regMainBody_ctlOrgGeneralInfo_lstBusinessOrgTypeSelect']")
	  WebElement type;
	
	
	/*//submit
	@FindBy(xpath="//input[@id='ctlTemplate_regMainBody_btnSubmit']")
	  WebElement submit ;
	*/
	
	
	 public AddOrganisationPage() {
			PageFactory.initElements(driver, this);
			 
	  }
public AddOrganisationPage clickOnAddOrganisation(String organcode,String organname,String typ) throws InterruptedException {
		
		//Organisation
		driver.findElement(By.xpath("//a[@id='ctlTemplate_regLeftNav_ctlMenuUser_mnuUser_MenuSection13_SectionHeader']")).click();
		  Thread.sleep(3000);
		
		 
		//Add Organisation
		  driver.findElement(By.xpath("//a[@id='ctlTemplate_regLeftNav_ctlMenuUser_mnuUser_MenuSection13_SectionItemsRepeater_ctl01_SectionItem']")).click();
		  Thread.sleep(3000);
		  
		  
		  language.click();
		  Thread.sleep(2000);
		  organisationcode.sendKeys(organcode);
		  Thread.sleep(2000);
		  organisationname.sendKeys(organname);
		  Thread.sleep(2000);
		  calenderclick .click();
		  Thread.sleep(2000);
		  Next.click();
		  Thread.sleep(2000);
		  selectdate.click();
		  Thread.sleep(2000);
		  clickoncalender.click();
		  Thread.sleep(2000);
		  next.click();
		  Thread.sleep(2000);
		  
		  clickdate.click();
		  Thread.sleep(2000);
		  type.sendKeys(typ);
		  Thread.sleep(2000);
		  
		  //primary contact
		  driver.findElement(By.xpath("//a[@id='ctlTemplate_regMainBody_ctlOrgGeneralInfo_ctlPrimaryContact_lnkPicker']")).click();
		  Thread.sleep(2000);
		  
		  //window handle
	      String parent=driver.getWindowHandle();
	    // This will return the number of windows opened by Webdriver and will return Set of Strings
	     Set<String>s1=driver.getWindowHandles();
	     //Now we will iterate using Iterator
	    Iterator<String>I1=s1.iterator();

	    while(I1.hasNext())
	    {
	     String child_window=I1.next();

	    //Here we will compare if parent window is not equal to child window then we will close

	   if(!parent.equals(child_window))
	   {
	   driver.switchTo().window(child_window);

	   System.out.println(driver.switchTo().window(child_window).getTitle());
	   
	   JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(0,2000)");
       System.out.println("scrolled Down");
       Thread.sleep(2000);
		  
		  
	   //search
		  driver.findElement(By.xpath("//input[@value='Search']")).click();
		  Thread.sleep(3000);
		  
		  
	//Add
	 driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_ctlUserList_grdDataGrid_ctl02_lnkAdd']")).click();
      Thread.sleep(3000);
		 
		  
    //switch to parent window
	     driver.switchTo().window(parent);
		  
		  
	   //Parent Organisation
		  driver.findElement(By.xpath("//a[@href='javascript:ctlTemplate_regMainBody_ctlOrgGeneralInfo_rptOrganizationParents_ctl00_ctlOrganizationParent_Launch();']")).click();
		  Thread.sleep(3000);
		  
		  
		  
		  //window handle
	      String parent1=driver.getWindowHandle();
	    // This will return the number of windows opened by Webdriver and will return Set of Strings
	     Set<String>s11=driver.getWindowHandles();
	     //Now we will iterate using Iterator
	    Iterator<String>I11=s11.iterator();

	    while(I11.hasNext())
	    {
	     String child_window1=I11.next();

	    //Here we will compare if parent window is not equal to child window then we will close

	   if(!parent1.equals(child_window1))
	   {
	   driver.switchTo().window(child_window1);

	   System.out.println(driver.switchTo().window(child_window1).getTitle());
	   
		  //Search
	   driver.findElement(By.xpath("//input[@value='Search']")).click();
		  Thread.sleep(3000);
		  
		  //select
		  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_ctlOrgList_grdOrgList_ctl03_lnkAdd']")).click();
		  Thread.sleep(3000);
		  
		  
		//switch to parent window
		     driver.switchTo().window(parent1);
		     
		     JavascriptExecutor js1=(JavascriptExecutor)driver;
		       js1.executeScript("window.scrollBy(0,2000)");
		       System.out.println("scrolled Down");
		       Thread.sleep(2000);
		     
		     
			  //submit
		     driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_btnSubmit']")).click();
			  Thread.sleep(3000);
		     
		  
	   }
	    }
	   }
	   
	    }
		  
		  
		return new AddOrganisationPage();
		 
	
}
}
	  