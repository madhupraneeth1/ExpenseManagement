package tests;
import pages.BaseClass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class T31 extends BaseClass {
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
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
		        +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Mileage"+"\").instance(0))"));
		WebElement expensetype = driver.findElement(By.xpath("//*[contains(@text, 'Mileage')]"));
		expensetype.click();
		Thread.sleep(3000);
		WebElement amount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));amount.sendKeys("11");
		Thread.sleep(2000);
		WebElement distance = driver.findElement(By.xpath("//*[containts(@text='DISTANCE')]"));distance.click();
		Thread.sleep(2000);
		WebElement enterdestinations = driver.findElement(By.id("com.infor.hl.xm.dev:id/enter_destinations_btn"));enterdestinations.click();
		WebElement checkbox1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/consentcheckbox1"));checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/consentcheckbox2"));checkbox2.click();
		Thread.sleep(2000);
		WebElement acceptbtn = driver.findElement(By.id("com.infor.hl.xm.dev:id/accept_button"));acceptbtn.click();
		WebElement startingaddress = driver.findElement(By.xpath("//*[contains(@text='Enter your starting place or address']"));startingaddress.click();
		WebElement searchdestinations1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));searchdestinations1.sendKeys("Hyderabad");
		WebElement selectplace1 =driver.findElement(By.xpath("//*contains(@text='Hyderabad']"));selectplace1.click();
		WebElement finalplace = driver.findElement(By.id("com.infor.hl.xm.dev:id/title_empty_state"));finalplace.click();
		WebElement searchdestinations2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));searchdestinations2.sendKeys("Delhi");
		WebElement selectplace2 =driver.findElement(By.xpath("//*contains(@text='Delhi']"));selectplace2.click();
		WebElement addstop = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_stop"));addstop.click();
		WebElement place3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/title_empty_state"));place3.click();
		WebElement searchdestinations3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));searchdestinations3.sendKeys("Nagpur");
		WebElement save1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));save1.click();
		WebElement save2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));save2.click();
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
}
