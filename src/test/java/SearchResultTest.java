import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginRegistrationPage;
import page.SearchPage;

/**
 * Class with all result of search tests
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
        Assert.assertEquals(searchPage.getSearchResultsOnPageCount(), 10, "Actual results on page number is wrong");
        searchPage.getDescriptionStringList();

    }
}
