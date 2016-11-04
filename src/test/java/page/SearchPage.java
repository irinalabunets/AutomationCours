package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.lang.Thread.sleep;

public class SearchPage extends BasePage{

    private WebElement advancedPeopleSearchBlock;
    private WebElement keywordsField;
    private WebElement firstNameField;
    private WebElement lastNameField;
    private WebElement titleField;
    private WebElement companyField;
    private WebElement schoolField;
    private WebElement locationField;
    private WebElement searchButton;
    private WebElement resetButton;
    private List<WebElement> searchResult;
    private List<WebElement> descriptionOfSearchResult;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void listOfElementsToSearch () {
        try {
            sleep (5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        advancedPeopleSearchBlock = driver.findElement(By.xpath("//div[@id='advs']/h3"));
        keywordsField = driver.findElement(By.id("advs-keywords"));
        firstNameField = driver.findElement(By.id("advs-firstName"));
        lastNameField = driver.findElement(By.id("advs-lastName"));
        titleField = driver.findElement(By.id("advs-title"));
        companyField = driver.findElement(By.id("advs-company"));
        schoolField = driver.findElement(By.id("advs-school"));
        locationField = driver.findElement(By.id("advs-locationType"));
        searchButton = driver.findElement(By.name("submit"));
        resetButton = driver.findElement(By.xpath("//div[@class='form-controls']/input[@type='reset']"));
        searchResult = driver.findElements(By.cssSelector(".mod.result.people"));
        descriptionOfSearchResult = driver.findElements(By.xpath("//ol[@id='results']/li[contains(@class,'people')]//div[@class='description']/b"));
    }

    public boolean isSearchPageLoaded() {
        return advancedPeopleSearchBlock.isDisplayed();
    }

    public void searchByKeywordAndSubmit (String keyword) {

        keywordsField.sendKeys(keyword);
        searchButton.click();
    }

    public boolean isListOfSearchResultLoaded () {
        return searchResult.size()>=10;
    }

    public void varificationThatSearchWorldAtTheList (){

        for(int i=0; i<descriptionOfSearchResult.size(); i++){
            String title;
            title = (i+1+"."+descriptionOfSearchResult.get(i).getText());

        }
    }



}
