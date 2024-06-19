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

public class XM3926 extends BaseClass {
	
	@Test
	
	public void dotest() throws Exception {
		
		Thread.sleep(3000);	
	    		
		WebElement add = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
		add.click();
		Thread.sleep(3000);
		
		WebElement startexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_expense_button"));
		startexpense.click();
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Taxi/Car Service"+"\").instance(0))"));
		WebElement expense = driver.findElement(By.xpath("//*[contains(@text, 'Taxi/Car Service')]"));
		if(expense.isDisplayed()) {
			expense.click();
		}
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
		
		WebElement amount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
		amount.sendKeys("23");
		Thread.sleep(2000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"NOTE"+"\").instance(0))"));
	    WebElement notes = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
	    String value = notes.getText();
	    System.out.println("Note is : " + value);
	    Thread.sleep(2000);
	    notes.click();
    
	    WebElement addnotes = driver.findElement(By.id("com.infor.hl.xm.dev:id/note"));
	    addnotes.click();
	    addnotes.sendKeys("Taxi/Car Service");
	    Thread.sleep(2000);
	    
	    WebElement back = driver.findElement(By.id("com.infor.hl.xm.dev:id/back"));
		back.click();
		Thread.sleep(3000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"NOTE"+"\").instance(0))"));
	    WebElement notes2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
	    value = notes2.getText();
	    System.out.println("Note is : " + value);
	    System.out.println("Note is still "+ value);
	    Thread.sleep(2000);
	    notes2.click();
	    
	    WebElement addnotes2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/note"));
	    addnotes2.click();
	    addnotes2.sendKeys("Taxi/Car Service");
	    Thread.sleep(2000);
	    
	    WebElement savenotes = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		savenotes.click();
		Thread.sleep(3000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"NOTE"+"\").instance(0))"));
	    WebElement notes3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
	    value = notes3.getText();
	    System.out.println("Note is : " + value);
	    System.out.println("Note is Edited with " + value);
	    Thread.sleep(2000);
	    notes3.click();
	    
	    WebElement addnotes3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/note"));
	    addnotes3.click();
	    addnotes3.sendKeys("'*%_{}$&?!@'");
	    Thread.sleep(2000);
	    
	    WebElement savenotes2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		savenotes2.click();
		Thread.sleep(3000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"NOTE"+"\").instance(0))"));
	    WebElement notes4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView[2]"));
	    value = notes4.getText();
	    System.out.println("Note is : " + value);
	    System.out.println("Note is accepting special characters like " + value);
	    Thread.sleep(3000);
	    
	    WebElement saveexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
	    saveexpense.click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
		
		Thread.sleep(3000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"Taxi/Car Service"+"\").instance(0))"));
        WebElement openexpense = driver.findElement(By.xpath("//*[contains(@text, 'Taxi/Car Service')]"));
    	if(openexpense.isDisplayed()){
    		openexpense.click();
    	}
    	Thread.sleep(3000);
    	
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
    	
    	driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"NOTE"+"\").instance(0))"));
	    WebElement notes5 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[9]/android.widget.TextView[2]"));
	    value = notes5.getText();
	    System.out.println("Note is : " + value);
	    Thread.sleep(2000);
	    notes5.click();
	    
	    WebElement addnotes4 = driver.findElement(By.id("com.infor.hl.xm.dev:id/note"));
	    addnotes4.click();
	    addnotes4.clear();
	    Thread.sleep(2000);
	    
	    WebElement savenotes3 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		savenotes3.click();
		Thread.sleep(3000);
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            +".scrollIntoView(new UiSelector()"+".textMatches(\""+"NOTE"+"\").instance(0))"));
	    WebElement notes6 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[9]/android.widget.TextView[2]"));
	    value = notes6.getText();
	    System.out.println("Note is : " + value);
	    System.out.println("Note is deleted & now note is again " + value);
	    Thread.sleep(2000);
		
		WebElement saveexpense2 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
	    saveexpense2.click();
		Thread.sleep(3000);
		
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
		
		
	 }
  
}	    