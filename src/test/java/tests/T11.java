package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.AppiumBy;
import pages.BaseClass;
import pages.Common;
import pages.Loginpage;

public class T11 extends BaseClass {

    @SuppressWarnings("static-access")
	@Test
    public void dotest() throws InterruptedException {
    	
    	// Login to the XM Application
        Loginpage.login("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX2", "jsmith", "p");
        
     // Create an expense
        Common.clickAdd();
        Common.clickStartExpense();
        Common.selectExpenseType("Hotel");
        Common.enterAmount("20");
        Common.selectVendor("Hilton");
        
     // Add itemizations
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Itemization"+"\").instance(0))"));
	    WebElement itemization = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
	    if(itemization.getText().equals("0"))
		{
		 System.out.println("Expense is itemizing");
		 itemization.click();
		   
	    Thread.sleep(3000);
	    
	    WebElement quickitemization = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_quick_itemizations"));
		quickitemization.click();
		Thread.sleep(2000);
		
		WebElement additemization = driver.findElement(By.id("com.infor.hl.xm.dev:id/itemization_add_container"));
		additemization.click();
		Thread.sleep(2000);
		
		Common.selectExpenseType("Laundry");
		Thread.sleep(2000);
		
		WebElement amount1 = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.infor.hl.xm.dev:id/amount\" and @text=\"$0.00\"]"));
		amount1.click();
		amount1.sendKeys("10");
		Thread.sleep(2000);
		
		WebElement back = driver.findElement(By.id("com.infor.hl.xm.dev:id/delete_button"));
		back.click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement additemization2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/itemization_add_container"));
		additemization2.click();
		Thread.sleep(2000);
		
		Common.selectExpenseType("Hotel: Other Charges");
		Thread.sleep(2000);
		
		WebElement amount2 = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.infor.hl.xm.dev:id/amount\" and @text=\"$0.00\"]"));
		amount2.click();
		amount2.sendKeys("10");
		Thread.sleep(2000);
		
		WebElement back1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/delete_button"));
		back1.click();
		driver.navigate().back();
		Thread.sleep(2000);
		
        Common.clickSave();
		Common.clickSave();
		}
	   
	    attachReceipt();
	    
	    Common.clickSave();
		Common.clickAdd();
		Common.clickStartReport();
	    Common.enterReportTitle("Testcase11");
	    Common.clickPurposeField();
	    Common.selectPurposeType("Business Development");
	    Common.clickNextButton();
	    Common.attachExpense("Hilton");
	    Common.clickNextButton();
	 //   Common.openExpense("Hilton");
	 //   Common.clickSave();
	    Common.clickSaveER();
	    Common.clickBack();
	    Common.clickBack();
	    
	    Common.clickReportsTab();
	    Common.openReport("Testcase11");
	    Common.openExpense("Hilton");
	    Thread.sleep(3000);
	    
	    driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Itemization"+"\").instance(0))"));
	    WebElement itemization1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
	    if(itemization1.getText().equals("2"))
	      {
	       System.out.println("Expense is itemized");
	       Thread.sleep(1000);
	       
/*	       itemization1.click();
	       
    	   WebElement item1 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/title\" and @text=\"Laundry\"]"));
    	   item1.click();
    	   Thread.sleep(1000);
    	   
    	   WebElement item1Amount = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/detail\" and @text=\"$10.00\"]"));
    	   item1Amount.click();
    	   Thread.sleep(1000);
    	   
    	   WebElement item1Amount1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount"));
    	   item1Amount1.click();
    	   item1Amount1.sendKeys("5");
    	   Thread.sleep(1000);
   		
    	   Common.clickSave();
    	   Common.clickSave();
    	   
    	   WebElement item2 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/title\" and @text=\"Hotel: Other Charges\"]"));
    	   item2.click();
    	   Thread.sleep(1000);
    	   
    	   WebElement item2Amount = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/detail\" and @text=\"$10.00\"]"));
    	   item2Amount.click();
    	   Thread.sleep(1000);
    	   
    	   WebElement item2Amount1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount"));
    	   item2Amount1.click();
    	   item2Amount1.sendKeys("15");
    	   Thread.sleep(1000);
   		
    	   Common.clickSave();
    	   
    	   WebElement item2Note = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/title\" and @text=\"Note\"]"));
    	   item2Note.click();
    	   item2Note.sendKeys("Hotel: Other Charges");
    	   Thread.sleep(1000);
    	   
    	   Common.clickSave();
    	   Common.clickSave();
    	   Common.clickSave();
*/	    
	       driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"VENDOR"+"\").instance(0))"));
	       Common.selectVendor("Radisson");
	       Common.clickSave();
	       Common.clickSaveER();
	       Common.clickBack();
	       System.out.println("Expense & itemization edited successfully");
	      }
	    else {
	    	System.out.println("Testcase 11 Failed");
        	Common.clickBack();
        	Thread.sleep(2000);
        	Common.clickProfileBtn();
            Common.clickLogout();
            Common.clickconfirm();
            driver.quit();
	    }
	    
	    Common.clickReportsTab();
	    Common.openReport("Testcase11");
	    Common.openExpense("Radisson");
	    
	    WebElement vendor =driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/title\" and @text=\"VENDOR\"]"));
    	if(vendor.getText().equals("Radisson")) 
    	{
    	  System.out.println("Edited ER saved successfully");
    	  WebElement itemization2 = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Itemization"+"\").instance(0))"));
    	  if(itemization2.getText().equals("2"))
          {
    	   System.out.println("Itemization Data is not missing when edit ER"); 
          }
    	  else {
  	    	System.out.println("Testcase 11 Failed");
          	Common.clickBack();
          	Thread.sleep(2000);
          	Common.clickProfileBtn();
            Common.clickLogout();
            Common.clickconfirm();
            driver.quit();
  	    }
    	} 
    	
    	Common.clickSave();
        Common.clickSaveER();
    	Common.clickSubmitReport();
    	Common.clickDone();
    	   
    	Common.clickReportsTab();
   	    Common.openReport("Testcase11");
   	    Common.openExpense("Radisson");
   	    Thread.sleep(2000);
   	    
   	    driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
   	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Itemization"+"\").instance(0))"));
   	    WebElement itemization3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
   	    if(itemization3.getText().equals("2"))
   	      {
   	       System.out.println("Testcase 11 Passed");
   	       Thread.sleep(1000);
   	      }
	    else {
	       System.out.println("Testcase 11 Failed");
     	   Common.clickBack();
     	   Thread.sleep(2000);
     	   Common.clickProfileBtn();
           Common.clickLogout();
           Common.clickconfirm();
           driver.quit();
	    }
   	   
   	   Common.clickBack();
   	   Common.clickBack();
   	   Common.clickProfileBtn();
       Common.clickLogout();
       Common.clickconfirm();
    	}
        public static void attachReceipt() throws InterruptedException {
        	Common.clickReceiptClip();
    		Common.clickTakeAPhoto() ;
    		Common.allowTakePictures();
    		Common.allowAccessMusic();
    		Common.allowAccessPhotos();
    		Common.allowNone();
    		Common.capture();
    		Common.clickSave();
		
			}
        
 /*       public static void openExpense(String expense) {
        	Common.clickByXpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/text_expense_name\" and @text= ]");
       }
 */       public static void openExpense(String expense) {
            WebElement element = driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                            + ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + expense + "\").instance(0))"));
            element.click();
}  }    