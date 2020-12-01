package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
    public WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }
    By book = By.xpath("//a[@href='https://www.bookswagon.com/book/harry-potter/9781608870394']"); //make it generic
    By buyNow = By.xpath( "#ctl00_phBody_ProductDetail_divAddtoCart > a > input");
    By newFrame = By.xpath("//iframe[@class='cboxIframe']");
    By placeOrder = By.id("BookCart_lvCart_imgPayment");

    public void buyBook(){
        driver.findElement(book).click();
        driver.findElement(buyNow).click();
        driver.switchTo().frame(driver.findElement(newFrame));
        driver.findElement(placeOrder);
    }
}
