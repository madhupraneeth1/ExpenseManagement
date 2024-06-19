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

public class XM4281 extends BaseClass {
	
	@Test
	
	public void dotest() throws Exception {
		
		System.out.println("Scenario1");
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button")));
		
		WebElement skip = driver.findElement(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button"));
		skip.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
	    	
	    myProfileLayoutVerification();
	    
	    WebElement profilepic =driver.findElement(By.id("com.infor.hl.xm.dev:id/user_name_initial_tv"));
		profilepic.click();
		Thread.sleep(3000);
		
		WebElement permission = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
		permission.click(); 
		Thread.sleep(2000);
		
		WebElement allow1 = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
		allow1.click();
		Thread.sleep(2000);
		
		WebElement allow2 = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
		allow2.click();
		Thread.sleep(2000);
		
		WebElement camera = driver.findElement(By.id("com.infor.hl.xm.dev:id/switch_b"));
		camera.click();
		Thread.sleep(2000);
			
		WebElement capture = driver.findElement(By.id("com.infor.hl.xm.dev:id/picture"));
		capture.click();
		Thread.sleep(3000);
		
		WebElement retake = driver.findElement(By.id("com.infor.hl.xm.dev:id/retake_tv"));
		retake.click();
		Thread.sleep(2000);
		
		WebElement capture2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/picture"));
		capture2.click();
		Thread.sleep(2000);
		
		WebElement usephoto = driver.findElement(By.id("com.infor.hl.xm.dev:id/use_photo_tv"));
		usephoto.click();
		Thread.sleep(2000);
		
		logoutcloseiconVerification();
		
	    logout();
	    System.out.println("Scenario:1 PASSED");
	    
	    Thread.sleep(3000);
	    
	    WebElement settings2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/tenant_button"));
		settings2.click();
	    Thread.sleep(1000);
	    
	    loginAsJsmith();
	    myProfileLayoutVerification();
	    
	    WebElement profilepic2 =driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[2]"));
		profilepic2.click();
		Thread.sleep(3000);
		
		WebElement capture3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/picture"));
		capture3.click();
		Thread.sleep(3000);
		
		WebElement retake2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/retake_tv"));
		retake2.click();
		Thread.sleep(2000);
		
		WebElement capture4 = driver.findElement(By.id("com.infor.hl.xm.dev:id/picture"));
		capture4.click();
		Thread.sleep(2000);
		
		WebElement usephoto2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/use_photo_tv"));
		usephoto2.click();
		Thread.sleep(2000);
		
		logoutcloseiconVerification();
		
	    logout();
	    System.out.println("Scenario:2 PASSED");
	    
        Thread.sleep(3000);
	    
	    WebElement settings3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/tenant_button"));
		settings3.click();
	    Thread.sleep(1000);
	    
	    loginAsJsmith();
	    myProfileLayoutVerification();
	    
	    WebElement profilepic3 =driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[2]"));
		profilepic3.click();
		Thread.sleep(3000);
	    
		WebElement fromgallery = driver.findElement(By.id("com.infor.hl.xm.dev:id/gallery"));
		fromgallery.click(); 
		Thread.sleep(3000);
		
		WebElement selectreceipt = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"IMG-20240403-WA0010.jpg, 196 kB, 5 Apr\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView"));
		selectreceipt.click(); 
		Thread.sleep(4000);
		
		WebElement retake3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/retake_tv"));
		retake3.click();
		Thread.sleep(2000);
		
		WebElement fromgallery2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/gallery"));
		fromgallery2.click(); 
		Thread.sleep(3000);
		
		WebElement selectreceipt2 = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"IMG-20240403-WA0011.jpg, 106 kB, 5 Apr\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView"));
		selectreceipt2.click(); 
		Thread.sleep(3000);
		
		WebElement usephoto3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/use_photo_tv"));
		usephoto3.click();
		Thread.sleep(2000);
		
		logoutcloseiconVerification();
		
	    logout();
	    System.out.println("Scenario:3 PASSED");
	    
	    System.out.println("Test Case 4281 is PASSED");
		
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

public static void myProfileLayoutVerification() throws InterruptedException {
	
	Thread.sleep(4000);
	
	WebElement profilebtn =driver.findElement(By.id("com.infor.hl.xm.dev:id/user_profile_img"));
	profilebtn.click();                              
	Thread.sleep(3000);
	
	WebElement producttour =driver.findElement(By.xpath("//*[contains(@text, 'Product Tour')]"));
	if(producttour.isDisplayed()){	
	WebElement privacypolicy =driver.findElement(By.xpath("//*[contains(@text, 'Privacy Policy')]"));
	if(privacypolicy.isDisplayed()){
	WebElement profileinfo =driver.findElement(By.xpath("//*[contains(@text, 'Profile Info')]"));
	if(profileinfo.isDisplayed()){
	WebElement about =driver.findElement(By.xpath("//*[contains(@text, 'About')]"));
	if(about.isDisplayed()){
					
		System.out.println("My Profile layout is shown as expected");
				}
			}
		}
	}
	else {
		System.out.println("My Profile layout is not shown as expected");
	}
	Thread.sleep(3000);
	
}

public static void logoutcloseiconVerification() throws InterruptedException {
	
	WebElement logoutbtn =driver.findElement(By.xpath("//*[contains(@text, 'Log Out')]"));
	if(logoutbtn.isDisplayed()){
		WebElement closeicon =driver.findElement(By.id("com.infor.hl.xm.dev:id/pro_close"));
		if(closeicon.isDisplayed()){
			closeicon.click();
	}
	}
	Thread.sleep(3000);
	
	WebElement profilepic =driver.findElement(By.xpath("//*[contains(@text, '')]"));
	if(profilepic.isDisplayed()){
		WebElement tab =driver.findElement(By.xpath("//*[contains(@text, 'EXPENSES')]"));
		if(tab.isDisplayed()){
			System.out.println("My Profile screen is closed and the screen go to Expenses screen,The Profile image is updated successfully");			
		}
	}
}


}
