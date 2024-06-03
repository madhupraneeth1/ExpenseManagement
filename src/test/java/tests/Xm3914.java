package tests;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;


public class XM3914 extends BaseClass {
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
WebElement expensetype = driver.findElement(By.xpath("//*[contains(@text, 'Airfare')]"));expensetype.click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//if(expensetype.isDisplayed()){
//expensetype.click();
	//	}
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
WebElement saveexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
saveexpense.click();
Thread.sleep(1000);
WebElement addexpense2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
addexpense2.click();
WebElement startexpense2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_expense_button"));
startexpense2.click();

driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
        +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Fax"+"\").instance(0))"));
Thread.sleep(2000);

WebElement expensetype2 = driver.findElement(By.xpath("//*[contains(@text, 'Fax')]"));
expensetype2.click();
WebElement amount2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
amount2.sendKeys("20");
WebElement saveexpense2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
saveexpense2.click();
Thread.sleep(1000);
WebElement addbtn = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));addbtn.click();
WebElement startreport = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_report_button"));startreport.click();
Thread.sleep(1000);
WebElement reporttitle = driver.findElement(By.id("com.infor.hl.xm.dev:id/report_name"));
reporttitle.sendKeys("Sam1");
Thread.sleep(1000);
WebElement purpose = driver.findElement(By.id("com.infor.hl.xm.dev:id/detail"));purpose.click();
Thread.sleep(1000);
WebElement purposetype = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/field_option\" and @text=\"Business Development\"]\r\n"
		+ ""));purposetype.click();
		
Thread.sleep(1000)		;
WebElement next = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));next.click();
Thread.sleep(2000);

WebElement selectexpense1 = driver.findElement(By.xpath("//*[contains(@text, 'United Airlines')]"));
selectexpense1.click();
WebElement attach1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
attach1.click();
WebElement submit = driver.findElement(By.id("com.infor.hl.xm.dev:id/submit_report"));
submit.click();
Thread.sleep(1000);
WebElement review = driver.findElement(By.id("com.infor.hl.xm.dev:id/brv_layout"));
review.click();
Thread.sleep(2000);
WebElement taptoaddexplanation = driver.findElement(By.id("com.infor.hl.xm.dev:id/explanation"));
taptoaddexplanation.click();
Thread.sleep(1000);
WebElement explanation = driver.findElement(By.id("com.infor.hl.xm.dev:id/explanation"));
explanation.sendKeys("ok");
Thread.sleep(2000);
WebElement done = driver.findElement(By.id("com.infor.hl.xm.dev:id/item_done"));
done.click();
Thread.sleep(1000);
WebElement done2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/done"));
done2.click();
Thread.sleep(1000);
WebElement submit2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/submit_report"));
submit2.click();
Thread.sleep(1000);
WebElement done3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_neutral"));
done3.click();
Thread.sleep(2000);
WebElement addbtn2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
addbtn2.click();
WebElement startreport2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_report_button"));
startreport2.click();
Thread.sleep(3000);
WebElement reporttitle2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/report_name"));
reporttitle2.sendKeys("Sam12");
Thread.sleep(2000);
WebElement purpose2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/detail"));
purpose2.click();
Thread.sleep(2000);
WebElement purposetype2 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/field_option\" and @text=\"Business Development\"]\r\n"
		+ ""));purposetype2.click();
		
Thread.sleep(3000)		;
WebElement next2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
next2.click();
Thread.sleep(2000);
WebElement selectexpense2 = driver.findElement(By.xpath("//*[contains(@text, 'Fax')]"));
selectexpense2.click();
Thread.sleep(2000);
WebElement attach2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
attach2.click();
Thread.sleep(2000);
WebElement submitfirst = driver.findElement(By.id("com.infor.hl.xm.dev:id/submit_report"));
submitfirst.click();
Thread.sleep(2000);
WebElement clickdone = driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_neutral"));clickdone.click();
Thread.sleep(2000);
WebElement profilebtn =driver.findElement(By.id("com.infor.hl.xm.dev:id/user_profile_img"));
profilebtn.click();
Thread.sleep(1000);

WebElement logout =driver.findElement(By.id("com.infor.hl.xm.dev:id/pro_log_out_btn"));
logout.click();
Thread.sleep(1000);

WebElement confirm =driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_negative"));
confirm.click();
WebElement settings = driver.findElement(By.id("com.infor.hl.xm.dev:id/tenant_button"));
settings.click();

Thread.sleep(1000);

//WebElement screenprotection = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_screen_protection"));
//screenprotection.click();

WebElement serveradd = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_address"));
serveradd.sendKeys("https://xm10-dde.xm.dev.inforcloudsuite.com");

WebElement serverport = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_port"));
serverport.sendKeys("443");

WebElement tenantid = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_tenant"));
tenantid.sendKeys("XMMOBSTND_AX2");

WebElement nextlogin = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
nextlogin.click();

Thread.sleep(1000);

WebElement username = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_username"));
username.sendKeys("jjones");

WebElement password = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_password"));
password.sendKeys("p");

WebElement login = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
login.click();
WebElement approvaltab = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.infor.hl.xm.dev:id/navigation_bar_item_icon_view\"])[5]\r\n"
		+ ""));
approvaltab.click();
Thread.sleep(2000);
WebElement doc1 = driver.findElement(By.xpath("//*[contains(@text, 'Sam1')]"));
if(doc1.isDisplayed()) {
	doc1.click();
}
Thread.sleep(2000);
WebElement approvebtn = driver.findElement(By.id("com.infor.hl.xm.dev:id/approve_icon"));
approvebtn.click();
WebElement approvedoc1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/approve"));
approvedoc1.click();
Thread.sleep(2000);
WebElement ok1 = driver.findElement(By.id("android:id/button2"));
ok1.click();
Thread.sleep(2000);
WebElement doc2 = driver.findElement(By.xpath("//*[contains(@text, 'Sam12')]"));
if(doc2.isDisplayed()) {
	doc2.click();
}
Thread.sleep(2000);
WebElement rejecttab = driver.findElement(By.id("com.infor.hl.xm.dev:id/reject"));
rejecttab.click();
WebElement rejectnote = driver.findElement(By.id("com.infor.hl.xm.dev:id/reject_note"));
rejectnote.sendKeys("test");
Thread.sleep(2000);
WebElement rejectreport = driver.findElement(By.id("com.infor.hl.xm.dev:id/reject_report"));
rejectreport.click();
Thread.sleep(2000);
WebElement ok2 = driver.findElement(By.id("android:id/button2"));
ok2.click();
WebElement profilebtnagain =driver.findElement(By.id("com.infor.hl.xm.dev:id/user_profile_img"));
profilebtnagain.click();
Thread.sleep(2000);

WebElement logoutagain  =driver.findElement(By.id("com.infor.hl.xm.dev:id/pro_log_out_btn"));
logoutagain.click();
Thread.sleep(2000);

WebElement confirmagain  =driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_negative"));
confirmagain.click();
WebElement settingsagain  = driver.findElement(By.id("com.infor.hl.xm.dev:id/tenant_button"));
settingsagain.click();

Thread.sleep(1000);

WebElement screenprotectionagain  = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_screen_protection"));
screenprotectionagain.click();

WebElement serveraddagain  = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_address"));
serveraddagain.sendKeys("https://xm10-dde.xm.dev.inforcloudsuite.com");

WebElement serverportagain  = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_port"));
serverportagain.sendKeys("443");

WebElement tenantidagain  = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_tenant"));
tenantidagain.sendKeys("XMMOBSTND_AX2");

WebElement nextloginagain  = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
nextloginagain.click();

Thread.sleep(3000);

WebElement usernameagain  = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_username"));
usernameagain .sendKeys("jsmith");

WebElement passwordagain  = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_password"));
passwordagain.sendKeys("p");

WebElement loginagain  = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
loginagain.click();

WebElement reportstab = driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.infor.hl.xm.dev:id/navigation_bar_item_icon_view\"])[4]"));
reportstab.click();
WebElement openapproveddoc = driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id=\"com.infor.hl.xm.dev:id/content_view\"])[3]"));
openapproveddoc.click();
WebElement back1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/back"));
back1.click();
WebElement openrejecteddoc = driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id=\"com.infor.hl.xm.dev:id/content_view\"])[2]"));
openrejecteddoc.click();
WebElement back2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/back"));
back2.click();
WebElement profilebtnlast =driver.findElement(By.id("com.infor.hl.xm.dev:id/user_profile_img"));
profilebtnlast.click();
Thread.sleep(2000);

WebElement logoutlast =driver.findElement(By.id("com.infor.hl.xm.dev:id/pro_log_out_btn"));
logoutlast.click();
Thread.sleep(2000);

WebElement confirmlast =driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_negative"));
confirmlast.click();
}
	@AfterTest
	public void teardown() {
driver.quit();

	}
		


	
	}


