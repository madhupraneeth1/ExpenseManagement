package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import pages.BaseClass;
import pages.Common;
import pages.Loginpage;

public class T20 extends BaseClass {
	
	@SuppressWarnings("static-access")
    @Test
    public void dotest() throws InterruptedException {
    	
        Loginpage.login("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX2", "jsmith", "p");
        Common.clickAdd();
        Common.clickStartExpense();
        Common.selectExpenseType("Parking");
        
        // Change currency to Yuan
        Common.clickCurrencyButton();
        Common.searchCurrency("yuan");
        Common.clickCurrencyTitle();
        Common.enterAmount("8");

        // Change currency to Euro and save expense
        Common.clickCurrencyButton();
        Common.searchCurrency("euro");
        Common.clickCurrencyTitle();
        Common.clickSave();

        Loginpage.logout();

    	}
}
