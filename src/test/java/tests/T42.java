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


public class T42 extends BaseClass  {
	
	@SuppressWarnings("static-access")
    @Test
    public void dotest() throws Exception {
    	// Login to the XM Application
        Loginpage.login("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX2", "jsmith", "p");
        {
         // Click Add button
            Common.clickAdd();
         // Start New Expense
            Common.clickStartExpense();
         // Select Expense Type
            Common.selectExpenseType("Parking"); 
         // Enter amount
            Common.enterAmount("20");
            Thread.sleep(1000);
         //payment type
            Common.paymentType();
         // select payment type
            Common.selectPaymentType("Company Paid");
         //Location
            Common.location("New York");
         //Save Expense
            Common.clickSave();
         //Click Add button
            Common.clickAdd();
          //Click Start Report
            Common.clickStartReport();
          //Enter Report Title
            Common.enterReportTitle("Test111");
          //Click purpose field
            Common.clickPurposeField();
          // select purpose field
            Common.selectPurposeType("Other");
          // Click Next
            Common.clickSave();
          //Click on Parking Expense
            clickonParkingExpense();
           //Click Attach
            Common.clickNextButton();
           //Submit Report
            Common.clickSubmitReport();
           //Click Done
            Common.clickDone();
           //Click profile button
            Common.clickprofilebtn();
            //Click log out
            Common.clicklogout();
            //Click Confirm
            Common.clickconfirm();
            // Login to the XM Application
            Loginpage.login("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX2", "jjones", "p");
            {   
            // click Approval
            	Common.clickApprovalBtn();
          // Click ER Approval
            	Common.clickERApproval();
           //Click on the ER
            	clickonER();
           //Request more info
            	Common.clickRequestMoreInfo();
           // more info note
                Common.enterMoreinfoText("Test");
           // Request more info
                  Common.clickRequestMoreInfo();
           // Click Ok
                  Common.clickOnOk();
           // Click Back
                  Common.clickBack();
                  
           // Click profile button
                  Common.clickprofilebtn();
           //Click log out
                  Common.clicklogout();
           //Click Confirm
                  Common.clickconfirm();
            // Login to the XM Application
                  Loginpage.login("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX2", "jsmith", "p");
                  {  
            // Click on reports tab
             Common.clickReportsTab();
             //Click on the ER
               clickonER();
             //Click on more info note
               Common.moreInfoNote();
              //Add Explanation
               Common.enterExplanation("Test2");
             //Click done
               Common.clickDone();
           // Submit Report
              Common.clickSubmitReport();
           //Click Done
              Common.clickDone();
           // Click profile button
              Common.clickprofilebtn();
       //Click log out
              Common.clicklogout();
       //Click Confirm
              Common.clickconfirm();
                  }
         
      


}
	}
	}

	public static void clickonParkingExpense() {
    	Common.clickByXpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/text_expense_name\" and @text=\"Parking\"]");
    }
	public static void clickonER () {
		Common.clickByXpath("//android.view.ViewGroup[@resource-id=\"com.infor.hl.xm.dev:id/content_view\"])");
	}
	
}
