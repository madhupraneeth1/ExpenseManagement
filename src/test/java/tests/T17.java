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

public class T17 extends BaseClass {

	
	@SuppressWarnings("static-access")
    @Test
    public void dotest() throws Exception {
		Loginpage.login("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX2", "jsmith", "p");
        Common.clickAdd();

        // Capture Receipt
        WebElement captureReceiptButton = driver.findElement(By.id("com.infor.hl.xm.dev:id/capture_receipt_button"));
        captureReceiptButton.click();

        // Handle permission dialogs
        WebElement allowForegroundButton = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
        allowForegroundButton.click();
        WebElement allowButton1 = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
        allowButton1.click();
        Thread.sleep(2000); // Adjust sleep time as needed
        WebElement allowButton2 = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
        allowButton2.click();
        Thread.sleep(2000); // Adjust sleep time as needed

        // Select image from gallery
        WebElement galleryButton = driver.findElement(By.id("com.infor.hl.xm.dev:id/gallery"));
        galleryButton.click();
        WebElement selectImage = driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.google.android.documentsui:id/icon_thumb\"]"));
        selectImage.click();

        // Start New Expense
        WebElement startNewExpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_new_expense_title"));
        startNewExpense.click();
        Thread.sleep(2000); // Adjust sleep time as needed

        // Select Expense Type
        Common.selectExpenseType("Meals: Business");

        // Enter Amount
        WebElement amountField = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
        amountField.sendKeys("20");

        // Select Vendor
        WebElement vendorField = driver.findElement(By.xpath("//*[contains(@text, 'Vendor')]"));
        vendorField.click();
        WebElement searchVendorField = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
        searchVendorField.sendKeys("Test");
        WebElement addTestVendor = driver.findElement(By.xpath("//*[contains(@text, 'Add test')]"));
        addTestVendor.click();

        // Save Expense
        WebElement saveExpenseButton = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
        saveExpenseButton.click();

        // Select Payment Type
        WebElement paymentTypeField = driver.findElement(By.xpath("//*[contains(@text, 'Payment Type')]"));
        paymentTypeField.click();
        WebElement selectPaymentType = driver.findElement(By.xpath("//*[contains(@text, 'cash')]"));
        selectPaymentType.click();

        // Add Guests
        WebElement guestsField = driver.findElement(By.xpath("//*[contains(@text, 'Guests')]"));
        guestsField.click();
        WebElement addSelfButton = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_addself"));
        addSelfButton.click();

        // Navigate back
        WebElement backButton = driver.findElement(By.id("com.infor.hl.xm.dev:id/back"));
        backButton.click();

        // Save Expense
        saveExpenseButton.click();
    }

    private void logout() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        // Navigate to Profile and Logout
        Common.clickprofilebtn();
        Thread.sleep(3000); // Adjust sleep time as needed
        Common.clicklogout();
        Thread.sleep(2000); // Adjust sleep time as needed
        Common.clickconfirm();
    }
}
