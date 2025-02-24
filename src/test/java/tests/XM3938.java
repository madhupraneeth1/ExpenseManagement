package tests;
import pages.BaseClass;
import pages.Common;
import pages.Loginpage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pages.BaseClass;

public class XM3938 extends BaseClass {
	@SuppressWarnings("static-access")
	@Test
    public void dotest() throws InterruptedException {
	
	// Login to the XM Application
    Loginpage.login("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX2", "jsmith", "p");
    
    // Click Add button
    Common.clickAdd();

    // Click Start Report
    Common.clickStartReport();

    // Enter report title
    Common.enterReportTitle("XM3913");

    // Click Purpose field
    Common.clickPurposeField();

    // Select Purpose type
    Common.selectPurposeType("Business Development");

    // Click Next button
    Common.clickNextButton();

    // Click Skip button
    Common.clickNextButton();

    // Click Add Expense button
    Common.clickExpenseButton();

    // Click Create New button
    Common.clickCreateNew();

    // Select Expense type
    Common.selectExpenseType("Cash Advance");
    
    // Enter amount
    Common.enterAmount("23");
		
		WebElement ticketnumber = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[2]"));
		ticketnumber.click();
		Thread.sleep(2000);
		
		WebElement enternumber = driver.findElement(By.id("com.infor.hl.xm.dev:id/note"));
		enternumber.click();
		enternumber.sendKeys("123456");
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement airfaresave = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		airfaresave.click();
		Thread.sleep(1000);
	
		WebElement vendor = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.ImageView[1]"));
		vendor.click();
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"United Airlines"+"\").instance(0))"));
	    WebElement vendortype = driver.findElement(By.xpath("//*[contains(@text, 'United Airlines')]"));
	    vendortype.click();
	    Thread.sleep(8000);
	    
		WebElement save1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		save1.click();
		Thread.sleep(3000);
		
		WebElement addexpense1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_tv"));
		addexpense1.click();
		
		WebElement createnew1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/create_new"));
		createnew1.click();
		Thread.sleep(2000);
		
		WebElement carrentalexpense = driver.findElement(By.xpath("//*[contains(@text, 'Car Rental')]"));
		if(carrentalexpense.isDisplayed()){
			carrentalexpense.click();
		}
		
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
		
		WebElement amount1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
		amount1.sendKeys("23");
		
		WebElement carvendor = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[2]"));
		carvendor.click();
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Avis"+"\").instance(0))"));
	    WebElement selectvendor = driver.findElement(By.xpath("//*[contains(@text, 'Avis')]"));
		selectvendor.click();
		Thread.sleep(2000);
		
		WebElement carrentalsave = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		carrentalsave.click();
		Thread.sleep(3000);
		
		WebElement addexpense2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_tv"));
		addexpense2.click();
		
		WebElement createnew2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/create_new"));
		createnew2.click();
		Thread.sleep(2000);
		
		WebElement cellularexpense = driver.findElement(By.xpath("//*[contains(@text, 'Cellular Phone')]"));
		if(cellularexpense.isDisplayed()){
			cellularexpense.click();
		}
		
		WebDriverWait wait4 = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
		
		WebElement amount2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
		amount2.sendKeys("22");
		
		WebElement cellularsave = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		cellularsave.click();
		Thread.sleep(4000);
		
		WebElement addexpense3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_tv"));
		addexpense3.click();
		
		WebElement createnew3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/create_new"));
		createnew3.click();
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Fax"+"\").instance(0))"));
	    WebElement faxexpense = driver.findElement(By.xpath("//*[contains(@text, 'Fax')]"));
	    faxexpense.click();
	    Thread.sleep(6000);
	
	    WebElement amount3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
	    amount3.sendKeys("20");
		
		WebElement faxsave = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		faxsave.click();
		Thread.sleep(3000);
		
		WebElement addexpense4 = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_tv"));
		addexpense4.click();
		
		WebElement createnew4 = driver.findElement(By.id("com.infor.hl.xm.dev:id/create_new"));
		createnew4.click();
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Hotel"+"\").instance(0))"));
	    WebElement hotelexpense = driver.findElement(By.xpath("//*[contains(@text, 'Hotel')]"));
	    hotelexpense.click();
	    Thread.sleep(6000);
		
		WebDriverWait wait5 = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait5.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
		
		WebElement amount4 = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
		amount4.sendKeys("23");
		
		WebElement hotelvendor = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[2]"));
		hotelvendor.click();
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Hilton"+"\").instance(0))"));
	    WebElement selecthotel = driver.findElement(By.xpath("//*[contains(@text, 'Hilton')]"));
	    selecthotel.click();
	    Thread.sleep(3000);
		
	    WebElement location = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView[2]"));
		location.click();
		Thread.sleep(2000);
		
		WebElement selectlocation = driver.findElement(By.xpath("//android.view.ViewGroup[@index='5']"));
		selectlocation.click();
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
		
		WebElement chooseexpensetype = driver.findElement(By.xpath("//android.view.ViewGroup[@index='4']"));
		chooseexpensetype.click();
		Thread.sleep(2000);
		
		WebElement itemizationamount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount"));
		itemizationamount.click();
		itemizationamount.sendKeys("23");
		Thread.sleep(2000);
		
		WebElement delete = driver.findElement(By.id("com.infor.hl.xm.dev:id/delete_button"));
		delete.click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement itemizationsave = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		itemizationsave.click();
		Thread.sleep(1000);
		
		WebElement itemizationsave1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		itemizationsave1.click();
		Thread.sleep(1000);
		
		WebElement hotelsave = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		hotelsave.click();
		Thread.sleep(3000);
		
		WebElement addexpense5 = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_tv"));
		addexpense5.click();
		
		WebElement createnew5 = driver.findElement(By.id("com.infor.hl.xm.dev:id/create_new"));
		createnew5.click();
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Entertainment"+"\").instance(0))"));
	    WebElement expensetype = driver.findElement(By.xpath("//*[contains(@text, 'Entertainment')]"));
	    expensetype.click();
	    Thread.sleep(6000);
		
		WebDriverWait wait6 = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait6.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
		
		
		WebElement amount5 = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
		amount5.sendKeys("23");
		
		WebElement entertainmentvendor = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[2]"));
		entertainmentvendor.click();
		Thread.sleep(2000);
		
		WebElement createvendor = driver.findElement(By.id("com.infor.hl.xm.dev:id/arrow"));
		createvendor.click();
		Thread.sleep(2000);
		
		WebElement entervendor = driver.findElement(By.className("android.widget.EditText"));
		entervendor.click();
		entervendor.sendKeys("iMAX");
		driver.navigate().back();
		Thread.sleep(3000);
		
		WebElement save = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		save.click();
		Thread.sleep(2000);
		
		WebElement paymenttype = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.TextView[2]"));
		paymenttype.click();
		Thread.sleep(2000);
		
		WebElement selectpaymenttype = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView"));
		selectpaymenttype.click();
		Thread.sleep(2000);
		
		WebElement entertainmentsave = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		entertainmentsave.click();
	
		WebDriverWait wait7 = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait7.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/submit_report")));
		
		WebElement submit = driver.findElement(By.id("com.infor.hl.xm.dev:id/submit_report"));
		submit.click();
		
		//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/dialog_button_neutral")));
		
		WebElement done = driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_neutral"));
		done.click();
		Thread.sleep(1000);
		
		WebElement profilebtn = driver.findElement(By.id("com.infor.hl.xm.dev:id/user_profile_img"));
		profilebtn.click();
		
		WebElement logout = driver.findElement(By.id("com.infor.hl.xm.dev:id/pro_log_out_btn"));
		logout.click();
		Thread.sleep(2000);
		
		WebElement confirm = driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_negative"));
		confirm.click();
		System.out.println("MutipleExpense report submitted");
	
	}
}
	


