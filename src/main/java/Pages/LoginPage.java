package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
//    WebElement element;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By txtUserName = By.xpath("//input[@name='username']");
    By txtPassword = By.xpath("//input[@name='password']");
    By btnLogin = By.id("loginButton");
    By lnkTroubleSigningIn = By.xpath("//a[@class='link trouble-link-branding is']");
    By txtAccountIsLocked = By.xpath("//*[@id=\"main-container\"]/div[2]/div[4]/div[2]/form/div[3]/span");

    public void enterUserName(String userName) {
        driver.findElement(txtUserName).sendKeys(userName);
    }

    public void enterPassword(String password) {
        driver.findElement(txtPassword).sendKeys(password);
    }

    public void clearPassword() {
        driver.findElement(txtPassword).clear();
    }

    public void clickBtnLogin() {
        driver.findElement(btnLogin).click();
    }

    public void clickLnkTroubleSigningIn() {
        driver.findElement(lnkTroubleSigningIn).click();
    }

    public String getTxtAccountIsLocked() {
       return driver.findElement(txtAccountIsLocked).getText();
    }


//    public LoginPage(){
//        System.out.println("Empty LoginPage constructor");
//    }

//    public WebElement txtUserName() {
//        element = driver.findElement(By.xpath("//input[@name='username']"));
//        return element;
//    }
//
//    public WebElement txtPassword() {
//        element = driver.findElement(By.xpath("//input[@name='password']"));
//        return element;
//    }
//
//    public WebElement btnLogin() {
//        element = driver.findElement(By.xpath("//*[@id=\"loginButton\"]"));
//        return element;
//    }


}
