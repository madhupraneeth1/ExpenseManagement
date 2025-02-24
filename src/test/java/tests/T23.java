package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.AppiumBy;
import pages.BaseClass;
import pages.Common;
import pages.Loginpage;

public class T23 extends BaseClass {

    @SuppressWarnings("static-access")
	@Test
    public void dotest() throws InterruptedException {
    	
    	// Login to the XM Application
        Loginpage.login("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX2", "jsmith", "p");
        
     // Create an expense
        System.out.println("Creating Meals:Breakfast Expense");
        Common.clickAdd();
        Common.clickStartExpense();
        Common.selectExpenseType("Meals: Breakfast");
        Common.location("Washington");
        Thread.sleep(2000);
        WebElement selectLocation = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));
        selectLocation.click();
        Thread.sleep(1000);
        
        WebElement locationField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]/android.widget.TextView[2]"));
        if(locationField.getText().equals("Washington")) {
        System.out.println("Value in Location field: " + locationField.getText());
        Thread.sleep(2000);
        }
        
		locationField.click();
		WebElement searchLocationField = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
        if (searchLocationField.isDisplayed()) {
        	searchLocationField.sendKeys("new");
        }
        Thread.sleep(2000);
        
        WebElement Result = driver.findElement(By.xpath("//*[contains(@text, '20 Results')]"));
        if (Result.isDisplayed()) {
        	WebElement location1 = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
    	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"New York - Ct Suburbs"+"\").instance(0))"));
    		if(location1.isDisplayed()) {
    			location1.click();
    		}
        }
        Thread.sleep(3000);
        WebElement locationField1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]/android.widget.TextView[2]"));
        if(locationField1.getText().equals("New York - Ct Suburbs")) {
        System.out.println("Value in Location field: " + locationField1.getText());
        }
        else {
        	System.out.println("Testcase 23 Failed");
        	Common.clickBack();
        	Thread.sleep(1000);
        	WebElement unsaveExpense= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]"));
        	unsaveExpense.click();
        	Thread.sleep(2000);
        	Common.clickBack();
        	Common.clickProfileBtn();
            Common.clickLogout();
            Common.clickconfirm();
            driver.quit();
        }
         
        Common.enterAmount("20");
        Common.clickSave();
        System.out.println("Meals:Breakfast Expense created successfully");
        
        System.out.println("Creating Parking Expense");
        Common.clickAdd();
        Common.clickStartExpense();
        Common.selectExpenseType("Parking");
        Thread.sleep(3000);
        WebElement locationField2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]/android.widget.TextView[2]"));
        locationField2.click();
        WebElement location2 = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"New York - Ct Suburbs"+"\").instance(0))"));
		if(location2.isDisplayed()) {
			location2.click();
		}
		else {
        	System.out.println("Testcase 23 Failed");
        	Common.clickBack();
        	Common.clickBack();
        	Thread.sleep(1000);
        	WebElement unsaveExpense= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]"));
        	unsaveExpense.click();
        	Thread.sleep(2000);
        	Common.clickBack();
        	Common.clickProfileBtn();
            Common.clickLogout();
            Common.clickconfirm();
        }
		Thread.sleep(3000);
		WebElement locationField3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]/android.widget.TextView[2]"));
        if(locationField3.getText().equals("New York - Ct Suburbs")) {
        System.out.println("Value in Location field: " + locationField3.getText());
        }
        else {
        	System.out.println("Testcase 23 Failed");
        	Common.clickBack();
        	Thread.sleep(1000);
        	WebElement unsaveExpense= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]"));
        	unsaveExpense.click();
        	Thread.sleep(2000);
        	Common.clickBack();
        	Common.clickProfileBtn();
            Common.clickLogout();
            Common.clickconfirm();
        }
		Common.enterAmount("22");
        Common.clickSave();
        System.out.println("Parking Expense created successfully");
        System.out.println("Testcase 23 Passed");
        Common.clickProfileBtn();
        Common.clickLogout();
        Common.clickconfirm();
        
    }} 