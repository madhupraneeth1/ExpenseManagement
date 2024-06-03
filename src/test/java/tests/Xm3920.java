package tests;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;


public class XM3920 extends BaseClass {
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
driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
        +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Parking"+"\").instance(0))"));
Thread.sleep(2000);
WebElement expensetype = driver.findElement(By.xpath("//*[contains(@text, 'Parking')]"));
expensetype.click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement usd = driver.findElement(By.id("com.infor.hl.xm.dev:id/currency_button"));
usd.click();
WebElement searchcurrency = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
searchcurrency.sendKeys("yuan");
WebElement searchyuan = driver.findElement(By.id("com.infor.hl.xm.dev:id/currency_title"));
searchyuan.click();
WebElement amount1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
amount1.sendKeys("1");
amount1.clear();
WebElement amount2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
amount2.sendKeys("5");
WebElement currency = driver.findElement(By.id("com.infor.hl.xm.dev:id/currency_button"));
currency.click();
WebElement searchcurrencyagain = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
searchcurrencyagain.sendKeys("Euro");
WebElement Euro = driver.findElement(By.id("com.infor.hl.xm.dev:id/currency_title"));
Euro.click();
WebElement save = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
save.click();
WebElement profilebtn =driver.findElement(By.id("com.infor.hl.xm.dev:id/user_profile_img"));
profilebtn.click();

WebElement logout =driver.findElement(By.id("com.infor.hl.xm.dev:id/pro_log_out_btn"));
logout.click();
Thread.sleep(2000);

WebElement confirm =driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_negative"));
confirm.click();


	}
}
