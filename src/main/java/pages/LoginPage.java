package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public String actual_pageTitle;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public By email = By.id("ctl00_phBody_SignIn_txtEmail");
    public By password = By.id("ctl00_phBody_SignIn_txtPassword");
    public By login_button = By.id("ctl00_phBody_SignIn_btnLogin");


    public void login(){
        driver.findElement(email).sendKeys("rishibodake20@gmail.com");
        driver.findElement(password).sendKeys("jocky1234#");
        driver.findElement(login_button).click();
        actual_pageTitle = driver.getTitle();
    }
}
