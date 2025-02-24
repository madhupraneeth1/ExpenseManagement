package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.Common;
import pages.Loginpage;

public class XM3918 extends BaseClass {


	
	@SuppressWarnings("static-access")
    @Test
    public void dotest() throws Exception {
		Loginpage.login("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX2", "jsmith", "p");
        Common.clickAdd();

        // Capture Receipt
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/capture_receipt_button")));
        Common.clickStartReport();

        // Handle permission dialogs
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")));
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
        Thread.sleep(2000);

        // Take picture or select from gallery
        driver.findElement(By.id("com.infor.hl.xm.dev:id/picture")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.infor.hl.xm.dev:id/save_receipt")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.infor.hl.xm.dev:id/navigation_bar_item_icon_view\"])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.infor.hl.xm.dev:id/receipt_image")).click();
        Thread.sleep(2000);

        // Start new expense
        Common.clickStartReport();
        Thread.sleep(2000);

        // Select expense type
        Common.selectExpenseType("Cellular Phone");
        Thread.sleep(2000);

        // Enter amount and save expense
        Common.enterAmount("8");
        driver.findElement(By.id("com.infor.hl.xm.dev:id/save")).click();
        Thread.sleep(2000);

        // Profile logout
        Common.clickprofilebtn();
        Thread.sleep(2000);
        Common.clicklogout();
        Thread.sleep(2000);
        Common.clickconfirm();
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
