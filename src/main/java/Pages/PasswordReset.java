package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordReset {

    WebDriver driver;

    public PasswordReset(WebDriver driver) {
        this.driver = driver;
    }


    By btnResetPassword = By.xpath("//*[@id=\"resetPasswordButton\"]/span");

    public void clickBtnResetPassword() {
        driver.findElement(btnResetPassword).click();
    }


    By txtUserName = By.xpath("//*[@id=\"username\"]");

    public void enterTxtUserName(String userName) {
        driver.findElement(txtUserName).sendKeys(userName);
    }


    By btnContinue = By.id("continueButton");

//    By txtSecurityQuestion = By.xpath("//*[@id=\"secQuestion\"]");
//    By btnFinish = By.xpath("//*[@id=\"finishButton\"]");


    public void clickBtnContinue() {
        driver.findElement(btnContinue).click();
    }

// public void enterTxtSecurityQuestion(String secQuestion) {
//
//        driver.findElement(txtSecurityQuestion).sendKeys();
//    }
//
//    public void clickBtnFinish() {
//        driver.findElement(btnFinish).click();
//    }


//    public void clickBtnResetPassword() {
//        driver.findElement(btnResetPassword).click();
//    }
//    //*[@id="username"]


}