package tests;

import pages.BaseClass;
import pages.Common;
import pages.Loginpage;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class T22 extends BaseClass {
	
	@SuppressWarnings("static-access")
    @Test
    public void dotest() throws Exception {
		
		Loginpage.login("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX2", "jsmith", "p");
        Common.clickAdd();
        Common.clickStartExpense();
        Common.selectExpenseType("Airfare");
        Common.enterAmount("8");
        Common.enterTcktNum("4387483");
        Common.enterVendorviaSearch("Vendor 23");
        Common.enterVendorviaCreate("Vendor 34"); 
        Common.selectVendor("United Airlines");
        Common.clickSave();
        Loginpage.logout();
    }
}
