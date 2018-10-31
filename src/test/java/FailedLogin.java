import Config.Accounts;
import Pages.LoginPage;
import Pages.WelcomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;

public class FailedLogin {

    String lockedAccountMessage = "Account is locked due to too many failed attempts.";


    @Test
    public void failedLogin() throws InterruptedException {

        setProperty("webdriver.chrome.driver", "C:\\webdriver\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://secure.eplanservices401k.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WelcomePage welcomePage = new WelcomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Accounts accounts = new Accounts();
//        ProfilePage profilePage = new ProfilePage(driver);

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
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        loginPage.enterPassword(accounts.getWrongPassword2());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        loginPage.clickBtnLogin();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // clear invalid password - 3
        loginPage.clearPassword();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        loginPage.enterPassword(accounts.getWrongPassword3());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        loginPage.clickBtnLogin();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        String abc = loginPage.getTxtAccountIsLocked();
        System.out.println("<"+abc+">");

        Thread.sleep(4000);

        try {
            Assert.assertEquals(loginPage.getTxtAccountIsLocked(), lockedAccountMessage);;
            System.out.println("Test case passed. Account is locked.");
        } catch (AssertionError e) {
            System.out.println("Test case failed.");
            throw e;
        }

    }
}
