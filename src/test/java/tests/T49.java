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

public class T49 extends BaseClass {

    @SuppressWarnings("static-access")
	@Test
    public void dotest() throws InterruptedException {
    	
    	System.out.println("Verify multiple receipts attach inside expense");
    	
    	// Login to the XM Application
        Loginpage.login("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX2", "jsmith", "p");
        
        // Create an expense
        Common.clickAdd();
        Common.clickStartExpense();
        Common.selectExpenseType("Meals: Breakfast");
        Common.enterAmount("20");
       // Common.clickSave();
       // Thread.sleep(2000);
       // Common.openExpense("Meals: Breakfast");
       // Thread.sleep(2000);
       // Common.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/receipt_clip")));
        Common.clickReceiptClip();
        takeAPhoto();
        Common.allowTakePictures();
		Common.allowAccessMusic();
	    Common.allowAccessPhotos();
	    Common.capture();
        Thread.sleep(1000);
        
        WebElement attachedReceipts1 = driver.findElement(By.xpath("//*[contains(@text, 'Attached Receipts (1)')]"));
        if (attachedReceipts1.isDisplayed()) {
            verifyAttachedReceiptsLayout();
        }
        
        chooseFromLibrary();
        
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                + ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + "Screenshot_20250206_154317_Infor Expense.jpg" + "\").instance(0))"));
        WebElement selectImage = driver.findElement(By.xpath("//*[contains(@text, 'Screenshot_20250206_154317_Infor Expense.jpg')]"));
        selectImage.click();
        Thread.sleep(1000);
        
        WebElement attachedReceipts2 = driver.findElement(By.xpath("//*[contains(@text, 'Attached Receipts (2)')]"));
        if (attachedReceipts2.isDisplayed()) {
            Common.clickSave();
        }
        
        WebElement receiptsCount = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/receipt_clip_label\" and @text=\"2\"]"));
        if(receiptsCount.isDisplayed()) {
           Common.clickSave();
        }   
        Common.clickReceiptsTab();
        
        WebElement plus = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_add"));
        plus.click();
        
        takeAPhoto();
	    Common.capture();
        Thread.sleep(1000);
        
        Common.clickExpensesTab();
        Common.openExpense("Meals: Breakfast");
        Common.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/receipt_clip")));
        
        Common.enterAmount("23");
        Common.clickReceiptClip();
        Thread.sleep(1000);
        
        WebElement pluss = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_add"));
        pluss.click();
        	
        chooseFromGallery();
        Common.clickSave();
        Thread.sleep(2000);
        
        WebElement receiptsCount3 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/receipt_clip_label\" and @text=\"3\"]"));
        if(receiptsCount3.isDisplayed()) {
           Common.clickSave();
        }
        
        Common.clickAdd();
	    Common.clickStartReport();
	    Common.enterReportTitle("Testcase49");
	    WebElement receiptClip = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_receipt_clip"));
	    if(receiptClip.isDisplayed()) {
	    	receiptClip.click();
	    	Thread.sleep(1000);
	    }	
	    takeAPhoto();
	    Common.capture();
        Thread.sleep(1000);
        
        WebElement docAttachedReceipts1 = driver.findElement(By.xpath("//*[contains(@text, 'Attached Receipts (1)')]"));
        if (docAttachedReceipts1.isDisplayed()) {
            verifyAttachedReceiptsLayout();
        }
        
        chooseFromLibrary();
        
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                + ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + "Screenshot_20250129_104109_Infor Expense.jpg" + "\").instance(0))"));
        WebElement docSelectImage = driver.findElement(By.xpath("//*[contains(@text, 'Screenshot_20250129_104109_Infor Expense.jpg')]"));
        docSelectImage.click();
        Thread.sleep(1000);
        
        WebElement docAttachedReceipts2 = driver.findElement(By.xpath("//*[contains(@text, 'Attached Receipts (2)')]"));
        if (docAttachedReceipts2.isDisplayed()) {
            Common.clickSave();
        }
        
	    Common.clickPurposeField();
	    Common.selectPurposeType("Business Development");
	    Common.clickNextButton();
	    Common.attachExpense("Meals: Breakfast");
	    Common.clickNextButton();
	    Common.clickSaveER();
	    Thread.sleep(2000);
	    Common.clickSubmitReport();
	    Common.clickDone();
	    Common.clickProfileBtn();
        Common.clickLogout();
        Common.clickconfirm();

}
    public static void takeAPhoto(){
    	WebElement choosefromLibrary = driver.findElement(By.xpath("//*[contains(@text, 'Choose from Library')]"));
	    if(choosefromLibrary.isDisplayed()) {
	       WebElement takeaPhoto = driver.findElement(By.xpath("//*[contains(@text, 'Take a Photo')]"));
	       if(takeaPhoto.isDisplayed()) {
		      takeaPhoto.click();
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
    
    public static void chooseFromLibrary() throws InterruptedException{
        Common.clickChooseFromLibrary();
        Thread.sleep(1000);
        
        WebElement menu = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Show roots\"]"));
        menu.click();
    
        WebElement images = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Images\"]"));
        images.click();
    
        WebElement screenshots = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Screenshots\"]"));
        screenshots.click();
    }    
    
    public static void verifyAttachedReceiptsLayout(){
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
                	       plus.click();	
            	       }
        	      }
        	    }
            }
        }
    }

}
