package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage extends BasePage{

    @FindBy (xpath = "//div[@id='advs']/h3")
    private WebElement advancedPeopleSearchBlock;
    @FindBy (id = "advs-keywords")
    private WebElement keywordsField;
    @FindBy (name = "submit")
    private WebElement searchButton;
    @FindBy (css = ".mod.result.people")
    private List<WebElement> searchResult;
    @FindBy (xpath = "//ol[@id='results']/li[contains(@class,'people')]//div[@class='description']/b")
    private List<WebElement> descriptionOfSearchResult;

    public SearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public boolean isSearchPageLoaded() {
        return waitForElementDisplayed (advancedPeopleSearchBlock, 5).isDisplayed();
    }

    public void searchByKeywordAndSubmit (String keyword) {

        keywordsField.sendKeys(keyword);
        searchButton.click();
    }

    public boolean isListOfSearchResultLoaded () {
        //waitForListOfElementsDisplayed(searchResult, 5);
        if (searchResult.size()==10) {
            return true;
        } else return false;
    }

    public String varificationThatSearchWorldAtTheList (){

        for(int i=0; i<descriptionOfSearchResult.size(); i++){
            System.out.println (i+1+ descriptionOfSearchResult.get(i).getText());
            return descriptionOfSearchResult.get(i).getText();
        }
        return null;
    }
}
