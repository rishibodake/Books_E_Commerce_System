package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver driver;
    public boolean flag;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "ctl00_TopSearch1_txtSearch")
    WebElement searchBar;

    @FindBy(id = "ctl00_TopSearch1_Button1")
    WebElement searchButton;

    @FindBy(xpath = "//span[contains(text(),'harry potter')]")
    WebElement verification;

    public void search_Book(){
        searchBar.sendKeys("Harry Potter");
        searchButton.click();
       if(verification.toString().contains("harry potter")){
           flag = true;
       }
    }
}
