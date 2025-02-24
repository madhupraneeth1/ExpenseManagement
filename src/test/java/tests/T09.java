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

public class T09 extends BaseClass {
	
	@Test
	
	public void dotest() throws Exception {
		
	System.out.println("Scenario 1");
		
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button")));
 
		WebElement skip = driver.findElement(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button"));
		skip.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));

		WebElement add = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
		add.click();
		Thread.sleep(2000);
		
		WebElement startexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_expense_button"));
		startexpense.click();
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Mileage"+"\").instance(0))"));
	    WebElement expensetype = driver.findElement(By.xpath("//*[contains(@text, 'Mileage')]"));
	    expensetype.click();
	    Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
		
		WebElement amount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
		amount.sendKeys("23");
		Thread.sleep(1000);
		
		WebElement distance = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[2]"));
		distance.click();
		Thread.sleep(2000);
		
		WebElement enterdestinations = driver.findElement(By.id("com.infor.hl.xm.dev:id/enter_destinations_btn"));
	    enterdestinations.click();
		Thread.sleep(2000);
		
		WebElement checkbox1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/consentcheckbox1"));
	    checkbox1.click();
		Thread.sleep(2000);
		
		WebElement checkbox2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/consentcheckbox2"));
		checkbox2.click();
		Thread.sleep(2000);
		
		WebElement accept = driver.findElement(By.id("com.infor.hl.xm.dev:id/accept_button"));
		accept.click();
		Thread.sleep(4000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout[2]")));
		
		WebElement startplace = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView"));
		startplace.click();
		Thread.sleep(3000);
		
		WebElement searchstartplace = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
		searchstartplace.click();
		searchstartplace.sendKeys("Allagadda");
		Thread.sleep(4000);
		
		WebElement selectstartplace = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));
		selectstartplace.click();
		Thread.sleep(4000);
		
		WebElement firstplace = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[1]"));
		String startingplace = firstplace.getText();
		System.out.println("Start place is : "+ startingplace);
		Thread.sleep(4000);
		
		WebElement finalplace = driver.findElement(By.id("com.infor.hl.xm.dev:id/title_empty_state"));
		finalplace.click();
		Thread.sleep(3000);
		
		WebElement searchfinalplace = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
		searchfinalplace.click();
		searchfinalplace.sendKeys("Nandyala");
		Thread.sleep(3000);
		
		WebElement selectfinalplace = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));
		selectfinalplace.click();
		Thread.sleep(4000);
		
		WebElement lastplace = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView[1]"));
		String endingplace = lastplace.getText();
		System.out.println("Final place is : "+ endingplace);
		Thread.sleep(4000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/save")));
				
		WebElement saveroute = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveroute.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/save")));
		
		WebElement distance2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[2]"));
	    String value = distance2.getText();
	    System.out.println("Value in distance field: " +value);
		
	    WebElement saveexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
	    saveexpense.click();
	    Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
		
		WebElement add2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
		add2.click();
		Thread.sleep(2000);
		
		WebElement startreport = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_report_button"));
		startreport.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/report_name")));
		
		WebElement doucmenttitle = driver.findElement(By.id("com.infor.hl.xm.dev:id/report_name"));
		doucmenttitle.sendKeys("XM 191");
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
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Mileage"+"\").instance(0))"));
		WebElement expense = driver.findElement(By.xpath("//*[contains(@text, 'Mileage')]"));
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
		openexpense.click();
		Thread.sleep(3000);
		
		WebElement distance3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[2]"));
		distance3.click();
		Thread.sleep(2000);
		
	    WebElement distance4 = driver.findElement(By.xpath("//*[contains(@text, value )]"));
		if(distance4.isDisplayed()) {
			System.out.println("Mileage Route is Saved with Start & Final places ..");
	    	System.out.println("Scenario 1: PASSED");
		}
		else {
			System.out.println("Mileage Route is not Saved with Start & Final places ..");
	    	System.out.println("Scenario 1: FAILED");
		}
		Thread.sleep(3000);
		
		WebElement saveroute2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveroute2.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/save")));
	    
	    WebElement saveexpense2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
	    saveexpense2.click();
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/save_draft_button")));
	    
	    WebElement savereport2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save_draft_button"));
	    savereport2.click();
	    Thread.sleep(3000);
	    
	    WebElement back2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/back"));
		back2.click();
		Thread.sleep(3000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
		
		logout();
		
	    System.out.println("Scenario 2");	
	
	    WebElement settings2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/tenant_button"));
	    settings2.click();
        Thread.sleep(1000);
        
        loginAsJsmith();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));

		WebElement add3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
		add3.click();
		Thread.sleep(2000);
		
		WebElement startexpense2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_expense_button"));
		startexpense2.click();
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Mileage"+"\").instance(0))"));
	    WebElement expensetype2 = driver.findElement(By.xpath("//*[contains(@text, 'Mileage')]"));
	    expensetype2.click();
	    Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
		
		WebElement amount2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
		amount2.sendKeys("23");
		Thread.sleep(1000);
		
		WebElement distance5 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[2]"));
		distance5.click();
		Thread.sleep(2000);
		
		WebElement enterdestinations2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/enter_destinations_btn"));
	    enterdestinations2.click();
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout[2]")));
		
		WebElement startplace2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView"));
		startplace2.click();
		Thread.sleep(3000);
		
		WebElement usemycurrentlocation = driver.findElement(By.id("com.infor.hl.xm.dev:id/use_current_location"));
		usemycurrentlocation.click();
		Thread.sleep(3000);
		
		WebElement enblelocationoption = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
		enblelocationoption.click();
		Thread.sleep(3000);
		
		WebElement firstplace2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[1]"));
		startingplace = firstplace2.getText();
		System.out.println("Start place is : "+ startingplace);
		Thread.sleep(4000);
		
		WebElement finalplace2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/title_empty_state"));
		finalplace2.click();
		Thread.sleep(3000);
		
		WebElement searchfinalplace2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
		searchfinalplace2.click();
		searchfinalplace2.sendKeys("Hyderabad");
		Thread.sleep(3000);
		
		WebElement selectfinalplace2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));
		selectfinalplace2.click();
		Thread.sleep(4000);
		
		WebElement lastplace2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView[1]"));
		endingplace = lastplace2.getText();
		System.out.println("Final place is : "+ endingplace);
		Thread.sleep(4000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/save")));
				
		WebElement saveroute3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveroute3.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/save")));
		
		WebElement distance6 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[2]"));
	    value = distance6.getText();
	    System.out.println("Value in distance field: " +value);
	    
	    WebElement distance7 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[2]"));
		distance7.click();
		Thread.sleep(2000);
		
	    WebElement distance8 = driver.findElement(By.xpath("//*[contains(@text, value )]"));
		if(distance8.isDisplayed()) {
			System.out.println("Mileage Route is Saved with Start & Final places ..");
	    	System.out.println("Scenario 2: PASSED");
		}
		else {
			System.out.println("Mileage Route is not Saved with Start & Final places ..");
	    	System.out.println("Scenario 2: FAILED");
		}
		Thread.sleep(3000);
		
		WebElement saveroute4 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveroute4.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/save")));
		
	    WebElement saveexpense3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
	    saveexpense3.click();
	    Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
		
		logout();
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

}