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

public class T55 extends BaseClass {
	
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
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"NOTE"+"\").instance(0))"));
		WebElement notes = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
	    String value = notes.getText();
	    System.out.println("Value in notes field: " +value);
	    WebElement note = driver.findElement(By.xpath("//*[contains(@text, startingplace - endingplace )]"));
		if(note.isDisplayed()) {
			System.out.println("Note field is updated with Start & Final Place");
	    	System.out.println("Scenario 1: PASSED");
		}
		else {
			System.out.println("Note field is not updated with Start & Final Place");
	    	System.out.println("Scenario 1: FAILED");
		}
		Thread.sleep(3000);
	    
	    WebElement saveexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
	    saveexpense.click();
	    Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
		
		logout();
		
      System.out.println("Scenario 2");
		
		WebElement settings2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/tenant_button"));
		settings2.click();
	    Thread.sleep(1000);
		
		loginAsJsmith();
		
		Thread.sleep(3000);
		
		WebElement add2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
		add2.click();
		Thread.sleep(2000);
		
		WebElement startreport = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_report_button"));
		startreport.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/report_name")));
		
		WebElement doucmenttitle = driver.findElement(By.id("com.infor.hl.xm.dev:id/report_name"));
		doucmenttitle.sendKeys("Mileage Expense");
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
		
		WebElement back = driver.findElement(By.id("com.infor.hl.xm.dev:id/back"));
		back.click();
		Thread.sleep(3000);
		
		WebElement reportstab = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"reports\"]/android.widget.FrameLayout/android.widget.ImageView"));
        reportstab.click();
        Thread.sleep(5000);
        
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Mileage Expense"+"\").instance(0))"));
		WebElement report = driver.findElement(By.xpath("//*[contains(@text, 'Mileage Expense')]"));
		if(report.isDisplayed()) {
			report.click();
		}
		Thread.sleep(3000);
		
		WebElement openexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/content_view"));
		if(openexpense.isDisplayed()) {
			openexpense.click();
		}
		Thread.sleep(3000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"NOTE"+"\").instance(0))"));
		WebElement notes2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
	    value = notes2.getText();
	    System.out.println("Value in notes field: " +value);
	    WebElement note2 = driver.findElement(By.xpath("//*[contains(@text, startingplace - endingplace )]"));
		if(note2.isDisplayed()) {
			System.out.println("Note field is updated with Start & Final Place");
	    	System.out.println("Scenario 2: PASSED");
		}
		else {
			System.out.println("Note field is not updated with Start & Final Place");
	    	System.out.println("Scenario 2: FAILED");
		}
		Thread.sleep(3000);
	    
	    WebElement saveexpense2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
	    saveexpense2.click();
	    Thread.sleep(4000);
	    
	    WebElement savereport2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save_draft_button"));
	    savereport2.click();
	    Thread.sleep(3000);
	    
	    WebElement back2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/back"));
		back2.click();
		Thread.sleep(3000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
		
		logout();
		
	System.out.println("Scenario 3");
		
		WebElement settings3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/tenant_button"));
		settings3.click();
	    Thread.sleep(1000);
		
		loginAsJsmith();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
		
		Thread.sleep(3000);
		
		WebElement add3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
		add3.click();
		Thread.sleep(2000);
		
		WebElement startreport2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_report_button"));
		startreport2.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/report_name")));
		
		WebElement doucmenttitle2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/report_name"));
		doucmenttitle2.sendKeys("Mileage Expense 3");
		Thread.sleep(1000);
		
		WebElement purpose2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/detail"));
		purpose2.click();
		Thread.sleep(3000);
		
		WebElement purposetype2 = driver.findElement(By.xpath("//*[contains(@text, 'Business Development')]"));
		if(purposetype2.isDisplayed()){
			purposetype2.click();
		}
		Thread.sleep(3000);

	    WebElement next2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
		next2.click();
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
		
		createMileageExpense();
		
		WebElement saveexpense4 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveexpense4.click();
		Thread.sleep(4000);	
		
		WebElement savereport3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save_draft_button"));
		savereport3.click();
		Thread.sleep(4000);
		
		WebElement back3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/back"));
		back3.click();
		Thread.sleep(3000);
		
		WebElement reportstab2 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"reports\"]/android.widget.FrameLayout/android.widget.ImageView"));
        reportstab2.click();
        Thread.sleep(5000);
        
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Mileage Expense 3"+"\").instance(0))"));
		WebElement report2 = driver.findElement(By.xpath("//*[contains(@text, 'Mileage Expense 3')]"));
		if(report2.isDisplayed()) {
			report2.click();
		}
		Thread.sleep(3000);
		
//		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
//	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Mileage"+"\").instance(0))"));
		WebElement openexpense2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/content_view"));
		if(openexpense2.isDisplayed()) {
			openexpense2.click();
		}
		Thread.sleep(3000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"NOTE"+"\").instance(0))"));
		WebElement notes3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
	    value = notes3.getText();
	    System.out.println("Value in notes field: " +value);
	    WebElement note3 = driver.findElement(By.xpath("//*[contains(@text, startingplace - endingplace )]"));
		if(note3.isDisplayed()) {
			System.out.println("Note field is updated with Start & Final Place");
	    	System.out.println("Scenario 3: PASSED");
		}
		else {
			System.out.println("Note field is not updated with Start & Final Place");
	    	System.out.println("Scenario 3: FAILED");
		}
		Thread.sleep(3000);
	    
	    WebElement saveexpense5 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
	    saveexpense5.click();
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/save_draft_button")));
	    
	    WebElement savereport4 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save_draft_button"));
		savereport4.click();
		Thread.sleep(4000);
		
		WebElement back4 = driver.findElement(By.id("com.infor.hl.xm.dev:id/back"));
		back4.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
		

		logout();
		
	 System.out.println("Scenario 4");
		    
	    WebElement settings4 = driver.findElement(By.id("com.infor.hl.xm.dev:id/tenant_button"));
		settings4.click();
	    Thread.sleep(1000);
		    
		loginAsJsmith();
		    
		Thread.sleep(5000);
		
		WebElement add4 = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
		add4.click();
		Thread.sleep(2000);
		
		WebElement startreport3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_report_button"));
		startreport3.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/report_name")));
		
		WebElement doucmenttitle3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/report_name"));
		doucmenttitle3.sendKeys("Mileage Expense 4");
		Thread.sleep(1000);
		
		WebElement purpose3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/detail"));
		purpose3.click();
		Thread.sleep(2000);
		
		WebElement purposetype3 = driver.findElement(By.xpath("//*[contains(@text, 'Business Development')]"));
		if(purposetype3.isDisplayed()){
			purposetype3.click();
		}
		Thread.sleep(2000);

	    WebElement saveasdraft = driver.findElement(By.id("com.infor.hl.xm.dev:id/save_draft_button"));
		saveasdraft.click();
		Thread.sleep(6000);
			
		WebElement add5 = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
		add5.click();
	    Thread.sleep(4000);
			
		WebElement startexpense2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_expense_button"));
		startexpense2.click();
		Thread.sleep(3000);
			
		createMileageExpense();
			
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"NOTE"+"\").instance(0))"));
		WebElement notes4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
	    value = notes4.getText();
	    System.out.println("Value in notes field: " +value);
	    WebElement note4 = driver.findElement(By.xpath("//*[contains(@text, startingplace - endingplace )]"));
		if(note4.isDisplayed()) {
			System.out.println("Note field is updated with Start & Final Place");
		}
		else {
			System.out.println("Note field is not updated with Start & Final Place");
		}
		    
		Thread.sleep(3000);
		    
	    WebElement saveexpense6 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
	    saveexpense6.click();
	    Thread.sleep(3000);
		    
		WebElement reportstab3 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"reports\"]/android.widget.FrameLayout/android.widget.ImageView"));
	    reportstab3.click();
        Thread.sleep(5000);
	        
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
		            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Mileage Expense 4"+"\").instance(0))"));
        WebElement draftReport2 = driver.findElement(By.xpath("//*[contains(@text, 'Mileage Expense 4')]"));
	    if(draftReport2.isDisplayed()) {
	   		draftReport2.click();	
	   	}
	    Thread.sleep(3000);
	    	
	    WebElement addexpense2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_tv"));
		addexpense2.click();
		Thread.sleep(2000);
			
		WebElement selectfromlist = driver.findElement(By.id("com.infor.hl.xm.dev:id/from_list"));
		selectfromlist.click();
		Thread.sleep(2000);
			
		WebElement selectexpense = driver.findElement(By.xpath("//*[contains(@text, 'Mileage')]"));
		if(selectexpense.isDisplayed()) {
			selectexpense.click();
		}
		Thread.sleep(3000);
			
		WebElement attach2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
		attach2.click();
		Thread.sleep(2000);
			
		WebElement savereport5 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save_draft_button"));
		savereport5.click();
		Thread.sleep(4000);
			
		WebElement back5 = driver.findElement(By.id("com.infor.hl.xm.dev:id/back"));
		back5.click();
		Thread.sleep(4000);
			
//			WebElement reportstab2 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"reports\"]/android.widget.FrameLayout/android.widget.ImageView"));
//	        reportstab2.click();
//	        Thread.sleep(5000);
	        
	    driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
		            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Mileage Expense 4"+"\").instance(0))"));
		WebElement report3 = driver.findElement(By.xpath("//*[contains(@text, 'Mileage Expense 4')]"));
		if(report3.isDisplayed()) {
			report3.click();
		}
		Thread.sleep(3000);
			
//			driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
//		            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Mileage"+"\").instance(0))"));
		WebElement openexpense3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/content_view"));
		if(openexpense3.isDisplayed()) {
			openexpense3.click();
		}
		Thread.sleep(3000);
			
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"NOTE"+"\").instance(0))"));
		WebElement notes5 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
	    value = notes5.getText();
	    System.out.println("Value in notes field: " +value);
	    WebElement note5 = driver.findElement(By.xpath("//*[contains(@text, startingplace - endingplace )]"));
		if(note5.isDisplayed()) {
			System.out.println("Note field is updated with Start & Final Place");
	    	System.out.println("Scenario 4: PASSED");
		}
		else {
			System.out.println("Note field is not updated with Start & Final Place");
	    	System.out.println("Scenario 4: FAILED");
		}
		Thread.sleep(3000);
		
	    WebElement saveexpense7 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveexpense7.click();
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/save_draft_button")));
		
	    WebElement savereport6 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save_draft_button"));
		savereport6.click();
		Thread.sleep(3000);
		
		WebElement back6 = driver.findElement(By.id("com.infor.hl.xm.dev:id/back"));
		back6.click();
		
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
			
	   logout();
		   
   System.out.println("Scenario 5");
		   
	   WebElement settings5 = driver.findElement(By.id("com.infor.hl.xm.dev:id/tenant_button"));
	   settings5.click();
       Thread.sleep(1000);
		   
	   loginAsJsmith();
		
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
	   
	   WebElement add6 = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
	   add6.click();
       Thread.sleep(3000);
			
	   WebElement startexpense3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_expense_button"));
	   startexpense3.click();
	   Thread.sleep(2000);
			
	   createMileageExpense();
			
	   driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"NOTE"+"\").instance(0))"));
		WebElement notes6 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
	    value = notes6.getText();
	    System.out.println("Value in notes field: " +value);
	    WebElement note6 = driver.findElement(By.xpath("//*[contains(@text, startingplace - endingplace )]"));
		if(note6.isDisplayed()) {
			System.out.println("Note field is updated with Start & Final Place");
		}
		else {
			System.out.println("Note field is not updated with Start & Final Place");
		}
	   Thread.sleep(3000);
		    
	   WebElement saveexpense8 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
       saveexpense8.click();
       Thread.sleep(3000);
		    
       WebElement openexpense4 = driver.findElement(By.xpath("//*[contains(@text, 'Mileage')]"));
    	if(openexpense4.isDisplayed()) {
			openexpense4.click();
		}
		Thread.sleep(3000);
			
			WebElement distance2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[2]"));
			distance2.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			WebElement enterdestinations2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/enter_destinations_btn"));
		    enterdestinations2.click();
			Thread.sleep(2000);
			
			WebElement addastop = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_stop_cell"));
			addastop.click();
			Thread.sleep(2000);
			
			WebElement startplace2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView"));
			startplace2.click();
			Thread.sleep(3000);
			
			WebElement searchstartplace2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
			searchstartplace2.sendKeys("Allagadda");
			Thread.sleep(4000);
			
			WebElement selectstartplace2 = driver.findElement((By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")));
			selectstartplace2.click();
			Thread.sleep(4000);
			
			WebElement firstplace2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[1]"));
			startingplace = firstplace2.getText();
			System.out.println("Start place is : "+ startingplace);
			Thread.sleep(4000);

			WebElement addstop = driver.findElement((By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView")));
			addstop.click();
			Thread.sleep(3000);
			
			WebElement searchstop = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
			searchstop.sendKeys("Nandyala");
			Thread.sleep(4000);
			
			WebElement selectstop = driver.findElement((By.xpath("//android.view.ViewGroup[@index='0']")));
			selectstop.click();
			Thread.sleep(4000);
			
			WebElement stopping = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView[1]"));
			String stop = stopping.getText();
			System.out.println("Stopping place is : "+ stop);
			Thread.sleep(4000);

			WebElement finalplace2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/title_empty_state"));
			finalplace2.click();
			Thread.sleep(3000);
			
			WebElement searchfinalplace2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
			searchfinalplace2.sendKeys("Kurnool");
			Thread.sleep(3000);
			
			WebElement selectfinalplace2 = driver.findElement((By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")));
			selectfinalplace2.click();
			Thread.sleep(3000);
			
			WebElement lastplace2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.TextView[1]"));
			endingplace = lastplace2.getText();
			System.out.println("Final place is : "+ endingplace);
			Thread.sleep(4000);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/save")));
					
			WebElement saveroute2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
			saveroute2.click();
			Thread.sleep(2000);
			
			driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
		            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"NOTE"+"\").instance(0))"));
			WebElement notes7 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[9]/android.widget.TextView[2]"));
		    value = notes7.getText();
		    System.out.println("Value in notes field: " +value);
		    WebElement note7 = driver.findElement(By.xpath("//*[contains(@text, startingplace - stop - endingplace )]"));
			if(note7.isDisplayed()) {
				System.out.println("Note field is updated with Start, Stop & Final Place");
			}
			else {
				System.out.println("Note field is not updated with Start, Stop & Final Place");
			}
		    Thread.sleep(3000);
		    
		    WebElement saveexpense9 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		    saveexpense9.click();
		    Thread.sleep(3000);
		    
		    Thread.sleep(3000);
			
			WebElement add7 = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
			add7.click();
			Thread.sleep(2000);
			
			WebElement startreport4 = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_report_button"));
			startreport4.click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/report_name")));
			
			WebElement doucmenttitle4 = driver.findElement(By.id("com.infor.hl.xm.dev:id/report_name"));
			doucmenttitle4.sendKeys("Mileage Expense 5");
			Thread.sleep(1000);
			
			WebElement purpose4 = driver.findElement(By.id("com.infor.hl.xm.dev:id/detail"));
			purpose4.click();
			Thread.sleep(2000);
			
			WebElement purposetype4 = driver.findElement(By.xpath("//*[contains(@text, 'Business Development')]"));
			if(purposetype4.isDisplayed()){
				purposetype4.click();
			}
			Thread.sleep(2000);
 
		    WebElement next3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
			next3.click();
			Thread.sleep(2000);
			
			driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
		            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Mileage"+"\").instance(0))"));
			WebElement expense4 = driver.findElement(By.xpath("//*[contains(@text, 'Mileage')]"));
			if(expense4.isDisplayed()) {
				expense4.click();
			}
			Thread.sleep(2000);
			
			WebElement attach3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
			attach3.click();
			Thread.sleep(2000);
			
			WebElement savereport7 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save_draft_button"));
			savereport7.click();
			Thread.sleep(4000);
			
			WebElement back7 = driver.findElement(By.id("com.infor.hl.xm.dev:id/back"));
			back7.click();
			Thread.sleep(4000);
			
			WebElement reportstab4 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"reports\"]/android.widget.FrameLayout/android.widget.ImageView"));
	        reportstab4.click();
	        Thread.sleep(5000);
	        
	        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
		            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Mileage Expense 5"+"\").instance(0))"));
			WebElement report4 = driver.findElement(By.xpath("//*[contains(@text, 'Mileage Expense 5')]"));
			if(report4.isDisplayed()) {
				report4.click();
			}
			Thread.sleep(3000);
			
			WebElement openexpense5 = driver.findElement(By.id("com.infor.hl.xm.dev:id/content_view"));
			openexpense5.click();
			Thread.sleep(3000);
			
			driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
		            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"NOTE"+"\").instance(0))"));
			WebElement notes8 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
		    value = notes8.getText();
		    System.out.println("Value in notes field: " +value);
		    WebElement note8 = driver.findElement(By.xpath("//*[contains(@text, startingplace - stop - endingplace )]"));
			if(note8.isDisplayed()) {
				System.out.println("Note field is updated with Start, Stop & Final Place");
				System.out.println("Scenario 5: PASSED");
			}
			else {
				System.out.println("Note field is not updated with Start, Stop & Final Place");
				System.out.println("Scenario 5: FAILED");
			}
		    Thread.sleep(3000);
		    
		    WebElement saveexpense10 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		    saveexpense10.click();
		    
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/save_draft_button")));
		    
		    WebElement savereport8 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save_draft_button"));
			savereport8.click();
			Thread.sleep(3000);
		    
		    WebElement back8 = driver.findElement(By.id("com.infor.hl.xm.dev:id/back"));
			back8.click();
			
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
	
	public static void createMileageExpense() throws InterruptedException {
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Mileage"+"\").instance(0))"));
	    WebElement expensetype = driver.findElement(By.xpath("//*[contains(@text, 'Mileage')]"));
	    expensetype.click();
	    Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
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
		
/*		WebElement checkbox1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/consentcheckbox1"));
		if(checkbox1.isDisplayed()) {
	    checkbox1.click();
		Thread.sleep(2000);
		
		WebElement checkbox2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/consentcheckbox2"));
		checkbox2.click();
		Thread.sleep(2000);
		
		WebElement accept = driver.findElement(By.id("com.infor.hl.xm.dev:id/accept_button"));
		accept.click();
		}
*/		Thread.sleep(8000);
		
		WebElement startplace = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView"));
		startplace.click();
		Thread.sleep(3000);
		
		WebElement searchstartplace = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
		searchstartplace.click();
		searchstartplace.sendKeys("Kurnool");
		Thread.sleep(4000);
		
		WebElement selectstartplace = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));
		selectstartplace.click();
		Thread.sleep(4000);
		
		WebElement firstplace = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[1]"));
		String place = firstplace.getText();
		System.out.println("Start place is : "+ place);
		Thread.sleep(4000);
		
		WebElement finalplace = driver.findElement(By.id("com.infor.hl.xm.dev:id/title_empty_state"));
		finalplace.click();
		Thread.sleep(3000);
		
		WebElement searchfinalplace = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
		searchfinalplace.click();
		searchfinalplace.sendKeys("Hyderabad");
		Thread.sleep(3000);
		
		WebElement selectfinalplace = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));
		selectfinalplace.click();
		Thread.sleep(3000);
		
		WebElement lastplace = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView[1]"));
		place = lastplace.getText();
		System.out.println("Final place is : "+ place);
		Thread.sleep(4000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/save")));
				
		WebElement saveroute = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		saveroute.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/save")));
			
	}

/*	public static void createReport() throws InterruptedException {
		
		Thread.sleep(3000);
		
		WebElement add = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
		add.click();
		Thread.sleep(2000);
		
		WebElement startreport = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_report_button"));
		startreport.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(90));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/report_name")));
		
		WebElement doucmenttitle = driver.findElement(By.id("com.infor.hl.xm.dev:id/report_name"));
		doucmenttitle.sendKeys("Mileage Expense");
		Thread.sleep(2000);
		
		WebElement purpose = driver.findElement(By.id("com.infor.hl.xm.dev:id/detail"));
		purpose.click();
		Thread.sleep(4000);
		
		WebElement purposetype = driver.findElement(By.xpath("//*[contains(@text, 'Business Development')]"));
		if(purposetype.isDisplayed()){
			purposetype.click();
		}
		Thread.sleep(2000);
		
	}
*/	    
}   