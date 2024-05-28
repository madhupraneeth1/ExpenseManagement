package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Login extends BaseClass{
	@Test
	public void dotest()  {
		try {
Thread.sleep(5000);
		
WebElement settings = driver.findElement(By.id("com.infor.hl.xm.dev:id/tenant_button"));
settings.click();

Thread.sleep(1000);

WebElement screenprotection = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_screen_protection"));
screenprotection.click();

WebElement serveradd = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_address"));
serveradd.sendKeys("https://xm10-dde.xm.dev.inforcloudsuite.com");

WebElement serverport = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_port"));
serverport.sendKeys("443");

WebElement tenantid = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_tenant"));
tenantid.sendKeys("XMMOBSTND_AX2");

WebElement next = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
next.click();

Thread.sleep(3000);

WebElement username = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_username"));
username.sendKeys("jsmith");

WebElement password = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_password"));
password.sendKeys("p");

WebElement login = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
login.click();
	


WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button")));

Thread.sleep(2000);

WebElement skip = driver.findElement(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button"));
skip.click();

Thread.sleep(2000);
WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(60));
wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/fab_add")));
WebElement addexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));addexpense.click();

WebElement createnew = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_expense_button"));createnew.click();
Thread.sleep(2000);
WebElement expensetype = driver.findElement(By.xpath("//*[contains(@text, 'Cellular Phone')]"));
if(expensetype.isDisplayed()){
	expensetype.click();
}

WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(120));
wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
WebElement amount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
amount.sendKeys("23");

WebElement save = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
save.click();
WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(120));
wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));


WebElement profilebtn =driver.findElement(By.id("com.infor.hl.xm.dev:id/user_profile_img"));
profilebtn.click();

WebElement logout =driver.findElement(By.id("com.infor.hl.xm.dev:id/pro_log_out_btn"));
logout.click();
Thread.sleep(2000);

WebElement confirm =driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_negative"));
confirm.click();

} 
	catch (Exception e) {
System.out.println("cause is :"+e.getCause());
System.out.println("Message is :"+e.getMessage());
e.printStackTrace();
}
}



@Test
public void sampleTest()
{
System.out.println("Hello world...");
}


@AfterTest
public void teardown() {


}
}	

