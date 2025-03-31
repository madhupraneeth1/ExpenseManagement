package pages;
 
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;

 
public class BaseClass extends ExtentReportsXM {
	
	protected static AppiumDriver driver;
	
	@BeforeClass
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
	
		} catch (Exception e) {
			System.out.println("cause is :"+e.getCause());
			System.out.println("Message is :"+e.getMessage());
			e.printStackTrace();
		}
 
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();	
		
	}
}
 