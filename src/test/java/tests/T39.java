package tests;
import pages.BaseClass;
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

public class T39 extends BaseClass {
	
	@Test
	
	public void dotest() throws Exception {
		
		Thread.sleep(3000);
	    
	    createCarrentalExpense();
		
	    WebElement findexpense = driver.findElement(By.xpath("//*[contains(@text, 'Avis')]"));
	    if(findexpense.isDisplayed()) {
	         WebElement add = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
		     add.click();
	    }
		Thread.sleep(3000);
		
		WebElement startexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_expense_button"));
		startexpense.click();
		Thread.sleep(2000);
		
		WebElement expensetype = driver.findElement(By.xpath("//*[contains(@text, 'Car Rental')]"));
		if(expensetype.isDisplayed()){
			expensetype.click();
		}
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
		
		WebElement saveasincomplete = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveasincomplete.click();
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Test Train Company"+"\").instance(0))"));
	    WebElement selecttccexpense = driver.findElement(By.xpath("//*[contains(@text, 'Test Train Company')]"));
		selecttccexpense.click();
		Thread.sleep(2000);
		
		WebElement selecttexpense = driver.findElement(By.xpath("//*[contains(@text, 'Cellular Phone')]"));
		if(selecttexpense.isDisplayed()){
			selecttexpense.click();
		}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
		
		WebElement receipt = driver.findElement(By.id("com.infor.hl.xm.dev:id/receipt_clip"));
		receipt.click();
		Thread.sleep(2000);
		
		WebElement takeaphoto = driver.findElement(By.id("com.infor.hl.xm.dev:id/take_photo"));
		takeaphoto.click();
		Thread.sleep(2000);
		
		WebElement permission = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
		permission.click(); 
		Thread.sleep(2000);
		
		WebElement allow1 = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
		allow1.click();
		Thread.sleep(2000);
		
		WebElement allow2 = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
		allow2.click();
		Thread.sleep(2000);
				
		WebElement capture = driver.findElement(By.id("com.infor.hl.xm.dev:id/picture"));
		capture.click();
		Thread.sleep(2000);
		
		WebElement savereceipt = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		savereceipt.click();
		Thread.sleep(2000);
		
		WebElement saveccexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveccexpense.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Cash Advance"+"\").instance(0))"));
	    WebElement selecttccexpense2 = driver.findElement(By.xpath("//*[contains(@text, 'Cash Advance')]"));
		selecttccexpense2.click();
		Thread.sleep(3000);
		
		WebElement selecttexpense2 = driver.findElement(By.xpath("//*[contains(@text, 'Conference')]"));
		if(selecttexpense2.isDisplayed()){
			selecttexpense2.click();
		}
		Thread.sleep(5000);
		
		WebElement saveccexpense2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveccexpense2.click();
		Thread.sleep(3000);
		
		WebElement saveasincomplete2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveasincomplete2.click();
		Thread.sleep(3000);
		
		createDraftER();
		Thread.sleep(3000);
		
		WebElement add2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
	    add2.click();
		Thread.sleep(2000);
		
		WebElement startreport = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_report_button"));
		startreport.click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/report_name")));
		
		WebElement doucmenttitle = driver.findElement(By.id("com.infor.hl.xm.dev:id/report_name"));
		doucmenttitle.sendKeys("Test Appium2");
		Thread.sleep(1000);
		
		WebElement purpose = driver.findElement(By.id("com.infor.hl.xm.dev:id/detail"));
		purpose.click();
		Thread.sleep(2000);
		
		WebElement purposetype = driver.findElement(By.xpath("//*[contains(@text, 'Business Development')]"));
		if(purposetype.isDisplayed()){
			purposetype.click();
		}
		Thread.sleep(2000);
		
		WebElement next = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
		next.click();
		Thread.sleep(2000);
		
		WebElement skiplist = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
		skiplist.click();
		Thread.sleep(2000);	
		
		WebElement addexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_tv"));
		addexpense.click();
		Thread.sleep(2000);	
		
		WebElement createnew = driver.findElement(By.id("com.infor.hl.xm.dev:id/create_new"));
		createnew.click();
		Thread.sleep(2000);
		
		WebElement expensetype2 = driver.findElement(By.xpath("//*[contains(@text, 'Car Rental')]"));
		if(expensetype2.isDisplayed()){
			expensetype2.click();
		}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
		
		WebElement amount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
		amount.sendKeys("23");
		
		WebElement vendor = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[2]"));
		vendor.click();
		Thread.sleep(2000);
		
		WebElement selectvendor = driver.findElement(By.xpath("//*[contains(@text, 'Avis')]"));
		if(selectvendor.isDisplayed()){
			selectvendor.click();
		}
		Thread.sleep(2000);
		
		WebElement save = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		save.click();
		Thread.sleep(5000);
		
		WebElement submit = driver.findElement(By.id("com.infor.hl.xm.dev:id/submit_report"));
		submit.click();
		Thread.sleep(3000);
		
		WebElement viewdetails = driver.findElement(By.id("com.infor.hl.xm.dev:id/action_icon_imageview"));
		viewdetails.click();
		Thread.sleep(2000);
		
		WebElement explanation = driver.findElement(By.id("com.infor.hl.xm.dev:id/explanation"));
		explanation.click();
		Thread.sleep(2000);
		
		WebElement typeexplanation = driver.findElement(By.id("com.infor.hl.xm.dev:id/explanation"));
		typeexplanation.click();
		typeexplanation.sendKeys("ok");
		Thread.sleep(2000);
		
		WebElement done = driver.findElement(By.id("com.infor.hl.xm.dev:id/item_done"));
		done.click();
		Thread.sleep(2000);
		
		WebElement done2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/done"));
		done2.click();
		Thread.sleep(2000);
		
		WebElement submitER = driver.findElement(By.id("com.infor.hl.xm.dev:id/submit_report"));
		submitER.click();
		Thread.sleep(4000);
		
		WebElement donedialogue = driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_neutral"));
		donedialogue.click();
		Thread.sleep(3000);
		
		attach2ReceiptsinReceiptsTab();
		
		WebElement expensestab = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"expense\"]/android.widget.FrameLayout/android.widget.ImageView"));
		expensestab.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
		
		logout();
	    
	    loginAsJjones();
	    
	    createCarrentalExpense();
		
	    attach2ReceiptsinReceiptsTab();
		
		WebElement expensestab2 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"expense\"]/android.widget.FrameLayout/android.widget.ImageView"));
		expensestab2.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
	    
		createDraftER();
		
		WebElement expensestab3 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"expense\"]/android.widget.FrameLayout/android.widget.ImageView"));
		expensestab3.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
	    
		logout();
		
        loginAsJsmith();
        
        WebElement reportstab = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"reports\"]/android.widget.FrameLayout/android.widget.ImageView"));
        reportstab.click();
        Thread.sleep(5000);
        
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Test Appium"+"\").instance(0))"));
        WebElement draftReport = driver.findElement(By.xpath("//*[contains(@text, 'Test Appium')]"));
    	if(draftReport.isDisplayed()){
    		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
    	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Test Appium2"+"\").instance(0))"));
            WebElement submittedReport = driver.findElement(By.xpath("//*[contains(@text, 'Test Appium2')]"));
        	if(submittedReport.isDisplayed()){
        		
        		System.out.println("Both draft & submitted report should available");
    	}
    	}
    	Thread.sleep(3000);
    	
    	WebElement expensestab4 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"expense\"]/android.widget.FrameLayout/android.widget.ImageView"));
		expensestab4.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
	    
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Avis"+"\").instance(0))"));
        WebElement completedExpense = driver.findElement(By.xpath("//*[contains(@text, 'Avis')]"));
    	if(completedExpense.isDisplayed()){
    		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
    	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Car Rental"+"\").instance(0))"));
            WebElement incompleteExpense = driver.findElement(By.xpath("//*[contains(@text, 'Car Rental')]"));
        	if(incompleteExpense.isDisplayed()){
        		
        		System.out.println("Both completed & incompleted Expense are available");
    	}
    	}
    	Thread.sleep(3000);
    	
    	driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Test Train Company"+"\").instance(0))"));
        WebElement completedCCExpense = driver.findElement(By.xpath("//*[contains(@text, 'Test Train Company')]"));
    	if(completedCCExpense.isDisplayed()){
    		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
    	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Cash Advance"+"\").instance(0))"));
            WebElement incompleteCCExpense = driver.findElement(By.xpath("//*[contains(@text, 'Cash Advance')]"));
        	if(incompleteCCExpense.isDisplayed()){
        		
        		System.out.println("Both completed & incompleted CC Expense are available");
    	}
    	}
    	Thread.sleep(3000);
    	
    	WebElement receiptstab = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"RECEIPTS\"]/android.widget.FrameLayout/android.widget.ImageView"));
    	receiptstab.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text, 'Receipts')]")));
		
		WebElement viewimages = driver.findElement(By.xpath("//*[contains(@text, 'Select')]"));
		if(viewimages.isDisplayed()){
			System.out.println("Receipts are available");
		}
		Thread.sleep(3000);
		
		logout();
		
		loginAsJjones();
		
		WebElement reportstab2 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"reports\"]/android.widget.FrameLayout/android.widget.ImageView"));
        reportstab2.click();
        Thread.sleep(5000);
        
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Test Appium"+"\").instance(0))"));
        WebElement draftReport2 = driver.findElement(By.xpath("//*[contains(@text, 'Test Appium')]"));
    	if(draftReport2.isDisplayed()) {
        		
        		System.out.println("Draft report is available");
    	}
    	Thread.sleep(3000);
    	
    	WebElement expensestab5 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"expense\"]/android.widget.FrameLayout/android.widget.ImageView"));
		expensestab5.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
	    
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Avis"+"\").instance(0))"));
        WebElement completedExpense2 = driver.findElement(By.xpath("//*[contains(@text, 'Avis')]"));
    	if(completedExpense2.isDisplayed()){
    		System.out.println("Completed Expense is available");
    	}
    	Thread.sleep(3000);
    	
    	WebElement receiptstab2 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"RECEIPTS\"]/android.widget.FrameLayout/android.widget.ImageView"));
    	receiptstab2.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text, 'Receipts')]")));
		
		WebElement viewimages2 = driver.findElement(By.xpath("//*[contains(@text, 'Select')]"));
		if(viewimages2.isDisplayed()){
			System.out.println("Receipts are available");
		}
		Thread.sleep(3000);
		
		logout();
		
		System.out.println("Test Case 3951 is PASSED");
	      
	 }    

	public static void loginAsJsmith() throws InterruptedException {

		Thread.sleep(3000);
	    
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
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button")));
		
		WebElement skip = driver.findElement(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button"));
		skip.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
	    		
			}


public static void loginAsJjones() throws InterruptedException {
	Thread.sleep(3000);
    
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
	username.sendKeys("jjones");
	
	WebElement password = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_password"));
	password.sendKeys("p");
	
	WebElement login = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
	login.click();
	Thread.sleep(5000);
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button")));
	
	WebElement skip = driver.findElement(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button"));
	skip.click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));		
			 
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
public static void createCarrentalExpense() throws InterruptedException {
	
	WebElement add = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
	add.click();
	Thread.sleep(3000);
	
	WebElement startexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_expense_button"));
	startexpense.click();
	Thread.sleep(2000);
	
	WebElement expensetype = driver.findElement(By.xpath("//*[contains(@text, 'Car Rental')]"));
	if(expensetype.isDisplayed()){
		expensetype.click();
	}
	
	WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(120));
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
	
	WebElement amount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
	amount.sendKeys("23");
	
	WebElement vendor = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[2]"));
	vendor.click();
	Thread.sleep(2000);
	
	WebElement selectvendor = driver.findElement(By.xpath("//*[contains(@text, 'Avis')]"));
	if(selectvendor.isDisplayed()){
		selectvendor.click();
	}
	Thread.sleep(2000);
	
	WebElement save = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
	save.click();
	Thread.sleep(5000);
		
}	

public static void createDraftER() throws InterruptedException {
	
	WebElement add3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
	add3.click();
	Thread.sleep(2000);
	
	WebElement startreport = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_report_button"));
	startreport.click();
	
	WebDriverWait wait5 = new WebDriverWait(driver,Duration.ofSeconds(90));
	wait5.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/report_name")));
	
	WebElement doucmenttitle = driver.findElement(By.id("com.infor.hl.xm.dev:id/report_name"));
	doucmenttitle.sendKeys("Test Appium");
	Thread.sleep(1000);
	
	WebElement purpose = driver.findElement(By.id("com.infor.hl.xm.dev:id/detail"));
	purpose.click();
	Thread.sleep(2000);
	
	WebElement purposetype = driver.findElement(By.xpath("//*[contains(@text, 'Business Development')]"));
	if(purposetype.isDisplayed()){
		purposetype.click();
	}
	Thread.sleep(2000);
	
	WebElement saveasdraft = driver.findElement(By.id("com.infor.hl.xm.dev:id/save_draft_button"));
	saveasdraft.click();
	Thread.sleep(3000);
		
	 }

public static void attach2ReceiptsinReceiptsTab() throws InterruptedException {
	
	WebElement unattachedreceiptstab = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"RECEIPTS\"]/android.widget.FrameLayout/android.widget.ImageView"));
	unattachedreceiptstab.click();
	Thread.sleep(5000);

	WebElement addreceipts = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_add"));
	addreceipts.click();
	Thread.sleep(3000);

	WebElement takeaphoto = driver.findElement(By.id("com.infor.hl.xm.dev:id/take_photo"));
	takeaphoto.click();
	Thread.sleep(3000);

	WebElement capture = driver.findElement(By.id("com.infor.hl.xm.dev:id/picture"));
	capture.click();
	Thread.sleep(2000);

	WebElement addreceipts2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_add"));
	addreceipts2.click();
	Thread.sleep(3000);

	WebElement takeaphoto2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/take_photo"));
	takeaphoto2.click();
	Thread.sleep(3000);

	WebElement capture2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/picture"));
	capture2.click();
	Thread.sleep(2000);

}
}
		
	