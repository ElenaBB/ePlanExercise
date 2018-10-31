package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewPassword {
    WebDriver driver;

    public NewPassword(WebDriver driver) {
        this.driver = driver;
    }

    By txtNewPass1 = By.id("userpassword");
    By txtNewPassConfirm = By.id("userpassword2");
    By btnSave = By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/form/button");
    By btnContinue = By.xpath("//*[@id=\"ngdialog1\"]/div[2]/div/div/a");

    public void enterTxtNewPass1(String newPass) {
        driver.findElement(txtNewPass1).sendKeys(newPass);
    }

    public void enterTxtNewPassConfirm(String newPassConfirm) {
        driver.findElement(txtNewPassConfirm).sendKeys(newPassConfirm);
    }

    public void clickBtnSave() {
        driver.findElement(btnSave).click();
    }

    public void clickBtnContinue() {
        driver.findElement(btnContinue).click();
    }

}
