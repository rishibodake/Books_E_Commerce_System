package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftMessage_Page {
    WebDriver driver;

    public GiftMessage_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "ctl00_cpBody_ShoppingCart_lvCart_txtGiftMessage")
    WebElement giftMessage;

    @FindBy(id = "ctl00_cpBody_ShoppingCart_lvCart_savecontinue")
    WebElement saveAndContinue;

    public void giftMessage() throws InterruptedException {
        Thread.sleep(2000);
        giftMessage.sendKeys("Happy BirthDay");
        saveAndContinue.click();
    }
}
