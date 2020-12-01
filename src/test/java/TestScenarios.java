import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchResultPage;

public class TestScenarios extends BaseClass {
    @Test(priority = 1)
    public void loginTest(){
        String expected_titleString = "Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com";
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        Assert.assertEquals(loginPage.actual_pageTitle,expected_titleString);
    }

    @Test(priority = 2)
    public void searchTest(){
        HomePage homePage = new HomePage(driver);
        homePage.search_Book();
        boolean flag = false;
        if(homePage.actual_Book_Title.toLowerCase().contains("harry potter")){
             flag = true;
        }
        Assert.assertTrue(flag);
    }

    @Test(priority = 3)
    public void bookBuy() throws InterruptedException {
        SearchResultPage searchResult = new SearchResultPage(driver);
        searchResult.buyBook();
    }
}
