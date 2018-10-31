package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GuerrillaMail {

    WebDriver driver;

    public GuerrillaMail(WebDriver driver) {
        this.driver = driver;
    }

    By btnMailBox = By.xpath("//*[@id='inbox-id']");
    By inputMailBox = By.xpath("//*[@id='inbox-id']/input");
    By btnSetMailBox = By.xpath("//*[@id='inbox-id']/button[@class='save button small']");
    By lnkEmailTab = By.xpath("//a[@title='Email']");
    By lnkLastEmail = By.xpath("//tbody[@id='email_list']/tr[1]");
    //    By txtEmailBody = By.xpath("//div[@class='email_body']/pre");
    By txtEmailBody = By.xpath("//*[@id=\"display_email\"]/div/div[2]/div");

    public void clickBtnMailBox() {
        driver.findElement(btnMailBox).click();
    }

    public void typeInputMailBox(String mailBox) {
        driver.findElement(inputMailBox).sendKeys(mailBox);
    }

    public void clickBtnSetMailBox() {
        driver.findElement(btnSetMailBox).click();
    }

    public void clickLnkEmailTab() {
        driver.findElement(lnkEmailTab).click();
    }

    public void clickLnkLastEmail() {
        driver.findElement(lnkLastEmail).click();
    }

    public String getTextEmailBody() {
        return driver.findElement(txtEmailBody).getText();
    }

}
