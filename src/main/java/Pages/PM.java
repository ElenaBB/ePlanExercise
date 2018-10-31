package Pages;

import Config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.setProperty;

public class PM {

    public WebDriver driver;
    protected POM pages;
    private Config config;

    public PM(){

    }

    public void setUpScript() {
        setProperty("webdriver.chrome.driver", "C:\\webdriver\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://secure.eplanservices401k.com");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pages = PageREsourcesFactory.getPageResources(driver);
    }

    protected WebDriver getDriver() { //visible from subclasses, not public OR private
        return driver;
    }


    //the pages/classes
    public Config getConfig() {return pages.getConfig(); }
    public LoginPage getLoginPage() {return  pages.getLoginPage();}
    public WelcomePage getWelcomePage() {return pages.getWelcomePage();}


    }




