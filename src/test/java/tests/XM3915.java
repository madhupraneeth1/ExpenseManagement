package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.Common;
import pages.Loginpage;

import java.time.Duration;

public class XM3915 extends BaseClass {

	@SuppressWarnings("static-access")
    @Test
    public void dotest() throws InterruptedException {
        
        Loginpage.loginwithtour("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX2", "jsmith", "p");
        Loginpage.takeProductTour();
        Thread.sleep(2000);
        
        Common.clickprofilebtn();
        Common.clickProdcuttour();
        Common.clickSkipButton();
        
        Common.clickProdcuttour();
        Loginpage.takeProductTour();
        
        Common.clicklogout();
    	Thread.sleep(2000);
    	Common.clickconfirm();
    }


}
