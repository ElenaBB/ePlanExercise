package Pages;

import Config.Config;
import org.openqa.selenium.WebDriver;

public class POM {

    public WebDriver driver;
    private LoginPage loginPage;
    private WelcomePage welcomePage;
    private Config config;

    public POM(WebDriver driver) {


//Set page references
        loginPage = new LoginPage(driver);
        welcomePage = new WelcomePage(driver);
        config = new Config(driver);
    }

    public POM() {

    }

//Getters

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public WelcomePage getWelcomePage() {
        return welcomePage;
    }

    public Config getConfig() {return  config;}



}