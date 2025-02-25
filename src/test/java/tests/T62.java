package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.AppiumBy;
import pages.BaseClass;
import pages.Common;
import pages.Loginpage;

public class T62 extends BaseClass {

    @SuppressWarnings("static-access")
	@Test
    public void dotest() throws InterruptedException {
    	
    	System.out.println("Added expense in ER asks for verification after saving the ER");
    	
    	// Login to the XM Application
        Loginpage.login("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX4", "jsmith", "p");
        
        // Create an expense
        Common.clickAdd();
        Common.clickStartExpense();
        Common.selectExpenseType("Car Rental");
        Common.enterAmount("20");
        Common.location("paris");
        Thread.sleep(2000);
        
        WebElement selectLocation = driver.findElement(By.xpath("//*[contains(@text, 'Paris')]"));
        if(selectLocation.isDisplayed()){
        	selectLocation.click();
        }
        
       // Common.selectPurpose("Other");
        Thread.sleep(2000);
        
/*        WebElement clickvendor = driver.findElement(By.xpath("//*[contains(@text, 'VENDOR')]"));
        if(clickvendor.isDisplayed()){
        	clickvendor.click();
        	Thread.sleep(2000);
        	WebElement selectVendor = driver.findElement(By.xpath("//*[contains(@text, 'Avis')]"));
            if(selectVendor.isDisplayed()){
            	selectVendor.click();
            	Thread.sleep(2000);
        }}
*/
        Common.selectVendor("Avis");
        
        WebElement bookingAgent = driver.findElement(By.xpath("//*[contains(@text, 'BOOKING AGENT')]"));
        if(bookingAgent.isDisplayed()){
        	bookingAgent.click();
        	Thread.sleep(2000);
        	WebElement selectBookingAgent = driver.findElement(By.xpath("//*[contains(@text, 'Other')]"));
            if(selectBookingAgent.isDisplayed()){
            	selectBookingAgent.click();
            	Thread.sleep(2000);
        }}
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                + ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + "CAR CLASS OF SERVICE" + "\").instance(0))"));
       	
		WebElement carClass = driver.findElement(By.xpath("//*[contains(@text, 'CAR CLASS OF SERVICE')]"));
        if(carClass.isDisplayed()){
        	carClass.click();
        	Thread.sleep(2000);
        	WebElement selectCarClass = driver.findElement(By.xpath("//*[contains(@text, 'Economy')]"));
            if(selectCarClass.isDisplayed()){
            	selectCarClass.click();
            	Thread.sleep(2000);
        }}
		Thread.sleep(2000);
		
		Common.clickSave();
        Common.clickAdd();
	    Common.clickStartReport();
	    Common.enterReportTitle("Testcase62");
	    Common.clickPurposeField();
	    Common.selectPurposeType("Other");
	    Common.clickNextButton();
	    Common.attachExpense("Avis");
	    Common.clickNextButton();
	    Common.clickSaveER();
	    Thread.sleep(2000);
	    Common.clickBack();
	    Common.clickReportsTab();
	    Common.openReport("Testcase62");
	    Common.openExpense("Avis");
	    Thread.sleep(2000);
	    Common.clickBack();
	    Thread.sleep(2000);
	    Common.clickBack();
	    Common.clickReportsTab();
	    Common.openReport("Testcase62");
	    Common.clickSubmitReport();
	    Thread.sleep(2000);
	    
	    Common.reportNeedReview();
	    Common.giveExplanation("ok");
	    Thread.sleep(1000);
	    Common.saveExplanation();
	    
	    Common.clickSubmitReport();
	    Common.clickDone();
	    
	    Loginpage.logout();
        
        Loginpage.loginAgain("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX4", "jjones", "p");
        System.out.println("Logging in with Jjones");
        
        Common.clickApprovalsTab();
        
        WebElement erApprovals = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_approval"));
        erApprovals.click();
        Thread.sleep(2000);
        
        Common.openReport("Testcase62");
        Common.ExpensesTab();
        Common.openExpense("Avis");
        
        WebElement amount = driver.findElement(By.xpath("//*[contains(@text, '20.00')]"));
        if (amount.isDisplayed()) {
           WebElement vendor =driver.findElement(By.xpath("//*[contains(@text, 'Avis')]"));
           if (vendor.isDisplayed()) {
           	   WebElement purpose = driver.findElement(By.xpath("//*[contains(@text, 'Other')]"));
               if (purpose.isDisplayed()) {
               	    WebElement bookingagent = driver.findElement(By.xpath("//*[contains(@text, 'Other')]"));
           	        if(bookingagent.isDisplayed()) {
           	    	   WebElement location = driver.findElement(By.xpath("//*[contains(@text, 'Paris')]"));
               	       if(location.isDisplayed()) {
               	    	driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
               	                + ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + "CAR CLASS OF SERVICE" + "\").instance(0))"));
               	       
               	    	   WebElement carclass = driver.findElement(By.xpath("//*[contains(@text, 'Economy')]"));
                   	       if(carclass.isDisplayed()) {
                   	    	   System.out.println("Testcase62 is Pass");
                   	    	   Common.clickBack();
                   	    	   Common.clickBack();
                   	    	   Common.clickBack();
               	       }
           	       }
           	    }
              }
           }
        }
        
        Loginpage.logout();
        
    }}
