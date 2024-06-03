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

public class XM3922 extends BaseClass {
	
	@Test
	
	public void dotest() throws Exception {
		
		Thread.sleep(3000);		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button")));
		
		WebElement skip = driver.findElement(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button"));
		skip.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
	    		
		WebElement add = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
		add.click();
		Thread.sleep(3000);
		
		WebElement startexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_expense_button"));
		startexpense.click();
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Fax"+"\").instance(0))"));
		WebElement expense = driver.findElement(By.xpath("//*[contains(@text, 'Fax')]"));
		if(expense.isDisplayed()) {
			expense.click();
		}
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
		
		WebElement amount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
		amount.sendKeys("23");
		Thread.sleep(2000);
		
		WebElement vendor = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.ImageView[1]"));
		vendor.click();
		Thread.sleep(2000);
		
		WebElement searchvendor = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
		if(searchvendor.isDisplayed()) {
			WebElement createnewvendor = driver.findElement(By.id("com.infor.hl.xm.dev:id/arrow"));
			if(createnewvendor.isDisplayed()) {
				searchvendor.sendKeys("vendor 6");
			}
		}
		Thread.sleep(2000);
		
		WebElement zeroresult = driver.findElement(By.xpath("//*[contains(@text, '0 Results')]"));
		if(zeroresult.isDisplayed()) {
			WebElement createnewvendor = driver.findElement(By.id("com.infor.hl.xm.dev:id/arrow"));
			if(createnewvendor.isDisplayed()) {
				WebElement addvendor = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView"));
				if(addvendor.isDisplayed()) {
					addvendor.click();
				}
			}
		}
		Thread.sleep(2000);
		
		WebElement addvendor = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
		String value = addvendor.getText();
		Thread.sleep(3000);
		
		WebElement savevendor = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		savevendor.click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"VENDOR"+"\").instance(0))"));
	    WebElement vendorvalue = driver.findElement(By.xpath("//*[contains(@text, value )]"));
		if(vendorvalue.isDisplayed()) {
			System.out.println("Value in vendor field: " +value);
			WebElement vendor2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.ImageView[1]"));
			vendor2.click();
		}
		Thread.sleep(2000);
		
		WebElement list = driver.findElement(By.id("com.infor.hl.xm.dev:id/vendor_title"));
		if(list.isDisplayed()) {
			WebElement createnewvendor = driver.findElement(By.id("com.infor.hl.xm.dev:id/arrow"));
			createnewvendor.click();
		}
		Thread.sleep(3000);
		
		WebElement addvendor2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
		addvendor2.click();
		addvendor2.sendKeys("Test vendor 3");
		value = addvendor2.getText();
		Thread.sleep(3000);
		
		WebElement savevendor2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		savevendor2.click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"VENDOR"+"\").instance(0))"));
	    WebElement vendorvalue2 = driver.findElement(By.xpath("//*[contains(@text, value )]"));
		if(vendorvalue2.isDisplayed()) {
			System.out.println("Value in vendor field: " +value);
			WebElement vendor2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.ImageView[1]"));
			vendor2.click();
		}
		Thread.sleep(2000);
		
		WebElement searchvendor2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
		searchvendor2.click();
		searchvendor2.sendKeys("Test");
		Thread.sleep(4000);
		
		WebElement result = driver.findElement(By.xpath("//*[contains(@text, 'Test vendor 2' )]"));
		if(result.isDisplayed()) {
			result.click();
		}
		Thread.sleep(4000);
		
		WebElement saveexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveexpense.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
		
		WebElement profilebtn =driver.findElement(By.id("com.infor.hl.xm.dev:id/user_profile_img"));
		profilebtn.click();
		Thread.sleep(3000);
		
		WebElement logout =driver.findElement(By.id("com.infor.hl.xm.dev:id/pro_log_out_btn"));
		logout.click(); 
		Thread.sleep(2000);
		
		WebElement confirm =driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_negative"));
		confirm.click();
		Thread.sleep(2000);
		
			 }}