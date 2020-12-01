package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalView_Page {
    WebDriver driver;
    public boolean flag;

    public FinalView_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "ctl00_lnkbtnLogout")
    WebElement logOutButton;

    @FindBy(xpath = "//h1[contains(text(),'My Account')]")
    WebElement verification;

    public void logOut() throws InterruptedException {
        Thread.sleep(2000);
        logOutButton.click();
        if(verification.toString().contains("My Account")){
            flag = true;
        }
    }
}
