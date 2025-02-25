package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;

import java.time.Duration;

public class Common extends BaseClass {

    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    // Methods

    public static void clickAdd() {
        clickById("com.infor.hl.xm.dev:id/fab_add");
    }

    public static void clickStartReport() {
        clickById("com.infor.hl.xm.dev:id/start_report_button");
    }
    
    public static void attachExpense(String expense) {
    	scrollAndClick(expense);
    }

    public static void clickStartExpense() {
        clickById("com.infor.hl.xm.dev:id/start_expense_button");
    }
    
    public static void enterReportTitle(String title) {
        enterTextById("com.infor.hl.xm.dev:id/report_name", title);
    }

    public static void clickPurposeField() {
        clickById("com.infor.hl.xm.dev:id/detail");
    }

    public static void selectPurposeType(String type) {
        clickByXpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/field_option\" and @text=\"" + type + "\"]");
    }

    public static void clickNextButton() {
        clickById("com.infor.hl.xm.dev:id/next_button");
    }

    public static void clickSkipButton() {
        clickById("com.infor.hl.xm.dev:id/skip_button");
    }

    public static void clickExpenseButton() {
        clickById("com.infor.hl.xm.dev:id/add_tv");
    }

    public static void clickCreateNew() {
        clickById("com.infor.hl.xm.dev:id/create_new");
    }

    public static void selectExpenseType(String type) {
    	scrollAndClick(type);
    }
    
    public static void selectVendor(String vendor) {
    	clickByXpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/title\" and @text=\"Vendor\" or @text=\"VENDOR\"]");
    	scrollAndClick(vendor);
    }
    
    public static void selectPaymentType(String paymenttype) {
    	clickByXpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/title\" and @text=\"PAYMENT TYPE\"]");
    	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text, '" + paymenttype + "')]")));
        element.click();
    }

    public static void location(String location) {
        clickByXpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/title\" and @text=\"LOCATION\"]");
        WebElement searchLocationField = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
        if (searchLocationField.isDisplayed()) {
        	searchLocationField.sendKeys(location);
        }
    }
    
    public static void selectPurpose(String purpose) {
    	clickByXpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/title\" and @text=\"PURPOSE\"]");
    	scrollAndClick(purpose);
    }
    
    public static void enterAmount(String amountValue) {
        enterTextById("com.infor.hl.xm.dev:id/amount_field", amountValue);
    }

    public static void clickReceiptClip() {
        clickById("com.infor.hl.xm.dev:id/receipt_clip");
    }

    public static void clickChooseFromLibrary() {
        clickById("com.infor.hl.xm.dev:id/library");
    }
    
    public static void clickTakeAPhoto() {
        clickById("com.infor.hl.xm.dev:id/take_photo");
    }
    
    public static void clickReceiptGallery() {
        clickById("com.infor.hl.xm.dev:id/gallery");
    }

    public static void selectImage() {
        clickByXpath("(//android.widget.ImageView[@resource-id=\"com.infor.hl.xm.dev:id/select_icon\"])[3]");
    }
    
    public static void allowTakePictures() {
        clickById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    }
    
    public static void allowAccessMusic() {
        clickById("com.android.permissioncontroller:id/permission_allow_button");
    }
    
    public static void allowAccessPhotos() {
        clickById("com.android.permissioncontroller:id/permission_allow_all_button");
    }
    
    public static void capture() {
        clickById("com.infor.hl.xm.dev:id/picture");
    }
    
    public static void selectImageFromLibrary() {
        clickByXpath("(//android.widget.ImageView[@resource-id=\"com.google.android.documentsui:id/icon_thumb\"])");
    }

    public static void clickAttach() {
        clickById("com.infor.hl.xm.dev:id/attach");
    }

    public static void clickSave() {
        clickById("com.infor.hl.xm.dev:id/save");
    }
    
    public static void clickSaveER() {
        clickById("com.infor.hl.xm.dev:id/save_draft_button");
    }
    
    public static void clickBack() {
        clickById("com.infor.hl.xm.dev:id/back");
    }              
    
    public static void clickReportsTab() {
        clickByXpath("//android.widget.FrameLayout[@content-desc=\"reports\"]/android.widget.FrameLayout/android.widget.ImageView");
    }
    
    public static void clickReceiptsTab() {
        clickByXpath("//android.widget.FrameLayout[@content-desc=\"RECEIPTS\"]/android.widget.FrameLayout/android.widget.ImageView");
    }
    
    public static void clickExpensesTab() {
        clickByXpath("//android.widget.FrameLayout[@content-desc=\"expense\"]/android.widget.FrameLayout/android.widget.ImageView");
    }
    
    public static void clickApprovalsTab() {
        clickByXpath("//android.widget.FrameLayout[@content-desc=\"approvals\"]/android.widget.FrameLayout/android.widget.ImageView");
    }
    
    public static void openReport(String report) {
    	scrollAndClick(report);
    }
    
    public static void openExpense(String expense) {
    	WebElement element = driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                        + ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + expense + "\").instance(0))"));
        element.click();
    }

    public static void clickSubmitReport() {
        clickById("com.infor.hl.xm.dev:id/submit_report");
    }

    public static void clickDone() {
        clickById("com.infor.hl.xm.dev:id/dialog_button_neutral");
    }

    public static void clickprofilebtn() {
        clickById("com.infor.hl.xm.dev:id/user_profile_img");
    }

    public static void clicklogout() {
        clickById("com.infor.hl.xm.dev:id/pro_log_out_btn");
    }

    public static void clickconfirm() {
        clickById("com.infor.hl.xm.dev:id/dialog_button_negative");
    }
    
    public static void clickProfileBtn() {
        clickById("com.infor.hl.xm.dev:id/user_profile_img");
    }

    public static void clickLogout() {
        clickById("com.infor.hl.xm.dev:id/pro_log_out_btn");
    }

    public void clickConfirm() {
        clickById("com.infor.hl.xm.dev:id/dialog_button_negative");
    }
    
    public static void ExceptionsTab() {
        clickByXpath("//android.widget.LinearLayout[@content-desc=\"Exceptions\"]/android.widget.TextView");
    }
    
    public static void ExpensesTab() {
        clickByXpath("//android.widget.LinearLayout[@content-desc=\"Expenses\"]/android.widget.TextView");
    }
    
    public static void ReceiptsTab() {
        clickByXpath("//android.widget.LinearLayout[@content-desc=\"Receipts\"]/android.widget.TextView");
    }
    
    public static void NotesTab() {
        clickByXpath("//android.widget.LinearLayout[@content-desc=\"Notes\"]/android.widget.TextView");
    }
    
    public static void clickProdcuttour() {
        clickByXpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/title_tv\" and @text=\"Product Tour\"]");
    }
    
    public static void enterTcktNum(String ticket) {
        clickByXpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/title\" and @text=\"TICKET NUMBER\"]");
        enterTextById("com.infor.hl.xm.dev:id/note", ticket);
        Common.clickSave();
    }
    
    public static void clickCurrencyButton() {
        clickById("com.infor.hl.xm.dev:id/currency_button");
    }
    
    public static void searchCurrency(String currency) {
        enterTextById("com.infor.hl.xm.dev:id/search_src_text", currency);
    }
    
    public static void clickCurrencyTitle() {
        clickById("com.infor.hl.xm.dev:id/currency_title");
    }
    
    public static void someFieldsNeedReview() {
    	clickById("com.infor.hl.xm.dev:id/brv_layout");
    }
    
    public static void reportNeedReview() {
    	clickById("com.infor.hl.xm.dev:id/action_textview");
    }
    
    public static void giveExplanation(String explanation) {
    	clickById("com.infor.hl.xm.dev:id/explanation");
    	enterTextById("com.infor.hl.xm.dev:id/explanation", explanation);
    	clickById("com.infor.hl.xm.dev:id/item_done");
    }     
    
    public static void saveExplanation() {
    	clickById("com.infor.hl.xm.dev:id/done");
    } 
    
    public static void enterVendorviaSearch(String text) throws InterruptedException {
    	clickByXpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/title\" and @text=\"VENDOR\"]");
    	WebElement searchVendorField = driver.findElement(By.id("com.infor.hl.xm.dev:id/search_src_text"));
        if (searchVendorField.isDisplayed()) {
        	searchVendorField.sendKeys(text);  
        }
        Thread.sleep(2000);
        

        WebElement zeroResult = driver.findElement(By.xpath("//*[contains(@text, '0 Results')]"));
        if (zeroResult.isDisplayed()) {
            WebElement createNewVendorIcon = driver.findElement(By.id("com.infor.hl.xm.dev:id/arrow"));
            if (createNewVendorIcon.isDisplayed()) {
                WebElement addVendorIcon = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView"));
                if (addVendorIcon.isDisplayed()) {
                    addVendorIcon.click();
                }
            }
        }
        Thread.sleep(2000);

        WebElement addVendorField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
        String vendorValue = addVendorField.getText();
        Thread.sleep(3000);

        Common.clickSave();
        Thread.sleep(3000);

        // Verify vendor value
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                + ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + "VENDOR" + "\").instance(0))"));
        WebElement vendorValueElement = driver.findElement(By.xpath("//*[contains(@text, '" + vendorValue + "') ]"));
        if (vendorValueElement.isDisplayed()) {
            System.out.println("Value in vendor field: " + vendorValue);
            WebElement vendorIcon = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.ImageView[1]"));
            vendorIcon.click();
        }
        Thread.sleep(2000);
    }
    
    public static void enterVendorviaCreate(String text) throws InterruptedException {
    	clickByXpath("//android.widget.TextView[@resource-id=\"com.infor.hl.xm.dev:id/title\" and @text=\"VENDOR\"]");
    	WebElement createNewVendorIcon = driver.findElement(By.id("com.infor.hl.xm.dev:id/arrow"));
        createNewVendorIcon.click();
        Thread.sleep(3000);

        WebElement addVendorField2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
        addVendorField2.click();
        addVendorField2.sendKeys(text);
        WebElement addVendorField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
        String vendorValue = addVendorField.getText();
        vendorValue = addVendorField2.getText();
        Thread.sleep(3000);

        Common.clickSave();
        Thread.sleep(3000);

        // Verify vendor value again
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                + ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + "VENDOR" + "\").instance(0))"));
        WebElement vendorValueElement2 = driver.findElement(By.xpath("//*[contains(@text, '" + vendorValue + "') ]"));
        if (vendorValueElement2.isDisplayed()) {
            System.out.println("Value in vendor field: " + vendorValue);
            WebElement vendorIcon = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.ImageView[1]"));
            vendorIcon.click();
        }
        Thread.sleep(2000);
    }

    public static void clickById(String id) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        element.click();
    }

    public static void clickByXpath(String xpath) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        element.click();
    }

    public static void enterTextById(String id, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        element.sendKeys(text);
    }

    public static void click(String text) {
        WebElement element =driver.findElement(By.xpath("//*[contains(@text, '" + text + "')]"));
        element.click();
    }
    
    public static void scrollAndClick(String text) {
        WebElement element = driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                        + ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + text + "\").instance(0))"));
        element.click();
    }
}
