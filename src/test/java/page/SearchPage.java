package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Search page - page object, that extends from base page
 */
public class SearchPage extends BasePage{

    @FindBy (xpath = "//div[@id='advs']/h3")
    private WebElement advancedPeopleSearchForm;

    @FindBy (id = "advs-keywords")
    private WebElement keywordsField;

    @FindBy (name = "submit")
    private WebElement searchButton;

    @FindBy (xpath = "//div[@class='description']")
    private List<WebElement> searchResultDescriptionsList;

    @FindBy (xpath = "//div[@class='search-info']/p[contains(text(), 'results for')]")
    private WebElement resuilsForInfoText;

    @FindBy (xpath = "//ol[@id='results']/li[contains(@class,'people')]//div[@class='description']/b")
    private List<WebElement> descriptionOfSearchResult;

    /**
     * Constructor for search page
     * @param driver
     */
    public SearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        waitUntilElementDisplayed(advancedPeopleSearchForm);
    }
    /**
     * Enter search word
     * @param keyword String search word
     */
    public void searchByKeywordAndSubmit (String keyword) {

        keywordsField.sendKeys(keyword);
        searchButton.click();
        waitUntilElementDisplayed(resuilsForInfoText);
        System.out.print(searchResultDescriptionsList.get(0).getText());
    }

    public int getSearchResultsOnPageCount (){
        return searchResultDescriptionsList.size();
    }

    public List<String> getDescriptionStringList () {
        List<String> searchResultDescriptionStringList = new ArrayList<String>();

        for (WebElement searchResultDescriptionElement : searchResultDescriptionsList){
            searchResultDescriptionStringList.add(searchResultDescriptionElement.getText());
        }
        return searchResultDescriptionStringList;
    }
    /**
     * Check that list of result by keyword is loaded
     * @return true or falls
     */
    public boolean isListOfSearchResultLoaded () {
        if (searchResultDescriptionsList.size()==10) {
            return true;
        } else return false;
    }
    /**
     * @return
     */
    public String varificationThatSearchWorldAtTheList (){

        for(int i=0; i<descriptionOfSearchResult.size(); i++){
            System.out.println (i+1+ descriptionOfSearchResult.get(i).getText());
            return descriptionOfSearchResult.get(i).getText();
        }
        return null;
    }
}
