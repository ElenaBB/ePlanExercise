import Config.Accounts;
import Pages.LoginPage;
import Pages.ProfilePage;
import Pages.WelcomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;

public class PassReset /*extends References */{

    String resetEmailAddress = "eplantesting@mailinator.com";
    String activationLink;

    @Test
    public void passwordReset() throws InterruptedException {

        setProperty("webdriver.chrome.driver", "C:\\webdriver\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://secure.eplanservices401k.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WelcomePage welcomePage = new WelcomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Accounts accounts = new Accounts();
        ProfilePage profilePage = new ProfilePage(driver);
        Mailinator mailinator = new Mailinator(driver);


        welcomePage.clicklnkSiteLogin1();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        loginPage.enterUserName(accounts.getAccountName());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        loginPage.enterPassword(accounts.getWrongPassword1());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        loginPage.clickBtnLogin();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // clear invalid password - 2
        loginPage.clearPassword();

        loginPage.enterPassword(accounts.getWrongPassword2());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        loginPage.clickBtnLogin();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // clear invalid password - 3
        loginPage.clearPassword();

        loginPage.enterPassword(accounts.getWrongPassword3());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        loginPage.clickBtnLogin();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//        activationLink = mailinator.getFirstLinkInFirstEmailInAccount(activationLink);


    }


}
