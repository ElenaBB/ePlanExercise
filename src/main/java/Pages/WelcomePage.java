package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {

    WebDriver driver;

    public WelcomePage(WebDriver driver) {
      this.driver = driver;
    }


    By lnkSiteLogin1 = By.xpath("//*[@href='/home/login.jsp' and @class='sideNavOff']");
    By lnkSiteLogin2 = By.id("sitelogin");

    public void clicklnkSiteLogin1(){
        driver.findElement(lnkSiteLogin1).click();
    }

    public void clicklnkSiteLogin2(){
        driver.findElement(lnkSiteLogin2).click();
    }

}
