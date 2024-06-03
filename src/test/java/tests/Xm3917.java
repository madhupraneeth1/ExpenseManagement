package tests;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class XM3917 extends BaseClass {
	@Test
public void dotest() throws Exception {
Thread.sleep(3000);
WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(60));
wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/fab_add")));
WebElement addexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
addexpense.click();
WebElement capturereceipt = driver.findElement(By.id("com.infor.hl.xm.dev:id/capture_receipt_button"));
capturereceipt.click();
WebElement allow1 = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
allow1.click();
WebElement allow2 = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
allow2.click();
Thread.sleep(2000);
WebElement allow3 = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
allow3.click();
Thread.sleep(2000);
WebElement camera =driver.findElement(By.id("com.infor.hl.xm.dev:id/picture"));
camera.click();
Thread.sleep(2000);
WebElement retake = driver.findElement(By.id("com.infor.hl.xm.dev:id/retake"));
retake.click();
WebElement gallery = driver.findElement(By.id("com.infor.hl.xm.dev:id/gallery"));
gallery.click();
WebElement selectimage = driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.google.android.documentsui:id/icon_thumb\"])"));
selectimage.click();
WebElement startnewexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_new_expense_title"));
startnewexpense.click();
Thread.sleep(2000);
driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
+".scrollIntoView(new UiSelector()"+".textMatches(\""+"Meals: Business"+"\").instance(0))"));
WebElement expensetype = driver.findElement(By.xpath("//*[contains(@text, 'Meals: Business')]"));
expensetype.click();
WebElement amount1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
amount1.sendKeys("20");
WebElement vendor = driver.findElement(By.xpath("//*[contains(@text, 'Vendor')]"));
vendor.click();
WebElement searchvendor = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
searchvendor.sendKeys("Test");
WebElement addtest = driver.findElement(By.xpath("//*[contains(@text, 'Add test')]"));
addtest.click();
WebElement save = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
save.click();
WebElement payment = driver.findElement(By.xpath("//*[contains(@text, 'Payment Type')]"));
payment.click();
WebElement selectpayment = driver.findElement(By.xpath("//*[contains(@text, 'cash')]"));
selectpayment.click();
WebElement guests = driver.findElement(By.xpath("//*[contains(@text, 'Guests')]"));
guests.click();
WebElement addself = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_addself"));
addself.click();
WebElement back =driver.findElement(By.id("com.infor.hl.xm.dev:id/back"));
back.click();
WebElement saveexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
saveexpense.click();
WebElement profilebtn =driver.findElement(By.id("com.infor.hl.xm.dev:id/user_profile_img"));
profilebtn.click();
WebElement logout =driver.findElement(By.id("com.infor.hl.xm.dev:id/pro_log_out_btn"));
logout.click();
Thread.sleep(2000);
WebElement confirm =driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_negative"));
confirm.click();




}
}