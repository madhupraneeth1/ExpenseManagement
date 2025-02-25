package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.AppiumBy;
import pages.BaseClass;
import pages.Common;
import pages.Loginpage;

public class T61 extends BaseClass {

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
        Common.selectVendor("Radisson");
        Common.location("paris");
        Thread.sleep(2000);
        
        WebElement selectLocation = driver.findElement(By.xpath("//*[contains(@text, 'Paris')]"));
        if(selectLocation.isDisplayed()){
        	selectLocation.click();
        }
        
        Common.selectPurpose("Marketing");
        
        WebElement bookingAgent = driver.findElement(By.xpath("//*[contains(@text, 'BOOKING AGENT')]"));
        if(bookingAgent.isDisplayed()){
        	bookingAgent.click();
        	Thread.sleep(1000);
        	WebElement selectBookingAgent = driver.findElement(By.xpath("//*[contains(@text, 'Other')]"));
            if(selectBookingAgent.isDisplayed()){
            	selectBookingAgent.click();
            	Thread.sleep(1000);
        }}
		
		WebElement hotelClassofService = driver.findElement(By.xpath("//*[contains(@text, 'HOTEL CLASS OF SERVICE')]"));
        if(hotelClassofService.isDisplayed()){
        	hotelClassofService.click();
        	Thread.sleep(1000);
        	WebElement selectHotelClass = driver.findElement(By.xpath("//*[contains(@text, 'Single')]"));
            if(selectHotelClass.isDisplayed()){
            	selectHotelClass.click();
            	Thread.sleep(1000);
        }}
        
        Common.selectPaymentType("Company Paid");
        	
        // Add itemizations
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Itemization"+"\").instance(0))"));
        
	    WebElement itemization = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
	    if(itemization.getText().equals("0")) {
	    	itemization.click();
	    }
	    
	    verifyItemizationScreen();
	    addItemization();
	    
	    WebElement itemization1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
	    if(itemization1.getText().equals("1"))
	      {
	    	itemization1.click();
	    	Thread.sleep(2000);
	      }
	    
	    WebElement itemizationExpense = driver.findElement(By.xpath("//*[contains(@text, 'Entertainment')]"));
	    itemizationExpense.click();
	    Thread.sleep(1000);
	    
	    verifyItemizationExpenseDetails();
	    
	    Common.clickSave();
	    Common.someFieldsNeedReview();
	    Common.giveExplanation("ok");
	    Thread.sleep(1000);
	    Common.saveExplanation();
	    
	    Common.clickSave();
	    Thread.sleep(2000);
	    
	    Loginpage.logout();
	    
	    System.out.println("Testcase61 is pass");
		
    }
    
    public static void verifyItemizationScreen() throws InterruptedException {
    	WebElement back =driver.findElement(By.id("com.infor.hl.xm.dev:id/back"));
        if (back.isDisplayed()) {
        	WebElement plus = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_add"));
            if (plus.isDisplayed()) {
           	    WebElement totalItemized = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/total_itemized\" and @text=\"$0.00\"]"));
                if (totalItemized.isDisplayed()) {
               	    WebElement amountLeft = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/amount_left\" and @text=\"$20.00\"]"));
           	        if(amountLeft.isDisplayed()) {
           	    	   WebElement noItemizations = driver.findElement(By.xpath("//*[contains(@text, 'No Itemizations')]"));
               	       if(noItemizations.isDisplayed()) {
               	    	   WebElement quickItemization = driver.findElement(By.xpath("//*[contains(@text, 'Quick Itemization')]"));
                   	       if(quickItemization.isDisplayed()) {
                   	    	  WebElement save = driver.findElement(By.xpath("//*[contains(@text, 'Save')]"));
                    	      if(save.isDisplayed()) {
                    	    	plus.click();
                    	    	Thread.sleep(2000);
     }}}}}}}}	   
    
    public static void addItemization() throws InterruptedException {
    	WebElement quickitemization =driver.findElement(By.xpath("//*[contains(@text, 'Quick Itemization')]"));
        if (quickitemization.isDisplayed()) {
        	WebElement addsingleitem = driver.findElement(By.xpath("//*[contains(@text, 'Add Single Item')]"));
            if (addsingleitem.isDisplayed()) {
            	 quickitemization.click();
            	 Thread.sleep(2000);
            	 WebElement additemization = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_itemization"));
         		 additemization.click();
         		 Thread.sleep(2000);
         		
         		 Common.selectExpenseType("Entertainment");
         		 Thread.sleep(2000);
         		
         		 WebElement amount1 = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.infor.hl.xm.dev:id/amount\" and @text=\"$0.00\"]"));
         		 amount1.click();
         		 amount1.sendKeys("20");
         		 Thread.sleep(2000);
         		
         		 WebElement back = driver.findElement(By.id("com.infor.hl.xm.dev:id/delete_button"));
         		 back.click();
         		 driver.navigate().back();
         		 Thread.sleep(2000);
         		
         		 Common.clickSave();
         		 
         		 WebElement entertainment = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/title\" and @text=\"Entertainment\"]"));
         		 entertainment.click();
         		 Thread.sleep(2000);
         		 
         		 WebElement guests = driver.findElement(By.xpath("//*[contains(@text, 'GUESTS')]"));
         		 guests.click();
         		 Thread.sleep(2000);
         		 
         		 WebElement addSelf = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_addself"));
         		 addSelf.click();
         		 Thread.sleep(1000);
         		 
         		 Common.clickBack();
         		 Common.clickSave();
         		 Common.clickSave();
         		 Thread.sleep(2000);	
            }
        }   
    }
    
    public static void verifyItemizationExpenseDetails() throws InterruptedException {
    	WebElement itemizationAmount =driver.findElement(By.xpath("//*[contains(@text, '$20.00')]"));
        if (itemizationAmount.isDisplayed()) {
        	WebElement itemizationVendor = driver.findElement(By.xpath("//*[contains(@text, 'Radisson')]"));
            if (itemizationVendor.isDisplayed()) {
           	    WebElement itemizationLocation = driver.findElement(By.xpath("//*[contains(@text, 'Paris')]"));
                if (itemizationLocation.isDisplayed()) {
               	    WebElement itemizationPurpose = driver.findElement(By.xpath("//*[contains(@text, 'Marketing')]"));
           	        if(itemizationPurpose.isDisplayed()) {
           	    	   WebElement itemizationPaymenttype = driver.findElement(By.xpath("//*[contains(@text, 'Company Paid')]"));
               	       if(itemizationPaymenttype.isDisplayed()) {
               	    	   WebElement itemizationReimburse = driver.findElement(By.xpath("//*[contains(@checked, 'false')]"));
                   	       if(itemizationReimburse.isDisplayed()) {
                   	    	  WebElement itemizationNote = driver.findElement(By.xpath("//*[contains(@text, 'Optional')]"));
                    	      if(itemizationNote.isDisplayed()) {
                    	    	  System.out.println("Fields in Itemization taken values from original Expense line"); 
                    	    	  Common.clickSave();
                    	    	  Common.clickSave();
                    	    	  Thread.sleep(2000);
      }}}}}}}}             	    	   
}