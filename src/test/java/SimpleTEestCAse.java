import Config.Accounts;
import Config.Config;
import Config.Mailinator;
import Pages.LoginPage;
import Pages.PasswordReset;
import Pages.ProfilePage;
import Pages.WelcomePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;

// Use Case # 3
// Preconditions: password from Test Case #2 has been reset.
public class SimpleTEestCAse /*extends PM*/ {

    String resetEmailAddress = "eplantesting@mailinator.com";
    String securityQuestion = "Denver";
    String tempPass;

//    public void setUp(){
//        setUpScript();
//    }

    @Test
    public void simpleTestCAse() throws InterruptedException {
        setProperty("webdriver.chrome.driver", "C:\\webdriver\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://secure.eplanservices401k.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WelcomePage welcomePage = new WelcomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Accounts accounts = new Accounts();
        ProfilePage profilePage = new ProfilePage(driver);
        Config config = new Config(driver);
        PasswordReset passReset = new PasswordReset(driver);



        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.open('https://www.mailinator.com/','_blank');");
        // It is working!!!
//        mailinator.getFrontPageEmailField().sendKeys(resetEmailAddress);
////        mailinator.getFrontPageGoButton().click();
////        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////
////        mailinator.getFirstLink().click();
////        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////
////        String tempPass = mailinator.getTempPassword().getText();
////        System.out.println(tempPass);



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

        loginPage.clickLnkTroubleSigningIn();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        passReset.clickBtnResetPassword();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        loginPage.enterUserName(accounts.getAccountName());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        passReset.clickBtnContinue();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//        passReset.enterTxtSecurityQuestion(securityQuestion);
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//        passReset.clickBtnFinish();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebDriver driver2 = new ChromeDriver();
//        driver2.get("https://www.mailinator.com");
        driver2.get("https://accounts.google.com");
        driver2.switchTo();
        Thread.sleep(5000);
        driver.switchTo();
        Thread.sleep(5000);
        driver2.switchTo();

        Mailinator mailinator = new Mailinator(driver2);

//        welcomePage.clicklnkSiteLogin1();
        driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //mailinator in action
//        mailinator.enterTxtFrontPageEmailField();
//        Thread.sleep(5000);
//        driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//        mailinator.clickBtnGo();
        driver2.manage().window().maximize();

        driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//        mailinator.clickGetFirstLink();
        driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//        tempPass = mailinator.getTxtTempPass();
//        System.out.println(tempPass);







// go back to the login page and go through the steps of Test Case 1

        // - enter new password in both text fields
        //click contine
        // do the assertion form test case #1


//        driver2.close();
//        driver.switchTo();
//        driver.close();
    }
}
