//import Config.Mailinator;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//import static java.lang.System.setProperty;
//
//public class GmailTestCase {
//
//    @Test
//    public void gmail(){
//
//        setProperty("webdriver.chrome.driver", "C:\\webdriver\\chrome\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://accounts.google.com");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//        Mailinator mailinator = new Mailinator(driver);
//
//        mailinator.enterTxtGoogleEmailField();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//        mailinator.clickBtnNext();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//        mailinator.entertxtGooglePasswordField();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//        mailinator.clickBtnSecondNext();
//
//
//    }
//}
