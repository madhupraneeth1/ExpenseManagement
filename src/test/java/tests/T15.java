package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import pages.BaseClass;
import pages.Common;
import pages.Loginpage;

import java.time.Duration;

public class T15 extends BaseClass {

	@SuppressWarnings("static-access")
    @Test
    public void dotest() throws Exception {
        // Login
        Loginpage.login("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX2", "jjones", "p");

        // Add Expense 1
        Common.clickAdd();
        Common.clickStartReport();
        Common.selectExpenseType("Airfare");
        Common.enterAmount("20");
        Common.enterReportTitle("Sam1");
        Common.clickPurposeField();
        Common.selectPurposeType("Business Development");
        Common.clickNextButton();
        Common.clickExpenseButton();
        Common.clickCreateNew();
        Common.selectVendor("United Airlines");
        Common.clickSave();

        // Add Expense 2
        Common.clickAdd();
        Common.clickStartReport();
        Common.selectExpenseType("Fax");
        Common.enterAmount("20");
        Common.clickSave();

        // Submit Report
        Common.clickSubmitReport();
        Common.clickDone();

        // Approve/Reject Documents
        Common.clickprofilebtn();
        Common.clicklogout();

    }

}
