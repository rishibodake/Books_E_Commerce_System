import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TestScenarios extends BaseClass {
    @Test
    public void loginTest(){
        String expected_titleString = "Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com";
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        Assert.assertEquals(loginPage.actual_pageTitle,expected_titleString);

    }
}
