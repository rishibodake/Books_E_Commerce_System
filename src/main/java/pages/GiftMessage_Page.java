package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftMessage_Page {
    WebDriver driver;
    public boolean flag;

    public GiftMessage_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "ctl00_cpBody_ShoppingCart_lvCart_txtGiftMessage")
    WebElement giftMessage;

    @FindBy(id = "ctl00_cpBody_ShoppingCart_lvCart_savecontinue")
    WebElement saveAndContinue;

    @FindBy(xpath = "//div[contains(text(),'Choose your mode of payment')]")
    WebElement verification;

    public void giftMessage() throws InterruptedException {
        Thread.sleep(2000);
        giftMessage.sendKeys("Happy BirthDay");
        saveAndContinue.click();
        Thread.sleep(2000);
        if (verification.toString().contains("Choose your mode of payment")){
            flag = true;
        }
    }
}
