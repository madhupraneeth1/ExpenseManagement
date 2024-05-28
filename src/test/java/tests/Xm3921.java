package tests;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Xm3921 extends BaseClass {
	@Test
public void dotest() throws Exception {
Thread.sleep(3000);
WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(60));
wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/fab_add")));
WebElement addexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
addexpense.click();
WebElement startexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_expense_button"));
startexpense.click();
Thread.sleep(2000);
driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
+".scrollIntoView(new UiSelector()"+".textMatches(\""+"Entertainment"+"\").instance(0))"));
Thread.sleep(2000);
WebElement expensetype = driver.findElement(By.xpath("//*[contains(@text, 'Entertainment')]"));
expensetype.click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement amount1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
amount1.sendKeys("20");
//driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
//+".scrollIntoView(new UiSelector()"+".textMatches(\""+"Guests"+"\").instance(0))"));
//Thread.sleep(2000);
WebElement guest = driver.findElement(By.xpath("//*[contains(@text, 'Guests')]"));
if(guest.isDisplayed()) {
	guest.click();
}
WebElement addbtn = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_add"));
addbtn.click();
WebElement addguest = driver.findElement(By.xpath("//*[contains(@text, 'Guests')]"));
addguest.click();
WebElement search = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
search.sendKeys("TestQA");
WebElement createnew =driver.findElement(By.id("com.infor.hl.xm.dev:id/add_tv"));
createnew.click();
WebElement firstname = driver.findElement(By.xpath("//*[contains(@text, 'FIRST NAME')]"));
firstname.sendKeys("TestQA");
WebElement lastname = driver.findElement(By.xpath("//*[contains(@text, 'LAST NAME')]"));
lastname.sendKeys("Test");
WebElement title = driver.findElement(By.xpath("//*[contains(@text, 'TITLE')]"));
title.sendKeys("QA");
WebElement company = driver.findElement(By.xpath("//*[contains(@text, 'TITLE')]"));
company.sendKeys("Infor");
WebElement saveguest =driver.findElement(By.id("com.infor.hl.xm.dev:id/create_guest"));
saveguest.click();
WebElement guestdone = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
guestdone.click();
WebElement addbtn2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_add"));
addbtn2.click();
WebElement addguest2 = driver.findElement(By.xpath("//*[contains(@text, 'Guests')]"));
addguest2.click();
WebElement search2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
search2.sendKeys("TestQA2");
WebElement createnew2 =driver.findElement(By.id("com.infor.hl.xm.dev:id/add_tv"));
createnew2.click();
WebElement firstname2 = driver.findElement(By.xpath("//*[contains(@text, 'FIRST NAME')]"));
firstname2.sendKeys("TestQA2");
WebElement lastname2 = driver.findElement(By.xpath("//*[contains(@text, 'LAST NAME')]"));
lastname2.sendKeys("Test2");
WebElement title2 = driver.findElement(By.xpath("//*[contains(@text, 'TITLE')]"));
title2.sendKeys("QA2");
WebElement company2 = driver.findElement(By.xpath("//*[contains(@text, 'TITLE')]"));
company2.sendKeys("Infor2");
WebElement saveguest2 =driver.findElement(By.id("com.infor.hl.xm.dev:id/create_guest"));
saveguest2.click();
WebElement guestdone2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
guestdone2.click();
WebElement addbtn3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_add"));
addbtn3.click();
WebElement addguest3 = driver.findElement(By.xpath("//*[contains(@text, 'Guests')]"));
addguest3.click();
WebElement search3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
search3.sendKeys("Test User");
WebElement selectguest = driver.findElement(By.id("com.infor.hl.xm.dev:id/select_icon"));
selectguest.click();
WebElement uncheckguest = driver.findElement(By.xpath("//*[contains(@text, 'TestQA Test')]"));
uncheckguest.click();
WebElement guestdone3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
guestdone3.click();
WebElement amount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
amount.clear();
WebElement amount2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
amount2.sendKeys("30");
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
WebElement receipt = driver.findElement(By.id("com.infor.hl.xm.dev:id/receipt_clip"));receipt.click();
Thread.sleep(3000);
WebElement receiptgallery= driver.findElement(By.id("com.infor.hl.xm.dev:id/gallery"));receiptgallery.click();
Thread.sleep(3000);
WebElement selectimage= driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.infor.hl.xm.dev:id/select_icon\"])[1]"));selectimage.click();
Thread.sleep(2000);
WebElement attach = driver.findElement(By.id("com.infor.hl.xm.dev:id/attach"));attach.click();
WebElement saveimage = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));saveimage.click();
Thread.sleep(2000);
WebElement saveexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
saveexpense.click();
WebElement review = driver.findElement(By.id("com.infor.hl.xm.dev:id/brv_layout"));review.click();
Thread.sleep(1000);
WebElement explanation = driver.findElement(By.id("com.infor.hl.xm.dev:id/explanation"));explanation.sendKeys("ok");
WebElement done = driver.findElement(By.id("com.infor.hl.xm.dev:id/item_done"));done.click();
Thread.sleep(1000);
WebElement done2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/done"));done2.click();
Thread.sleep(1000);
WebElement saveexpense2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
saveexpense2.click();
WebElement profilebtn =driver.findElement(By.id("com.infor.hl.xm.dev:id/user_profile_img"));
profilebtn.click();

WebElement logout =driver.findElement(By.id("com.infor.hl.xm.dev:id/pro_log_out_btn"));
logout.click();
Thread.sleep(2000);

WebElement confirm =driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_negative"));
confirm.click();














	}
}
