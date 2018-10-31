package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {

    WebDriver driver;
//    WebElement element;

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



//    public WelcomePage() {
//
//    }
//
//    public WebElement lnkSiteLogin() {
//        element = driver.findElement(By.xpath("//*[@id=\"sitelogin\"]"));
//        return element;
//    }
//
//    public WebElement lnkSiteLoginNavBar() {
//        element = driver.findElement(By.xpath("//tbody//tr[6]//td//a"));
//        return element;
//    }
//
//    public WebElement googleUserName() {
//        element = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
//        return element;
//    }
//
//    public WebElement googleNextBtn() {
//        element = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span"));
//        return element;
//    }



}
