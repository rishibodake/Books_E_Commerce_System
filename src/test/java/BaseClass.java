import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    public WebDriver driver;
    @BeforeClass
    public void initialise(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications","start-maximized");
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://www.bookswagon.com/login");
    }

    @AfterClass
    public void closeup() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
