package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.BaseClass;
import pages.Common;
import pages.Loginpage;
import io.appium.java_client.AppiumBy;

public class XM3926 extends BaseClass {

	@SuppressWarnings("static-access")
    @Test
    public void dotest() throws Exception {
    	// Login to the XM Application
        Loginpage.login("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX2", "jsmith", "p");
        
        // Click Add button
        Common.clickAdd();

        // Click Start Report
        Common.clickStartReport();

        // Enter report title
        Common.enterReportTitle("XM3913");

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

        // Select Expense type
        Common.selectExpenseType("Taxi/Car Service");

        // Enter amount
        Common.enterAmount("20");

        Thread.sleep(2000);

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                        + ".scrollIntoView(new UiSelector().textMatches(\"NOTE\").instance(0))"));
        WebElement notes = driver.findElement(By.xpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
        String value = notes.getText();
        System.out.println("Note is : " + value);
        Thread.sleep(2000);
        notes.click();

        WebElement addNotes = driver.findElement(By.id("com.infor.hl.xm.dev:id/note"));
        addNotes.click();
        addNotes.sendKeys("Taxi/Car Service");

        Thread.sleep(2000);

        WebElement back = driver.findElement(By.id("com.infor.hl.xm.dev:id/back"));
        back.click();
        Thread.sleep(3000);

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                        + ".scrollIntoView(new UiSelector().textMatches(\"NOTE\").instance(0))"));
        WebElement notes2 = driver.findElement(By.xpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
        value = notes2.getText();
        System.out.println("Note is : " + value);
        System.out.println("Note is still " + value);
        Thread.sleep(2000);
        notes2.click();

        WebElement addNotes2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/note"));
        addNotes2.click();
        addNotes2.sendKeys("Taxi/Car Service");

        Thread.sleep(2000);

        WebElement saveNotes = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
        saveNotes.click();
        Thread.sleep(3000);

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                        + ".scrollIntoView(new UiSelector().textMatches(\"NOTE\").instance(0))"));
        WebElement notes3 = driver.findElement(By.xpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
        value = notes3.getText();
        System.out.println("Note is : " + value);
        System.out.println("Note is edited with " + value);
        Thread.sleep(2000);

        WebElement addNotes3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/note"));
        addNotes3.click();
        addNotes3.sendKeys("'*%_{}$&?!@'");

        Thread.sleep(2000);

        WebElement saveNotes2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
        saveNotes2.click();
        Thread.sleep(3000);

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                        + ".scrollIntoView(new UiSelector().textMatches(\"NOTE\").instance(0))"));
        WebElement notes4 = driver.findElement(By.xpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
        value = notes4.getText();
        System.out.println("Note is : " + value);
        System.out.println("Note is accepting special characters like " + value);
        Thread.sleep(3000);

        WebElement saveExpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
        saveExpense.click();
        Thread.sleep(3000);

        Loginpage.logout();
    }
}
