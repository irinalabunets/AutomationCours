import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginRegistrationPage;
import page.SearchPage;

/**
 * Class wiht all result of search tests
 */
public class SearchResultTest extends BaseTest{

    /**
     * Search by keyword HR
     */
    @Test
    public void searchForKeywordHR () {
        LoginRegistrationPage loginRegistrationPage = new LoginRegistrationPage(getDriver());
        HomePage homePage = loginRegistrationPage.loginFormFillAndSubmit("irina.la@ukr.net", "edcvfr789");
        Assert.assertTrue(homePage.isPageLoaded());

        SearchPage searchPage = homePage.clickForAdvansedSearchLink();
        searchPage.searchByKeywordAndSubmit("HR");
        //Assert.assertTrue(searchPage.isListOfSearchResultLoaded());
        Assert.assertEquals(searchPage.getSearchResultsOnPageCount(), 10, "Actual results on page number is wrong");
        //searchPage.getSearchCount();
        searchPage.getDescriptionStringList();

        //searchPage.varificationThatSearchWorldAtTheList();
        //Assert.assertEquals(searchPage.varificationThatSearchWorldAtTheList(),"HR", "Expected that search word was not found on page");


    }
}
