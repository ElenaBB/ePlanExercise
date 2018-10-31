import Config.Config;
import Pages.WelcomePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestCase1 //extends POM /
 {

//    public TestCase1() {
//
//        super();
//    }

//    @BeforeClass
//    public void setUp() {
//        setUpScript();
//    }

     WebDriver driver;

     WelcomePage welcomePage;// = new WelcomePage();
     Config config;//  = new Config();


    @Test
    public void successfulLogin() throws InterruptedException {

//        getWelcomePage().lnkSiteLogin().click();
//        Thread.sleep(3000);
//
//        getLoginPage().txtUserName().sendKeys("jhallowaytest");
//        Thread.sleep(3000);
//
//        getLoginPage().txtPassword().sendKeys("MozotoEqueta123");
//        Thread.sleep(3000);

        // create Config page object
        config = new Config(driver);
        welcomePage = new WelcomePage(driver);



        config.setUpScript();
        Thread.sleep(7000);

//        welcomePage.googleUserName().click();
//        Thread.sleep(6000);
//
//
//        welcomePage.googleUserName().sendKeys("Hello");


    }


}
