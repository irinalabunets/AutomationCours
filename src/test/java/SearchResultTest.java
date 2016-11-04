import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginRegistrationPage;
import page.SearchPage;

public class SearchResultTest extends BaseTest{

    @Test
    public void searchForKeywordHR () {
        LoginRegistrationPage loginRegistrationPage = new LoginRegistrationPage(getDriver());
        loginRegistrationPage.openPage();
        loginRegistrationPage.listOfElementsToLoginRegistration();
        loginRegistrationPage.loginFormFillAndSubmit("irina.la@ukr.net", "edcvfr789");

        HomePage homePage = new HomePage(getDriver());
        homePage.listOfElementsToHomePage();
        Assert.assertTrue(homePage.isPageLoaded());
        homePage.clickForAdvansedButton();

        SearchPage searchPage = new SearchPage(getDriver());
        searchPage.listOfElementsToSearch();
        Assert.assertTrue(searchPage.isSearchPageLoaded());
        searchPage.searchByKeywordAndSubmit("HR");
        searchPage.isListOfSearchResultLoaded();
        searchPage.varificationThatSearchWorldAtTheList();


    }
}
