package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Loginpage extends BaseClass {
	
	

    private static WebElement getSettingsButton() {
        return driver.findElement(By.id("com.infor.hl.xm.dev:id/tenant_button"));
    }

    private static WebElement getScreenProtectionCheckbox() {
        return driver.findElement(By.id("com.infor.hl.xm.dev:id/login_screen_protection"));
    }

    private static WebElement getServerAddressField() {
        return driver.findElement(By.id("com.infor.hl.xm.dev:id/login_address"));
    }

    private static WebElement getServerPortField() {
        return driver.findElement(By.id("com.infor.hl.xm.dev:id/login_port"));
    }

    private static WebElement getTenantIdField() {
        return driver.findElement(By.id("com.infor.hl.xm.dev:id/login_tenant"));
    }

    private static WebElement getNextButton() {
        return driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
    }

    private static WebElement getUsernameField() {
        return driver.findElement(By.id("com.infor.hl.xm.dev:id/login_username"));
    }

    private static WebElement getPasswordField() {
        return driver.findElement(By.id("com.infor.hl.xm.dev:id/login_password"));
    }

    private static WebElement getLoginButton() {
        return driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
    }

    private static WebElement getProductTourSkipButton() {
        return driver.findElement(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button"));
    }

    public static void login(String serverAddress, String serverPort, String tenantId, String username, String password) throws InterruptedException {
    	ClickSettingsButton();
        clickScreenProtectionCheckbox();
        enterServerAddress(serverAddress);
        enterServerPort(serverPort);
        enterTenantId(tenantId);
        clickNextButton();
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
        clcikSkip();
    }

    public static void loginwithoutskip(String serverAddress, String serverPort, String tenantId, String username, String password) throws InterruptedException {
    	ClickSettingsButton();
        clickScreenProtectionCheckbox();
        enterServerAddress(serverAddress);
        enterServerPort(serverPort);
        enterTenantId(tenantId);
        clickNextButton();
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }

    private static void clickScreenProtectionCheckbox() {
        getScreenProtectionCheckbox().click();
    }

    private static void enterServerAddress(String address) {
        getServerAddressField().sendKeys(address);
    }

    private static void enterServerPort(String port) {
        getServerPortField().sendKeys(port);
    }

    private static void enterTenantId(String tenant) {
        getTenantIdField().sendKeys(tenant);
    }

    private static void clickNextButton() {
        getNextButton().click();
    }

    private static void enterPassword(String pass) {
        getPasswordField().sendKeys(pass);
    }

    private static void clickLoginButton() {
        getLoginButton().click();
    }
    
    
    private static void clcikSkip() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button")));
        getProductTourSkipButton().click();
    }

    private static void ClickSettingsButton() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/tenant_button")));
        getSettingsButton().click();
    }
    
    private static void enterUsername(String user) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/login_username")));
        getUsernameField().sendKeys(user);
    }
   
}
