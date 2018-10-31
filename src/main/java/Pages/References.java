package Pages;

import Config.Accounts;
import Config.Mailinator;
import org.openqa.selenium.WebDriver;

public class References {

    WebDriver driver;

    public WelcomePage welcomePage = new WelcomePage(driver);
    public LoginPage loginPage = new LoginPage(driver);
    public Accounts accounts = new Accounts();
    public ProfilePage profilePage = new ProfilePage(driver);
    public Mailinator mailinator = new Mailinator(driver);


}
