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

public class Testcase79 extends BaseClass {
	
    @SuppressWarnings("static-access")
    @Test
	public void dotest() throws InterruptedException {

    	System.out.println("Verifying the Currency for Different users");
    	
    	// Login to the XM Application 
        Loginpage.login("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX4", "mwolf", "p");
        System.out.println("Verifying the Currency for Mwolf user");
        // Create an expense
        Common.clickAdd();
        Common.clickStartExpense();
        Common.selectExpenseType("Parking");
        
        Common.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
        WebElement mwolfCurrency = driver.findElement(By.id("com.infor.hl.xm.dev:id/currency_code"));
        if (mwolfCurrency.getText().equals("EUR")) 
        {
     	   System.out.println("Mwolf Currency is EURO");  
     	   Common.enterAmount("20");
           Common.clickSave();
           Thread.sleep(2000);
           Common.openExpense("Parking");
           Common.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
           WebElement mwolfCurrency1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/currency_code"));
           if (mwolfCurrency1.getText().equals("EUR")) 
           {
        	   System.out.println("Mwolf Currency is EURO");
               WebElement amount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
               if(amount.getText().equals("20.00"))
               {
      		      Common.clickSave();
      		      Thread.sleep(2000);
      		      Common.clickSave();
      		      Common.clickAdd();
      		      Common.clickStartReport();
      		      Common.enterReportTitle("Testcase79-1");
      		 
      		      WebElement saveAsDraft = driver.findElement(By.id("com.infor.hl.xm.dev:id/save_draft_button"));
      		      saveAsDraft.click();
      		      Thread.sleep(1000);
      		 
      		      Common.openReport("Testcase79-1");
         		  Thread.sleep(1000);
         		  WebElement totalAmount = driver.findElement(By.id("com.infor.hl.xm.dev:id/total_amount"));
         		  if(totalAmount.getText().equals("€0.00"))
         		  {
         			 WebElement addExpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_tv"));
            		 addExpense.click();
            		 Thread.sleep(1000);
            		 
            		 Common.clickCreateNew();
            		 Common.selectExpenseType("Fax");
            		 Common.enterAmount("20");
            		 Common.clickSave();
            		 Common.clickSaveER();
            		 Thread.sleep(2000);
          		 
            		 WebElement totalAmount1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/total_amount"));
              		 if(totalAmount1.getText().equals("€20.00"))
              		 {
              		    Common.clickBack();
              		    Thread.sleep(2000);
           		    
              		    WebElement currency =driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[2]"));
             	    	if(currency.getText().equals("20.0€")) 
             	    	{
             	    	  System.out.println("Mwolf currency is Euro every where");
             	    	  System.out.println("T79-Scenario 1 is pass");
             	    	  Common.clickProfileBtn();
             	          Common.clickLogout();
             	          Common.clickconfirm();
             	    	}}}}}
               else {
            	   Thread.sleep(2000);
            	   System.out.println("T79-scenario 1 is Fail");
            	   Common.clickBack();
            	   Thread.sleep(2000);
                   Common.clickProfileBtn();
                   Common.clickLogout();
                   Common.clickconfirm();
               }}
        else {
             System.out.println("T79-scenario 1 is Fail");
             Common.clickBack();
             Thread.sleep(2000);
             Common.clickBack();
      	     Thread.sleep(2000);
             Common.clickProfileBtn();
             Common.clickLogout();
             Common.clickconfirm();
               }       
        
        
    	// Login to the XM Application 
        Loginpage.loginAgain("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX4", "nheath", "p");
        System.out.println("Verifying the Currency for Nheath user");
        // Create an expense
        Common.clickAdd();
        Common.clickStartExpense();
        Common.selectExpenseType("Parking");
        Common.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
        WebElement nheathCurrency = driver.findElement(By.id("com.infor.hl.xm.dev:id/currency_code"));
        if (nheathCurrency.getText().equals("GBP")) 
        {
     	   System.out.println("Nheath Currency is POUND");  
     	   Common.enterAmount("15");
           Common.clickSave();
           Thread.sleep(2000);
           Common.openExpense("Parking");
           Common.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
           WebElement nheathCurrency1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/currency_code"));
           if (nheathCurrency1.getText().equals("GBP")) 
           {
        	   System.out.println("Nheath Currency is POUND");
               WebElement amount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
               if(amount.getText().equals("15.00"))
               {
      		      Common.clickSave();
      		      Thread.sleep(2000);
      		      Common.clickSave();
      		      Common.clickAdd();
      		      Common.clickStartReport();
      		      Common.enterReportTitle("Testcase79-2");
      		 
      		      WebElement saveAsDraft = driver.findElement(By.id("com.infor.hl.xm.dev:id/save_draft_button"));
      		      saveAsDraft.click();
      		      Thread.sleep(1000);
      		 
      		      Common.openReport("Testcase79-2");
         		  Thread.sleep(1000);
         		  WebElement totalAmount = driver.findElement(By.id("com.infor.hl.xm.dev:id/total_amount"));
         		  if(totalAmount.getText().equals("£0.00"))
         		  {
         			 WebElement addExpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_tv"));
            		 addExpense.click();
            		 Thread.sleep(1000);
            		 
            		 Common.clickCreateNew();
            		 Common.selectExpenseType("Fax");
            		 Common.enterAmount("16");
            		 Common.clickSave();
            		 Common.clickSaveER();
            		 Thread.sleep(2000);
          		 
            		 WebElement totalAmount1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/total_amount"));
              		 if(totalAmount1.getText().equals("£16.00"))
              		 {
              		    Common.clickBack();
              		    Thread.sleep(2000);
           		    
              		    WebElement currency =driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[2]"));
             	    	if(currency.getText().equals("16.0£")) 
             	    	{
             	    	  System.out.println("Nheath currency is Pound every where");
             	    	  System.out.println("T79-Scenario 2 is pass");
             	    	  Common.clickProfileBtn();
             	          Common.clickLogout();
             	          Common.clickconfirm();
             	    	}}}}}
               else {
            	   Thread.sleep(2000);
            	   System.out.println("T79-scenario 2 is Fail");
            	   Common.clickBack();
            	   Thread.sleep(2000);
                   Common.clickProfileBtn();
                   Common.clickLogout();
                   Common.clickconfirm();
               }}
        else {
             System.out.println("T79-scenario 2 is Fail");
             Common.clickBack();
             Thread.sleep(2000);
             Common.clickBack();
      	     Thread.sleep(2000);
             Common.clickProfileBtn();
             Common.clickLogout();
             Common.clickconfirm();
               }       
    }          	 
       
    public static void verifyMwolfCurrency()throws InterruptedException{
    	WebElement currencyCode = driver.findElement(By.id("com.infor.hl.xm.dev:id/currency_code"));
       if (currencyCode.getText().equals("EUR")) {
    	   System.out.println("Mwolf Currency is EURO");  
        }
       else {
    	   System.out.println("T79-scenario 1 is Fail");
    	   Common.clickBack();
    	   Thread.sleep(2000);
           Common.clickProfileBtn();
           Common.clickLogout();
           Common.clickconfirm();
       }    
}
    public static void verifyNheathCurrency()throws InterruptedException{
    	WebElement currencyCode = driver.findElement(By.id("com.infor.hl.xm.dev:id/currency_code"));
        if (currencyCode.getText().equals("GBP")) {
     	   System.out.println("Nheath Currency is POUND");  
         }
        else {
     	   System.out.println("T79-scenario 2 is Fail");
     	   Common.clickBack();
     	   Thread.sleep(2000);
            Common.clickProfileBtn();
            Common.clickLogout();
            Common.clickconfirm();
        }    
 }
}



