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


public class T35 extends BaseClass  {
	
	@SuppressWarnings("static-access")
    @Test
    public void dotest() throws Exception {
    	// Login to the XM Application
        Loginpage.login("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX5", "jsmith", "p");
        {
        // Click Add button
            Common.clickAdd();
         // Start New Expense
            Common.clickStartExpense();
         // Scroll
            Common.scrollAndClick("Parking");
         // Select Expense Type
            Common.selectExpenseType("Parking");
         // Enter amount
            Common.enterAmount("10");
            Thread.sleep(1000);
         // Save Expense
            Common.clickSave();
        // Click Add button
            Common.clickAdd();   
        // Start New Expense Again
            Common.clickStartExpense();
         // Scroll
            Common.scrollAndClick("Meals: Business");
        // Select Expense Type
            Common.selectExpenseType("Meals: Business");
        // Enter amount
            Common.enterAmount("0");
            Thread.sleep(1000);
       // Save Expense
            Common.clickSave();
       // Save as incomplete
            Common.clickSave(); 
       // Click Add button
            Common.clickAdd();  
       // Start Report
            Common.clickStartReport();
       // Enter Report Title
            Common.enterReportTitle("Draft");
       // Click purpose field
            Common.clickPurposeField();
       // Select Purpose
            Common.selectPurposeType("Other");
       // Click Receipt
            Common.clickReceiptClip();
       // Click ReceiptGallery
            Common.clickReceiptGallery();
       // Select image
            Common.selectImage(2);
       // Click Attach
            Common.clickAttach();
       // Click Save
            Common.clickSave();
       // Click Next
            Common.clickSave();
       // Click SelectAll and DeselectAll
           Common.selectandDeselectAllExpenseButton();
           Common.selectandDeselectAllExpenseButton();
       // select Expense
            Common.selectExpense(1);
       // select Expense
            Common.selectExpense(2);
       // select Expense
            Common.selectExpense(7);
       // Click Attach
            Common.clickNextButton();
       // Click Save
            Common.clickSave();
       // Click back
            Common.clickBack();
       // Click on Draft Report
            Common.openReport("Draft");
       // Open the Expense inside the report
            Common.openExpense("Parking");
       // give amount
            Common.enterAmount("20");
       // Give Location
            Common.location("New York");
          //payment type
            Common.paymentType();
         // select payment type
            Common.selectPaymentType("Company Paid");
       // Save Expense
            Common.clickSave();
       //Open the CC expense
            clickonCCExpense();
        }
        //Click receipt clip
        Common.clickReceiptClip();
        //Click receipt gallery
        Common.clickReceiptGallery();
        //Select Image
        Common.selectImage(1);
        //Click Attach
        Common.clickAttach();
        //Click Save
        Common.clickSave();
        //Click Save Again
        Common.clickSave();
        //Open Explanation
        Common.openexplanation();
        //Click on Done
        Common.clickDone();
        //Click Save
        Common.clickSave();
       //Remove expense
          
       //Save ER
        Common.clickSave();
       //Click on add expense
        Common.clickNextButton();
       //Click Select from list
        Common.clickSelectFromList();
        //Click on Parking Expense
         clickonParkingExpense();
        //Click Attach
         Common.clickNextButton();
       //Click on add expense
         Common.clickExpenseButton();
        // Click on create new
         Common.clickCreateNew();
      // Select Expense Type
         Common.selectExpenseType("Cellular Phone");
      // Enter amount
         Common.enterAmount("20");
         Thread.sleep(1000);
      // Save Expense
         Common.clickSave();
       //Submit ER
         Common.clickSubmitReport();
       // Click on Explanation
         Common.openexplanation();
       //Tap to add explanation
         Common.tapToAddExplanation();
        //Enter Explanation
         Common.enterExplanation("Test");
        //Click Done
         Common.clickDone();
       //Click Done Again
         Common.clickDone();
       //Submit ER
         Common.clickSubmitReport();
       //Click Done
         Common.clickDone();
         
        
        }
        public static void clickonCCExpense() {
        	Common.clickByXpath("/android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/text_expense_name\" and @text=\"Enterprise\"]"
        );
        	 }
        public static void clickonParkingExpense() {
        	Common.clickByXpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/text_expense_name\" and @text=\"Parking\"]");
        }
            
            
            
            
        

}
	
	

