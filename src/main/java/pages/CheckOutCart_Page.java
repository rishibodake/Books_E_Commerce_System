package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutCart_Page {
    WebDriver driver;

    public CheckOutCart_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@class='btn-red']")
    WebElement continueButton;

    //Shipping Address
    @FindBy(id = "ctl00_cpBody_txtNewRecipientName")
    WebElement name;

    @FindBy(id = "ctl00_cpBody_txtNewCompanyName")
    WebElement companyName;

    @FindBy(id = "ctl00_cpBody_txtNewAddress")
    WebElement streetAddress;

    @FindBy(id = "ctl00_cpBody_ddlNewState")
    WebElement state;

    @FindBy(xpath = "//option[@value='MH']" )
    WebElement MH;

    @FindBy(id = "ctl00_cpBody_txtNewCity")
    WebElement city;

    @FindBy(id = "ctl00_cpBody_txtNewPincode")
    WebElement pinCode;

    @FindBy(id = "ctl00_cpBody_txtNewMobile")
    WebElement mobile;

    @FindBy(id = "ctl00_cpBody_imgSaveNew")
    WebElement saveAndContinue;

    public void fillTheAddress() throws InterruptedException {
        continueButton.click();
        Thread.sleep(2000);
        name.sendKeys("Rishikesh");
        streetAddress.sendKeys("Karad Road");
        state.click();
        MH.click();
        city.sendKeys("Vita");
        pinCode.sendKeys("415311");
        mobile.sendKeys("2525252525");
        saveAndContinue.click();
    }
}
