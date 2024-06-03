package tests;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class XM3949 extends BaseClass {
	
	@Test
	public void dotest() throws Exception {
		Thread.sleep(3000);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/fab_add")));
		WebElement addexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));addexpense.click();
		WebElement startreport = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_report_button"));startreport.click();
		Thread.sleep(1000);
		WebElement reporttitle = driver.findElement(By.id("com.infor.hl.xm.dev:id/report_name"));reporttitle.sendKeys("T1");
		Thread.sleep(2000);
		WebElement purpose = driver.findElement(By.id("com.infor.hl.xm.dev:id/detail"));purpose.click();
		WebElement purposetype = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/field_option\" and @text=\"Business Development\"]\r\n"
				+ ""));purposetype.click();
				
		Thread.sleep(2000)		;
WebElement next = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));next.click();
WebElement skip = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));skip.click();
WebElement expense = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_tv"));expense.click();
Thread.sleep(1000);
WebElement createnew = driver.findElement(By.id("com.infor.hl.xm.dev:id/create_new"));createnew.click();
Thread.sleep(2000);
driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
        +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Entertainment"+"\").instance(0))"));
WebElement expensetype = driver.findElement(By.xpath("//*[contains(@text, 'Entertainment')]"));
expensetype.click();
Thread.sleep(6000);
WebElement amount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));amount.sendKeys("8");
Thread.sleep(1000);
WebElement vendor = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/title\" and @text=\"VENDOR\"]")); vendor.click();
Thread.sleep(2000);
WebElement selectvendor = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/vendor_title\" and @text=\"entertainment\"]"));selectvendor.click();
WebElement paymenttype = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/title\" and @text=\"PAYMENT TYPE\"]\r\n"
				+ ""));paymenttype.click();
WebElement selectpaymenttype = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/field_option\" and @text=\"AMEX Corporate Card\"]\r\n"
				+ ""));selectpaymenttype.click();
WebElement saveexpense =driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));saveexpense.click();
Thread.sleep(2000);
WebElement error = driver.findElement(By.id("com.infor.hl.xm.dev:id/action_icon_imageview"));error.click();
Thread.sleep(1000);
WebElement explanation =driver.findElement(By.id("com.infor.hl.xm.dev:id/explanation")); explanation.click();
Thread.sleep(1000);
WebElement giveexplanation = driver.findElement(By.id("com.infor.hl.xm.dev:id/explanation"));giveexplanation.sendKeys("ok");
Thread.sleep(1000);
WebElement done = driver.findElement(By.id("com.infor.hl.xm.dev:id/explanation"));done.click();
WebElement done2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/done"));done2.click();
Thread.sleep(1000);
WebElement saveexpense2 =driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));saveexpense2.click();
Thread.sleep(2000);
WebElement submit = driver.findElement(By.id("com.infor.hl.xm.dev:id/submit_report"));submit.click();
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
	@AfterTest
	public void teardown() {
driver.quit();

	}
		
	

}



		
		
	
	


