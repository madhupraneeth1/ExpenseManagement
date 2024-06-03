package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class XM4305 extends BaseClass {
	
	@Test
	
	public void dotest() throws Exception {
		
	System.out.println("Scenario 1");

	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button")));
 
		WebElement skip = driver.findElement(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button"));
		skip.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));

		createIncompleteHotelExpense();
		
		WebElement add2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
		add2.click();
		Thread.sleep(2000);
		
		WebElement startreport = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_report_button"));
		startreport.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/report_name")));
		
		WebElement doucmenttitle = driver.findElement(By.id("com.infor.hl.xm.dev:id/report_name"));
		doucmenttitle.sendKeys("4305-scenario1");
		Thread.sleep(1000);
		
		WebElement purpose = driver.findElement(By.id("com.infor.hl.xm.dev:id/detail"));
		purpose.click();
		Thread.sleep(2000);
		
		WebElement purposetype = driver.findElement(By.xpath("//*[contains(@text, 'Client Costs')]"));
		if(purposetype.isDisplayed()){
			purposetype.click();
		}
		Thread.sleep(2000);

		WebElement next = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
		next.click();
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Westin"+"\").instance(0))"));
		WebElement expense = driver.findElement(By.xpath("//*[contains(@text, 'Westin')]"));
		if(expense.isDisplayed()) {
			expense.click();
		}
		Thread.sleep(2000);
		
		WebElement attach = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
		attach.click();
		Thread.sleep(2000);
		
		WebElement savereport = driver.findElement(By.id("com.infor.hl.xm.dev:id/save_draft_button"));
		savereport.click();
		Thread.sleep(3000);
		
		WebElement openexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/content_view"));
		if(openexpense.isDisplayed()) {
			openexpense.click();
		}
		Thread.sleep(3000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"ITEMIZATION"+"\").instance(0))"));
	    WebElement itemization2 = driver.findElement(By.xpath("//*[contains(@text, 'ITEMIZATION')]"));
	    itemization2.click();
	    Thread.sleep(3000);
	    
	    WebElement employeeawards2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/title"));
		employeeawards2.click();
		Thread.sleep(2000);
		
		WebElement editamount = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[2]"));
		editamount.click();
		Thread.sleep(2000);
		
		WebElement amount2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount"));
		amount2.click();
		amount2.sendKeys("23");
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement saveamount2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveamount2.click();
		Thread.sleep(2000);
		
		WebElement saveemployeeawards2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveemployeeawards2.click();
		Thread.sleep(2000);
		
		WebElement saveitemization2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveitemization2.click();
	    Thread.sleep(2000);
	    
	    WebElement saveexpense3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
	    saveexpense3.click();
	    Thread.sleep(6000);
	    
	    WebElement submitreport = driver.findElement(By.id("com.infor.hl.xm.dev:id/submit_report"));
	    submitreport.click();

	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/action_textview")));
	    
	    WebElement redband2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/action_textview"));
	    redband2.click();
	    Thread.sleep(2000);
	    
	    WebElement requiresexplanation = driver.findElement(By.id("com.infor.hl.xm.dev:id/explanation"));
		requiresexplanation.click();
		Thread.sleep(2000);
		
		WebElement enterexplanation = driver.findElement(By.id("com.infor.hl.xm.dev:id/explanation"));
		enterexplanation.click();
		enterexplanation.sendKeys("ok");
		Thread.sleep(2000);
		
		WebElement done3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/item_done"));
		done3.click();
		Thread.sleep(2000);
		
		WebElement done4 = driver.findElement(By.id("com.infor.hl.xm.dev:id/done"));
		done4.click();
		Thread.sleep(2000);
		
		WebElement submitreportagain = driver.findElement(By.id("com.infor.hl.xm.dev:id/submit_report"));
	    submitreportagain.click();
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/dialog_button_neutral")));
		
		WebElement done5 = driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_neutral"));
		done5.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
		
		logout();
		
	System.out.println("Scenario 1 is Passed");
		
	System.out.println("Scenario 2");
		
		WebElement settings2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/tenant_button"));
		settings2.click();
	    Thread.sleep(1000);
	    
	    loginAsJsmith();
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
	    
	    createIncompleteHotelExpense();
	    
        Thread.sleep(3000);
		
		WebElement add = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
		add.click();
		Thread.sleep(2000);
		
		WebElement startexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_expense_button"));
		startexpense.click();
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Hotel"+"\").instance(0))"));
	    WebElement expensetype = driver.findElement(By.xpath("//*[contains(@text, 'Hotel')]"));
	    expensetype.click();
	    Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
		
		WebElement amount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
		amount.sendKeys("15");
		Thread.sleep(1000);
		
		WebElement vendor = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[2]"));
		vendor.click();
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Hilton"+"\").instance(0))"));
	    WebElement selectvendor = driver.findElement(By.xpath("//*[contains(@text, 'Hilton')]"));
	    selectvendor.click();
	    Thread.sleep(3000);
	    
	    WebElement location = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView[2]"));
		location.click();
		Thread.sleep(2000);
		
		WebElement selectlocation = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]"));
		selectlocation.click();
		Thread.sleep(2000);
	    
	    WebElement bookingagent = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]/android.widget.TextView[2]"));
	    bookingagent.click();
		Thread.sleep(2000);
		
		WebElement Corporatetravelagent = driver.findElement(By.xpath("//*[contains(@text, 'Corporate Travel Agent')]"));
		if(Corporatetravelagent.isDisplayed()) {
		   Corporatetravelagent.click();
		}
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"ITEMIZATION"+"\").instance(0))"));
	    WebElement itemization = driver.findElement(By.xpath("//*[contains(@text, 'ITEMIZATION')]"));
	    itemization.click();
	    Thread.sleep(3000);
	    
	    WebElement quickitemization = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_quick_itemizations"));
		quickitemization.click();
		Thread.sleep(2000);
		
		WebElement additemization = driver.findElement(By.id("com.infor.hl.xm.dev:id/itemization_add_container"));
		additemization.click();
		Thread.sleep(2000);
		
		WebElement chooseexpensetype = driver.findElement(By.xpath("//*[contains(@text, 'Employee Awards')]"));
		chooseexpensetype.click();
		Thread.sleep(2000);
		
		WebElement amount1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount"));
		amount1.click();
		amount1.sendKeys("15");
		Thread.sleep(2000);
		
		WebElement delete = driver.findElement(By.id("com.infor.hl.xm.dev:id/delete_button"));
		delete.click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement save = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		save.click();
		Thread.sleep(2000);
		
		WebElement employeeawards = driver.findElement(By.id("com.infor.hl.xm.dev:id/title"));
		employeeawards.click();
		Thread.sleep(2000);
		
		WebElement guest = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.TextView[2]"));
		guest.click();
		Thread.sleep(2000);
		
		WebElement addself = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_addself"));
		addself.click();
		Thread.sleep(2000);
		
		WebElement back = driver.findElement(By.id("com.infor.hl.xm.dev:id/back"));
		back.click();
		Thread.sleep(2000);
		
		WebElement save1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		save1.click();
		Thread.sleep(2000);
		
		WebElement saveitemization = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveitemization.click();
		Thread.sleep(2000);
		
		WebElement saveexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveexpense.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/action_textview")));
		
		WebElement redband = driver.findElement(By.id("com.infor.hl.xm.dev:id/action_textview"));
		redband.click();
		Thread.sleep(2000);
		
		WebElement requiresexplanation2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/explanation"));
		requiresexplanation2.click();
		Thread.sleep(2000);
		
		WebElement enterexplanation2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/explanation"));
		enterexplanation2.click();
		enterexplanation2.sendKeys("ok");
		Thread.sleep(2000);
		
		WebElement done = driver.findElement(By.id("com.infor.hl.xm.dev:id/item_done"));
		done.click();
		Thread.sleep(2000);
		
		WebElement done2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/done"));
		done2.click();
		Thread.sleep(2000);
		
		WebElement saveexpense2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveexpense2.click();
		Thread.sleep(2000);
		
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
		
        WebElement add3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
		add3.click();
		Thread.sleep(2000);
		
		WebElement startreport2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_report_button"));
		startreport2.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/report_name")));
		
		WebElement doucmenttitle2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/report_name"));
		doucmenttitle2.sendKeys("4305-scenario2");
		Thread.sleep(1000);
		
		WebElement purpose2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/detail"));
		purpose2.click();
		Thread.sleep(2000);
		
		WebElement purposetype2 = driver.findElement(By.xpath("//*[contains(@text, 'Client Costs')]"));
		if(purposetype2.isDisplayed()){
			purposetype2.click();
		}
		Thread.sleep(2000);

		WebElement next2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
		next2.click();
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Westin"+"\").instance(0))"));
		WebElement expense2 = driver.findElement(By.xpath("//*[contains(@text, 'Westin')]"));
		if(expense2.isDisplayed()) {
			expense2.click();
		}
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Hilton"+"\").instance(0))"));
		WebElement expense3 = driver.findElement(By.xpath("//*[contains(@text, 'Hilton')]"));
		if(expense3.isDisplayed()) {
			expense3.click();
		}
		Thread.sleep(2000);
		
		WebElement attach2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
		attach2.click();
		Thread.sleep(2000);
		
		WebElement savereport2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save_draft_button"));
		savereport2.click();
		Thread.sleep(3000);
		
		WebElement openexpense2 = driver.findElement(By.xpath("//*[contains(@text, 'Westin')]"));
		if(openexpense2.isDisplayed()) {
			openexpense2.click();
		}
		Thread.sleep(3000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"ITEMIZATION"+"\").instance(0))"));
	    WebElement itemization3 = driver.findElement(By.xpath("//*[contains(@text, 'ITEMIZATION')]"));
	    itemization3.click();
	    Thread.sleep(3000);
	    
	    WebElement employeeawards3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/title"));
		employeeawards3.click();
		Thread.sleep(2000);
		
		WebElement editamount2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[2]"));
		editamount2.click();
		Thread.sleep(2000);
		
		WebElement amount3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount"));
		amount3.click();
		amount3.sendKeys("23");
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement saveamount3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveamount3.click();
		Thread.sleep(2000);
		
		WebElement saveemployeeawards3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveemployeeawards3.click();
		Thread.sleep(2000);
		
		WebElement saveitemization3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveitemization3.click();
	    Thread.sleep(2000);
	    
	    WebElement saveexpense4 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
	    saveexpense4.click();
	    Thread.sleep(6000);
	    
	    WebElement submitreport2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/submit_report"));
	    submitreport2.click();
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/action_textview")));
	    
	    WebElement redband3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/action_textview"));
	    redband3.click();
	    Thread.sleep(2000);
	    
	    WebElement requiresexplanation3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/explanation"));
		requiresexplanation3.click();
		Thread.sleep(2000);
		
		WebElement enterexplanation3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/explanation"));
		enterexplanation3.click();
		enterexplanation3.sendKeys("ok");
		Thread.sleep(2000);
		
		WebElement done6 = driver.findElement(By.id("com.infor.hl.xm.dev:id/item_done"));
		done6.click();
		Thread.sleep(2000);
		
		WebElement done7 = driver.findElement(By.id("com.infor.hl.xm.dev:id/done"));
		done7.click();
		Thread.sleep(2000);
		
		WebElement submitreportagain2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/submit_report"));
	    submitreportagain2.click();
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/dialog_button_neutral")));
		
		WebElement done8 = driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_neutral"));
		done8.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
		
		logout();
		
	System.out.println("Scenario 2 is Passed");
			
		
	 }
	 
	 public static void loginAsJsmith() throws InterruptedException {
			
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
			Thread.sleep(5000);
						
			}

	public static void logout() throws InterruptedException {
					
			WebElement profilebtn =driver.findElement(By.id("com.infor.hl.xm.dev:id/user_profile_img"));
			profilebtn.click();
			Thread.sleep(3000);
			
			WebElement logout =driver.findElement(By.id("com.infor.hl.xm.dev:id/pro_log_out_btn"));
			logout.click(); 
			Thread.sleep(2000);
			
			WebElement confirm =driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_negative"));
			confirm.click();
			Thread.sleep(2000);
			
				}
	
	public static void createIncompleteHotelExpense() throws InterruptedException {
		
		Thread.sleep(3000);
		
		WebElement add = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
		add.click();
		Thread.sleep(2000);
		
		WebElement startexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_expense_button"));
		startexpense.click();
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Hotel"+"\").instance(0))"));
	    WebElement expensetype = driver.findElement(By.xpath("//*[contains(@text, 'Hotel')]"));
	    expensetype.click();
	    Thread.sleep(3000);
		
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
		
		WebElement amount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
		amount.sendKeys("23");
		Thread.sleep(1000);
		
		WebElement vendor = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[2]"));
		vendor.click();
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Westin"+"\").instance(0))"));
	    WebElement selectvendor = driver.findElement(By.xpath("//*[contains(@text, 'Westin')]"));
	    selectvendor.click();
	    Thread.sleep(3000);
	    
	    WebElement bookingagent = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]/android.widget.TextView[2]"));
	    bookingagent.click();
		Thread.sleep(2000);
		
		WebElement Corporatetravelagent = driver.findElement(By.xpath("//*[contains(@text, 'Corporate Travel Agent')]"));
		if(Corporatetravelagent.isDisplayed()) {
		   Corporatetravelagent.click();
		}
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"ITEMIZATION"+"\").instance(0))"));
	    WebElement itemization = driver.findElement(By.xpath("//*[contains(@text, 'ITEMIZATION')]"));
	    itemization.click();
	    Thread.sleep(3000);
	    
	    WebElement quickitemization = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_quick_itemizations"));
		quickitemization.click();
		Thread.sleep(2000);
		
		WebElement additemization = driver.findElement(By.id("com.infor.hl.xm.dev:id/itemization_add_container"));
		additemization.click();
		Thread.sleep(2000);
		
		WebElement chooseexpensetype = driver.findElement(By.xpath("//*[contains(@text, 'Employee Awards')]"));
		chooseexpensetype.click();
		Thread.sleep(2000);
		
		WebElement amount1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount"));
		amount1.click();
		amount1.sendKeys("10");
		Thread.sleep(2000);
		
		WebElement delete = driver.findElement(By.id("com.infor.hl.xm.dev:id/delete_button"));
		delete.click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement save = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		save.click();
		Thread.sleep(2000);
		
		WebElement employeeawards = driver.findElement(By.id("com.infor.hl.xm.dev:id/title"));
		employeeawards.click();
		Thread.sleep(2000);
		
		WebElement guest = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.TextView[2]"));
		guest.click();
		Thread.sleep(2000);
		
		WebElement addself = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_addself"));
		addself.click();
		Thread.sleep(2000);
		
		WebElement back = driver.findElement(By.id("com.infor.hl.xm.dev:id/back"));
		back.click();
		Thread.sleep(2000);
		
		WebElement save1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		save1.click();
		Thread.sleep(2000);
		
		WebElement saveitemization = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveitemization.click();
		Thread.sleep(2000);
		
		WebElement saveexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveexpense.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/action_textview")));
		
		WebElement redband = driver.findElement(By.id("com.infor.hl.xm.dev:id/action_textview"));
		redband.click();
		Thread.sleep(2000);
		
		WebElement requiresexplanation = driver.findElement(By.id("com.infor.hl.xm.dev:id/explanation"));
		requiresexplanation.click();
		Thread.sleep(2000);
		
		WebElement enterexplanation = driver.findElement(By.id("com.infor.hl.xm.dev:id/explanation"));
		enterexplanation.click();
		enterexplanation.sendKeys("ok");
		Thread.sleep(2000);
		
		WebElement done = driver.findElement(By.id("com.infor.hl.xm.dev:id/item_done"));
		done.click();
		Thread.sleep(2000);
		
		WebElement done2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/done"));
		done2.click();
		Thread.sleep(2000);
		
		WebElement saveexpense2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveexpense2.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/close")));
		
		WebElement itemnotfullyitemizied = driver.findElement(By.id("com.infor.hl.xm.dev:id/close"));
		itemnotfullyitemizied.click();
		Thread.sleep(2000);
		
		WebElement saveasincomplete = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveasincomplete.click();
		
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
		
	}
	
}