package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordReset {

    WebDriver driver;

    public PasswordReset(WebDriver driver) {
        this.driver = driver;
    }

    By btnResetPassword = By.xpath("//*[@id=\"resetPasswordButton\"]/span");
    By txtUserName = By.xpath("//*[@id=\"username\"]");
    By btnContinue = By.id("continueButton");

    public void clickBtnResetPassword() {
        driver.findElement(btnResetPassword).click();
    }

    public void enterTxtUserName(String userName) {
        driver.findElement(txtUserName).sendKeys(userName);
    }

    public void clickBtnContinue() {
        driver.findElement(btnContinue).click();
    }

}