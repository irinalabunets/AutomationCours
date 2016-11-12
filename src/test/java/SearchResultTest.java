import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginRegistrationPage;
import page.SearchPage;

/**
 * Class with all result of search tests
 */
public class SearchResultTest extends BaseTest {

    public HomePage homePage;

    @BeforeClass
    public void beforeTest(){
        LoginRegistrationPage loginRegistrationPage = new LoginRegistrationPage(getDriver());
        homePage = loginRegistrationPage.loginFormFillAndSubmit("irina.la@ukr.net", "edcvfr789");
        Assert.assertTrue(homePage.isPageLoaded());
    }

    @DataProvider(name = "searchTerms")
    public Object[][] searchTermsData(){
        return new Object[][] {
                { "HR", "HR" },
                { "hr", "hr" }
        };
    }
    /**
     * Search by keyword HR
     */
    @Test (dataProvider = "searchTerms")
    public void searchForKeyword (String searchTerms, String expectedContainedTerm) {
        SearchPage searchPage = homePage.clickForAdvansedSearchLink();
        searchPage.searchByKeywordAndSubmit(searchTerms);
        Assert.assertEquals(searchPage.getSearchResultsOnPageCount(), 10, "Actual results on page number is wrong");
        //searchPage.getDescriptionStringList();
        Assert.assertTrue(searchPage.getDescriptionStringList().get(0).contains(expectedContainedTerm), "Expected search term is not found in result list");
    }
}
