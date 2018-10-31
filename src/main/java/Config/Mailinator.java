package Config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mailinator {

    WebDriver driver;

    public Mailinator(WebDriver driver) {
        this.driver = driver;
    }

//    private static final String URL = "https://www.mailinator.com";
//
//    public WebElement getFrontPageEmailField() {
//        return driver.findElement(By.xpath("//*[@id=\"inboxfield\"]"));
//    }
//
//    public WebElement getFrontPageGoButton() {
//        return driver.findElement(By.xpath("//span/button"));
//    }
//
//    public WebElement getInboxEmail1() {
//        return driver.findElement(By.xpath("//div[2]/div[5]/div"));
//    }
//
//    public WebElement getiFrameActivationLink() { //make sure to get link text... or find something that contains qabidder.net
//        return driver.findElements(By.xpath("/html/body//a")).get(0);
//    }
//
//    public WebElement getFirstLink() {return  driver.findElement(By.xpath("//*[@id=\"row_eplantesting-1540769283-25139580\"]/td"));}
//
//    public WebElement getTempPassword() {return driver.findElement(By.xpath("/html/body/text()[4]"));}


    By txtFrontPageEmailField = By.id("inboxfield");

    public void enterTxtFrontPageEmailField() {
        driver.findElement(txtFrontPageEmailField).sendKeys("eplantesting@mailinator.com");
    }

    By btnGo = By.xpath("//span/button");

    public void clickBtnGo() {
        driver.findElement(btnGo).click();
    }

    By getFirstLink = By.xpath("//*[@id=\"row_eplantesting-1540769283-25139580\"]");

    public void clickGetFirstLink() {
        driver.findElement(getFirstLink).click();
    }

    By txtGetTempPassword = By.tagName("body");
//            ("/html/body");
//            ("/html/body/text()[4]");

    public String getTxtTempPass(){
        return driver.findElement(txtGetTempPassword).getText();

    }



   /* // Gooogle:

    By txtGoogleEmailField = By.id("identifierId");

    public void enterTxtGoogleEmailField() {
        driver.findElement(txtGoogleEmailField).sendKeys("ann.samoylov@gmail.com");
    }

    By btnNext = By.xpath("//*[@id=\"identifierNext\"]/content/span");

    public void clickBtnNext() {
        driver.findElement(btnNext).click();
    }

    By txtGooglePasswordField = By.xpath("//input[@type='password']");

    public void entertxtGooglePasswordField() {
        driver.findElement(txtGooglePasswordField).sendKeys("6Vylbb!9mq");
    }

    By btnSecondNext = By.xpath("//*[@id=\"passwordNext\"]/content/span");

    public void clickBtnSecondNext() {
        driver.findElement(btnSecondNext).click();
    }

    By lnkGoogleFirstLink = By.id("id=\":36");

    public void clickLnkGoogleFirstLink() {
        driver.findElement(lnkGoogleFirstLink).click();
    }
*/


//    public String getFirstLinkInFirstEmailInAccount(String emailAddressLocalPart) throws InterruptedException { //returns first link in first email in the account as a string.
//        driver.get(URL);
//        int waitTime = 5000;
//
//        Thread.sleep(waitTime);
//
//        getFrontPageEmailField().click();
//        getFrontPageEmailField().sendKeys(emailAddressLocalPart);
//        getFrontPageGoButton().click();
//        Thread.sleep(waitTime);
//
//        getInboxEmail1().click();
//        Thread.sleep(waitTime);
//
//        //Switch to iFrame
//        driver.switchTo().frame("publicshowmaildivcontent");
////driver.findElements(By.xpath("/html/body/a")).get(0).getAttribute("href")
//        String iFrameActivationLink = getiFrameActivationLink().getAttribute("href"); //return link as string
//        System.out.println(iFrameActivationLink);
//        driver.switchTo().parentFrame();
//        return iFrameActivationLink; //return link as string
//    }
}