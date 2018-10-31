package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {

    WebDriver driver;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    By lnkProfileName = By.xpath("//*[@id=\"profileName\"]");
    By txtProfileName = By.xpath("//div[@class='profile-info']//div//h3//span");
    By lnkSignOut = By.xpath("//a[contains(text(),'Sign out')]");

    public void clickLnkProfileName() {
        driver.findElement(lnkProfileName).click();
    }

    public String getTextProfileName() {
        return driver.findElement(txtProfileName).getText();
    }

}
