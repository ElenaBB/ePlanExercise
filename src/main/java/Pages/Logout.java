package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout {

    WebDriver driver;
    WebElement element;

    public Logout(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement profileName() {
        element = driver.findElement(By.xpath("//*[@id=\"profileName\"]"));
        return element;
    }

    public WebElement signOut() {
        element = driver.findElement(By.xpath("//a[contains(text(),'Sign out')]"));
        return element;
    }

    public void breakDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }

}
