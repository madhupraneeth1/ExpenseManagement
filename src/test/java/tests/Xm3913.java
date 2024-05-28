package tests;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Xm3913 extends BaseClass {
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
		WebElement purposetype = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/field_option\" and @text=\"Business Development\"]\r\n"
				+ ""));purposetype.click();
				
		Thread.sleep(2000)		;
		WebElement next = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));next.click();
		WebElement skip = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));skip.click();
		WebElement expense = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_tv"));expense.click();
		WebElement createnew = driver.findElement(By.id("com.infor.hl.xm.dev:id/create_new"));createnew.click();
		Thread.sleep(3000);
		WebElement expensetype = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/txt_exp_type\" and @text=\"Cellular Phone\"]"));expensetype.click();
		Thread.sleep(5000);
		WebElement amount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));amount.sendKeys("8");
		Thread.sleep(1000);
		WebElement receipt = driver.findElement(By.id("com.infor.hl.xm.dev:id/receipt_clip"));receipt.click();
		Thread.sleep(3000);
		WebElement receiptgallery= driver.findElement(By.id("com.infor.hl.xm.dev:id/gallery"));receiptgallery.click();
		Thread.sleep(3000);
		WebElement selectimage= driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.infor.hl.xm.dev:id/select_icon\"])[3]"));selectimage.click();
		Thread.sleep(3000);
		
		WebElement attach = driver.findElement(By.id("com.infor.hl.xm.dev:id/attach"));attach.click();
		WebElement saveimage = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));saveimage.click();
		
		WebElement save = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));save.click();
		Thread.sleep(6000);
		WebElement submit = driver.findElement(By.id("com.infor.hl.xm.dev:id/submit_report"));submit.click();
		Thread.sleep(5000);
		WebElement done = driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_neutral"));done.click();
		
		

}
}
