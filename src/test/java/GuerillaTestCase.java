import Pages.GuerrillaMail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Arrays;

import static java.lang.System.setProperty;

public class GuerillaTestCase {

    @Test
    public void GuerillaTC() throws InterruptedException{

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
        Thread.sleep(1000);
        guerrillaMail.clickBtnSetMailBox();
        Thread.sleep(1000);
        guerrillaMail.clickLnkEmailTab();
        Thread.sleep(1000);
        guerrillaMail.clickLnkLastEmail();
        Thread.sleep(1000);
        String messagePassword = guerrillaMail.getTextEmailBody();

        // getting temp password from message
        String[] lines = messagePassword.split("\\r?\\n");
        int index = Arrays.asList(lines).indexOf("Your new TEMPORARY account password is:");
        String tempPassword = lines[index + 2].trim();
        System.out.println("Temp password: <"+tempPassword+"> index: "+ index);
        driver2.close();
        // ==================================
    }
}
