package tests;
import java.time.Duration;

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

public class T26 extends BaseClass {
	@SuppressWarnings("static-access")
    @Test
    public void dotest() throws InterruptedException {
    	

        Loginpage.login("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX2", "jsmith", "p");
        Common.clickAdd();
        Common.clickStartExpense();
        Common.selectExpenseType("Airfare");
        Thread.sleep(1000);
        Common.enterTcktNum("4387483");
        
        WebElement vendor = driver.findElement(By.xpath("//*[contains(@text, 'Vendor')]"));
        vendor.click();
        Thread.sleep(2000);
        WebElement selectvendor = driver.findElement(By.xpath("//*[contains(@text, 'United Airlines')]"));
        selectvendor.click();
        Thread.sleep(1000);
        //WebElement originationairport = driver.findElement(By.xpath("//*[contains(@text, 'ORIGINATION AIRPORT')]"));originationairport.click();
        //WebElement enterairportname = driver.findElement(By.id("com.infor.hl.xm.dev:id/note"));enterairportname.sendKeys("abc");
        //WebElement saveairportname =driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));saveairportname.click();
        //WebElement classofservice = driver.findElement(By.xpath("//*[contains(@text, 'AIRLINE CLASS OF SERVICE')]"));classofservice.click();
        //WebElement selectservice =driver.findElement(By.xpath("//*[contains(@text, 'Business')]"));selectservice.click();


        WebElement selectexpenseagain  = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/detail\" and @text=\"Airfare\"]"));
        selectexpenseagain.click();
        Thread.sleep(2000);

        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Fax"+"\").instance(0))"));
        Thread.sleep(2000);
        
        Common.selectExpenseType("Fax");
        Thread.sleep(1000);
        
        WebElement chooseexpense =driver.findElement(By.id("android:id/button1"));
        chooseexpense.click();
        Thread.sleep(1000);
       
        Common.clickSave();
        Common.openExpense("Fax");
        Thread.sleep(2000);
        
        Common.scrollAndClick("Delete");

        Thread.sleep(1000);
        WebElement selectno = driver.findElement(By.id("android:id/button2"));
        selectno.click();
        Thread.sleep(1000);
        WebElement delete2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/delete"));
        delete2.click();
        Thread.sleep(2000);
        WebElement selectyes = driver.findElement(By.id("android:id/button1"));
        selectyes.click();
        Thread.sleep(1000);

        Loginpage.logout();

}
}




