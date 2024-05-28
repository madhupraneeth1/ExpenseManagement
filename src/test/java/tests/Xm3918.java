package tests;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Xm3918 extends BaseClass {
	@Test 
	
	public void dotest() throws Exception {
		Thread.sleep(3000);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/fab_add")));
		
WebElement addexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));addexpense.click();
WebElement capturereceipt = driver.findElement(By.id("com.infor.hl.xm.dev:id/capture_receipt_button"));capturereceipt.click();
Thread.sleep(3000);
WebElement allow = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));allow.click();
WebElement allow2 = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));allow2.click();
Thread.sleep(2000);
WebElement allow3 = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));allow3.click();
Thread.sleep(2000);
WebElement camera =driver.findElement(By.id("com.infor.hl.xm.dev:id/picture"));camera.click();
Thread.sleep(2000);
WebElement savereceipt = driver.findElement(By.id("com.infor.hl.xm.dev:id/save_receipt"));savereceipt.click();
Thread.sleep(2000);
WebElement receiptgallery = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.infor.hl.xm.dev:id/navigation_bar_item_icon_view\"])[2]\r\n")); receiptgallery.click();
Thread.sleep(2000);
WebElement selectimage = driver.findElement(By.id("com.infor.hl.xm.dev:id/receipt_image")); selectimage.click();
Thread.sleep(2000);
WebElement startnewexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_new_expense_title"));startnewexpense.click();
Thread.sleep(3000);
WebElement addexpense2 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/txt_exp_type\" and @text=\"Cellular Phone\"]\r\n")); addexpense2.click();
Thread.sleep(3000);
WebElement amount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));amount.sendKeys("8");
Thread.sleep(1000);
WebElement saveexpense =driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));saveexpense.click();
Thread.sleep(2000);
WebElement profilebtn =driver.findElement(By.id("com.infor.hl.xm.dev:id/user_profile_img"));profilebtn.click();
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
	


