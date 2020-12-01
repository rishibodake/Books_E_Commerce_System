package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinalView {
    WebDriver driver;

    public FinalView(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "ctl00_lnkbtnLogout")
    WebElement logOutButton;

    public void logOut(){
        logOutButton.click();
    }
}
