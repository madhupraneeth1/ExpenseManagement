package tests;
import java.time.Duration;
import pages.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class T29 extends BaseClass {
	@Test
public void dotest() throws Exception {
Thread.sleep(3000);
WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(60));
wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/fab_add")));
WebElement addexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));addexpense.click();
WebElement startreport = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_report_button"));startreport.click();
Thread.sleep(3000);
WebElement reporttitle = driver.findElement(By.id("com.infor.hl.xm.dev:id/report_name"));reporttitle.sendKeys("T1");
Thread.sleep(2000);
WebElement purpose = driver.findElement(By.id("com.infor.hl.xm.dev:id/detail"));purpose.click();
Thread.sleep(2000);
WebElement purposetype = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/field_option\" and @text=\"Business Development\"]\r\n"
		+ ""));purposetype.click();
		
Thread.sleep(3000)		;
WebElement next = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));next.click();
WebElement skip = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));skip.click();
WebElement expense = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_tv"));expense.click();
WebElement createnew = driver.findElement(By.id("com.infor.hl.xm.dev:id/create_new"));createnew.click();
Thread.sleep(3000);
driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
        +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Hotel"+"\").instance(0))"));
WebElement expensetype = driver.findElement(By.xpath("//*[contains(@text, 'Hotel')]"));
expensetype.click();
Thread.sleep(4000);
WebElement amount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));amount.sendKeys("20");
Thread.sleep(1000);
/*WebElement receipt = driver.findElement(By.id("com.infor.hl.xm.dev:id/receipt_clip"));receipt.click();
Thread.sleep(3000);
WebElement receiptgallery= driver.findElement(By.id("com.infor.hl.xm.dev:id/gallery"));receiptgallery.click();
Thread.sleep(3000);
WebElement selectimage= driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.infor.hl.xm.dev:id/select_icon\"])[1]"));selectimage.click();
Thread.sleep(2000);
WebElement attach = driver.findElement(By.id("com.infor.hl.xm.dev:id/attach"));attach.click();
WebElement saveimage = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));saveimage.click();
Thread.sleep(2000);*/
WebElement vendor = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/title\" and @text=\"VENDOR\"]")); vendor.click();
Thread.sleep(2000);
WebElement selectvendor = driver.findElement(By.xpath("//android.view.ViewGroup[@index='8']"));selectvendor.click();
Thread.sleep(2000);

driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
        +".scrollIntoView(new UiSelector()"+".textMatches(\""+"ITEMIZATION"+"\").instance(0))"));
WebElement itemization = driver.findElement(By.xpath("//*[contains(@text, 'ITEMIZATION')]"));
itemization.click();
Thread.sleep(2000);
//WebElement save2 =driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));save2.click();
WebElement addbtn = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_add"));addbtn.click();
Thread.sleep(2000);
WebElement singleitemization = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_single_item"));singleitemization.click();
WebElement selectitemization = driver.findElement(By.xpath("//*[contains(@text,'Laundry')]"));selectitemization.click();
Thread.sleep(2000);
WebElement itemizationamount1 = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.infor.hl.xm.dev:id/arrow\"])[1]"));itemizationamount1.click();
WebElement enteramount1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount"));enteramount1.sendKeys("4");
WebElement saveamount = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));saveamount.click();


//WebElement saveitemization = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));saveitemization.click();
//Thread.sleep(2000);
WebElement addbtn1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_add"));addbtn1.click();
Thread.sleep(2000);
WebElement singleitemization2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_single_item"));singleitemization2.click();
WebElement selectitemization2 = driver.findElement(By.xpath("//*[contains(@text,'Meals: Business')]"));selectitemization2.click();
Thread.sleep(2000);
WebElement itemizationamount2 = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.infor.hl.xm.dev:id/arrow\"])[1]"));itemizationamount1.click();
WebElement enteramount2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount"));enteramount2.sendKeys("6");
WebElement saveamount2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));saveamount2.click();
WebElement changedate =driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.infor.hl.xm.dev:id/arrow\"])[2]\r\n"
		+ "")); changedate.click();
		Thread.sleep(2000);
WebElement enterdate = driver.findElement(By.xpath("//android.view.View[@content-desc=\"04 April 2024\"]"));enterdate.click();
WebElement guests = driver.findElement(By.xpath("//*[contains(@text, 'GUESTS')]"));guests.click();
WebElement addself =driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_addself"));addself.click();
Thread.sleep(2000);
WebElement clickback = driver.findElement(By.id("com.infor.hl.xm.dev:id/back"));clickback.click();
Thread.sleep(2000);
WebElement days = driver.findElement(By.xpath("//*[contains(@text, 'NUMBER OF DAYS')]"));days.click();
WebElement noofdays = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount"));noofdays.sendKeys("2");
WebElement savedays = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));savedays.click();
Thread.sleep(2000);
WebElement saveitemization = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));saveitemization.click();
Thread.sleep(2000);
WebElement addbtn2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_add"));addbtn2.click();
Thread.sleep(2000);
WebElement quickitemization = driver.findElement(By.id("com.infor.hl.xm.dev:id/quick_itemization"));quickitemization.click();
WebElement clickyes = driver.findElement(By.id("android:id/button1"));clickyes.click();
Thread.sleep(2000);
WebElement additemization = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_itemization"));additemization.click();
WebElement chooseexpensetype = driver.findElement(By.xpath("//*[contains(@text, 'Meals: Breakfast')]"));chooseexpensetype.click();

Thread.sleep(2000);
WebElement itemizationamount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount"));itemizationamount.sendKeys("10");
WebElement additemizationagain = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_itemization"));additemizationagain.click();
WebElement chooseexpensetypeagain = driver.findElement(By.xpath("//*[contains(@text, 'Hotel: Other Charges')]"));chooseexpensetypeagain.click();
WebElement hotelitemizationamount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount"));hotelitemizationamount.sendKeys("10");
Thread.sleep(2000);
WebElement savebothitemization = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));savebothitemization.click();



WebElement save3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));save3.click();
WebElement submit = driver.findElement(By.id("com.infor.hl.xm.dev:id/submit_report"));submit.click();
Thread.sleep(1000);
WebElement review = driver.findElement(By.id("com.infor.hl.xm.dev:id/brv_layout"));review.click();
Thread.sleep(1000);
WebElement explanation = driver.findElement(By.id("com.infor.hl.xm.dev:id/explanation"));explanation.sendKeys("ok");
WebElement done = driver.findElement(By.id("com.infor.hl.xm.dev:id/item_done"));done.click();
Thread.sleep(1000);
WebElement done2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/done"));done2.click();
Thread.sleep(1000);
WebElement submit2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/submit_report"));submit2.click();
Thread.sleep(1000);
WebElement done3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_neutral"));done3.click();
Thread.sleep(2000);
WebElement profilebtn =driver.findElement(By.id("com.infor.hl.xm.dev:id/user_profile_img"));
profilebtn.click();
Thread.sleep(2000);

WebElement logout =driver.findElement(By.id("com.infor.hl.xm.dev:id/pro_log_out_btn"));
logout.click();
Thread.sleep(2000);

WebElement confirm =driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_negative"));
confirm.click();
}
}

