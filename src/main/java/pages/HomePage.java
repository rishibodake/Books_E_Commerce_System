package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;
    public String actual_Book_Title;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBar = By.id("ctl00_TopSearch1_txtSearch");
    By searchButton = By.id("ctl00_TopSearch1_Button1");
    By itemName = By.id("ctl00_phBody_ProductDetail_lblTitle");

    public void search_Book(){
        driver.findElement(searchBar).sendKeys("Harry Potter");
        driver.findElement(searchButton).click();
        actual_Book_Title = driver.getTitle();
    }
}
