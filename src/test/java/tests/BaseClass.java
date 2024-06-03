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

 
public class BaseClass extends ExtentReportsXM {
	
	static AppiumDriver driver;
	
	@BeforeTest
	public void setup() {
		try {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("deviceName", "Oneplus 7T");
		caps.setCapability("udid", "7fac1e5a");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "11");
		caps.setCapability("automationName", "uiautomator2");
		caps.setCapability("appPackage", "com.infor.hl.xm.dev");
		caps.setCapability("appActivity", "com.infor.hl.xm.ui.navigation.NavigationActivity");
		
			@SuppressWarnings("deprecation")
			URL url = new URL("http://127.0.0.1:4723");
		    driver = new AppiumDriver(url, caps);
		    
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
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button")));

			Thread.sleep(2000);

			WebElement skip = driver.findElement(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button"));
			skip.click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
			
		} catch (Exception e) {
			System.out.println("cause is :"+e.getCause());
			System.out.println("Message is :"+e.getMessage());
			e.printStackTrace();
		}
 
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();	
		
	}
}
 