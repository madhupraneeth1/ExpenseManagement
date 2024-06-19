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

public class XM3927 extends BaseClass {
	@Test
	public void dotest() throws Exception {
Thread.sleep(3000);
WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(60));
wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/fab_add")));
WebElement addexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
addexpense.click();
Thread.sleep(1000);
WebElement startexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_expense_button"));
startexpense.click();
Thread.sleep(2000);
WebElement expensetype = driver.findElement(By.xpath("//*[contains(@text, 'Airfare')]"));
if(expensetype.isDisplayed()){
	expensetype.click();
}
Thread.sleep(2000);
WebElement amount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
amount.sendKeys("20");
Thread.sleep(1000);
WebElement ticketnumber = driver.findElement(By.xpath("//*[contains(@text, 'TICKET NUMBER')]"));
ticketnumber.click();
WebElement enternumber = driver.findElement(By.id("com.infor.hl.xm.dev:id/note"));
enternumber.sendKeys("123456");
WebElement savenumber =driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
savenumber.click();
Thread.sleep(2000);
WebElement vendor = driver.findElement(By.xpath("//*[contains(@text, 'VENDOR')]"));
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
WebElement chooseexpense =driver.findElement(By.id("android:id/button1"));
chooseexpense.click();
Thread.sleep(1000);
WebElement saveexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
saveexpense.click();
Thread.sleep(1000);
WebElement openexpense = driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id=\"com.infor.hl.xm.dev:id/content_view\"])[2]"));
openexpense.click();
Thread.sleep(1000);
driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
        +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Delete"+"\").instance(0))"));
Thread.sleep(2000);
WebElement delete1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/delete"));
delete1.click();
Thread.sleep(1000);
WebElement selectno = driver.findElement(By.id("android:id/button2"));
selectno.click();
Thread.sleep(1000);
WebElement delete2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/delete"));
delete2.click();
Thread.sleep(1000);
WebElement selectyes = driver.findElement(By.id("android:id/button1"));
selectyes.click();
Thread.sleep(1000);
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




