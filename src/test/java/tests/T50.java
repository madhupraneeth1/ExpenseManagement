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

public class Testcase50 extends BaseClass {

    @SuppressWarnings("static-access")
	@Test
    public void dotest() throws InterruptedException {
    	
    	System.out.println("Verify deleting/replacing receipts for expense");
    	
    	// Login to the XM Application
        Loginpage.login("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX2", "jsmith", "p");
        
        Common.clickReceiptsTab();
        WebElement plus = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_add"));
        plus.click();
        Common.clickTakeAPhoto();
        Common.allowTakePictures();
		Common.allowAccessMusic();
	    Common.allowAccessPhotos();
	    Common.capture();
        Thread.sleep(1000);
        
        WebElement selectImage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView"));
        selectImage.click();
        
        WebElement startNewExpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/new_expense"));
        startNewExpense.click();
        
        Common.selectExpenseType("Meals: Breakfast");
        Common.enterAmount("20");
        WebElement receiptsCount = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/receipt_clip_label\" and @text=\"1\"]"));
        if(receiptsCount.isDisplayed()) {
        	Common.clickReceiptClip();
        	verifyAttachedReceiptsLayout();
        }
        
        WebElement receiptImage = driver.findElement(By.id("com.infor.hl.xm.dev:id/receipt_image"));
	    if(receiptImage.isDisplayed()) {
	    	receiptImage.click();
	    }
        removeReceipt();
        
        WebElement touchOutSide = driver.findElement(By.id("com.infor.hl.xm.dev:id/touch_outside"));
        touchOutSide.click();
        
        WebElement attachedReceipts = driver.findElement(By.xpath("//*[contains(@text, 'Attached Receipts (0)')]"));
        if (attachedReceipts.isDisplayed()) {
            Common.clickSave();
        }
        Common.clickSave();
        Common.clickExpensesTab();
        Common.openExpense("Meals: Breakfast");
        Common.enterAmount("20");
        Common.clickReceiptClip();
        Thread.sleep(1000);
        takeAPhoto();
        
        WebElement attachedReceipts1 = driver.findElement(By.xpath("//*[contains(@text, 'Attached Receipts (1)')]"));
        if (attachedReceipts1.isDisplayed()) {
            Common.clickSave();
        }
        
        Common.clickReceiptClip();
        
        WebElement plus1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_add"));
        if (plus1.isDisplayed()) {
        	plus1.click();
        }
        chooseFromGallery();
        
        WebElement attachedReceipts2 = driver.findElement(By.xpath("//*[contains(@text, 'Attached Receipts (2)')]"));
        if (attachedReceipts2.isDisplayed()) {
            Common.clickSave();
        }
        
        Common.clickReceiptClip();
        WebElement removeall = driver.findElement(By.id("com.infor.hl.xm.dev:id/remove_all"));
	    if(removeall.isDisplayed()) {
	       removeall.click();
	    }
        
	    WebElement touchOutSide1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/touch_outside"));
        touchOutSide1.click();
        Thread.sleep(1000);
        
	    WebElement attachedReceipts0 = driver.findElement(By.xpath("//*[contains(@text, 'Attached Receipts (0)')]"));
        if (attachedReceipts0.isDisplayed()) {
            Common.clickSave();
        }
        
        Common.clickSave();
        Common.clickProfileBtn();
        Common.clickLogout();
        Common.clickconfirm();   
        
}
    public static void verifyAttachedReceiptsLayout(){
     WebElement attachedReceipts = driver.findElement(By.xpath("//*[contains(@text, 'Attached Receipts (1)')]"));
     if (attachedReceipts.isDisplayed()) {
        WebElement back =driver.findElement(By.id("com.infor.hl.xm.dev:id/back"));
        if (back.isDisplayed()) {
        	WebElement plus = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_add"));
            if (plus.isDisplayed()) {
            	WebElement removeall = driver.findElement(By.id("com.infor.hl.xm.dev:id/remove_all"));
        	    if(removeall.isDisplayed()) {
        	    	WebElement receiptImage = driver.findElement(By.id("com.infor.hl.xm.dev:id/receipt_image"));
            	    if(receiptImage.isDisplayed()) {
            	    	WebElement saveButton = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
                	    if(saveButton.isDisplayed()) {
                	    	receiptImage.click();
            	       }
        	       }
        	    }
            }
        }
     }
   } 
    
    public static void removeReceipt() {
    	WebElement close = driver.findElement(By.id("com.infor.hl.xm.dev:id/close"));
        if (close.isDisplayed()) {
    	  WebElement attachedReceipt = driver.findElement(By.xpath("//*[contains(@text, 'Attached Receipt')]"));
	      if(attachedReceipt.isDisplayed()) {
	    	WebElement receiptImage = driver.findElement(By.id("com.infor.hl.xm.dev:id/receipt_image"));
    	    if(receiptImage.isDisplayed()) {
    	    	WebElement remove = driver.findElement(By.id("com.infor.hl.xm.dev:id/remove"));
        	    if(remove.isDisplayed()) {
        	    	remove.click();
    	       }
	      }
	    }
    }
  }
    public static void takeAPhoto() throws InterruptedException {
    	WebElement choosefromLibrary = driver.findElement(By.xpath("//*[contains(@text, 'Choose from Library')]"));
	    if(choosefromLibrary.isDisplayed()) {
	       WebElement takeaPhoto = driver.findElement(By.xpath("//*[contains(@text, 'Take a Photo')]"));
	       if(takeaPhoto.isDisplayed()) {
	    	   WebElement choosefromGallery = driver.findElement(By.xpath("//*[contains(@text, 'Choose from Receipt Gallery')]"));
		       if(choosefromGallery.isDisplayed()) {
		    	  takeaPhoto.click();
		  	      Common.capture();
		  	      Thread.sleep(1000);
		       }
		     }
	      }
	  }
    public static void chooseFromGallery(){
    	WebElement choosefromLibrary = driver.findElement(By.xpath("//*[contains(@text, 'Choose from Library')]"));
	    if(choosefromLibrary.isDisplayed()) {
	       WebElement takeaPhoto = driver.findElement(By.xpath("//*[contains(@text, 'Take a Photo')]"));
	       if(takeaPhoto.isDisplayed()) {
	    	   WebElement choosefromGallery = driver.findElement(By.xpath("//*[contains(@text, 'Choose from Receipt Gallery')]"));
		       if(choosefromGallery.isDisplayed()) {
		    	   choosefromGallery.click();
		    	   WebElement selectImage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[1]"));
		    	   selectImage.click();
		    	   Common.clickAttach();
		       }
		     }
	      }
	    }
}