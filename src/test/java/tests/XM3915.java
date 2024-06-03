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

import io.appium.java_client.AppiumDriver;

public class XM3915 extends BaseClass {
	
	@Test
	
	public void dotest() throws Exception {
		WebElement taketour = driver.findElement(By.id("com.infor.hl.xm.dev:id/product_tour_take_button"));
		taketour.click();
		Thread.sleep(2000);
		
		WebElement next2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
		next2.click();
		Thread.sleep(3000);
		
		WebElement next3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
		next3.click();
		Thread.sleep(3000);
		
		WebElement next4 = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
		next4.click();
		Thread.sleep(3000);
		
		WebElement done = driver.findElement(By.id("com.infor.hl.xm.dev:id/done_button"));
		done.click();
		
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
		
		WebElement profilebtn =driver.findElement(By.id("com.infor.hl.xm.dev:id/user_profile_img"));
		profilebtn.click();
		Thread.sleep(3000);
		
		WebElement producttour =driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView"));
		producttour.click();
		Thread.sleep(3000);
		
		WebElement skiptour =driver.findElement(By.id("com.infor.hl.xm.dev:id/skip_button"));
		skiptour.click();
		Thread.sleep(3000);
		
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
