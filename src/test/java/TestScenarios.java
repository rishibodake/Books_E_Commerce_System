import org.testng.annotations.Test;
import pages.LoginPage;

public class TestScenarios extends BaseClass {
    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
    }
}
