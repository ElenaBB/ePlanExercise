package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordResetSecurityQuestion {
    WebDriver driver;

    public PasswordResetSecurityQuestion(WebDriver driver) {
        this.driver = driver;
    }


    By txtSecurityQuestion = By.xpath("//*[@id=\"secQuestion\"]");
    By btnFinish = By.xpath("//*[@id=\"finishButton\"]");

    public void enterTxtSecurityQuestion(String secQuestion) {
        driver.findElement(txtSecurityQuestion).sendKeys(secQuestion);
    }

    public void clickBtnFinish() {
        driver.findElement(btnFinish).click();
    }

}
