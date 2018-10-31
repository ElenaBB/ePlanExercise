import Pages.SuccessfulLogin;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class TestCase2 extends SuccessfulLogin {


//    @BeforeClass
//    public void setUp() throws InterruptedException{
//        setUpScript();
//    }

    @Test
    public void testCAse2() throws InterruptedException{
        setUpScript();
//       getConfig().setUpScript();
        getWelcomePage().clicklnkSiteLogin1();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//        getLoginPage().enterUserName(getaaccounts.getAccountName());
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//        getLoginPage().enterPassword(accounts.getAccountPassword());
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }


}
