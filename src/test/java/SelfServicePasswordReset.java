import Config.Accounts;
import Pages.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;

/*
Use Case #3 - : Self-service password reset
Preconditions: user account has been locked (see Test Case #2)
To get the temporary password, I used a Guerrilla mail disposable account "eplantesting@sharklasers.com"
*/

public class SelfServicePasswordReset {

    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&?@";
    String newPas = RandomStringUtils.random(15, characters);
    String securityQuestion = "Denver";
    String userName;
    String expectedUserName;
    String messagePassword;

    @Test
    public void selfServicePasswordReset() throws InterruptedException {

        setProperty("webdriver.chrome.driver", "C:\\webdriver\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://secure.eplanservices401k.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        ProfilePage profilePage = new ProfilePage(driver);
        WelcomePage welcomePage = new WelcomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        PasswordReset passReset = new PasswordReset(driver);
        Accounts accounts = new Accounts();
        PasswordResetSecurityQuestion secQ = new PasswordResetSecurityQuestion(driver);
        NewPassword newPassword = new NewPassword(driver);


        welcomePage.clicklnkSiteLogin2();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        loginPage.clickLnkTroubleSigningIn();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        passReset.clickBtnResetPassword();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        passReset.enterTxtUserName(accounts.getAccountName());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(2000);

        passReset.clickBtnContinue();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        secQ.enterTxtSecurityQuestion(securityQuestion);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        secQ.clickBtnFinish();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        setProperty("webdriver.chrome.driver", "C:\\webdriver\\chrome\\chromedriver.exe");
        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://www.guerrillamail.com");
        driver2.switchTo();
        driver2.manage().window().maximize();
        Thread.sleep(1000);

        GuerrillaMail guerrillaMail = new GuerrillaMail(driver2);

        guerrillaMail.clickBtnMailBox();
        Thread.sleep(1000);

        guerrillaMail.typeInputMailBox("eplantesting@sharklasers.com");
        Thread.sleep(4000);

        guerrillaMail.clickBtnSetMailBox();
        Thread.sleep(120000);
        System.out.println("Waiting for 2 minutes for the temporary password email to arrive...");

        guerrillaMail.clickLnkEmailTab();
        Thread.sleep(1000);

        guerrillaMail.clickLnkLastEmail();
        Thread.sleep(1000);

        messagePassword = guerrillaMail.getTextEmailBody();

        String[] lines = messagePassword.split("\\r?\\n");
        int index = Arrays.asList(lines).indexOf("Your new TEMPORARY account password is:");
        String tempPassword = lines[index + 2].trim();
        driver2.close();

        loginPage.clickBtnLogin();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        loginPage.enterUserName(accounts.getAccountName());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        loginPage.enterPassword(tempPassword);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        loginPage.clickBtnLogin();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        newPassword.enterTxtNewPass1(newPas);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println(newPas);

        newPassword.enterTxtNewPassConfirm(newPas);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        newPassword.clickBtnSave();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        newPassword.clickBtnContinue();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        profilePage.clickLnkProfileName();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        userName = profilePage.getTextProfileName();
        expectedUserName = accounts.getFullAccountName();

        try {
            Assert.assertEquals(userName, expectedUserName);
            System.out.println("Test case passed. User successfully logged in");
        } catch (AssertionError e) {
            System.out.println("Test case failed.");
            throw e;
        }

        Thread.sleep(3000);
        driver.close();
    }
}
