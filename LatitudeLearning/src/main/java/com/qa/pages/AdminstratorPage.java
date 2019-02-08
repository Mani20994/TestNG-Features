package com.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lati.base.TestBase;

public class AdminstratorPage extends TestBase{
	static AdminstratorPage administrationPage;
	
	/*//organisation
	  @FindBy(xpath="//a[contains(text(),'Choose Organizations')]")
	static
	  WebElement Organisation;
	
	 //search
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlSearchList_ctlSearchList_ctlSearchPanel_btnSearch']")
	static
	  WebElement Search;

	  //Click on Add
	  @FindBy(xpath="//input[@value='Add']")
	static
	  WebElement Add;
	
	  //checkout
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlBasket_cmdCheckout']")
	static
	  WebElement checkout;
*/
	 //code
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlCourseGeneralInfoEdit_ctl01_txtCode']")
	static
	  WebElement code;

	   //Name
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlCourseGeneralInfoEdit_ctl01_ttName']")
	static
	  WebElement name;
	
	  //Tuition
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlCourseGeneralInfoEdit_ctl01_ctlCostsList_ctl00_txtAmount']")
	static
	  WebElement tuition ;
	
	  //Description
	  @FindBy(xpath="//textarea[@id='ctlTemplate_regMainBody_ctlCourseGeneralInfoEdit_ctl01_ttDescription']")
	static
	  WebElement description ;
	
	  //targeted learners
	  @FindBy(xpath="//textarea[@id='ctlTemplate_regMainBody_ctlCourseGeneralInfoEdit_ctl01_ttAudience']")
	static
	  WebElement targetedlearners;
	
	  //hours
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlCourseGeneralInfoEdit_ctl01_txtDuration']")
	static
	  WebElement hours ;
	  
	  
	  //Delivery method
	  @FindBy(xpath="//select[@id='ctlTemplate_regMainBody_ctlCourseGeneralInfoEdit_ctl01_lstDeliveryMethod']")
	static
	  WebElement deliverymethod ;
	  
	  //major
	  
	  @FindBy(xpath="//select[@id='ctlTemplate_regMainBody_ctlCourseGeneralInfoEdit_ctl01_lstCourseMajor']")
		static
		  WebElement major ;
		  
	  //Approval Method
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlCourseGeneralInfoEdit_ctl01_lstApprovalRequired_0']")
	static
	  WebElement approvalmethod ;
	  
	  
	  //Course completion certificate
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlCourseGeneralInfoEdit_ctl01_lstCourseCompletionCertificate_0']")
	static
	  WebElement  coursecompletion;
	  
	 /* //choose resource
	  @FindBy(xpath="//a[@id='ctlTemplate_regMainBody_ctlCourseGeneralInfoEdit_ctl01_ctlResourcePicker_lnkPicker']")
	static
	  WebElement  chooseresource;
	  
	  
	  //click on search
	  
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlResourceList_ctlSearchList_ctlSearchPanel_btnSearch']")
	static
	  WebElement  search;
	  
	  //click on Add
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlResourceList_ctlSearchList_ctlSearchList_Results_ctl01_lnkAdd']")
	static
	  WebElement  add;
	  
	  //checkout
	  @FindBy(xpath="//input[@value='Check Out']")
	static
	  WebElement checkout1;*/
	  
	  /*//click on plus icon
	  @FindBy(xpath="//img[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_plusMinusImage']")
		static
		  WebElement plus;
	  //click on language
	  @FindBy(xpath="//select[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_ctlPageLanguage_LanguageDropDown']")
		static
		  WebElement language;
	  
	  //Notes
	  @FindBy(xpath="//textarea[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_ttNotes']")
		static
		  WebElement notes;
	  
	  
	//Course Display date
	  @FindBy(xpath="//fieldset[@id='additionalInfoFields']//dl[3]//dd[1]//img[1]")
	static
	  WebElement displaydate ;
	  
	  //click display date
	  @FindBy(xpath="//div[@class='day day6'][contains(text(),'9')]")
	static
	  WebElement clickdisplaydate;
	  */
	  //Enrollment Open date
	 /* @FindBy(xpath="//dl[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_dlOpenDateContainer']//img[@class='calButton']")
	static
	  WebElement  opendate;
	  
	  //click open date
	  @FindBy(xpath="//div[contains(text(),'11')]")
	static
	  WebElement clickopendate;
	  
	  
	  //Enrollment close date
	  @FindBy(xpath="//dl[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_dlCloseDateContainer']//img[@class='calButton']")
	static
	  WebElement closedate;
	  //click to next month
	  @FindBy(xpath="//div[@class='next']")
		static
		  WebElement  nextmonth;
	  
	  @FindBy(xpath="//div[contains(text(),'16')]")
		static
		  WebElement  clickonclosedate;
	  
	  //course hide date
	  @FindBy(xpath="//fieldset[@id='additionalInfoFields']//dl[6]//dd[1]//img[1]")
		static
		  WebElement hidedate ;
		  
		  @FindBy(xpath="//div[contains(text(),'25')]")
			static
			  WebElement clickhidedate;
	  
	  //calculation date
		  @FindBy(xpath="//dl[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_dlCalculationDateContainer']//img[@class='calButton']")
			static
			  WebElement caldate ;
			  
			  @FindBy(xpath="//div[contains(text(),'15')]")
				static
				  WebElement clickcaldate;
		  
	  
	  
	  
	  //Enrollment restriction
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_lstRetakeRestrictionType_0']")
	static
	  WebElement restriction;
	  
	//Accumulate credit
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_lstAccumulateCredit_0']")
	static
	  WebElement credit;
	  
	  
	  //Instructional language
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_lstInstructionalLanguage_7']")
	static
	  WebElement language1;
	  
	  //Add course
	  @FindBy(xpath="//input[@id='ctlTemplate_regMainBody_btnSubmit']")
	static
	  WebElement addcourse;
	  */
	  
	public AdminstratorPage() {
		PageFactory.initElements(driver, this);
		 
		}
	public static  AdminstratorPage clickOnAddCourse(String cod,String nm,String tut,String desc ,String tarle,String hr,String majr,String delmet) throws InterruptedException {
		
		//Course
		  driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/span[2]/div[9]/a[1]")).click();
		  Thread.sleep(3000);
		  //Add Course
		  driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/span[2]/div[10]/div[2]/a[1]")).click();
		  Thread.sleep(3000);

		
		  //organisation
		  driver.findElement(By.xpath("//a[contains(text(),'Choose Organizations')]")).click();
		  Thread.sleep(3000);
		  
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
	   
	   //search
		  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_ctlSearchList_ctlSearchList_ctlSearchPanel_btnSearch']")).click();
		  Thread.sleep(3000);
		  
		  //Add
		  driver.findElement(By.xpath("//input[@value='Add']")).click();
		  Thread.sleep(3000);
		  
		  //checkout
		  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_ctlBasket_cmdCheckout']")).click();
		  Thread.sleep(3000);
		  
		  //switch to parent window
		     driver.switchTo().window(parent);
		     
		     
		     code.sendKeys(cod);
				Thread.sleep(3000);
				name.sendKeys(nm);
				Thread.sleep(3000);
				 tuition.sendKeys(tut);
					Thread.sleep(3000);
				 description.sendKeys(desc);
					Thread.sleep(3000);
				 targetedlearners.sendKeys(tarle);
					Thread.sleep(3000);
				 hours.sendKeys(hr);
					Thread.sleep(3000);
					major.sendKeys(majr);
					Thread.sleep(3000);
				 
				 deliverymethod.sendKeys(delmet);
					Thread.sleep(3000);
					
				 approvalmethod.click();
					Thread.sleep(3000);
				 coursecompletion.click();
					Thread.sleep(3000);
		  
		     //Add resources
		     driver.findElement(By.xpath("//a[@id='ctlTemplate_regMainBody_ctlCourseGeneralInfoEdit_ctl01_ctlResourcePicker_lnkPicker']")).click();
			  Thread.sleep(3000);
		  
			//window handle
		      String parent1=driver.getWindowHandle();
		    // This will return the number of windows opened by Webdriver and will return Set of Strings
		     Set<String>s11=driver.getWindowHandles();
		     //Now we will iterate using Iterator
		    Iterator<String>I2=s11.iterator();

		    while(I2.hasNext())
		    {
		     String child_window1=I2.next();

		    //Here we will compare if parent window is not equal to child window then we will close

		   if(!parent.equals(child_window1))
		   {
		   driver.switchTo().window(child_window1);

		   System.out.println(driver.switchTo().window(child_window1).getTitle());
		  
		   //Search
		   
		   driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_ctlResourceList_ctlSearchList_ctlSearchPanel_btnSearch']")).click();
			  Thread.sleep(3000);
		   
			  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_ctlResourceList_ctlSearchList_ctlSearchList_Results_ctl01_lnkAdd']")).click();
			  Thread.sleep(3000);
			  
			  driver.findElement(By.xpath("//input[@value='Check Out']")).click();
			  Thread.sleep(3000);
		   
			//switch to parent window
			     driver.switchTo().window(parent1);
				  
		   //Plus
		 driver.findElement(By.xpath("//img[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_plusMinusImage']")).click();
		  Thread.sleep(3000);
			     
		 //Language
		  driver.findElement(By.xpath("//select[@name='ctlTemplate$regMainBody$pnlCourseAdditionalInfo$ctlCourseAdditionalInfoEdit$ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_ctlPageLanguage_LanguageDropDown']")).click();
		  Thread.sleep(3000);
		  
		  //Notes
		  driver.findElement(By.xpath("//textarea[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_ttNotes']")).sendKeys("Notes for Students");
		  Thread.sleep(3000);
		  
		  /*
		  JavascriptExecutor js=(JavascriptExecutor)driver;
	       js.executeScript("window.scrollBy(0,2000)");
	       System.out.println("scrolled Down");
	       Thread.sleep(2000);
		 */
		  
		  
		  //Display date
		  driver.findElement(By.xpath("//fieldset[@id='additionalInfoFields']//dl[3]//dd[1]//img[1]")).click();
		  Thread.sleep(3000);
		  
		  //click display date
		  driver.findElement(By.xpath("//div[contains(text(),'12')]")).click();
		  Thread.sleep(3000);
		  
		  //Enrollment open date
		  driver.findElement(By.xpath("//dl[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_dlOpenDateContainer']//img[@class='calButton']")).click();
		  Thread.sleep(3000);
		  
		  
		  //click enrollment open date
		  driver.findElement(By.xpath("//div[contains(text(),'15')]")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//dl[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_dlCloseDateContainer']//img[@class='calButton']")).click();
		  Thread.sleep(3000);
			     
		  driver.findElement(By.xpath("//div[@class='next']")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//div[contains(text(),'16')]")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//fieldset[@id='additionalInfoFields']//dl[6]//dd[1]//img[1]")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//div[contains(text(),'25')]")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//dl[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_dlCalculationDateContainer']//img[@class='calButton']")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//div[contains(text(),'15')]")).click();
		  Thread.sleep(3000);
		  /*
		  //days for student to complete
		  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_txtCoursePastDuedate']")).sendKeys("28/03/2019");
		  Thread.sleep(3000);
		  
		  //
		  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_txtCourseDuedateReminder']")).sendKeys("10");
		  Thread.sleep(3000);*/
		  
		  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_txtTranscriptExpirationDays']")).sendKeys("15");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_txtTranscriptExpirationReminder']")).sendKeys("15");
		  Thread.sleep(3000);
		  
		  
		  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_lstRetakeRestrictionType_0']")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_lstAccumulateCredit_0']")).click();
		  Thread.sleep(3000);
			   
		  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_txtCredit']")).sendKeys("10");
		  Thread.sleep(3000);
			     
			     
		  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_lstInstructionalLanguage_7']")).click();
		  Thread.sleep(3000);
			     
		  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_txtVersionNumber']")).sendKeys("1");
		  Thread.sleep(3000);
			     
		  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_btnSubmit']")).click();
		  Thread.sleep(3000);
		
}
}

} 
}
		return new AdminstratorPage();
}
	
	
}
