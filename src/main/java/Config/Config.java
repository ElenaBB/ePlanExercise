package Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.plugin2.util.BrowserType;

import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;

public class Config {

    private String baseURL;
    private BrowserType browserType;
    private String userName;
    private String password;
    WebDriver driver;

//    public Config() {
//    }


    public Config(WebDriver driver) {
        this.driver = driver;
    }




    public void setUpScript() {


        setProperty("webdriver.chrome.driver", "C:\\webdriver\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://secure.eplanservices401k.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


//       driver.get("https://accounts.google.com/");


//    public String getBaseURL() {
//        return baseURL;
//    }
//
//    public void setBaseURL(String baseURL) {
//        this.baseURL = baseURL;
//    }
//
//    public BrowserType getBrowserType() {
//        return browserType;
//    }
//
//    public void setBrowserType(BrowserType browserType) {
//        this.browserType = browserType;
//    }
    }
}