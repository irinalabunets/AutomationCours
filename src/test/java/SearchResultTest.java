import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginRegistrationPage;
import page.SearchPage;

public class SearchResultTest extends BaseTest{

    @Test
    public void searchForKeywordHR () {
        LoginRegistrationPage loginRegistrationPage = new LoginRegistrationPage(getDriver());
        HomePage homePage = loginRegistrationPage.loginFormFillAndSubmit("irina.la@ukr.net", "edcvfr789");
        Assert.assertTrue(homePage.isPageLoaded());

        SearchPage searchPage = homePage.clickForAdvansedButton();
        Assert.assertTrue(searchPage.isSearchPageLoaded());

        searchPage.searchByKeywordAndSubmit("HR");
        //Assert.assertTrue(searchPage.isListOfSearchResultLoaded());
        searchPage.isListOfSearchResultLoaded();
        searchPage.varificationThatSearchWorldAtTheList();


    }
}
