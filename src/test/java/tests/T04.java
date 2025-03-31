package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.BaseClass;
import pages.Common;
import pages.Loginpage;
import io.appium.java_client.AppiumBy;

public class T04 extends BaseClass {

	@SuppressWarnings("static-access")
    @Test
    public void dotest() throws Exception {
    	// Login to the XM Application
        Loginpage.login("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX2", "jsmith", "p");
        
        // Click Add button
        Common.clickAdd();

/*        // Click Start Report
        Common.clickStartReport();

        // Enter report title
        Common.enterReportTitle("T04");

        // Click Purpose field
        Common.clickPurposeField();

        // Select Purpose type
        Common.selectPurposeType("Business Development");

        // Click Next button
        Common.clickNextButton();

        // Click Skip button
        Common.clickNextButton();

        // Click Add Expense button
        Common.clickExpenseButton();

        // Click Create New button
        Common.clickCreateNew();
*/
        Common.clickStartExpense();
        // Select Expense type
        Common.selectExpenseType("Taxi/Car Service");

        // Enter amount
        Common.enterAmount("20");

        Thread.sleep(2000);

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                        + ".scrollIntoView(new UiSelector().textMatches(\"Notes\").instance(0))"));
        WebElement notes = driver.findElement(By.xpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
        System.out.println("Note is : " + notes.getText());
        Thread.sleep(2000);
       
        Common.enterNote("Taxi/Car Service");
        
        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                        + ".scrollIntoView(new UiSelector().textMatches(\"Notes\").instance(0))"));
        WebElement notes2 = driver.findElement(By.xpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
        System.out.println("Note is updated with: " + notes2.getText());
        Thread.sleep(1000);
        
        Common.enterNote("Taxi/Car");

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                        + ".scrollIntoView(new UiSelector().textMatches(\"Notes\").instance(0))"));
        WebElement notes3 = driver.findElement(By.xpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
        System.out.println("Note is edited with :" + notes3.getText());
        Thread.sleep(2000);
        
        Common.enterNote("'*%_{}$&?^#()|:;<>!@'");
        
        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                        + ".scrollIntoView(new UiSelector().textMatches(\"Notes\").instance(0))"));
        WebElement notes4 = driver.findElement(By.xpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
        System.out.println("Note is accepting special characters like :" + notes4.getText());
        Thread.sleep(3000);
        
        Common.clickSave();
//        Common.clickSaveER();
        Thread.sleep(1000);
        
//        Common.clickBack();
//        Thread.sleep(1000);
        
//        Common.openReport("T04");
        Common.openExpense("Taxi/Car Service");
        Thread.sleep(2000);
        Common.enterAmount("22");

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                        + ".scrollIntoView(new UiSelector().textMatches(\"Notes\").instance(0))"));
        WebElement notes5 = driver.findElement(By.xpath(
        		"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[9]/android.widget.TextView[2]"));
        notes5.click();
        
        WebElement notes6 = driver.findElement(By.id("com.infor.hl.xm.dev:id/note"));
        notes6.click();
        notes6.clear();
        
        Common.clickSave();
        Common.clickSave();
//        Common.clickSaveER();
//        Thread.sleep(1000);
        
//        Common.clickBack();
        Loginpage.logout();
    }
}
