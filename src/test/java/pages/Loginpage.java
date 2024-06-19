package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Loginpage extends BaseClass {

    private WebElement getSettingsButton() {
        return driver.findElement(By.id("com.infor.hl.xm.dev:id/tenant_button"));
    }

    private WebElement getScreenProtectionCheckbox() {
        return driver.findElement(By.id("com.infor.hl.xm.dev:id/login_screen_protection"));
    }

    private WebElement getServerAddressField() {
        return driver.findElement(By.id("com.infor.hl.xm.dev:id/login_address"));
    }

    private WebElement getServerPortField() {
        return driver.findElement(By.id("com.infor.hl.xm.dev:id/login_port"));
    }

    private WebElement getTenantIdField() {
        return driver.findElement(By.id("com.infor.hl.xm.dev:id/login_tenant"));
    }

    private WebElement getNextButton() {
        return driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
    }

    private WebElement getUsernameField() {
        return driver.findElement(By.id("com.infor.hl.xm.dev:id/login_username"));
    }

    private WebElement getPasswordField() {
        return driver.findElement(By.id("com.infor.hl.xm.dev:id/login_password"));
    }

    private WebElement getLoginButton() {
        return driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
    }

    private WebElement getProductTourSkipButton() {
        return driver.findElement(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button"));
    }

    public void settings(String serverAddress, String serverPort, String tenantId) throws InterruptedException {
        clickSettings();
        clickScreenProtectionCheckbox();
        enterServerAddress(serverAddress);
        enterServerPort(serverPort);
        enterTenantId(tenantId);
        clickNextButton();
    }
    public void loginwithskip(String username, String password) throws InterruptedException {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
        waitForProductTourSkipButton();
    }
    public void loginwithoutskip(String username, String password) throws InterruptedException {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();      
    }

    private void clickSettings() {
        getSettingsButton().click();
    }

    private void clickScreenProtectionCheckbox() {
        getScreenProtectionCheckbox().click();
    }

    private void enterServerAddress(String address) {
        getServerAddressField().sendKeys(address);
    }

    private void enterServerPort(String port) {
        getServerPortField().sendKeys(port);
    }

    private void enterTenantId(String tenant) {
        getTenantIdField().sendKeys(tenant);
    }

    private void clickNextButton() {
        getNextButton().click();
    }

    private void enterUsername(String user) {
        getUsernameField().sendKeys(user);
    }

    private void enterPassword(String pass) {
        getPasswordField().sendKeys(pass);
    }

    private void clickLoginButton() {
        getLoginButton().click();
    }

    private void waitForProductTourSkipButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button")));
        getProductTourSkipButton().click();
    }

   
}
