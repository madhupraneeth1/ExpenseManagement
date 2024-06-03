package tests;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class XM3925 extends BaseClass {
	@Test
public void dotest() throws Exception {
Thread.sleep(3000);
WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(60));
wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/fab_add")));
WebElement addexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));addexpense.click();
WebElement startexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_expense_button"));
startexpense.click();
Thread.sleep(2000);
driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
        +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Hotel"+"\").instance(0))"));
Thread.sleep(2000);
WebElement expensetype = driver.findElement(By.xpath("//*[contains(@text, 'Hotel')]"));
expensetype.click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement amount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
amount.sendKeys("20");
Thread.sleep(1000);
WebElement clickallocation = driver.findElement(By.xpath("//*[contains(@text, 'CHARGE CODE ALLOCATIONS')]"));
clickallocation.click();
WebElement clickplusbtn = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_add"));
clickplusbtn.click();
WebElement addproject = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_project_code"));
addproject.click();
WebElement searchbox = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
searchbox.sendKeys("GTO");
WebElement selectproject =driver.findElement(By.xpath("//*[contains(@text, 'Hotel')]"));
selectproject.click();
WebElement saveallocation = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
saveallocation.click();
WebElement clickallocationagain = driver.findElement(By.xpath("//*[contains(@text, 'CHARGE CODE ALLOCATIONS')]"));
clickallocationagain.click();
//WebElement deleteallocation =



}
}
