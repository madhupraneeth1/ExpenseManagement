package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import pages.BaseClass;
import pages.Common;
import pages.Loginpage;

import java.time.Duration;

public class XM3925 extends BaseClass {
	
	@SuppressWarnings("static-access")
    @Test
    public void dotest() throws Exception {
    	// Login to the XM Application
        Loginpage.login("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX2", "jsmith", "p");
        
        // Click Add button
        Common.clickAdd();

        // Click Start Report
        Common.clickStartReport();

        // Enter report title
        Common.enterReportTitle("XM3925");

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
        Common.selectExpenseType("Hotel");

        // Enter amount
        Common.enterAmount("20");
        Thread.sleep(1000);

        // Click on charge code allocations
        WebElement clickAllocation = driver.findElement(By.xpath("//*[contains(@text, 'CHARGE CODE ALLOCATIONS')]"));
        clickAllocation.click();

        // Add project code
        WebElement clickPlusBtn = driver.findElement(By.id("com.infor.hl.xm.dev:id/btn_add"));
        clickPlusBtn.click();

        WebElement addProject = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_project_code"));
        addProject.click();

        WebElement searchBox = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
        searchBox.sendKeys("GTO");

        WebElement selectProject = driver.findElement(By.xpath("//*[contains(@text, 'GTO')]"));
        selectProject.click();

        // Save allocation
        WebElement saveAllocation = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
        saveAllocation.click();

        // Click allocation again
        clickAllocation.click();
        WebElement saveExpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
        saveExpense.click();
        Thread.sleep(3000);
        Loginpage.logout();
    }
}
