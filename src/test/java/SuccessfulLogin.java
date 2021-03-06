import Config.Accounts;
import Pages.LoginPage;
import Pages.ProfilePage;
import Pages.WelcomePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;

/* Use Case #1 - "happy path" - entering valid login and password. In Assert.Equals -
 verification that user is logged in to their account */

public class SuccessfulLogin {

    String userName;
    String expectedUserName = "Jack Holloway";

    @Test
    public void verifyWelcomePage() throws InterruptedException {

        setProperty("webdriver.chrome.driver", "C:\\webdriver\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://secure.eplanservices401k.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WelcomePage welcomePage = new WelcomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Accounts accounts = new Accounts();
        ProfilePage profilePage = new ProfilePage(driver);

        welcomePage.clicklnkSiteLogin1();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        loginPage.enterUserName(accounts.getAccountName());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        loginPage.enterPassword(accounts.getAccountPassword());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        loginPage.clickBtnLogin();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        profilePage.clickLnkProfileName();

        userName = profilePage.getTextProfileName();

        try {
            Assert.assertEquals(userName, expectedUserName);
            System.out.println("Test case passed. User successfully logged in");
        } catch (AssertionError e) {
            System.out.println("Test case failed.");
            throw e;
        }

        driver.close();
    }
}
