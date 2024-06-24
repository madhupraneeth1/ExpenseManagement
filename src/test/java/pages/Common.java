package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;

import java.time.Duration;

public class Common extends BaseClass {

    private static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    // Methods

    public static void clickAdd() {
        clickById("com.infor.hl.xm.dev:id/fab_add");
    }

    public static void clickStartReport() {
        clickById("com.infor.hl.xm.dev:id/start_report_button");
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

    public void clickSkipButton() {
        clickById("com.infor.hl.xm.dev:id/product_tour_skip_button");
    }

    public static void clickExpenseButton() {
        clickById("com.infor.hl.xm.dev:id/add_tv");
    }

    public static void clickCreateNew() {
        clickById("com.infor.hl.xm.dev:id/create_new");
    }

    public static void selectExpenseType(String type) {
    	scrollAndClickByExpense(type);
    }

    public static void enterAmount(String amountValue) {
        enterTextById("com.infor.hl.xm.dev:id/amount_field", amountValue);
    }

    public static void clickReceiptClip() {
        clickById("com.infor.hl.xm.dev:id/receipt_clip");
    }

    public static void clickReceiptGallery() {
        clickById("com.infor.hl.xm.dev:id/gallery");
    }

    public static void selectImage() {
        clickByXpath("(//android.widget.ImageView[@resource-id=\"com.infor.hl.xm.dev:id/select_icon\"])[3]");
    }

    public static void clickAttach() {
        clickById("com.infor.hl.xm.dev:id/attach");
    }

    public static void clickSave() {
        clickById("com.infor.hl.xm.dev:id/save");
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
        //clickById("com.infor.hl.xm.dev:id/dialog_button_negativeabcdef");
    }


    

    private static void clickById(String id) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        element.click();
    }

    private static void clickByXpath(String xpath) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        element.click();
    }

    private static void enterTextById(String id, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        element.sendKeys(text);
    }

    public static void scrollAndClickByExpense(String text) {
        WebElement element = driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                        + ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + text + "\").instance(0))"));
        element.click();
    }
}
