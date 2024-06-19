package tests;

import org.testng.annotations.Test;
import pages.BaseClass;
import pages.Common;
import pages.Loginpage;

public class XM3913 extends BaseClass {

    @SuppressWarnings("static-access")
	@Test
    public void dotest() throws InterruptedException {
    	
    	// Login to the XM Application
        Loginpage.login("https://xm10-dde.xm.dev.inforcloudsuite.com", "443", "XMMOBSTND_AX2", "jsmith", "p");
        
        // Click Add button
        Common.clickAdd();

        // Click Start Report
        Common.clickStartReport();

        // Enter report title
        Common.enterReportTitle("XM3913");

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
        Common.selectExpenseType("Cash Advance");

        // Enter amount
        Common.enterAmount("8");

        // Click Save button 
        Common.clickSave();

        // Click Submit report button
        Common.clickSubmitReport();

        // Click Done button in dialog
        Common.clickDone();
        
        // Click profile button
        Common.clickprofilebtn();
        
        // Click logout
        Common.clicklogout();
        
        // Click confirm
        Common.clickconfirm();
    }
}
